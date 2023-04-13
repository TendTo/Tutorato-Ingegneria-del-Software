import java.io.File;

public class ConcreteLoremFactory extends LoremFactory {

    @Override
    public Lorem createLorem(String source) {
        if (source.startsWith("http")) {
            return new OnlineLorem(source);
        } else if (new File(source).exists()) {
            return new LocalLorem(source);
        } else {
            return new StringLorem();
        }
    }
}
