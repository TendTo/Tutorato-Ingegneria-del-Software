import java.text.DecimalFormat;

//CircleArea.java 

public class CircleArea{

    private static double calculateArea(double radius){
        return Math.PI*radius*radius;
    }

    public static void main (String[] args){
        if(args.length != 1){
            System.err.print("Usage: java CircleArea <radius>");
            System.exit(1);
        }

        double radius = Double.parseDouble(args[0]);
        double area = calculateArea(radius);

        //Format the area value with 3 decimal places
        DecimalFormat formattedArea = new DecimalFormat("#.###");

        System.out.println(formattedArea.format(area));
    }
}