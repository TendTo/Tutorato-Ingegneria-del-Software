# Java

Installazione e configurazione per programmare in Java.

<!-- New section -->

## Obiettivi

- Installare Java
- Configurare l'ambiente di sviluppo (VsCode)
- Il primo hello world
- Parametri da linea di comando
- Input utente

<!-- New section -->

## Java

Java è un linguaggio di programmazione sviluppato da Sun Microsystems nel 1995.  
Si tratta un linguaggio ad alto livello orientato agli oggetti e fortemente tipizzato.

Dopo averlo compilato i programmi in bytecode, questo viene eseguito su una macchina virtuale (JVM), disponibile per tutti i sistemi operativi.  
Il codice scritto in Java può essere eseguito su qualsiasi sistema, al costo di una penalità di prestazioni.

<!-- .element: class="fragment" data-fragment-index="1" -->

<!-- New section -->

## Installazione

<!-- New subsection -->

### Windows

- Scaricare l'installer (msi) da [qui](https://learn.microsoft.com/en-us/java/openjdk/download#openjdk-11018-lts)
- Lanciare l'installer

<!-- New subsection -->

### MAC

#### Homebrew

- Assicurarsi di avere installato [Homebrew](https://brew.sh/)
- Lanciare il comando `brew install openjdk@11`
- [Ulteriori dettagli](https://formulae.brew.sh/formula/openjdk)

<!-- New subsection -->

#### Manualmente

- Scaricare l'installer (tar.gz) per la versione 11.0.2 da [qui](https://jdk.java.net/archive/)
- Decomprimere il file ` tar -xf <nome_fiel>.tar.gz -C <destinazione>`
- Esportate le variabili d'ambiente `export JAVA_HOME=<destinazione>/jdk-11.0.2.jdk/Contents/Home` e `export PATH=\$JAVA_HOME/bin:\$PATH`

<!-- New subsection -->

### Linux

Utilizzate il gestore dei pacchetti del vostro sistema operativo.

#### Ubuntu

```shell
sudo apt install openjdk-11-jdk
```

#### Arch Linux

```shell
sudo pacman -S jdk11-openjdk
```

#### Fedora

```shell
sudo dnf install java-11-openjdk
```

<!-- New section -->

## Comandi utili per Java

- `java -version`
  - mostra la versione di Java installata
- `java -jar <nome_file>.jar`
  - esegue un file jar
- `javac <nome_file>.java`
  - compila un file java in bytecode (_.class_)
- `java <nome_file>`
  - esegue un file java

<!-- New subsection -->

- `javap <nome_file>.class`
  - decompila un file file bytecode restituendo il codice sorgente, se possibile
- `jar cf <nome_output_file>.jar <files>.class`
  - crea un file jar archivio contenente i file _class_
- `jar cfe <nome_output_file>.jar <main_class> <files>.class`
  - crea un file jar eseguibile contenente i file _class_

<!-- New section -->

## Editor

<!-- New subsection -->

### Intellij

- Scaricare l'[installer](https://www.jetbrains.com/idea/download/)
- In qualità di studenti, è possibile riscattare una [licenza gratuita](https://www.jetbrains.com/student/)

<!-- New subsection -->

### Eclipse

- Scaricare l'[installer](https://www.eclipse.org/downloads/)

<!-- New subsection -->

### VsCode

- Installare [VsCode](https://code.visualstudio.com/)
- Installare l'estensione [Java Extension Pack](https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-pack)

<!-- New section -->

## Hello World

<!-- New subsection -->

### Codice

```java[1|3,7|4-6|4|5]
// HelloWorld.java

class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
```

<!-- New subsection -->

### Compilazione ed esecuzione

```shell
javac HelloWorld.java
java HelloWorld
```

<!-- New section -->

## Parametri da linea di comando

Quando si lancia un programma da linea di comando, è possibile passare dei parametri che saranno poi accessibili al programma stesso sotto forma di un array di stringhe.

```java
public static void main(String[] args)
```

<!-- New subsection -->

### Codice

```java[4|5-8|11,12|14-29|31]
// Calculator.java

class Calculator {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: java Calculator <a> <op> <b>");
            System.out.println("<op> can be +, -, x, /");
            return;
        }

        int result;
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[2]);

        switch (args[1]) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "x":
                result = a * b;
                break;
            case "/":
                result = a / b;
                break;
            default:
                System.out.println("Unknown operator");
        }

        System.out.println(result);
    }
}
```

<!-- New subsection -->

### Compilazione ed esecuzione

```shell
javac Calculator.java
java Calculator 2 + 3
```

<!-- New section -->

## Input utente

Il programma può interagire con l'utente stampando e leggendo i caratteri sul terminale.  
Vi sono diversi modi per farlo.
In questo caso utilizzeremo la classe `Scanner`.

<!-- New subsection -->

### Codice

```java[1,2|6|8|9-11|16-35|37|39|40-42|44-48]
import java.util.Random;
import java.util.Scanner;

// InverseCalculator.java

public class InverseCalculator {
    public static void main(String[] args) {
        Random random = new Random();
        int a = random.nextInt(20);
        int b = random.nextInt(10);
        int op = random.nextInt(4);

        int result;
        char opChar;

        switch (op) {
            case 0:
                result = a + b;
                opChar = '+';
                break;
            case 1:
                result = a - b;
                opChar = '-';
                break;
            case 2:
                result = a * b;
                opChar = 'x';
                break;
            case 3:
                result = a / b;
                opChar = '/';
                break;
            default:
                return;
        }

        System.out.print("What is " + a + " " + opChar + " " + b + "? ");

        // int answer = Integer.parseInt(System.console().readLine());
        Scanner scanner = new Scanner(System.in);
        int answer = scanner.nextInt();
        scanner.close();

        if (answer == result) {
            System.out.println("Correct!");
        } else {
            System.out.println("Wrong!");
        }
    }
}
```

<!-- New subsection -->

### Compilazione ed esecuzione

```shell
javac InverseCalculator.java
java InverseCalculator
```

<!-- New section -->

## Challenge

- Scrivere un Hello World in maniera più creativa
- Scrivere un programma che calcoli l'area di un cerchio
- Rendere più interattivo il programma di calcolo inverso, chiedendo all'utente di rispondere più volte e parametrizzandolo da riga di comando
