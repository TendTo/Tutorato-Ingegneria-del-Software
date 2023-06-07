# Stream

Utilizzo degli stream in Java.

<!-- New section -->

## Approccio funzionale

Sebbene nasca come un linguaggio orientato agli oggetti, nel corso degli anni anche Java ha cercato di integrare paradigmi di programmazione diversi, al fine di dare allo sviluppatore tool più comodi per svolgere il suo lavoro.

Un aspetto fondamentale della programmazione funzionale è il trattare le funzioni come oggetti da poter passare come parametri ad altre funzioni, che vengono considerate funzioni di ordine superiore.  
Quando le funzioni sono anonime, si parla di funzioni o espressioni lambda.

<!-- .element: class="fragment" -->

<!-- New subsection -->

### Funzioni lambda

In Java le funzioni lambda sono definite come segue:

```java
(int x, int y) -> x + y
```

Dove `(int x, int y)` è la lista dei parametri, `->` è l'operatore lambda e `x + y` è il corpo della funzione.

Alcune varianti sono:

<!-- .element: class="fragment" data-fragment-index="1" -->

```java
// Posso usare le parentesi graffe se ho necessità di più righe di codice
// In questo caso devo esplicitare il return
(int x, int y) -> { int z = x + y; return z; }
// Se non ho parametri, devo usare le parentesi tonde vuote
() -> System.out.println("Hello World");
// Se ho un solo parametro, posso omettere le parentesi tonde
x -> x * x
```

<!-- .element: class="fragment" data-fragment-index="1" -->

<!-- New subsection -->

### Tipi delle funzioni lambda

Le funzioni lambda sono associate a interfacce funzionali, ovvero interfacce che hanno un solo metodo astratto.
In base al numero di parametri e al tipo di ritorno, le interfacce funzionali sono classificate in:

- `Consumer<T>`: prende un parametro di tipo `T` e non ritorna nulla
- `Supplier<T>`: non prende parametri e ritorna un valore di tipo `T`
- `Function<T, R>`: prende un parametro di tipo `T` e ritorna un valore di tipo `R`
- `Predicate<T>`: prende un parametro di tipo `T` e ritorna un valore booleano (true o false)
- `Comparator<T>`: prende due parametri di tipo `T` e ritorna un valore intero per indicare l'ordine

<!-- New subsection -->

### Metodi passati come funzioni

In Java è possibile passare come parametro un metodo, che verrà trattato come una funzione lambda.

```java
List<String> list = List.of("a1", "a2", "b1", "c2", "c1");
list.stream()
    .map(String::toUpperCase) // Equivalente a s -> s.toUpperCase()
    .forEach(System.out::println); // Equivalente a s -> System.out.println(s)
```

<!-- New section -->

## Stream

Gli stream sono una nuova struttura dati introdotta in Java 8, che permette di eseguire operazioni su una sequenza di elementi, sfruttando al massimo le potenzialità della programmazione funzionale.

Una collezione può essere trasformata in uno stream tramite il metodo `stream()`:

```java
List<String> list = List.of("a1", "a2", "b1", "c2", "c1");
Stream<String> stream = list.stream();
```

<!-- New subsection -->

### Lazy vs Eager

Gli stream permettono di eseguire operazioni di trasformazione e filtraggio, che vengono eseguite in modo lazy, quindi non verranno lanciate fino a quando non verrà chiamata un'operazione terminale.

Altre operazioni, cioè quelle terminali, sono invece eager, ovvero vengono eseguite subito e forzano l'esecuzione di tutte le operazioni precedenti.

<!-- .element: class="fragment" -->

<!-- New subsection -->

### Stateless vs stateful

Alcune operazioni, come la map e la filter lavorano sul singolo elemento, quindi non hanno bisogno di contenere uno stato interno per funzionare.  
Questo tipo di operazioni è detta stateless.

Altre operazioni, come la sorted o la max, invece hanno bisogno di contenere uno stato interno, per fare confronti fra gli elementi.  
Questo tipo di operazioni è detta stateful.

<!-- .element: class="fragment" -->

<!-- New subsection -->

### Filter

Il metodo filter è un'operazione lazy stateless che prende in input un predicato e restituisce un nuovo stream contenente solo gli elementi che soddisfano il predicato.

```java
List<String> list = List.of("a1", "a2", "b1", "c2", "c1");
Stream<String> stream = list.stream()
                            .filter(s -> s.startsWith("c"));
// stream contiene solo "c2" e "c1"
```

