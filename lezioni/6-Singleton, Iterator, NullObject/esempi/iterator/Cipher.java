import java.util.Iterator;

/**
 * Implementazione di un cifrario colonnare.
 * Data una stringa di testo e una chiave k, il testo verrà trasposto per
 * colonna in una matrice di k colonne.
 * 
 * @example "Hello World!" con chiave 3 diventa: "Hore llWdlo!"
 */
public class Cipher implements Iterable<Character> {

    /**
     * Iteratore che scorre i caratteri per riga dalla matrice.
     */
    protected class CipherIterator implements Iterator<Character> {
        private int i = 0;
        private int j = 0;

        @Override
        public boolean hasNext() {
            return i < matrix.length;
        }

        @Override
        public Character next() {
            if (hasNext()) {
                char c = matrix[i][j++];
                if (j >= matrix[i].length) {
                    j = 0;
                    i++;
                }
                return c;
            }
            throw new IndexOutOfBoundsException();
        }
    }

    /**
     * Chiave del cifrario
     */
    private int key;
    /**
     * Matrice di trasposizione
     */
    char matrix[][];

    /**
     * Inizializza il cifrario con la chiave indicata
     * 
     * @param key chiave del cifrario che corrisponde al numero di colonne della
     *            matrice
     */
    public Cipher(int key) {
        this.key = key;
    }

    /**
     * Cifra il testo indicato con la chiave del cifrario. <p>
     * "Hello World!" chiave 3 diventa: <p>
     * |H|o|r| <p>
     * |e| |l| <p>
     * |l|W|d| <p>
     * |l|o|!| <p>
     * Si legge "Hore llWdlo!"
     * @param plainText testo da cifrare
     */
    public void encrypt(String plainText) {
        int rows = plainText.length() / key;
        this.matrix = new char[rows][key];
        int k = 0;
        for (int i = 0; i < key; i++) {
            for (int j = 0; j < rows; j++) {
                matrix[j][i] = plainText.charAt(k++);
            }
        }
    }

    @Override
    public Iterator<Character> iterator() {
        return new CipherIterator();
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (char c : this) {
            result.append(c);
        }
        return result.toString();
    }
}
