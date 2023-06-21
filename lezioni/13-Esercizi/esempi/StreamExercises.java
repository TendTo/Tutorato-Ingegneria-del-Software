import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.time.LocalDate;

public class StreamExercises {

    public record Persona(String name, int age, String role) {
    }

    public record Prodotto(String nome, double prezzo) {
    }

    public record Utente(String nome, List<Commento> commenti) {
    }

    public record Commento(String testo, LocalDate data) {
    }

    /**
     * Trovare i nomi dei programmatori con età minore di 30 anni.
     */
    private static void es1() {
        List<Persona> l = List.of(new Persona("Kent", 29, "CTO"),
                new Persona("Luigi", 25, "Programmer"),
                new Persona("Andrea", 26, "GrLeader"),
                new Persona("Sofia", 26, "Programmer"));

        l.stream()
                .filter(p -> p.age() < 30)
                .filter(p -> p.role().equals("Programmer"))
                .map(Persona::name)
                .forEach(System.out::println);
    }

    /**
     * Trovare tutti i ruoli distinti delle persone nella lista.
     */
    private static void es2() {
        List<Persona> l = List.of(new Persona("Kent", 29, "CTO"),
                new Persona("Luigi", 25, "Programmer"),
                new Persona("Andrea", 26, "GrLeader"),
                new Persona("Sofia", 26, "Programmer"));

        l.stream()
                .map(Persona::role)
                .distinct()
                .forEach(System.out::println);

        List<Persona> newL = l.stream()
                .sorted(Comparator.comparing(x -> x.name()))
                .collect(Collectors.toList());
    }

    /**
     * Produrre una lista che contiene solo le stringhe che cominciano con un certo
     * prefisso noto.
     */
    private static void es3() {
        String prefix = "au";
        List<String> l = List.of("f", "author", "auto",
                "autocorrect", "begin",
                "big", "bigger", "biggish", "au");

        l.stream()
                // .filter(s -> s.startsWith(prefix))
                .filter(s -> s.length() >= prefix.length())
                .filter(s -> s.substring(0, prefix.length()).equals(prefix))
                .forEach(System.out::println);
    }

    /**
     * Produrre una stringa contenente le iniziali di ciascuna stringa della lista.
     */
    private static void es4() {
        List<String> l = List.of("to", "speak", "the", "truth",
                "and", "pay", "your", "debts");
        String startingLetter = l.stream()
                .filter(s -> s.length() > 0)
                .map(s -> s.substring(0, 1))
                .reduce(String::concat).orElse("");
        // .reduce("", (acc, i) -> acc + i);

        System.out.println(startingLetter);
    }

    /**
     * Data una lista di terne di numeri interi, per ciascuna terna verificare se
     * essa costituisce un triangolo. Restituire la lista dei perimetri per le terne
     * che rappresentano triangoli.
     * In un triangolo, ciascun lato è minore della somma degli altri due.
     * Si può rappresentare la terna come un array di tre elementi interi
     */
    private static void es5() {
        List<List<Integer>> l = List.of(List.of(3, 4, 5), List.of(3, 4, 6),
                List.of(3, 4, 7), List.of(3, 4, 8));

        List<Integer> perimeters = l.stream()
                .filter(x -> x.size() == 3)
                .filter(x -> x.get(0) + x.get(1) >= x.get(2))
                .filter(x -> x.get(0) + x.get(2) >= x.get(1))
                .filter(x -> x.get(1) + x.get(2) >= x.get(0))
                .map(x -> x.get(0) + x.get(1) + x.get(2))
                .collect(Collectors.toList());

        for (Integer i : perimeters)
            System.out.println(i);
    }

    /**
     * Data una lista di numeri interi positivi, verificare se la lista è ordinata.
     * 
     * Suggerimenti:
     *
     * - Si generano gli indici da 0 a n-1
     * - Per ciascun valore dell'indice i, si confrontano l'elemento con indice i ed
     * il successivo, se il secondo è minore del primo la lista non è ordinata e si
     * può fermare la verifica
     */
    private static void es6() {
        List<Integer> ordL = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> notOrdL = List.of(5, 6, 1, 2, 3, 4, 9, 8, 7);

        boolean isOrd = IntStream.iterate(0, i -> i + 1)
                .limit(ordL.size() - 1)
                .allMatch(i -> ordL.get(i) < ordL.get(i + 1));
        System.out.println("ordL: " + isOrd);

        // Metodo alternativo con la reduce
        boolean isNotOrd = notOrdL.stream()
                .reduce(Integer.MIN_VALUE, (acc, i) -> acc == null || acc > i ? null : i) != null;
        System.out.println("notOrdL: " + isNotOrd);

        boolean isEmptyOrd = new ArrayList<Integer>().stream()
                .reduce(Integer.MIN_VALUE, (acc, i) -> acc == null || acc > i ? null : i) != null;
        System.out.println("emptyList: " + isEmptyOrd);
    }

    /**
     * Restituire il costo totale dei prodotti che hanno un prezzo maggiore di 10.
     */
    private static void es7() {
        List<Prodotto> l = List.of(new Prodotto("p1", 5.0), new Prodotto("p2", 10.0),
                new Prodotto("p3", 15.0), new Prodotto("p4", 20.0));

        double sum = l.stream()
                .filter(p -> p.prezzo() > 10.0)
                .mapToDouble(Prodotto::prezzo)
                .sum();

        // Senza usare la map
        // sum = l.stream()
        // .filter(p -> p.prezzo() > 10.0)
        // .reduce(0.0, (acc, p) -> acc + p.prezzo(), (acc1, acc2) -> acc1 + acc2);

        System.out.println(sum);
    }

    /**
     * Produrre una lista contenente i primi n multipli di 7
     */
    private static void es8() {
        int n = 10;
        List<Integer> l = Stream.iterate(0, i -> i + 7)
                .limit(n)
                .collect(Collectors.toList());

        for (Integer integer : l)
            System.out.println(integer);

    }

    /**
     * Restituire tutti i commenti degli utenti ordinati per data
     * 
     * Stream<Utente> -> Stream<Stream<Commento>> -> Stream<Commento>
     * [U1, U2, U3] -> [[C1, C2], [C3, C4, C5], [C6]] # Con la map
     * [U1, U2, U3] -> [C1, C2, C3, C4, C5, C6] # Con la flatMap
     */
    private static void es9() {
        List<Utente> l = List.of(
                new Utente("u1",
                        List.of(new Commento("c2", LocalDate.of(2021, 1, 2)),
                                new Commento("c1", LocalDate.of(2021, 1, 1)),
                                new Commento("c5", LocalDate.of(2021, 1, 5)))),
                new Utente("u2",
                        List.of(new Commento("c4", LocalDate.of(2021, 1, 4)),
                                new Commento("c3", LocalDate.of(2021, 1, 3)))));

        l.stream()
                .flatMap(u -> u.commenti().stream())
                .sorted((c1, c2) -> c1.data().compareTo(c2.data()))
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        // es1();
        // es2();
        // es3();
        // es4();
        // es5();
        // es6();
        // es7();
        // es8();
        // es9();
    }

}