<!-- New subsection -->

### Map

Il metodo map è un'operazione lazy stateless che prende in input una funzione e restituisce un nuovo stream contenente gli elementi trasformati dalla funzione.

```java
List<String> list = List.of("a1", "a2", "b1", "c2", "c1");
Stream<String> stream = list.stream()
                            .map(s -> s.toUpperCase());
// stream contiene "A1", "A2", "B1", "C2", "C1"
```

<!-- New subsection -->

### Sorted

Il metodo sorted è un'operazione lazy stateful che prende in input un comparatore e restituisce un nuovo stream contenente gli elementi ordinati secondo il comparatore.

```java
List<Integer> list = List.of(5, 2, 6, 3, 1);
Stream<Integer> stream = list.stream()
                             .sorted((s1, s2) -> s1 - s2);
// stream contiene 1, 2, 3, 5, 6
```

<!-- New subsection -->

### Count

Il metodo count è un'operazione eager che restituisce il numero di elementi presenti nello stream.

```java
List<String> list = List.of("a1", "a2", "b1", "c2", "c1");
long count = list.stream()
                 .filter(s -> s.equals("c2"))
                 .count();
// count contiene 1
```

<!-- New subsection -->

### Collect

Il metodo collect è un'operazione eager che prende in input un collector e restituisce un nuovo stream contenente gli elementi trasformati dal collector.

```java
List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8);
List<Integer> newList = list.stream()
                           .filter(i -> i % 2 == 0)
                           .collect(Collectors.toList());
// newList contiene 2, 4, 6, 8
```

<!-- New subsection -->

### Reduce

Il metodo reduce è un'operazione eager che prende in input una funzione che, a partire da un valore accumulatore, continua ad applicare un'operazione fra l'accumulatore e l'elemento corrente e restituisce il risultato dell'accumulazione.

```java
List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8);
int mult = list.stream()
              .reduce(1, (acc, i) -> acc * i);
// mult contiene 40320
```

<!-- New subsection -->

### Iterate

Il metodo iterate è un'operazione lazy stateless che prende in input un valore iniziale che fa da accumulatore e una funzione che, applicando la funzione al valore corrente dell'accumulatore, restituisce il valore successivo.
Poiché di default proseguirebbe all'infinito, è necessario specificare un limite con il metodo limit.

```java
Stream<Integer> stream = Stream.iterate(0, i -> i + 1)
                                .limit(10);
// stream contiene 0, 1, 2, 3, 4, 5, 6, 7, 8, 9
```

<!-- New subsection -->

### Generate

Il metodo generate è un'operazione lazy stateless che prende in input una funzione che restituisce il valore successivo.
Poiché di default proseguirebbe all'infinito, è necessario specificare un limite con il metodo limit.

```java
Stream<Integer> stream = Stream.generate(() -> Math.round(Math.random()*10))
                                .limit(10);
// stream contiene 10 numeri casuali
```

<!-- New subsection -->

### ForEach

Il metodo forEach è un'operazione eager che prende in input una funzione e applica la funzione a tutti gli elementi dello stream.

```java
List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8);
list.stream()
    .filter(i -> i % 2 == 0)
    .forEach(System.out::println);
// stampa 2, 4, 6, 8
```

<!-- New subsection -->

### Peek

Il metodo peek è un'operazione lazy stateless che prende in input una funzione e applica la funzione a tutti gli elementi dello stream.
In altre parole, è come un forEach, ma non è un'operazione terminale.

```java
List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8);
int count = list.stream()
    .filter(i -> i % 2 == 0)
    .peek(System.out::println)
    .count();
// stampa 2, 4, 6, 8
// restituisce 4
```

<!-- New subsection -->

### FindFist o FindAny

I metodi findFirst e findAny sono operazioni eager che restituiscono il primo elemento dello stream che soddisfa il predicato.
Per poi ottenere il valore dell'elemento, è necessario usare il metodo get.
Se non esiste alcun elemento che soddisfa il predicato, viene restituito un Optional vuoto, che può essere gestito con il metodo orElse.

```java
List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8);
Optional<Integer> first = list.stream()
                              .filter(i -> i % 2 == 0)
                              .findFirst();
// first contiene 2
// Se l'optional è vuoto, viene lanciata un'eccezione
Integer firstValue = first.get(); 
// Se l'optional è vuoto, firstValue contiene 0
Integer firstValueDefault = first.orElse(0); 
```
