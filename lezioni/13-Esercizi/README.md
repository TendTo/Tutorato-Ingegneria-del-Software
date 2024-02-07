# Esercizi

Esercizi presi dai compiti in classe.

<!-- New subsection -->

## Warning

Questi esercizi sono stati svolti da me e da altri studenti, quindi potrebbero contenere errori.
Se ne trovate, segnalateli.

<!-- New section -->

## Domande a risposta multipla

<!-- New subsection -->

<details class="question">
<summary>
<b>In generale, per convalidare dei requisiti non è possibile</b>
  <ol>
    <li> Eseguirli tramite test
    <li> Servirsi di prototipi
    <li> Usare modelli di analisi di consistenza
    <li> Sviluppare dei test
  </ol>
</summary>
<i>3. Usare modelli di analisi di consistenza</i>
<br/>
Possiamo controllare che il software soddisfi i requisiti tramite test, facendo provare al client i vari prototipi e sviluppando dei test che controllino un determinato requisito.
</details>

<!-- New subsection -->

<details class="question">
<summary>
<b>La frase "Il sistema dovrà fornire prestazioni adeguate" è</b>
  <ol>
    <li> Un requisito molto importante
    <li> Un requisito funzionale
    <li> Un requisito non funzionale
    <li> Un requisito interpretabile in tanti modi
  </ol>
</summary>
<i>3. Un requisito non funzionale</i>
<br/>
I requisiti non funzionali riguardano come il sistema svolge la sua funzione (es. affidabilità, efficienza, prestazioni,
manutenibilità, etc.)
</details>

<!-- New subsection -->

<details class="question">
<summary>
<b>Nell'ingegneria dei requisiti è necessario</b>
  <ol>
    <li> Tutte le risposte
    <li> Risolvere i conflitti fra i requisiti
    <li> Revisionare i requisiti raccolti
    <li> Stabilire le priorità
  </ol>
</summary>
<i>1. Tutte le risposte</i>
<br/>
Tutti i passi elencati vengono applicati nell'ingegneria dei requisiti.
</details>

<!-- New subsection -->

<details class="question">
<summary>
<b>La navigabilità nelle relazioni dei diagrammi UML indica</b>
  <ol>
    <li> Per un oggetto, le istanze di cui invoca i metodi
    <li> Per una classe, quali altre classi conosce/usa
    <li> Per una classe, quali oggetti usa
    <li> Per una classe, le classi di cui è composta
  </ol>
</summary>
<i>2. Per una classe, quali altre classi conosce/usa</i>
<br/>
La freccia singola indica che una classe conosce un'altra classe e la utilizza in una qualche forma.
</details>

<!-- New subsection -->

<details class="question">
<summary>
<b>Le fasi generali del processo RUP sono</b>
  <ol>
    <li> Revisione requisiti, unione e uso componenti, produzione e pianificazione
    <li> Analisi, progettazione, implementazione, test e revisione
    <li> Avvio, elaborazione, costruzione, transizione, produzione
    <li> Revisione, decisione, pianificazione, marketing
  </ol>
</summary>
<i>3. Avvio, elaborazione, costruzione, transizione, produzione</i>
<br/>
<a href="https://it.wikipedia.org/wiki/Rational_Unified_Process">Descrizione del processo RUP.</a>
</details>

<!-- New subsection -->

<details class="question">
<summary>
<b>Il processo a cascata non è adatto a</b>
  <ol>
    <li> Cambiare i requisiti in nessuna delle sue fasi
    <li> Sviluppare sistemi realtime
    <li> Cambiare requisiti durante le fasi della progettazione e codifica
    <li> Produrre prototipi nella prima fase di sviluppo
  </ol>
</summary>
<i>3. Cambiare requisiti durante le fasi della progettazione e codifica</i>
<br/>
Nel processo a cascata, una volta stabiliti i requisiti, questi saranno considerati immutabili ed utilizzati per tutti gli step successivi, che si concludono con il rilascio del prodotto.
</details>

<!-- New subsection -->

<details class="question">
<summary>
<b>Quali delle seguenti attività n on è prevista in nessun processo di sviluppo</b>
  <ol>
    <li> Fornire al cliente gli sviluppatori di software
    <li> Rilasciare al cliente incrementi di software a cadenza regolare
    <li> Permettere al cliente di lavorare nella sede degli sviluppatori
    <li> Valutare se la produzione del software è strategica
  </ol>
</summary>
<i>4. Valutare se la produzione del software è strategica</i>
<br/>
Questa è una valutazione che spetta al cliente, non agli sviluppatori.
</details>

<!-- New subsection -->

<details class="question">
<summary>
<b>Per il design pattern Observer, le sottoclassi di Observer</b>
  <ol>
    <li> Dovrebbero essere al massimo 20
    <li> Dovrebbero avere almeno 2 istanze ciascuna
    <li> Dovrebbero essere almeno 2
    <li> Potrebbero avere una sola istanza ciascuna
  </ol>
</summary>
<i>4. Potrebbero avere una sola istanza ciascuna</i>
<br/>
Il pattern Observer permette ad un numero arbitrario e dinamico di Observer di effettuare un attach al Subject per essere informati di eventuali cambiamenti del suo stato.
</details>

<!-- New subsection -->

<details class="question">
<summary>
<b>Nel design pattern Mediator</b>
  <ol>
    <li> Colleague conosce la sua sottoclasse
    <li> Mediator conosce la sua sottoclasse
    <li> Colleague conosce la sottoclasse di Mediator
    <li> Colleague conosce Mediator
  </ol>
</summary>
<i>4. Colleague conosce Mediator</i>
<br/>
È sufficiente che tutti i Colleague abbiano modo di utilizzare l'interfaccia offerta da Mediator per potersi scambiare i messaggi fra di loro.
Il concrete mediator, invece, deve conoscere le implementazioni dei colleague.
</details>

<!-- New subsection -->

<details class="question">
<summary>
<b>I design pattern</b>
  <ol>
    <li> Forniscono una collezione di oggetti
    <li> Descrivono una soluzione riusabile ad un problema noto
    <li> Forniscono un modo per riutilizzare il codice
    <li> Forniscono una gerarchia di classi
  </ol>
</summary>
<i>2. Descrivono una soluzione riusabile ad un problema noto</i>
<br/>
I design pattern sono soluzioni ben studiate che permettono di risolvere un problema noto in modo efficiente e riproducibile tramite una gerarchia di classi, ognuno con un ruolo ben definito.
</details>

<!-- New subsection -->

<details class="question">
<summary>
<b>Una variabile di un certo tipo T</b>
  <ol>
    <li> Può contenere solo istanze di T
    <li> Può contenere istanze di T e di super-tipi di T
    <li> Può contenere qualsiasi istanza
    <li> Può contenere istanze di T e di sottotipi di T
  </ol>
</summary>
<i>4. Può contenere istanze di T e di sottotipi di T</i>
<br/>
Animal a = new Dog(); // Valido
<br/>
Dog d = new Animal(); // Non valido
</details>

<!-- New subsection -->

<details class="question">
<summary>
<b>Nello sviluppo di sistemi OO è incoraggiato l'uso di dipendenze</b>
  <ol>
    <li> Da interfacce e non da classi
    <li> Da librerie esterne
    <li> Da classi e non da interfacce
    <li> Da classi e oggetti
  </ol>
</summary>
<i>1. Da interfacce e non da classi</i>
<br/>
È sempre meglio dipendere da interfacce piuttosto che da classi concrete, in modo da poter cambiare l'implementazione senza dover modificare il codice che dipende da essa.
</details>

<!-- New subsection -->

<details class="question">
<summary>
<b>Tramite l'uso del Factory Method, il client ha il vantaggio di</b>
  <ol>
    <li> Poter creare gli oggetti a runtime
    <li> Poter scegliere quale creator utilizzare
    <li> Controllare quando usare e creare un'istanza
    <li> Indicare solo quando ha bisogno di un'istanza, ma non quando questa deve essere creata
  </ol>
</summary>
<i>1. Poter creare gli oggetti a runtime</i>
<br/>
Il Factory Method permette di creare un'istanza di una classe senza doverne conoscere il tipo, in modo da poterla cambiare a runtime in base ai parametri forniti al creator.
</details>

