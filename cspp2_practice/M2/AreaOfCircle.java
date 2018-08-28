import java.util.Scanner;
/**
 *@author Prasanth!!!
*/
public final class AreaOfCircle {
    /**
     * @variable PIVALUE
    */
    private static final double PIVALUE = 3.14;
    /**
     * @Empty Constructor.
    */
    private AreaOfCircle() {
        //Iam not using this constructor
    }
    /**
     * Main function to print.
     * @param args is the parameter for this function
    */
    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);
        int b = s.nextInt();
        System.out.println(area(b));
    }
    /**
     * area of the method to calculate for circle.
     * @param radius is the parameter of this method
     * @return double value of the area of the circle.
    */
    public static double area(final int radius) {
        return (pi() * radius * radius);
    }
    /**
     * pi method for pi value.
     * @return double value
    */
    public static double pi() {
        return PIVALUE;
    }
}
