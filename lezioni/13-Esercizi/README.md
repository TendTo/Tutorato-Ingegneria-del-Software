# Esercizi

Esercizi presi dai compiti in classe.

<!-- New section -->

## Domande a risposta multipla

<!-- New subsection -->

<details>
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

<details>
<summary>
<b>La frase "Il sistema dovrà fornire prestazioni adeguate" è</b>
  <ol>
    <li> Un requisito molto importante
    <li> Un requisito funzionale
    <li> Un requisito non funzionale
    <li> Un requisito interpretabile in tanti modi
  </ol>
</summary>
<i>2. Un requisito non funzionale</i>
<br/>
I requisiti non funzionali riguardano come il sistema svolge la sua funzione (es. affidabilità, efficienza, prestazioni,
manutenibilità, etc.)
</details>

<!-- New subsection -->

<details>
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

<details>
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

<details>
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

<details>
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

<details>
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

<details>
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

<details>
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
</details>

<!-- New subsection -->

<details>
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

<details>
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

<details>
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

<details>
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

<details>
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

<details>
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

<details>
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

<details>
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

<details>
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

<details>
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

<details>
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

<details>
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

<details>
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

<details>
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

<details>
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

<details>
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