<!-- New subsection -->

<details class="question">
<summary>
<b>Quali caratteristiche ha un sistema riflessivo</b>
  <ol>
    <li> Introspezione e intercettazione
    <li> Elementi come classi, istanze e metodi
    <li> Capacità di conoscere lo stato di un oggetto
    <li> Concetti di ereditarietà e polimorfismo
  </ol>
</summary>
<i>1. Introspezione e intercettazione</i>
<br/>
Attraverso la riflessione è possibile conoscere dettagli a proposito di un oggetto quali i metodi che offre, le loro firme e i parametri che accettano.
Questo permette, ad esempio, di intercettare le chiamate ai metodi e di modificarne il comportamento.
</details>

<!-- New subsection -->

<details class="question">
<summary>
<b>Nella soluzione proposta dal Mediator</b>
  <ol>
    <li> Una sottoclasse di Mediator chiama i metodi di alcune sottoclassi
    <li> Mediator chiama i metodi di alcune superclassi
    <li> Una sottoclasse di Mediator chiama i metodi di alcune superclassi
    <li> Mediator chiama i metodi di alcune sottoclassi
  </ol>
</summary>
<i>1. Una sottoclasse di Mediator chiama i metodi di alcune sottoclassi</i>
<br/>
L'implementazione dell'interfaccia Mediator chiama i metodi dei ConcreteColleague, che sono sottoclassi di Colleague.
</details>

<!-- New subsection -->

<details class="question">
<summary>
<b>Nel design pattern State, i client conoscono</b>
  <ol>
    <li> Nessuna sottoclasse di State
    <li> State
    <li> Sottoclassi di State
    <li> State e sottoclasse di State
  </ol>
</summary>
<i>1. Nessuna sottoclasse di State</i>
<br/>
L'utilizzo dello state è interno al Context.
È solo con questo che il client interagisce.
</details>

<!-- New subsection -->

<details class="question">
<summary>
<b>Le relazioni di aggregazione in UML sono rappresentate da</b>
  <ol>
    <li> Rettangoli annidati
    <li> Linee con triangoli alle estremità
    <li> Linee
    <li> Linee con un rombo all'estremità
  </ol>
</summary>
<i>4. Linee con un rombo all'estremità</i>
<br/>
Nel caso dell'aggregazione il rombo è vuoto.
Se si trattasse di composizione, il rombo sarebbe pieno.
</details>

<!-- New subsection -->

<details class="question">
<summary>
<b>In UML, un diagramma delle attività mostra rettangoli</b>
  <ol>
    <li> Per attività, prodotti come ellissi e flussi con frecce
    <li> Per attività, flussi con frecce
    <li> Arrotondati per stati, flussi con frecce
    <li> Arrotondati per attività, flussi con frecce
  </ol>
</summary>
<i>4. Arrotondati per attività, flussi con frecce</i>
La sintassi di un diagramma delle attività è la seguente:
<ul>
<li> Rettangoli arrotondati per le attività
<li> Frecce per i flussi
<li> Rombi per le ramificazioni
<li> Cerchio pieno per lo stato iniziale
</ul>
<br/>
Explanation
</details>

<!-- New subsection -->

<details class="question">
<summary>
<b>Date le attività T1 da 15 giorni, T2 da 3 e T3 da 7, e sia T3 dipendente da T2; T1 e T2 possono essere eseguite in parallelo</b>
  <ol>
    <li> T2 può durare 22 giorni senza cambiare la durata complessiva
    <li> Qualsiasi ritardo su T1, T2 o T3 si ripercuote sulla durata complessiva
    <li> T1 può durare 5 giorni in più senza cambiare la durata complessiva
    <li> T3 può durare 5 giorni in più senza cambiare la durata complessiva
  </ol>
</summary>
<i>4. T3 può durare 5 giorni in più senza cambiare la durata complessiva</i>
<br/>
T1 dura 15 giorni, T2 + T3 10 giorni.
Se T3 dura 5 giorni durasse 5 giorni in può, entrambi i flussi durerebbero 15 giorni, che è comunque la durata complessiva del progetto.
</details>

<!-- New subsection -->

<details class="question">
<summary>
<b>Quando si dovrà lavorare a stretto contatto con il cliente, è consigliabile  i/il processo/i</b>
<br/>
  <ol>
    <li> Cascata
    <li> Cascata, RUP
    <li> RUP
    <li> Spirale, XP
  </ol>
</summary>
<i>4. Spirale, XP</i>
<br/>
Sia il processo a spirale che XP prevedono un contatto continuo con il cliente per poter rispondere ai cambiamenti nei requisiti o eventuali feedback.
</details>

<!-- New subsection -->

<details class="question">
<summary>
<b>Il processo XP produce</b>
  <ol>
    <li> Poca documentazione, aderente allo standard UML
    <li> Poca documentazione
    <li> La documentazione che serve, a discrezione degli sviluppatori
    <li> Molta documentazione
  </ol>
</summary>
<i>2. Poca documentazione</i>
<br/>
Nel processo XP la documentazione è ridotta al minimo, a favore di Story Cards.
</details>

<!-- New subsection -->

<details class="question">
<summary>
<b>Un metodo di tipo synchronized</b>
  <ol>
    <li> Consente di iniziare l'esecuzione più velocemente
    <li> Una volta iniziato, procede fino alla fine
    <li> Aumenta il parallelismo del sistema
    <li> Permette l'esecuzione di un solo thread all'interno dell'oggetto
  </ol>
</summary>
<i>4. Permette l'esecuzione di un solo thread all'interno dell'oggetto</i>
<br/>
Un metodo di tipo synchronized è un metodo che può essere eseguito da un solo thread alla volta.
Implementa i monitor di Hoare.
</details>

<!-- New subsection -->

<details class="question">
<summary>
<b>Un'interfaccia X, ovvero public interface X</b>
  <ol>
    <li> Serve a runtime ad allocare memoria per una variabile
    <li> Può contenere metodi implementati
    <li> Ha lo scopo di definire un tipo
    <li> Ha lo scopo di definire un sottotipo
  </ol>
</summary>
<i>3. Ha lo scopo di definire un tipo</i>
<br/>
Un'interfaccia definisce un tipo che sarà poi implementato da altre classi.
</details>

<!-- New subsection -->

<details class="question">
<summary>
<b>Un'interfaccia X, ovvero public interface X</b>
  <ol>
    <li> Contiene l'implementazione di algoritmi
    <li> Può essere istanziata
    <li> Permette alle classi che la usano di non legarsi ad una implementazione
    <li> Contiene implementazioni di algoritmi non completi
  </ol>
</summary>
<i>3. Permette alle classi che la usano di non legarsi ad una implementazione</i>
<br/>
Utilizzando un'interfaccia, avviene un accoppiamento più lasco fra le classi che la usano, che non devono necessariamente conoscere le classe che la implementano.
</details>

<!-- New subsection -->

<details class="question">
<summary>
<b>I design pattern strutturali permettono</b>
  <ol>
    <li> Creare oggetti
    <li> Comporre oggetti ma non classi
    <li> Comporre classi ma non oggetti
    <li> Comporre classi e oggetti
  </ol>
</summary>
<i>4. Comporre classi e oggetti</i>
<br/>
I design patter strutturali permettono di comporre classi e oggetti al fine di realizzare un sistema più complesso.
Esempi sono l'Adapter, il Composite, il Bridge, il Decorator.
</details>

<!-- New subsection -->

<details class="question">
<summary>
<b>La legge di Lehman sul cambiamento continuo dice</b>
  <ol>
    <li> Poiché i sistemi sono aggiornabili, i cambiamenti sono continui
    <li> I sistemi dovrebbero essere continuamente cambiati per rimanere utili
    <li> Poiché i sistemi mutano continuamente degradano le loro prestazioni
    <li> I sistemi prima o poi dovranno essere sostituiti da altri
  </ol>
</summary>
<i>2. I sistemi dovrebbero essere continuamente cambiati per rimanere utili</i>
<br/>
Una delle caratteristiche che distingue il software da altri prodotti è la sua modificabilità.
Al fine di impedire l'obsolescenza, il software deve essere continuamente aggiornato e mantenuto.
</details>

