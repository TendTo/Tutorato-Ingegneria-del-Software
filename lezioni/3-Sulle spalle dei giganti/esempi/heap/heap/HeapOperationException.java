package heap;

/**
 * Eccezione lanciata quando si tenta di eseguire un'operazione non consentita
 * su un heap.
 * Il messaggio contiene informazioni aggiuntive sulla natura dell'errore.
 */
public class HeapOperationException extends RuntimeException {
    /**
     * Costruisce un'eccezione HeapOperationException con un messaggio di errore
     * 
     * @param message il messaggio di errore
     */
    public HeapOperationException(String message) {
        super(message);
    }
}
