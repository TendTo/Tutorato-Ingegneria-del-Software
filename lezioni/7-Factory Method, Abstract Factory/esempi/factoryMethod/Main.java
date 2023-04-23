// java FactoryMethod lorem_fake.txt
// java FactoryMethod lorem.txt
// java FactoryMethod http://loripsum.net/api
// java FactoryMethod https://baconipsum.com/api/?type=meat-and-filler&paras=5&format=text
class Main {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: FactoryMethod <lorem source>");
            return;
        }

        LoremFactory factory = new ConcreteLoremFactory();
        Lorem lorem = factory.createLorem(args[0]);
        System.out.println(lorem.getLorem());
    }
}