<!-- New subsection -->

```java
public Libro getLibro() { return b.getLib(); }
```

<details class="question">
<summary>
<b>Il frammento di codice...</b>
  <ol>
    <li> è compilabile solo se getLib() restituisce un'istanza di Libro
    <li> è compilabile solo se b è inizializzato
    <li> sta svolgendo il ruolo di Factory method
    <li> è inutile
  </ol>
</summary>
<i>1. è compilabile solo se getLib() restituisce un'istanza di Libro</i>
<br/>
Se getLib() non restituisce un oggetto di tipo Libro, il compilatore restituirà un errore.
Il codice è compilabile nel caso in cui b sia definito ma non inizializzato, ma a runtime verrà lanciata una NullPointerException.
</details>

<!-- New subsection -->

<details class="question">
<summary>
<b>I requisiti utente sono più spesso descritti tramite</b>
  <ol>
    <li> Linguaggio naturale, tabelle e diagrammi
    <li> Casi d'uso soltanto
    <li> Linguaggio formale
    <li> Diagrammi soltanto
  </ol>
</summary>
<i>1. Linguaggio naturale, tabelle e diagrammi</i>
<br/>
Vi sono vari metodi per descrivere i requisiti utente.
Un cliente potrebbe usarne più di uno, partendo da un linguaggio naturale, per poi passare ad una versione più formale tramite tabelle e diagrammi.
</details>

<!-- New subsection -->

<details class="question">
<summary>
<b>Cosa significa che i requisiti devono essere completi e consistenti?</b>
  <ol>
    <li> Ogni requisito ha un modello di descrizione
    <li> Ogni requisito deve avere testo e diagrammi
    <li> Tutto ciò che è descritto è testabile, ma non tutto è descritto
    <li> Bisogna descrivere tutto senza contraddizioni
  </ol>
</summary>
<i>4. Bisogna descrivere tutto senza contraddizioni</i>
<br/>
Nella fase di analisi dei requisiti, è importante che questi descrivano il comportamento del software nella sua interezza e che non ci siano requisiti in conflitto tra loro.
</details>

<!-- New subsection -->

<details class="question">
<summary>
<b>Uno dei vantaggi della riflessione computazionale consiste nella possibilità di</b>
  <ol>
    <li> istanziare classi conosciute a compile time
    <li> invocare metodi conosciuti a compile time
    <li> invocare metodi conosciuti non conosciuti a design time
    <li> invocare metodi conosciuti non conosciuti a runtime
  </ol>
</summary>
<i>3. invocare metodi conosciuti non conosciuti a design time</i>
<br/>
Tramite la riflessione si ha la possibilità di scorrere ed invocare a runtime i metodi di un oggetto senza conoscerli a priori.
</details>

<!-- New subsection -->

<details class="question">
<summary>
<b>Il metodo <i>newInstance()</i> è fornito dalla classe</b>
  <ol>
    <li> Implementata dal programmatore dell'applicazione
    <li> Method
    <li> Object
    <li> Class
  </ol>
</summary>
<i>4. Class</i>
<br/>
Si tratta di un metodo della class Class che permette di creare una nuova istanza della classe rappresentata dall'oggetto Class.
È deprecated a partire da Java 9.
</details>

<!-- New subsection -->

<details class="question">
<summary>
<b>Nel design pattern Observer si desidera ottenere</b>
  <ol>
    <li> L'indipendenza tra un oggetto ed il numero e il tipo di osservatori
    <li> Oggetti che non interagiscono
    <li> Due oggetti strettamente accoppiati
    <li> Due oggetti lascamente accoppiati
  </ol>
</summary>
<i>1. L'indipendenza tra un oggetto ed il numero e il tipo di osservatori</i>
<br/>
Nel pattern observer, il Subject mantiene una lista di Observer, che si possono registrare e deregistrare a runtime.
</details>

<!-- New subsection -->

<details class="question">
<summary>
<b>Nel design pattern State, i client conoscono</b>
  <ol>
    <li> ConcreteStateA e Context
    <li> ConcreteStateA, ConcreteStateB, etc.
    <li> State e Context
    <li> Context
  </ol>
</summary>
<i>4. Context</i>
<br/>
Il client interagisce con il Context.
Al suo interno, questo mantiene uno State che determina il suo comportamento e può cambiare a runtime.
</details>

<!-- New subsection -->

<details class="question">
<summary>
<b>Date le attività T1: 15g, T2: 5g e T3: 5g. T3 dipende da T2 e T1. T1 e T2 eseguono in parallelo. Il percorso critico è di</b>
<br/>
  <ol>
    <li> 15 giorni
    <li> 30 giorni
    <li> 25 giorni
    <li> 20 giorni
  </ol>
</summary>
<i>4. 20 giorni</i>
<br/>
T1 (15) -> T3 (5)
</details>

<!-- New subsection -->

<details class="question">
<summary>
<b>Con correttezza del software si intende</b>
  <ol>
    <li> Facilità nell'apportare cambiamenti per soddisfare nuove esigenze
    <li> Soddisfare il 90% degli utenti
    <li> Aderenza allo scopo, conformità alle specifiche
    <li> Evitare sprechi di memoria e del processore
  </ol>
</summary>
<i>3. Aderenza allo scopo, conformità alle specifiche</i>
<br/>
Un software è corretto se soddisfa le specifiche e se non ha difetti individuabili dai test.
</details>

<!-- New subsection -->

<details class="question">
<summary>
<b>In UML, l'implementazione di un'interfaccia è rappresentata da</b>
  <ol>
    <li> Linee tratteggiate con un rombo all'estremità
    <li> Linee continue con un triangolo vuoto all'estremità
    <li> Linee tratteggiate con un triangolo vuoto all'estremità
    <li> Linee senza frecce
  </ol>
</summary>
<i>3. Linee tratteggiate con un triangolo vuoto all'estremità</i>
<br/>
Nello schema UML, l'implementazione di un'interfaccia è rappresentata da una linea tratteggiata con un triangolo vuoto all'estremità che parte dalla classe concreta e punta verso l'interfaccia.
</details>

<!-- New subsection -->

<details class="question">
<summary>
<b>Un diagramma di interazione (o collaborazione) UML è</b>
  <ol>
    <li> Un grafo che mostra le chiamate tra i metodi delle istanze
    <li> Un grafo che mostra la navigabilità tra le classi
    <li> Un albero che mostra l'ereditarietà tra le classi
    <li> Un grafo che mostra l'ereditarietà e istanziazioni fra classi e oggetti
  </ol>
</summary>
<i>1. Un grafo che mostra le chiamate tra i metodi delle istanze</i>
<br/>
Il diagramma di interazione mostra le chiamate tra i metodi delle istanze che avvengono all'interno del software.
</details>

<!-- New subsection -->

<details class="question">
<summary>
<b>Nella soluzione proposta dal pattern Class Adapter</b>
  <ol>
    <li> L'adapter contiene un riferimento all'oggetto Adaptee
    <li> Il client contiene un riferimento all'oggetto Adaptee
    <li> L'Adapter eredita l'Adaptee
    <li> L'Adaptee contiene un riferimento all'oggetto Adapter
  </ol>
</summary>
<i>3. L'Adapter eredita l'Adaptee</i>
<br/>
Nella versione Class Adapter, l'Adapter eredita l'Adaptee.
Nella versione Object Adapter, l'Adapter contiene un riferimento all'Adaptee.
</details>

<!-- New subsection -->

<details class="question">
<summary>
<b>La soluzione suggerita dal design patter Class Adapter</b>
  <ol>
    <li> Adatta una classe modificandone i metodi
    <li> Elimina l'uso di una istanza all'interno di Adapter
    <li> Non si può implementare in Java
    <li> Istanzia un Adaptee all'interno dell'Adapter
  </ol>
</summary>
<i>2. Elimina l'uso di una istanza all'interno di Adapter</i>
<br/>
Estendendo direttamente l'Adaptee, l'Adapter non ha bisogno di contenere un riferimento all'Adaptee, in quanto è esso stesso un Adaptee.
</details>

