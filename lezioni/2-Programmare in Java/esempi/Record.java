import java.util.Objects;

public class Record {

    public static record PairRecord<K, V>(K key, V value) {

    }

    public static class PairClass<K, V> {
        private final K key;
        private final V value;

        public PairClass(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }

        @Override
        public String toString() {
            return "PairClass[" +
                    "key=" + key +
                    ", value=" + value +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o)
                return true;
            if (o == null || getClass() != o.getClass())
                return false;
            PairClass<?, ?> item = (PairClass<?, ?>) o;
            return key.equals(item.key) && value.equals(item.value);
        }

        @Override
        public int hashCode() {
            return Objects.hash(key, value);
        }
    }

    public static void main(String args[]) {
        // Class
        PairClass<String, Integer> pairClass = new PairClass<>("Ciao", 1);
        System.out.println(pairClass.getKey());
        System.out.println(pairClass.getValue());
        System.out.println(pairClass);
        System.out.println(pairClass.hashCode());
        System.out.println(pairClass.equals(new PairClass<>("Ciao", 1)));
        System.out.println(pairClass.equals(new PairClass<>("Ciao", 2)));

        System.out.println("------------------");

        // Record
        PairRecord<String, Integer> pairRecord = new PairRecord<>("Ciao", 1);
        System.out.println(pairRecord.key());
        System.out.println(pairRecord.value());
        System.out.println(pairRecord);
        System.out.println(pairRecord.hashCode());
        System.out.println(pairRecord.equals(new PairRecord<>("Ciao", 1)));
        System.out.println(pairRecord.equals(new PairRecord<>("Ciao", 2)));

    }

}
