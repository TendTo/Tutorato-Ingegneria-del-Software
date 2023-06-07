# Observer, Composite, Strategy, Command

Descrizione dei design pattern Observer, Composite, Strategy e Command.

<!-- New section -->

## Observer

L'observer è un design pattern comportamentale.

Definisce una dipendenza di tipo uno-a-molti tra oggetti in modo che quando un oggetto cambia lo stato, tutti i suoi oggetti dipendenti vengono notificati e aggiornati automaticamente.

<!-- New subsection -->

### Problema e soluzione

<div class="cols">

- Notificare le modifiche ogni volta che un oggetto cambia il proprio stato
- Le notifiche dovrebbero coinvolgere solo gli oggetti interessati
- Deve essere possibile aggiungere o rimuovere gli osservatori in qualsiasi momento

<br/>

- Integrare un meccanismo di iscrizione nel subject
- Il subject si occupa di notificare tutti gli oggetti iscritti quando cambia lo stato
- L'accoppiamento tra subject e observer deve essere lasco

</div>

<!-- New subsection -->

### UML

```mermaid
classDiagram
direction TB

class Subject {
    <<Abstract>>
    -List~Observer~
    +attach(Observer observer)
    +detach(Observer observer)
    +notify()
}

class ConcreteSubject {
    +State state
    +setState(State state)
    +getState(): State
}

class Observer {
    <<Interface>>
    +update(Subject subject)
}

class ConcreteObserver {
    +State state
    +update(Subject subject)
}

Subject <|-- ConcreteSubject
Observer <|.. ConcreteObserver
```

<!-- New subsection -->

### Diagramma di sequenza

```mermaid
sequenceDiagram
actor c as Client
participant S as ConcreteSubject
participant O as ConcreteObserver

c ->>+ S : attach(concreteObject)
S -->>- c : #10003;
c ->>+ S : modify()
S ->>+ O : update(this)
O ->>+ S : getStet()
S -->>- O : state
O -->>- S : #10003;
S -->>- c : #10003;
```

<!-- New subsection -->

### Codice Subject

```java
public abstract class Subject {
    protected Set<Observer> observers;
    public void attach(Observer observer) { observers.put(observer); }
    public void detach(Observer observer) { observers.remove(observer); }
    protected void notify(Object state) {
        for (Observer observer : observers)
            observer.update(this, state);
    }
}
```

```java
public class BookStore extends Subject {
    List<Book> books;
    public List<Book> getBooks() { return books; }
    public void addBook(Book book) {
        books.add(book);
        notify(books);
    }
}
```

<!-- New subsection -->

### Codice Observer

```java
public interface Observer {
    public void update(Subject subject, Object state);
}
```

```java
public class Reader implements Observer {
    List<String> bookWishlist;

    @Override
    public void update(Subject subject, Object state){
        if (state instanceof List<Book> books){
            for (Book book : books) {
                if (wishlist.contains(book))
                    book.buy();
            }
        }
    }
}
```

<!-- New subsection -->

### Implementazione in Java

Data l'importanza del pattern, Java ne fornisce una implementazione nativa, con le interfacce `Observer` e `Observable`.
Tuttavia il loro utilizzo è stato deprecato a partire dalla versione 9.

L'alternativa nativa è rappresentata da `java.util.concurrent.Flow`, che fornisce un'interfaccia per la pubblicazione e sottoscrizione di eventi in maniera asincrona.

<!-- New subsection -->

### Possibili applicazioni

- Gestione di un'architettura distribuita
- Sistema di notifiche
- Attesa di input esterni

<!-- New subsection -->

### Pro e contro

<div class="cols">

- La lista di oggetti da notificare è dinamica
- Approccio push invece che pull
- Associazione lasca fra Subject e Observers

<br/>

- Non c'è garanzia nell'ordine delle notifiche
- L'interfaccia dell'Observer tende a essere generica e necessitare cast

</div>

<!-- New section -->

## Composite

Il composite è un design pattern strutturale.

Consente di rappresentare oggetti composti da altri oggetti in modo da trattarli come se fossero oggetti semplici.

<!-- New subsection -->

### Problema e soluzione

<div class="cols">