<!-- New subsection -->

<details class="question">
<summary>
<b>I design pattern</b>
  <ol>
    <li> Descrivono il processo di riuso del codice
    <li> Sono una collezione di artefatti del programmatore
    <li> Descrivono una soluzione riusabile ad un problema noto
    <li> Forniscono una organizzazione gerarchica delle classi
  </ol>
</summary>
<i>3. Descrivono una soluzione riusabile ad un problema noto</i>
<br/>
I design pattern sono una raccolta di soluzioni ben studiate a problemi noti, che possono essere riutilizzate in contesti diversi.
</details>

<!-- New subsection -->

<details class="question">
<summary>
<b>Un design pattern è</b>
<br/>
  <ol>
    <li> Un problema ricorrente
    <li> Una soluzione collaudata ma generica
    <li> Una soluzione non collaudata
    <li> Un utile supporto per il riutilizzo del codice
  </ol>
</summary>
<i>2. Una soluzione collaudata ma generica</i>
<br/>
Ogni design pattern rappresenta una soluzione collaudata ad un problema ricorrente, ma è generica in quanto può essere applicata in contesti diversi, fintanto che l'intento del pattern è rispettato.
</details>

<!-- New subsection -->

<details class="question">
<summary>
<b>In un piano per le attività di un progetto troviamo</b>
  <ol>
    <li> Solo costi del personale
    <li> Solo diagrammi che indicano il flusso di dati
    <li> Diagrammi dei casi d'uso, delle classi e degli stati
    <li> Tabelle, diagrammi a barre e reti di attività
  </ol>
</summary>
<i>4. Tabelle, diagrammi a barre e reti di attività</i>
<br/>
<a href="https://www.appvizer.it/rivista/organizzazione/project-management/piano-di-progetto" target="_blank">Articolo</a>
</details>

<!-- New subsection -->

<details class="question">
<summary>
<b>Il design pattern Adapter permette a certe classi di interagire perché</b>
  <ol>
    <li> Rende note le istanze di classi presenti
    <li> Elimina le incompatibilità tra le interfacce
    <li> Passa le chiamate tra classi implementate in linguaggi diversi
    <li> Tiene traccia dei nomi delle classi disponibili
  </ol>
</summary>
<i>2. Elimina le incompatibilità tra le interfacce</i>
<br/>
La classe Adapter permette al client di chiamare i metodi dell'interfaccia Target, traducendoli poi in chiamate ai metodi dell'interfaccia Adaptee.
</details>

<!-- New subsection -->

<details class="question">
<summary>
<b>È consigliabile usare il Facade quando</b>
  <ol>
    <li> Si vogliono far dipendere i client solo da interfacce
    <li> Si vuole nascondere la complessità di un sottosistema
    <li> Si hanno classi molto accoppiate
    <li> Si hanno classi con funzionalità simili
  </ol>
</summary>
<i>2. Si vuole nascondere la complessità di un sottosistema</i>
<br/>
Il facade offre un'interfaccia di livello più alto al client, nascondendo una serie di chiamate a classi che compongono un sistema complesso.
</details>

<!-- New subsection -->

<details class="question">
<summary>
<b>Un documento dei requisiti ben scritto mirerà a fornire</b>
  <ol>
    <li> Valutazioni sul codice che deriverà dagli stessi requisiti
    <li> Informazioni da cui derivare la progettazione del sistema
    <li> Dettagli sulla progettazione del sistema
    <li> Dati sul guadagno che si trarrà dopo la produzione
  </ol>
</summary>
<i>2. Informazioni da cui derivare la progettazione del sistema</i>
<br/>
Il documento dei requisiti si produce nella fase di analisi, e contiene informazioni che permettono di passare alla fase di progettazione.
</details>

<!-- New subsection -->

<details class="question">
<summary>
<b>Nella soluzione del design pattern State, ogni Concrete State</b>
  <ol>
    <li> Definisce l'interfaccia che il client usa
    <li> Definisce l'interfaccia associata ad uno stato
    <li> Mantiene un'istanza di State
    <li> Implementa un comportamento
  </ol>
</summary>
<i>4. Implementa un comportamento</i>
<br/>
Ogni Concrete State definisce un comportamento associato ad uno stato del Context, e può anche essere responsabile di cambiare lo stato del Context.
</details>

<!-- New subsection -->

<details class="question">
<summary>
<b>Per il pattern Observer, cosa è interessante osservare?</b>
  <ol>
    <li> Il comportamento del Subject
    <li> Il comportamento del Concrete Observer
    <li> Lo stato del Concrete Observer
    <li> Lo stato del Concrete Subject
  </ol>
</summary>
<i>4. Lo stato del Concrete Subject</i>
<br/>
Il Concrete Observer è interessato allo stato del Concrete Subject, e può essere notificato dal Concrete Subject quando questo cambia.
</details>

<!-- New subsection -->

<details class="question">
<summary>
<b>La coesione di una classe è</b>
  <ol>
    <li> Alta se la classe ha pochi metodi e attributi
    <li> Alta se tutti i metodi contribuiscono ad implementare un singolo compito
    <li> Alta se il codice della classe è facile da comprendere
    <li> Tanto più alta quanto più alta è la coesione di ogni metodo
  </ol>
</summary>
<i>2. Alta se tutti i metodi contribuiscono ad implementare un singolo compito</i>
<br/>
La coesione di una classe è alta se tutti i metodi contribuiscono ad implementare un singolo compito, e bassa se i metodi implementano compiti diversi.
</details>

<!-- New subsection -->

<details class="question">
<summary>
<b>La legge di Lehman è pensata per</b>
  <ol>
    <li> software di grandi dimensioni
    <li> software di piccole dimensioni
    <li> prodotti COIST
    <li> piccole aziende di software
  </ol>
</summary>
<i>1. software di grandi dimensioni</i>
<br/>
La legge di Lehman è pensata per software di grandi dimensioni, e afferma che un software deve essere modificato per rimanere utile.
</details>

<!-- New subsection -->

<details class="question">
<summary>
<b>Sia la classe Agent un Singleton.
Si abbia la linea di codice:
Agent a = Agent.getInstance()</b>
  <ol>
    <li> Verrà creata una volta sola l'istanza di Agent, a prescindere dal numero di esecuzioni
    <li> Viene restituito un errore a compile time
    <li> Viene restituito un errore a run time appena si incontra per la seconda volta tale linea di codice
    <li> Verrà creata una istanza di Agent ogni volta che viene incontrata la suddetta linea di codice
  </ol>
</summary>
<i>1. Verrà creata una volta sola l'istanza di Agent, a prescindere dal numero di esecuzioni</i>
<br/>
Il design pattern singleton assicura che venga creata una sola istanza di una classe, e che questa sia accessibile globalmente, tramite un metodo statico.
Il costruttore della classe è privato.
</details>

<!-- New subsection -->

<details class="question">
<summary>
<b>Per il Factory Method</b>
  <ol>
    <li> La classe Creator ha un metodo che ritorna ConcreteProduct
    <li> La classe ConcreteCreator ha un metodo che ritorna Product
    <li> La classe ConcreteProduct ha un metodo che ritorna Creator
    <li> La classe ConcreteCreator ha un metodo che ritorna ConcreteProduct
  </ol>
</summary>
<i>2. La classe ConcreteCreator ha un metodo che ritorna Product</i>
<br/>
Con il factory method, il client si disinteressa dell'instanziazione di un product, delegando il compito al ConcreteCreator.
Agli occhi del client, gli verrà restituito un Product.
Sarà compito del ConcreteCreator scegliere ed instanziare il ConcreteProduct corretto.
</details>

<!-- New subsection -->

<details class="question">
<summary>
<b>Fissata un'interfaccia, il design pattern Decorator</b>
  <ol>
    <li> Lascia non fissati alcuni nomi dei metodi pubblici delle classi
    <li> Fornisce una lista di istanze di classi che la implementano
    <li> Richiede di implementare metodi con lo stesso nome ma in classi diverse
    <li> Richiede classi client diverse fra loro
  </ol>
