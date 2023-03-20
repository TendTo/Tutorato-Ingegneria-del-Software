import java.util.ArrayList;
import java.util.List;

public class TextStyle{
    protected static List<String> colors = new ArrayList<String>();
    protected static final String RESET = "\33[0m";

    /**Inizializza la lista di formati */
    protected static void setStyle(){
        colors.add("\33[1;32m");
        colors.add("\33[1;31m");
        colors.add("\033[41m");
        colors.add("\033[1;93m");
        colors.add("\033[4;32m");
        colors.add("\033[47m");
    }
}