- Necessità di gestire una gerarchia di oggetti ad albero
- Evitare che il client si preoccupi di gestire interfacce diverse per oggetti semplici e composti
- Le chiamate devono essere riportate a tutti gli oggetti della struttura

<br/>

- Implementare una singola interfaccia per tutti gli oggetti della gerarchia
- Permettere una specializzazione, trasparente per il client, di oggetti semplici e composti
- I metodi possono essere richiamati ricorsivamente

</div>

<!-- New subsection -->

### UML

```mermaid
classDiagram
direction TB

class Component {
    <<Interface>>
    +operation()
}

class Leaf {
    +operation()
}

class Composite {
    +add(Component c)
    +remove(Component c)
    +operation()
}

note for Component "Client"
Component <|.. Leaf
Component <|.. Composite
```

<!-- New subsection -->

### Codice

```java
public interface Item {
    public float getCost();
}
```

```java
public class Book implements Item {
    private float price;
    public float getCost() { return price; }
}
```

```java
public class Box implements Item {
    private List<Item> items;
    public void add(Item item) { items.add(item); }
    public void remove(Item item) { items.remove(item); }
    public float getCost() {
        float cost = 0;
        for (Item item : items)
            cost += item.getCost();
        return cost;
    }
}
```

<!-- New subsection -->

### Possibili applicazioni

- Strutture ad alberi
- Gestione di file e cartelle
- Organizzazione di oggetti in una gerarchia

<!-- New subsection -->

### Pro e contro

<div class="cols">

- Il client non deve conoscere la gerarchia
- È possibile interagire con gli oggetti utilizzando la medesima interfaccia

<br/>

- Non è applicabile se le differenze fra le categorie di oggetti iniziano a diventare troppo evidenti

</div>

<!-- New section -->

## Strategy

Il strategy è un design pattern comportamentale.

Consente di definire una famiglia di algoritmi, rendendoli intercambiabili e indipendenti dagli altri.

<!-- New subsection -->

### Problema e soluzione

<div class="cols">

- Necessità di utilizzare diversi algoritmi per lo stesso scopo
- Fare in modo che l'implementazione sia trasparente al client
- Poter cambiare l'algoritmo a runtime

<br/>

- Definire una interfaccia comune per tutti gli algoritmi
- Separare l'algoritmo dalla classe che lo utilizzerà
- Applicare dependency injection

</div>

<!-- New subsection -->

### UML e diagramma di sequenza

```mermaid
classDiagram
direction LR

class Strategy {
    <<Interface>>
    +execute()
}

class ConcreteStrategy {
    +execute()
}

class Context {
    -Strategy strategy
    +setStrategy(Strategy s)
    +execute()
}

note for Context "Client"
Strategy <|.. ConcreteStrategy
Context o-- Strategy
```

<br/>

```mermaid
sequenceDiagram

actor c as Client
participant C as Context
participant S as ConcreteStrategy

c ->>+ C: setStrategy(Strategy s)
C -->>- c: #10003;
c ->>+ C: execute()
C ->>+ S: execute()
S -->>- C: #10003;
C -->>- c: #10003;
```

<!-- New subsection -->

### Codice

```java
public class Graph {
    // ...
    SPAlgorithm algorithm;
    public void setShortestPathAlgorithm(SPAlgorithm algorithm) {
        this.algorithm = algorithm;
    }
    public List<Node> shortestPath(Node source, Node destination) {
        return algorithm.shortestPath(source, destination);
    }
}
```

```java
public class Dijkstra implements SPAlgorithm {
    public List<Node> shortestPath(Node source, Node destination) {
        // ...
    }
}

public class BellmanFord implements SPAlgorithm {
    public List<Node> shortestPath(Node source, Node destination) {
        // ...
    }
}
```

<!-- New subsection -->

### Possibili applicazioni

- Gestione di algoritmi di ordinamento
- Diverse metodologie di calcolo di un percorso
- Possibilità di selezione fra algoritmi più o meno efficienti a seconda delle circostanze

<!-- New subsection -->

### Pro e contro

<div class="cols">

- Possibilità di cambiare l'algoritmo a runtime
- Separazione di responsabilità fra classe e algoritmo

<br/>

- I client potrebbero avere la necessità di conoscere gli algoritmi
- Potrebbe essere sostituito da un approccio funzionale