</summary>
<i>3. Richiede di implementare metodi con lo stesso nome ma in classi diverse</i>
<br/>
Nel design pattern Decorator, si ha un'interfaccia che definisce un metodo pubblico.
Le classi ConcreteDecorator implementano l'interfaccia e contengono un riferimento ad Component, aggiungendo funzionalità al metodo, e finendo poi per richiamare il metodo del Component stesso.
</details>

<!-- New subsection -->

<details class="question">
<summary>
<b>In genere, quale dei seguenti prende decisioni su instanziazione di classi?</b>
<br>
  <ol>
    <li> Una abstract class
    <li> Mediator
    <li> Singleton
    <li> Observer
  </ol>
</summary>
<i>3. Singleton</i>
<br/>
Il singleton è un pattern creazionale, che assicura che venga creata una sola istanza di una classe, e che questa sia accessibile globalmente, tramite un metodo statico.
</details>

<!-- New subsection -->

<details class="question">
<summary>
<b>In un codice che utilizza il pattern Bridge vengono creati 3 ConcreteImplementor e 4 Refined Abstraction.
Se non utilizzassi il pattern, e volessi mantenere tutte le possibili combinazioni, quante classi dovrei creare?</b>
<br>
  <ol>
    <li> 7
    <li> 12
    <li> 9
    <li> 16
  </ol>
</summary>
<i>2. 12</i>
<br/>
Per poter combinare tutti i ConcreteImplementor con tutti i Refined Abstraction, dovrei creare 3*4=12 classi.
</details>

<!-- New subsection -->

<details class="question">
<summary>
<b>Quale fra questi è un vantaggio che ottengo utilizzando il pattern Adapter</b>
  <ol>
    <li> Nascondere la complessità di un sotto-sistema
    <li> Poter cambiare delle interfacce senza dover modificare il client
    <li> Poter far interagire due server web diversi
    <li> Aggiungere funzionalità ad una classe più semplice
  </ol>
</summary>
<i>2. Poter cambiare delle interfacce senza dover modificare il client</i>
<br/>
Utilizzare il pattern Adapter slega il client dall'implementazione di un'interfaccia esterna.
Volendola cambiare, sarà sufficiente aggiornare l'Adapter, senza dover modificare il client.
</details>

<!-- New subsection -->

<details class="question">
<summary>
<b>Quale pattern è particolarmente indicato per rappresentare delle strutture ricorsive ed operare su esse?</b>
<br>
  <ol>
    <li> Chain of Responsibility
    <li> Decorator
    <li> Composite
    <li> Bridge
  </ol>
</summary>
<i>3. Composite</i>
<br/>
Il Composite è un pattern strutturale, che permette di utilizzare indistintamente un oggetto singolo o un insieme di oggetti tramite un'interfaccia comune.
Nell'interfaccia sarà definito un metodo implementato in modo diverso a seconda che l'oggetto sia singolo o composto (implementazione ricorsiva).
</details>

<!-- New subsection -->

<details class="question">
<summary>
<b>Un negozio vende una collezione di blocchi. Questi possono essere di metallo o di legno, dipinti, graffiati o patinati. Talvolta possono addirittura essere radioattivi o magnetizzati.
<br/>
Quale design pattern permetterebbe di introdurre nuove tipologie di blocchi senza modificare codice già esistente?
<br>
</b>
  <ol>
    <li> Observer
    <li> State
    <li> Bridge
    <li> Decorator
  </ol>
</summary>
<i>3. Bridge</i>
<br/>
Utilizzando il Bridge, abstraction (Blocco) e implementor (Caratteristica) sono separate.
Diviene semplice aggiungere un ulteriore concrete implementor (ad esempio, blocchi di vetro) o refined abstraction senza dover modificare il codice già esistente.
</details>

<!-- New subsection -->

<details class="question">
<summary>
<b>In un gioco il personaggio protagonista acquisisce sempre più potenziamenti man mano che prosegue. Questi sbloccano nuove abilità, permettendogli di compiere azioni che gli erano precluse.<br>
Che pattern si può utilizzare per gestire il comportamento del personaggio?</b>
<br>
</b>
<ol>
  <li> State
  <li> Composite
  <li> Bridge
  <li> Observer
</ol>
</summary>
<i>1. State</i>
<br/>
Durante la sua avventura, lo stato del personaggio cambia, e con esso le sue abilità e azioni possibili.
</details>

<!-- New subsection -->

<details class="question">
<summary>
<b>Limita l'istanziazione di una classe ad un solo oggetto</b>
  <ol>
    <li> Facade
    <li> Observer
    <li> Singleton
    <li> NullObject
  </ol>
</summary>
<i>3. Singleton</i>
<br/>
Il singleton è un pattern creazionale, che assicura che venga creata una sola istanza di una classe, e che questa sia accessibile globalmente, tramite un metodo statico.
</details>

<!-- New subsection -->

<details class="question">
<summary>
<b>Aggiunge delle funzionalità ad un oggetto in maniera dinamica</b>
  <ol>
    <li> Decorator
    <li> Adapter
    <li> Facade
    <li> Composite
  </ol>
</summary>
<i>1. Decorator</i>
<br/>
Il decorator è un pattern strutturale, che permette di aggiungere funzionalità ad un oggetto in maniera dinamica, wrappandolo in un altro oggetto che implementa la stessa interfaccia.
</details>

<!-- New subsection -->

<details class="question">
<summary>
<b>Viene utilizzato un oggetto per incapsulare tutte le informazioni necessarie a richiamare un metodo successivamente</b>
  <ol>
    <li> Bridge
    <li> Prototype
    <li> Strategy
    <li> Command
  </ol>
</summary>
<i>4. Command</i>
<br/>
Il command è un pattern comportamentale. Si introduce una classe Command che, quando eseguito tramite il metodo execute(), richiama i metodi del receiver.
</details>

<!-- New subsection -->

<details class="question">
<summary>
<b>Il comportamento dell'algoritmo può essere selezionato a runtime</b>
  <ol>
    <li> Factory Method
    <li> Strategy
    <li> State
    <li> Decorator
  </ol>
</summary>
<i>2. Strategy</i>
<br/>
Il pattern Strategy permette di selezionare a runtime il comportamento di un algoritmo, separando l'implementazione dell'algoritmo dall'oggetto che lo utilizza, che poi lo incapsulerà al suo interno.
</details>

<!-- New section -->

## Domande a risposta aperta

<!-- New subsection -->

<details class="question">
<summary>
<b>Disegnare e spiegare i passi (o attività) della gestione dei requisiti in un processo tipo quello a cascata</b>
</summary>
<ol>
<li>Studio di fattibilità
<li>Analisi dei requisiti
<li>Specifica dei requisiti
<li>Convalida requisiti
</ol>
</details>

<!-- New subsection -->

```java
public class Buffer {
  private int box;
  private boolean full = false;
  public mod1 int get() throws InterruptedException {
    while (!full) metodo1();
    full = false; notifyAll(); return box;
  }
  public mod2 void put(int value) throws InterruptedException {
    while (full) metodo2();
    box = value; full = true; metodo3();
  }
}
```

<details class="question">
<summary>
<b>Quali sono dei nomi appropriati per metodo1, metodo2 e metodo3?<br/>Che modificatori sono mod1 e mod2</b>
</summary>
<i>
metodo1, metodo2 -> wait<br/>
metodo3 -> notifyAll<br/>
mod1, mod2 -> synchronized<br/>
</i>
</details>
<section>

<!-- New subsection -->

**Produrre il design ad oggetti corrispondente ai seguenti requisiti:**

- Su richiesta dell'utente deve essere calcolato il costo complessivo degli ordini fatti dal cliente in un mese
- Per gli ordini in un mese dovranno essere fornite le categorie a cui appartengono ciascuno dei prodotto acquistati

<!-- New subsection -->

```java
public class Order {
    String product;
    int cost;
    String category;
    String month;
    String client;
    // getters and setters
}
```

```java
class OrderManager {
    List<Order> orders = new ArrayList<>();
    public int getCostInMonthForClient(String month, String client) {
        return orders.stream()
                .filter(order -> order.month.equals(month))
                .filter(order -> order.client.equals(client))
                .mapToInt(order -> order.cost)
                .sum();
    }
    public List<String> getCategoriesInMong(String month) {
        return orders.stream()
                .filter(order -> order.month.equals(month))
                .map(order -> order.category)
                .distinct()
                .collect(Collectors.toList());
    }
}
```

