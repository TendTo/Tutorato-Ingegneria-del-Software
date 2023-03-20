import java.util.ArrayList;
import java.util.List;

// HelloWorldUpdate.java

public class HelloWorldUpdate extends TextStyle{
    private static List<String> hellos = new ArrayList<String>();

    /**Inizializza i vari Hello World in varie lingue */
    private static void setHellos(){
            hellos.add("Hello World ");
            hellos.add("Ciao Mondo ");
            hellos.add("Bonjour le monde ");
            hellos.add("Salut Lume ");
            hellos.add("Hallo Welt ");
            hellos.add("Ola Mundo ");
    }

    /**Setta il formato alla stringa*/
    private static String setColor(int index){
        TextStyle.setStyle();
        String color = TextStyle.colors.get(index);
        return color;
    }

    /**Genera la stringa formattata */
    private static String generateHellos(){
        String hello = "";
        for (int index=0; index<6; index++)
            hello+= setColor(index) + hellos.get(index) + RESET;
        return hello;
    }

    public static void main(String[] args) {
        setHellos();
        System.out.println(generateHellos());
    }
}
