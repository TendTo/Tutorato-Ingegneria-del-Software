# Sulle spalle dei giganti

Includere ed utilizzare librerie.

<!-- New section -->

## Librerie

Le librerie sono dei pacchetti di codice che possono essere riutilizzati in più progetti.

Java ha una libreria standard molto ricca, ed è possibile includere innumerevoli librerie di terze parti.

<!-- .element: class="fragment" data-fragment-index="1" -->

Per includere una libreria esterna, è necessario scaricarla e aggiungerla al progetto.
Per poter utilizzare le classi di una libreria, è necessario importarle all'interno del file.

<!-- .element: class="fragment" data-fragment-index="2" -->

```java
import java.util.Scanner; // importa la classe Scanner del package java.util
import java.util.*; // importa tutte le classi del package java.util
```

<!-- .element: class="fragment" data-fragment-index="2" -->

<!-- New section -->

## Libreria standard

Java offre una libreria standard molto ricca, che include classi per la gestione di file, stringhe, numeri, strutture dati e molto altro.

Sarebbe impossibile mostrare tutte le classi disponibili, ma è possibile trovare una lista completa [qui](https://docs.oracle.com/javase/17/docs/api/).

<!-- .element: class="fragment" -->

<!-- New subsection -->

### Esempi notevoli

- `java.util.ArrayList`: classe per la gestione di array dinamici
- `java.util.Scanner`: classe per la lettura di input da tastiera
- `java.util.HashMap`: classe per la gestione di mappe chiave-valore
- `java.util.Random`: classe per la generazione di numeri casuali
- `java.util.Date`: classe per la gestione di date e orari
- `java.io.FileReader`: classe per la lettura di file di testo
- `java.io.BufferedReader`: classe per la lettura di stream di testo bufferizzati

<!-- New subsection -->

### Google è vostro amico

È impossibile conoscere a memoria tutte le utility offerte dalla libreria standard.

Piuttosto di fare lo sforzo inutile di ricordare centinaia di classi, memorizzate quelle che vi capiterà di usare più frequentemente e affidatevi a Google per il resto.

<!-- .element: class="fragment" -->

<!-- New section -->

## Librerie esterne

La maggior parte delle librerie esterne può essere trovata su [Maven repository](https://mvnrepository.com/).

Ci sono molti modi per includere una libreria in un progetto, ma il più semplice è quello di scaricare il file `.jar` e renderlo accessibile agli altri file sorgente.

<!-- .element: class="fragment" -->

Un file `.jar` è un file compresso che contiene le classi di una libreria, il file `MANIFEST.MF` e le risorse.

<!-- .element: class="fragment" -->

<!-- New subsection -->

### Struttura di un progetto

Sebbene non ci siano regole rigide, è buona norma organizzare il progetto in modo che sia chiaro dove si trovano le classi, le risorse e le librerie.

<div class="cols">

Questo è un possibile approccio:

```shell
.
├── lib # librerie esterne
├── out # file compilati
└── src # file sorgente
    └── main
        ├── resources # risorse
        │   └── META-INF
        │       └── MANIFEST.MF
        └── java
            ├── data # package
            │   └── *.java
            └── Main.java # entry point
```

</div>

<!-- .element: class="fragment cols" -->

<!-- New subsection -->

### Compilare

Affinché il compilatore possa trovare le classi di una libreria, è necessario specificare il percorso della cartella contenente il file `.jar`.

```shell
javac -cp src:lib/* src/main/java/Main.java -d out
```

- `-cp (classpath)`: lista di percorsi da considerare per la ricerca delle classi, separate da "`:`"
- `-d`: percorso della cartella in cui posizionare l'output della compilazione

<!-- New subsection -->

### Esecuzione

Per eseguire il programma

```shell
java -cp <src folder>:<lib folder>/* <main class>
# Esempio
java -cp out:/lib/* main.java.Main <nome-file>
```

<!-- New subsection -->

### Produrre un file JAR

Per produrre un file JAR, è necessario creare un file `MANIFEST.MF` contenente il nome della classe principale e il percorso delle librerie esterne.  
Il percorso delle librerie esterne deve essere relativo alla cartella contenente il JAR prodotto.

```shell
Manifest-Version: 1.0
Main-Class: main.java.Main
Class-Path: ../lib/gson-2.10.1.jar
```

<!-- .element: class="fragment" data-fragment-index="1" -->

Il file JAR viene creato con il comando

<!-- .element: class="fragment" data-fragment-index="2" -->

```shell
jar cfm <nome-file>.jar <percorso-file-manifest> -C <percorso-cartella-classes> .
# Esempio
jar -cfm out/JsonReader.jar src/main/resources/META-INF/MANIFEST.MF -C out .
```

<!-- .element: class="fragment" data-fragment-index="2" -->

<!-- New subsection -->

### Esecuzione del file JAR

Il comando per eseguire il JAR è

```shell
java -jar <nome-file>.jar <argomenti>
# Esempio
java -jar out/JsonReader.jar <nome-file>
```

Si noti che ciò continua a funzionare finché il percorso verso le librerie esterne, specificato nel MANIFEST, continua ad essere corretto in relazione al file JAR.

<!-- .element: class="fragment" -->

<!-- New subsection -->

### Considerazioni

Non sarebbe bello avere un tool che si occupa di gestire tutte le librerie esterne e il processo di compilazione?

<!-- New section -->

## Esempio

Applicazione in grado di leggere un file JSON con una struttura prestabilita e stampare a video i dati.

<!-- New subsection -->

### JSON

Il JavaScript Object Notation (JSON) è un formato di dati molto comune, utilizzato per lo scambio di informazioni tra applicazioni.

```json
{
  "users": [
    { "name": "John", "age": 30 },
    { "name": "Mary", "age": 28 }
  ],
  "messages": [
    { "from": "John", "to": "Mary", "message": "Hi, how are you?" },
    { "from": "Mary", "to": "John", "message": "I'm fine, thanks!" }
  ]
}
```

<!-- New subsection -->

### Libreria Gson

La libreria Gson è una libreria realizzata da Google per la serializzazione e deserializzazione di oggetti Java in JSON.

[Maven repository](https://mvnrepository.com/artifact/com.google.code.gson/gson/2.10.1)
[Jar](https://repo1.maven.org/maven2/com/google/code/gson/gson/2.10.1/gson-2.10.1.jar)

<!-- New subsection -->

### Documentazione di Gson

Ogni qualvolta si utilizza una libreria esterna, è estremamente consigliato consultarne la [documentazione ufficiale](https://github.com/google/gson/blob/master/UserGuide.md).

Quello che ci interessa è il metodo [`fromJson`](https://github.com/google/gson/blob/1da826dc6c8eb85ad9ed97e120823428fe1236f4/gson/src/main/java/com/google/gson/Gson.java#L1076) della classe `Gson`.

```java
FileReader file = new FileReader("path/to/file");
BufferedReader reader = new BufferedReader(file);
Object json = new Gson().fromJson(reader, Object.class);
```

<!-- New subsection -->

### Utilizzare i record

Possiamo utilizzare dei record per costruire velocemente una trasposizione in Java delle informazioni contenute nel file JSON.

```java
public record Message(String from, String to, String message) {}
public record User(String name, int age) {}
public record ApiResponse(User[] users, Message[] messages) {}
```

Utilizzando il metodo `fromJson` di `Gson`, possiamo ottenere un oggetto `ApiResponse` contenente le informazioni del file JSON.

<!-- .element: class="fragment" data-fragment-index="1" -->

```java
FileReader file = new FileReader("path/to/file");
BufferedReader reader = new BufferedReader(file);
ApiResponse json = new Gson().fromJson(reader, ApiResponse.class);
```

<!-- .element: class="fragment" data-fragment-index="1" -->

<!-- New section -->

## Challenge

- Applicazione in grado di leggere più formati di file JSON, in base all'input dell'utente
- Applicazione in grado di leggere JSON ricevuti tramite una richiesta ad una REST API
