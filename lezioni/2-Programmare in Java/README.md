# Programmare in Java

Conoscere e gestire le peculiarità di Java.

<!-- New section -->

## Obiettivi

- Casting
- Valore vs Riferimento
- Confronto fra oggetti
- Progetti con più file
- Polimorfismo
- Eccezioni
- Generics
- Record

<!-- New section -->

## Casting

```java
public static void main(String[] args) {
    int x = 10;
    double y = 5.5;
    x = (int) y;
}
```

Java è un linguaggio staticamente tipizzato.  
Generalmente non è permesso convertire automaticamente un oggetto di tipo in un altro.

Il casting deve essere esplicito, ed è responsabilità del programmatore.

<!-- .element: class="fragment" -->

<!-- New subsection -->

### Casting fra oggetti

```java[|1,2|5|6,7|8-11|]
class Shape{}
class Circle extends Shape{}

public static void main(String[] args) {
    Circle c = new Circle();
    // Il cerchio è una sottclasse di Shape
    Shape s = c;
    // Controllo sul tipo di s
    if (s instanceof Circle){
        Circle c2 = (Circle) s;
    }
}
```

Prima di fare un casting, è buona norma assicurarsi che l'oggetto sia del tipo atteso.

Il casting implicito è consentito da una classe derivata alla superclasse, mentre viceversa l'operazione deve essere forzata esplicitamente.

<!-- .element: class="fragment" -->

<!-- New section -->

## Passaggio di parametri

Nella maggior parte dei casi, chiamare un metodo di una classe prevede anche il passaggio di un certo numero di parametri.

<!-- New subsection -->

### Passaggio per valore

Passare un parametro per valore crea una nuova variabile che ha lo stesso valore dell'originale.  
Le due variabili sono indipendenti.

Sono passati per valore tutti i tipi primitivi: **boolean**, **byte**, **char**, **short**, **int**, **long**, **float**, **double**

<!-- New subsection -->

#### Esempio: passaggio per valore

```java
public static int sum(int a, int b){
    a = a + b;
    return a;
}

public static void main(String args[]){
    int x = 1, y = 5;
    sum(x, y);
}
```

<div class="cols">

```mermaid
flowchart TB

x{{x}}
y{{y}}

x --> 1
y --> 5
```

<!-- .element: class="fragment" -->

```mermaid
flowchart TB

x{{x}}
y{{y}}
a{{a}}
b{{b}}
x1[1]
y5[5]
a1[1]
b5[5]

x --> x1
y --> y5
a --> a1
b --> b5
```

<!-- .element: class="fragment" -->

```mermaid
flowchart TB

x{{x}}
y{{y}}
a{{a}}
b{{b}}
x1[1]
y5[5]
a6[6]
b5[5]

x --> x1
y --> y5
a --> a6
b --> b5
```

<!-- .element: class="fragment" -->

</div>

<!-- New subsection -->

### Passaggio per riferimento

Passare un parametro pre riferimento crea una nuova variabile che punta allo stesso oggetto di quella originale.  
Entrambe le variabili permettono di agire sullo stesso oggetto.

Sono passati per riferimento tutti gli oggetti.

<!-- New subsection -->

#### Esempio: passaggio per riferimento

```java
public static int appendIntAndGetSize(List<String> list, int value) {
    list.add(String.valueOf(value));
    return list.size();
}

public static void main(String[] args) {
    int val = 12;
    List<String> arrayList = new ArrayList<>();
    arrayList.add("10");
    appendIntAndGetSize(arrayList, val);
}
```

<div class="cols">

```mermaid
flowchart TB

arrayList{{arrayList}}
val{{val}}
a["['10']"]

arrayList --> a
val --> 5
```

<!-- .element: class="fragment" -->

```mermaid
flowchart TB

arrayList{{arrayList}}
val{{val}}
list{{list}}
value{{value}}
val5[5]
value5[5]
a["['10']"]

arrayList --> a
val --> val5
list --> a
value --> value5
```

<!-- .element: class="fragment" -->

```mermaid
flowchart TB

arrayList{{arrayList}}
val{{val}}
list{{list}}
value{{value}}
val5[5]
value5[5]
a["['10', '12']"]

arrayList --> a
val --> val5
list --> a
value --> value5
```