</div>

<!-- New section -->

## Command

Il command è un design pattern comportamentale.

Prevede di incapsulare una richiesta in un oggetto, permettendo di parametrizzare uno stesso invoker con richieste diverse, impostando arbitrariamente il receiver della determinata richiesta.

<!-- New subsection -->

### Problema e soluzione

<div class="cols">

- Mantenere separata la logica di presentazione da quella di business
- Permettere ad uno stesso invoker di lanciare richieste diverse senza preoccuparsi della loro implementazione
- Riutilizzare l'implementazione di una richiesta in più contesti

<br/>

- Incapsulare la richiesta stessa in un oggetto
- Parametrizzare l'invoker con un oggetto che implementa l'interfaccia della richiesta
- Far conoscere alla richiesta il receiver in grado di eseguirla

</div>

<!-- New subsection -->

### UML

```mermaid
classDiagram
direction LR

class Command {
    <<Interface>>
    +execute()
}

class ConcreteCommand1 {
    -Receiver receiver
    ConcreteCommand1(Receiver r)
    +execute()
}

class ConcreteCommand2 {
    -Receiver receiver
    +setReceiver(Receiver r)
    +execute()
}

class Invoker {
    -Command command
    +setCommand(Command c)
    +executeCommand()
}

class Receiver {
    +operation()
}

note for Invoker "Client"
Command <|.. ConcreteCommand1
Command <|.. ConcreteCommand2
Invoker o-- Command
ConcreteCommand1 --> Receiver
ConcreteCommand2 --> Receiver
```

<!-- New subsection -->

### Diagramma di sequenza

```mermaid
sequenceDiagram

actor c as Client
participant I as Invoker
participant C as ConcreteCommand
participant R as Receiver

c ->>+ I: setCommand(Command c)
I -->>- c: #10003;
c ->>+ I: executeCommand()
I ->>+ C: execute()
C ->>+ R: operation()
R -->>- C: #10003;
C -->>- I: #10003;
```

<!-- New subsection -->

### Invoker e receiver

```java
// Invoker
public class Button {
    Command command;
    public void setCommand(Command command) {
        this.command = command;
    }
    public void click() {
        command.execute();
    }
}
```

```java
// Receiver
public class DeathStar {
    private int x, y;
    public void selfDestroy() {
        System.out.println("La Death Star si è autodistrutta. But why?");
    }
    public void fireLaser() {
        System.out.println("Si spara il laser nel punto (" + x + ", " + y + ")");
    }
    public void aim(int x, int y) {
        this.x = x; this.y = y;
    }
}
```

<!-- New subsection -->

### Command

```java
public interface Command {
    void execute();
}
```

```java
public class SelfDestructCommand implements Command {
    private DeathStar deathStar;
    public SelfDestructCommand(DeathStar deathStar) {
        this.deathStar = deathStar;
    }
    public void execute() { deathStar.selfDestroy(); }
}
```

```java
public class ShootCommand implements Command {
    private DeathStar deathStar;
    private int x, y;
    public ShootCommand(DeathStar deathStar, int x, int y) {
        this.deathStar = deathStar;
        this.x = x;
        this.y = y;
    }
    public void execute() { deathStar.aim(x, y); deathStar.fireLaser(); }
}
```

<!-- New subsection -->

### Possibili applicazioni

- Comandi invocati da più sorgenti (GUI, CLI, etc.)
- Trasferimento di un comando su un altro thread
- Implementazione di un undo/redo
- Scheduling dei comandi

<!-- New subsection -->

### Pro e contro

<div class="cols">

- I comandi possono essere facilmente riutilizzati da più sender (invoker)
- Separazione di responsabilità fra sender e receiver
- Possibilità di comporre una sequenza di comandi

<br/>

- Aggiunta di un layer in più fra sender (invoker) e receiver

</div>

<!-- New section -->

## Challenge

- (Observer) Implementare un sistema di notifiche per un sistema di messaggistica istantanea
- (Composite) Simulare un file system con la possibilità di ottenere informazioni come la memoria occupata
- (Strategy) Implementare un sistema di ordinamento di array di interi con diverse strategie (Bubble Sort, Merge Sort, Quick Sort, etc.)