<!-- New section -->

## Design pattern

<!-- New subsection -->

### Esercizio 1

```java
public interface IDataSource {
 public String getNomeCompleto();
 public int getEta();
}
```

```java
public class Info {
  private String nome;
  private String cognome;
  private Date dataDiNascita;
  public Info(String nome, String cognome, Date dataDiNascita) {
    this.nome = nome; this.cognome = cognome; this.dataDiNascita = dataDiNascita;
  }
  public String getNome() { return nome;}
  public String getCognome() { return cognome;}
  public Date getDataDiNascita() { return dataDiNascita;}
}
```

<!-- New subsection -->

#### Domanda 1

<details class="question">
<summary>
<b>Il client vuole ottenere dei dati di un utente utilizzando l'interfaccia IDataSource.
Quale pattern potrebbe utilizzare?
Scrivere tutte le componenti mancanti necessarie per realizzare il pattern</b>
</summary>
<i>Il design pattern Adapter</i>
</details>

```java
public class InfoAdapter implements IDataSource {
  private Info info;
  public InfoAdapter(Info info) { this.info = info; }
  public String getNomeCompleto() {
    return info.getNome() + " " + info.getCognome();
  }
  public int getEta() {
    return LocalDate.now().getYear() - info.getDataDiNascita().getYear();
  }
}
```

<!-- .element: class="fragment" -->

<!-- New subsection -->

#### Domanda 2

Utilizzare una variante del pattern per risolvere lo stesso problema.

```java
public class InfoAdapter extends Info implements IDataSource {
  public InfoAdapter(String nome, String cognome, Date dataDiNascita) {
    super(nome, cognome, dataDiNascita);
  }
  public String getNomeCompleto() {
    return getNome() + " " + getCognome();
  }
  public int getEta() {
    return LocalDate.now().getYear() - getDataDiNascita().getYear();
  }
}
```

<!-- .element: class="fragment" -->

<!-- New subsection -->

### Esercizio 2

```java
public interface Auto {
  public String getTipo();
  public int getPeso();
  public float getDistanza(int t);
}
```

```java
public interface Motore {
  public int getPotenza();
}
```

```java
public class Berlina implements Auto {
  private Motore m;
  public Berlina(Motore x) { m = x; }
  public String getTipo() { return "Berlina"; }
  public int getPeso() { return 800; }
  public float getDistanza(int t) {
    return (float) t * t * m.getPotenza() / getPeso();
  }
}
```

```java
public class Fire implements Motore {
  public int getPotenza() { return 1000; }
}
```

<!-- New subsection -->

#### Domanda 1

<details class="question">
<summary>
<b>Qual è il design pattern implementato e il ruolo svolto dalle classi/interfacce Auto, Motore, Berlina e Fire?</b>
</summary>
<i>
Il pattern implementato è il Bridge.
Auto è l'abstraction, Berlina è la refined abstraction, Motore è l'implementor e Fire è la concrete implementor.
</i>
</details>

<!-- New subsection -->

#### Domanda 2

Implementare la classe C1 che istanzia le classi Berlina e Fire in modo opportuno.

```java
public class C1 {
  public static Auto getNewAuto() {
    Motore m = new Fire();
    Auto a = new Berlina(m);
  }
}
```

<!-- .element: class="fragment" -->

<!-- New subsection -->

#### Domanda 3

Implementare la classe C2 che chiama i metodi definiti in Auto.

```java
public class C2 {
  public static main(String args[]) {
    Auto auto = C1.getNewAuto();
    System.out.println(auto.getTipo());
    System.out.println(auto.getPeso());
    System.out.println(auto.getDistanza(10));
  }
}
```

<!-- .element: class="fragment" -->

<!-- New subsection -->

#### Domanda 4

Disegnare il diagramma UML delle classi per il codice mostrato e per le classi C1 e C2 indicate

```mermaid
classDiagram
direction LR

class Auto {
  <<interface>>
  +getTipo(): String
  +getPeso(): int
  +getDistanza(int t): float
}

class Berlina {
  -Motore m
  +Berlina(Motore x)
  +getTipo(): String
  +getPeso(): int
  +getDistanza(int t): float
}

class Motore {
  <<interface>>
  +getPotenza(): int
}

class Fire {
  +getPotenza(): int
}

class C1 {
  +getNewAuto(): Auto
}

class C2 {
  +main(String[] args): void
}

Auto <|.. Berlina
Motore <|.. Fire
Berlina *-- Motore
C1 --> Auto
C2 --> C1
```

<!-- .element: class="fragment" -->

<!-- New subsection -->

#### Domanda 5

Disegnare il diagramma UML di sequenza per il codice mostrato e per le classi C1 e C2 indicate

```mermaid
sequenceDiagram

participant C2
participant C1
participant Berlina
participant Fire

C2 ->>+ C1: getNewAuto()
C1 ->>+ Fire: new Fire()
Fire -->>- C1: Fire
C1 ->>+ Berlina: new Berlina(Fire)
Berlina -->>- C1: Berlina
C1 -->>- C2: Berlina
C2 ->>+ Berlina: getDistanza(10)
Berlina -->>+ Fire: getPotenza()
Fire -->>- Berlina: potenza
Berlina -->>- C2: distanza
```

<!-- .element: class="fragment" -->

<!-- New subsection -->

### Esercizio 3

```java
public interface Esame {
  public void prenota();
  public void registra();
}
public class Nuovo implements Esame {
  public void prenota() { System.out.println("Presentazione Ok"); }
  public void registra() { System.out.println("Impossibile registrare l’esame"); }
}
public class Prenotato implements Esame {
  public void prenota() { System.out.println("Impossibile prenotare l'esame"); }
  public void registra() { System.out.println("Registrazione Ok"); }
}
```

<!-- New subsection -->

#### Domanda 1

Completare l'implementazione del design Pattern State con almeno due classi.

<!-- New subsection -->

```java
// Context
public class Appello {
  private Esame state = new Nuovo(this);
  public void prenota() {
    this.state = this.state.prenota();
  }
  public void registra() {
    this.state = this.state.registra();
  }
}
```

```java
// Concrete State 1
public class Nuovo implements Esame {
  private Appello appello;
  public Nuovo(Appello appello) { this.appello = appello; }
  public Esame prenota() {
    System.out.println("Presentazione Ok");
    return new Prenotato(appello);
  }
  public Esame registra() {
    System.out.println("Non è possibile registrare l’esame");
    return this;
  }
}
```

<!-- New subsection -->

```java
// Concrete State 2
public class Prenotato implements Esame {
  private Appello appello;
  public Prenotato(Appello appello) { this.appello = appello; }
  public Esame prenota() {
    System.out.println("Non è possibile prenotare l’esame");
    return this;
  }
  public Esame registra() {
    System.out.println("Registrazione Ok");
    return new Registrato(appello);
  }
}
```

```java
// Concrete State 3
public class Registrato implements Esame {
  private Appello appello;
  public Registrato(Appello appello) { this.appello = appello; }
  public Esame prenota() {
    System.out.println("Non è possibile prenotare l’esame");
    return this;
  }
  public Esame registra() {
    System.out.println("Non è possibile registrare l’esame");
    return this;
  }
}
```

<!-- New subsection -->

#### Domanda 2

Inserire in una delle classi la memorizzazione del nome della materia e della data dell'esame.

<!-- New subsection -->

```java
public class Appello {
  // ...
  private String materia;
  private LocalDate date;
  public Appello(String materia, LocalDate date) {
    this.materia = materia;
    this.date = date;
  }
  public String getMateria() { return this.materia; }
  public LocalDate getDate() { return this.data; }
  // ...
}
```

```java
public class Nuovo implements Esame {
  // ...
  public Esame prenota() {
    if (appello.getDate().before(LocalDate.now())) {
      System.out.println("Presentazione Ok");
      return new Prenotato(appello);
    }
    System.out.println("Non è possibile prenotare l’esame");
    return this;
  }
  // ...
}
```