<!-- .element: class="fragment" -->

</div>

<!-- New section -->

## Confronto fra oggetti

```java
public class Circle{
    public int radius;
    public Circle(int radius){
        this.radius = radius;
    }
}
```

In Java, tutto ciò che non è un tipo primitivo è gestito tramite puntatori.

Fare un confronto fra due oggetti con `obj1 == obj2` significa confrontare i puntatori.

<!-- .element: class="fragment" -->

<!-- New subsection -->

### Metodo `equals()`

```java[|3,4|5|6|7|8,9|]
class Circle{
    // ...
    @Override
    public boolean equals(Object obj){
        if (obj == null) return false;
        if (obj == this) return true;
        if (!(obj instanceof Circle)) return false;
        Circle other = (Circle) obj;
        return this.radius == other.radius;
    }
}
```

Per fare un confronto logico fra due oggetti, è necessario sovrascrivere il metodo `equals()`.

La logica può essere complessa a piacimento, ma generalmente si controllano i tipi dell'oggetto e i valori dei campi della classe.

<!-- .element: class="fragment" -->

<!-- New section -->

## Lavorare con più classi

Le classi raggruppano dati e metodi in un unico blocco logico.  
Un progetto complesso conterrà un numero elevato di classi.

I design pattern sono una serie di regole che permettono di organizzare le classi in modo da avere un codice più pulito e mantenibile.

<!-- .element: class="fragment" -->

<!-- New subsection -->

### Suddividere le classi in package

La convenzione prevede che ogni file contenga una classe con lo stesso nome (ad eccezioni delle classi interne ad altre).

Le classi possono essere raggruppate in package.  
Un package è una cartella che contiene una serie di classi che rappresentano un aspetto del progetto.

<!-- .element: class="fragment" -->

<!-- New subsection -->

#### Esempio: suddividere le classi in package

<div class="cols">

```mermaid
classDiagram
direction LR

class Interactable{
    <<Interface>>
    +interact()
}
class Damageable{
    <<Interface>>
    +damage()
}
class Entity{
    -String name
    +getName() String
}
class LightSwitch{
    -boolean isOn
    +isOn() boolean
}
class Character{
    <<Abstract>>
    -int maxHealth
    -int currentHealth
    -int damage
    -int defense
    +getMaxHealth() int
    +getCurrentHealth() int
    +isAlive() boolean
    +attack()*
    +die()*
}
class Hero
class Enemy {
    <<Abstract>>
}
class Orc
class Ghost

Entity <|-- LightSwitch
Entity <|-- Character
Interactable <|.. LightSwitch
Damageable <|.. Character
Character <|-- Enemy
Character <|-- Hero
Enemy <|-- Orc
Enemy <|-- Ghost
```

```shell
src
├── Main.java
└── entity
    ├── Character.java
    ├── Damageable.java
    ├── Enemy.java
    ├── Entity.java
    ├── Ghost.java
    ├── Hero.java
    ├── Interactable.java
    ├── LightSwitch.java
    └── Orc.java
```

</div>

<!-- New subsection -->

### Compilazione ed esecuzione

```shell
javac Main.java
java Main
```

<!-- New subsection -->

### Creare un archivio JAR

Un archivio JAR è un file che contiene una serie di classi e risorse.  
Nel caso di progetti composti da più file, può essere utile creare un archivio JAR.

```shell
javac Main.java
jar cvfe Main.jar Main Main.class entity/*.class
```

- `c`: crea un nuovo archivio
- `v`: sii verboso nell'output
- `f`: specifica il nome del file JAR prodotto
- `e`: specifica la classe entrypoint

<!-- .element: class="fragment" -->

<!-- New section -->

## Polimorfismo

Il polimorfismo è un concetto fondamentale della programmazione orientata agli oggetti.  
Un oggetto può essere visto in maniera diversa, più o meno generica, a seconda delle esigenze.

Ciò che permette di raggiungere questo risultato sono le meccaniche di ereditarietà e implementazione.

<!-- .element: class="fragment" -->

<!-- New subsection -->

### Utilizzare il polimorfismo: raggruppare

```java
List<Entity> entities = new ArrayList<>();
entities.add(new LightSwitch());
entities.add(new Orc());
entities.add(new Ghost());
```

Utilizzare la classe base permette di raggruppare gli oggetti in un'unica struttura.  
Questo perché, sebbene i tipi siano diversi, tutti derivano dalla stessa classe base.

<!-- New subsection -->

#### Utilizzare il polimorfismo: differenziare

```java
for (Entity entity : entities) {
    if (entity instanceof Interactable) {
        Interactable interactable = (Interactable) entity;
        interactable.interact();
    }
    if (entity instanceof Damageable) {
        hero.attack((Damageable) entity);
    }
    if (entity instanceof Enemy enemy) {
        if (enemy.isAlive())
            enemy.attack(hero);
    }
}
```

È comunque possibile differenziare gli oggetti in base alle loro caratteristiche specifiche.  
Per farlo, è necessario effettuare un cast esplicito, assicurandosi che l'oggetto sia effettivamente di quel tipo con un'istruzione `instanceof`.

<!-- New section -->

## Eccezioni

Le eccezioni sono un meccanismo che permette di gestire gli errori in modo controllato.

In Java, le eccezioni sono oggetti che vengono lanciati quando si verifica un errore, interrompendo il flusso normale dell'esecuzione.

<!-- .element: class="fragment" -->

<!-- New subsection -->

### Gestire le eccezioni

```java
try {
    // ...
} catch (IOException | SQLException ex) {
    // ...
} finally {
    // ...
}
```

Le eccezioni possono essere gestite con un blocco `try-catch`.

Il blocco `try` contiene il codice che può generare un'eccezione.

<!-- .element: class="fragment" -->

Il blocco `catch` contiene il codice che viene eseguito solo se viene generata un'eccezione del tipo specificato.

<!-- .element: class="fragment" -->

Il blocco `finally` contiene il codice che viene eseguito in ogni caso.

<!-- .element: class="fragment" -->

<!-- New subsection -->

### Lanciare eccezioni

```java
throw new Exception("Something went wrong");
```

È possibile lanciare eccezioni con l'istruzione `throw` accompagnato da un oggetto che estende la classe `Exception`.

Se si vuole creare una nuova eccezione per un caso d'uso personalizzato, è possibile estendere la classe `Exception` o una delle sue sottoclassi.

<!-- .element: class="fragment" -->

<!-- New subsection -->

### Delegare la gestione delle eccezioni

```java
public void interact() throws Exception {
    throw new Exception("Something went wrong");
}
```

Normalmente, quando si maneggia del codice che può generare un'eccezione, è necessario gestirla all'interno del blocco `try-catch`.

Se invece si vuole delegare la gestione dell'eccezione, è possibile aggiungere la clausola `throws` al metodo, indicando il tipo di eccezione che può essere generata.

<!-- .element: class="fragment" -->

<!-- New subsection -->

### Try-with-resources

```java
try (BufferedReader reader = new BufferedReader(new FileReader("file.txt"))) {
    String line = reader.readLine()
    // ...
} catch (Exception e) {
    // ...
}
```

La struttura `try-with-resources` permette di gestire le risorse che vengono aperte all'interno di un blocco `try`.

Le risorse vengono automaticamente chiusa alla fine del blocco `try`, anche in caso di eccezioni.

<!-- .element: class="fragment" -->

<!-- New subsection -->

### Eccezioni: best practice

- **Be specific**: catturare eccezioni che sappiamo come gestire
- **Fail-fast**: notificare l'errore il prima possibile
- **Catch-late**: rimandare la gestione dell'errore al livello superiore
- **Logging**: registrare gli errori in un file di log
- **Custom exceptions**: creare eccezioni personalizzate per i casi d'uso specifici
- **Use judiciously**: evitare di usare eccezioni per il controllo del flusso