<!-- New subsection -->

#### Domanda 3

<details class="question">
<summary>
<b>Dare il nome dei ruoli per tutte le classi e interfacce del design Pattern.</b>
</summary>

- Appello: Context
- Esame: State
- Nuovo: Concrete State 1
- Prenotato: Concrete State 2
- Registrato: Concrete State 3

</details>

<!-- New subsection -->

#### Domanda 4

Disegnare il diagramma UML delle classi.

```mermaid
classDiagram

class Appello {
  -Esame state
  -String materia
  -LocalDate date
  +Appello(String, LocalDate)
  +getMateria(): String
  +getDate(): LocalDate
  +prenota()
  +registra()
}

class Esame {
  <<interface>>
  +prenota()
  +registra()
}

class Nuovo {
  -Appello appello
  +Nuovo(Appello)
  +prenota()
  +registra()
}

class Prenotato {
  -Appello appello
  +Prenotato(Appello)
  +prenota()
  +registra()
}

class Registrato {
  -Appello appello
  +Registrato(Appello)
  +prenota()
  +registra()
}

Esame <|.. Nuovo
Esame <|.. Prenotato
Esame <|.. Registrato

Appello *-- Esame
```

<!-- .element: class="fragment" -->

<!-- New subsection -->

#### Domanda 5

Disegnare il diagramma UML di sequenza illustrando l'esecuzione a partire da una classe appropriata.

```mermaid
sequenceDiagram

actor Client
participant Appello
participant Nuovo
participant Prenotato

Client ->>+ Appello: prenota()
Appello ->>+ Nuovo: prenota()
Nuovo -->>- Appello: new Prenotato(appello)
Appello -->>- Client: #10003;

Client ->>+ Appello: registra()
Appello ->>+ Prenotato: registra()
Prenotato -->>- Appello: new Registrato(appello)
Appello -->>- Client: #10003;
```

<!-- .element: class="fragment" -->

<!-- New subsection -->

### Esercizio 4

```java
public class Student {
  private String nome = "Al";
  private int aperti = 0;
  private Modulo[] e = new Modulo[10];
  private int crediti = 0;
  public void inizia() {
    if (aperti < e.length) { e[aperti++] = new Modulo(); }
  }
  public void completa() {
    if (aperti > 0) { crediti += e[--aperti].getCrediti(); }
  }
}
```

```java
public class Modulo {
  private boolean superato = false;
  public int getCrediti() { return 3; }
  public boolean superato() { return superato; }
  public void setSuperato() { superato = true; }
}
```

<!-- New subsection -->

#### Domanda 1

Cambiare la classe Modulo in modo da far svolgere il ruolo di Concrete product del design pattern Factory Method.

<!-- New subsection -->

```java
public interface Modulo {
  int getCrediti();
  boolean superato();
}
```

```java
public class ModuloSuperato extends Modulo {
  public int getCrediti() { return 3; }
  public boolean superato() { return true; }
}
```

```java
public class ModuloIniziato extends Modulo {
  public int getCrediti() { return 0; }
  public boolean superato() { return false; }
}
```

<!-- New subsection -->

#### Domanda 2

Implementare una classe che instanzia il Concrete product in modo appropriato al design pattern.

<!-- New subsection -->

```java
public class ModuloFactory {
  public static Modulo create(boolean isSuperato) {
    return isSuperato ? new ModuloSuperato() : new ModuloIniziato();
  }
}
```

<!-- New subsection -->

#### Domanda 3

Cambiare la classe studente in modo da usare le classi ricavate precedentemente.

<!-- New subsection -->

```java
public class Student {
  // ...
  public void inizia() {
    if (aperti < e.length) { e[aperti++] = ModuloFactory.create(false); }
  }
  public void completa() {
    if (aperti > 0) {
      e[aperti] = ModuloFactory.create(true);
      crediti += e[aperti].getCrediti();
      aperti--;
    }
  }
}
```

<!-- New subsection -->

#### Domanda 4

Disegnare il diagramma UML delle classi.

```mermaid
classDiagram
direction TB

class Student {
  -String nome
  -int aperti
  -Modulo[] e
  -int crediti
  +inizia()
  +completa()
}

class ModuloFactory {
  +create(boolean): Modulo$
}

class Modulo {
  <<interface>>
  +getCrediti(): int
  +superato(): boolean
}

class ModuloSuperato {
  +getCrediti(): int
  +superato(): boolean
}

class ModuloIniziato {
  +getCrediti(): int
  +superato(): boolean
}

Modulo <|.. ModuloSuperato
Modulo <|.. ModuloIniziato
ModuloFactory --> ModuloSuperato
ModuloFactory --> ModuloIniziato
Student --> ModuloFactory
Student --> Modulo
```

<!-- .element: class="fragment" -->

<!-- New subsection -->

#### Domanda 5

Disegnare il diagramma UML di sequenza illustrando l'esecuzione a partire da una classe appropriata.

<!-- New subsection -->

```mermaid
sequenceDiagram

actor Client
participant Student
participant ModuloFactory
participant ModuloIniziato
participant ModuloSuperato

Client ->>+ Student: inizia()
Student ->>+ ModuloFactory: create(false)
ModuloFactory -->>+ ModuloIniziato: new ModuloIniziato()
ModuloIniziato -->>- ModuloFactory: moduloIniziato
ModuloFactory -->>- Student: ModuloIniziato
Student -->>- Client: #10003;
Client ->>+ Student: completa()
Student ->>+ ModuloFactory: create(true)
ModuloFactory -->>+ ModuloSuperato: new ModuloSuperato()
ModuloSuperato -->>- ModuloFactory: moduloSuperato
ModuloFactory -->>- Student: ModuloSuperato
Student -->>- Client: #10003;
```

<!-- New section -->

## Stream

[Soluzioni](./esempi/StreamExercises.java)

<!-- New subsection -->

Data una lista di persone, trovare i nomi dei programmatori con età minore di 30 anni.

```java
public record Persona(String name, int age, String role) {}

List<Persona> l = List.of(new Persona("Kent", 29, "CTO"),
                          new Persona("Luigi", 25, "Programmer"),
                          new Persona("Andrea", 26, "GrLeader"),
                          new Persona("Sofia", 26, "Programmer"),
                          new Persona("Alfio", 63, "Programmer"));
// ...
// result = ["Luigi", "Sofia"]
```

<!-- New subsection -->

Data una lista di istanze di Persona trovare i diversi ruoli.

```java
public record Persona(String name, int age, String role) {}

List<Persona> l = List.of(new Persona("Kent", 29, "CTO"),
                          new Persona("Luigi", 25, "Programmer"),
                          new Persona("Andrea", 26, "GrLeader"),
                          new Persona("Sofia", 26, "Programmer"));
// ...
// result = ["CTO", "Programmer", "GrLeader"]
```

<!-- New subsection -->

Data una lista di stringhe, produrre una lista che contiene solo le stringhe che cominciano con un certo prefisso noto.

```java
List<String> l = List.of("author", "auto",
                          "autocorrect", "begin",
                          "big", "bigger", "biggish");
// ...
// se prefisso = "au", result = ["author", "auto", "autocorrect"]
```

<!-- New subsection -->

Data una lista di stringhe, produrre una stringa contenente le iniziali di ciascuna stringa della lista.

```java
List<String> l = List.of("to", "speak", "the", "truth",
                          "and", "pay", "your", "debts");
// ...
// result = "tsttapyd"
```

<!-- New subsection -->

Data una lista di terne di numeri interi, per ciascuna terna verificare se essa costituisce un triangolo. Restituire la lista dei perimetri per le terne che rappresentano triangoli.  
In un triangolo, ciascun lato è minore della somma degli altri due.  
Si può rappresentare la terna come un array di tre elementi interi

```java
List<List<Integer>> l = List.of(List.of(3, 4, 5), List.of(3, 4, 6),
                                List.of(3, 4, 7), List.of(3, 4, 8));
// ...
// result = [12, 13, 14]
```

<!-- New subsection -->

Data una lista di numeri interi positivi, verificare se la lista è ordinata.  
Suggerimenti:

- Si generano gli indici da 0 a n-1
- Per ciascun valore dell'indice i, si confrontano l'elemento con indice i ed il successivo, se il secondo è minore del primo la lista non è ordinata e si può fermare la verifica

<!-- New subsection -->

Data una lista di prodotti, restituire il costo totale dei prodotti che hanno un prezzo maggiore di 10.

```java
public record Prodotto(String nome, double prezzo) {}

List<Prodotto> l = List.of(new Prodotto("p1", 5.0), new Prodotto("p2", 10.0),
                            new Prodotto("p3", 15.0), new Prodotto("p4", 20.0));
// ...
// result = 35.0
```

<!-- New subsection -->

Produrre una lista contenente i primi n multipli di 7.

```java
int n = 10;
// ...
// result = [0, 7, 14, 21, 28, 35, 42, 49, 56, 63]
```

<!-- New subsection -->

Data una lista di utenti, restituire tutti i loro commenti ordinati per data.

```java
public record Utente(String nome, List<Commento> commenti) {}
public record Commento(String testo, Date data) {}

List<Utente> l = List.of(
        new Utente("u1",
                List.of(new Commento("c2", LocalDate.of(2021, 1, 2)),
                        new Commento("c1", LocalDate.of(2021, 1, 1)),
                        new Commento("c5", LocalDate.of(2021, 1, 5)))),
        new Utente("u2",
                List.of(new Commento("c4", LocalDate.of(2021, 1, 4)),
                        new Commento("c3", LocalDate.of(2021, 1, 3)))));
// result = ["c1", "c2", "c3", "c4", "c5"]
```

<!-- New subsection -->

Restituire gli utenti che hanno pubblicato almeno un commento prima di una certa data

```java
LocalDate date = LocalDate.of(2021, 1, 3);
List<Utente> l = List.of(
        new Utente("u1",
                List.of(new Commento("c2", LocalDate.of(2021, 1, 2)),
                        new Commento("c1", LocalDate.of(2021, 1, 1)),
                        new Commento("c5", LocalDate.of(2021, 1, 5)))),
        new Utente("u2",
                List.of(new Commento("c4", LocalDate.of(2021, 1, 4)),
                        new Commento("c3", LocalDate.of(2021, 1, 3)))));
// result = ["u1"]
}
```

<!-- New subsection -->

Restituire l'utente che ha pubblicato il commento più recente

```java
List<Utente> l = List.of(
        new Utente("u1",
                List.of(new Commento("c2", LocalDate.of(2021, 1, 2)),
                        new Commento("c1", LocalDate.of(2021, 1, 1)),
                        new Commento("c5", LocalDate.of(2021, 1, 5)))),
        new Utente("u2",
                List.of(new Commento("c4", LocalDate.of(2021, 1, 4)),
                        new Commento("c3", LocalDate.of(2021, 1, 3)))));
// result = "u1"
```

<!-- New subsection -->

Restituire il prodotto più economico

```java
List<Prodotto> l = List.of(new Prodotto("p1", 80), new Prodotto("p2", 50),
                           new Prodotto("p3", 10), new Prodotto("p4", 20));

// result = "p3"
}
```

<!-- New subsection -->

Restituire tutte le figure che siano rettangoli o quadrati (tutti gli angoli uguali)

```java
public record Figura(int l1, int l2, int l3, int l4,
                     int a1, int a2, int a3, int a4) {}

List<Figura> l = List.of(new Figura(12, 12, 12, 12, 45, 45, 135, 135),
                         new Figura(2, 2, 2, 2, 90, 90, 90, 90),
                         new Figura(1, 2, 1, 2, 90, 90, 90, 90));
// ...
// result = [Figura2, Figura3]
```

<!-- New subsection -->

Restituire uno stream che contenga il lato minore per ogni figura

```java
List<Figura> l = List.of(new Figura(12, 12, 12, 12, 45, 45, 135, 135),
                         new Figura(2, 2, 2, 2, 90, 90, 90, 90),
                         new Figura(1, 2, 1, 2, 90, 90, 90, 90));
// ...
// result = [12, 2, 1]
```

<!-- New subsection -->

Restituire il perimetro minore tra tutte le figure

```java
List<Figura> l = List.of(new Figura(12, 12, 12, 12, 45, 45, 135, 135),
                         new Figura(2, 2, 2, 2, 90, 90, 90, 90),
                         new Figura(1, 2, 1, 2, 90, 90, 90, 90));
// ...
// result = 6
```

<!-- New subsection -->

Ottenere la somma del valore dell'area di tutte le figure

```java
List<Figura> l = List.of(new Figura(12, 12, 12, 12, 45, 45, 135, 135),
                         new Figura(2, 2, 2, 2, 90, 90, 90, 90),
                         new Figura(1, 2, 1, 2, 90, 90, 90, 90));
// ...
// result = 150
```

<!-- New subsection -->

Restituire la somma totale dei costi dei 2 prodotti meno cari

```java
List<Prodotto> l = List.of(new Prodotto("p1", 80),
                           new Prodotto("p2", 40),
                           new Prodotto("p3", 10),
                           new Prodotto("p4", 90));
// ...
// result = 50
```

<!-- New subsection -->

Restituire la lista di lati maggiori dei triangoli.

```java
List<Triangolo> l = List.of(new Triangolo(3, 4, 5, 30, 60, 90),
                            new Triangolo(4, 5, 4, 30, 30, 120),
                            new Triangolo(13, 5, 12, 30, 60, 90),
                            new Triangolo(17, 15, 8, 30, 60, 90));
// ...
// result = [5, 5, 13, 17]
```

<!-- New subsection -->

Restituire una lista di triangoli isosceli.
Un triangolo è isoscele se due suoi lati sono uguali.

```java
List<Triangolo> l = List.of(new Triangolo(3, 4, 5, 30, 60, 90),
                            new Triangolo(4, 5, 4, 30, 30, 120),
                            new Triangolo(13, 5, 12, 30, 60, 90),
                            new Triangolo(17, 15, 8, 30, 60, 90));
// ...
// result = [Triangolo2]
```

<!-- New subsection -->

Creare un metodo che prende in ingresso due parametri, min e max, e restituisce una lista di istanze di persona costituita da elementi di gente che hanno età compresa fra min e max.

```java
public record Persona(String nome, int eta, String nazione) {}

int min = 20, max = 40;
List<Persona> l = List.of(new Persona("p1", 10, "n1"),
                          new Persona("p2", 20, "n1"),
                          new Persona("p3", 30, "n2"),
                          new Persona("p4", 40, "n3"),
                          new Persona("p5", 50, "n3"));
// ...
// result = [p2, p3, p4]
```

<!-- New subsection -->

Calcolare la somma delle età di tutte le persone nella lista.

```java
public record Persona(String nome, int eta, String nazione) {}

int min = 20, max = 40;
List<Persona> l = List.of(new Persona("p1", 10, "n1"),
                          new Persona("p2", 20, "n1"),
                          new Persona("p3", 30, "n2"),
                          new Persona("p4", 40, "n3"),
                          new Persona("p5", 50, "n3"));
// ...
// result = 140
```

<!-- New subsection -->

Restituire la lista di nazioni senza ripetizioni presenti in una lista di gente.

```java
public record Persona(String nome, int eta, String nazione) {}

int min = 20, max = 40;
List<Persona> l = List.of(new Persona("p1", 10, "n1"),
                          new Persona("p2", 20, "n1"),
                          new Persona("p3", 30, "n2"),
                          new Persona("p4", 40, "n3"),
                          new Persona("p5", 50, "n3"));
// ...
// result = [n1, n2, n3]
```

<!-- New subsection -->

Restituire una mappa contenente le coppie (nome persone - nazione).

```java
public record Persona(String nome, int eta, String nazione) {}

int min = 20, max = 40;
List<Persona> l = List.of(new Persona("p1", 10, "n1"),
                          new Persona("p2", 20, "n1"),
                          new Persona("p3", 30, "n2"),
                          new Persona("p4", 40, "n3"),
                          new Persona("p5", 50, "n3"));
// ...
// result = {"p1" -> "n1", "p2" -> "n1", "p3" -> "n2", "p4" -> "n3", "p5" -> "n3"} 
```