[Ulteriori dettagli](https://www.digitalocean.com/community/tutorials/exception-handling-in-java)

<!-- New section -->

## Generics

I generics sono un meccanismo che permette di creare classi e metodi parametrici, in grado di operare su qualsiasi tipo non primitivo.

<!-- New subsection -->

### Creare una classe generica

```java
public class Pair<K, V> {
    private K key;
    private V value;
    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }
    public K getKey() {
        return key;
    }
    public V getValue() {
        return value;
    }
}
```

All'interno della definizione della classe, è possibile specificare uno o più tipi generici fra le parentesi angolate.

<!-- New subsection -->

### Utilizzare una classe generica

```java
public static void main(String[] args) {
    Pair<String, Integer> pair = new Pair<>("Hello", 42);
    System.out.println(pair.getKey());
    System.out.println(pair.getValue());
}
```

Nel momento in cui si crea un oggetto di una classe generica, è necessario specificare i tipi con cui si vuole utilizzare la classe.

Solo i tipi non primitivi possono essere usati come tipi generici.

<!-- .element: class="fragment" -->

<!-- New subsection -->

### Limitare i tipi generici

```java
public class Pair<K extends Comparable<K>, V> {
    // ...
}

public class Box<K super Serializable & Iterable> {
    // ...
}
```

È possibile specificare un limite superiore o inferiore per i tipi generici in termini di ereditarietà.

Nel caso di Pair, il tipo `K` deve implementare l'interfaccia `Comparable`.

<!-- .element: class="fragment" -->

<!-- New section -->

## Record

I record sono un tipo particolare di classe che permette di creare oggetti immutabili con pochissimo boilerplate.

<!-- New subsection -->

### Creare un record

```java
public record Item(int price, String name) {}
```

Questa sintassi equivale a:

```java
public class Item {
    private int price;
    private String name;
    public Item(int price, String name) {
        this.price = price;
        this.name = name;
    }
    public int getPrice() {
        return price;
    }
    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return price == item.price && Objects.equals(name, item.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, name);
    }

    @Override
    public String toString() {
        return "Item[" +
                "price=" + price +
                ", name='" + name + '\'' +
                ']';
    }
}
```

<!-- New section -->

## Switch

Il costrutto `switch` è un'alternativa all'`if-else` per la gestione di casi multipli.

<!-- New subsection -->

### Sintassi classica

```java
switch (value) {
    case 1:
        // ...
        break;
    case 2:
        // ...
        break;
    default:
        // ...
}
```

Il costrutto `switch` prende in input un'espressione e confronta il suo valore con i valori specificati nei `case`.

Nel caso in cui il valore dell'espressione corrisponda a uno dei valori specificati, viene eseguito il codice contenuto nel `case`, proseguendo nelle sezioni sottostanti fino a che non si incontra un `break`.

<!-- .element: class="fragment" -->

<!-- New subsection -->

### Sintassi compatta

```java
switch (value) {
    case 1, 2, 3 -> System.out.println("Small");
    case 4, 5, 6 -> System.out.println("Medium");
    case 7, 8, 9 -> System.out.println("Large");
    default -> System.out.println("Unknown");
}
```

Nelle nuove versioni di Java è possibile utilizzare la sintassi più compatta, che evita la necessità di utilizzare il `break`.

<!-- New subsection -->

### Sintassi con yield

```java
int result = switch (value) {
    case 1, 2, 3 -> 1;
    case 4, 5, 6 -> 2;
    case 7, 8, 9 -> 3;
    default -> {
        System.out.println("Unexpected value");
        yield 0;
    };
};
```

Lo switch  può anche restituisce il valore dell'espressione contenuta nel `case` corrispondente, permettendo ad esempio di memorizzare il risultato in una variabile.

Se si ha la necessità di eseguire più istruzioni all'interno di un `case`, è possibile utilizzare un blocco di codice e restituire il valore finale con la keyword `yield`.

<!-- .element: class="fragment" -->

<!-- New section -->

## Challenge

- Creare una coda utilizzando i generics
- Utilizzare la classe ArrayList per implementare lo stack o la coda e che utilizzi le eccezioni per gestire i casi limite
- Creare una coda di priorità generica che si specializza in max-heap o min-heap in base alla sottoclasse
- Creare un wrapper per la lettura e scrittura di file
- Creare una struttura dati simile a Pair che permetta di memorizzare più di due elementi
- Creare un simulatore di gioco di ruolo molto semplice da riga di comando
