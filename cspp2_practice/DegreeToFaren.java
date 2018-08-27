/**
 *@author Prasanth!!!
*/
public final class DegreeToFaren {
  /**
     * Empty Constructor.
    */
    private DegreeToFaren() {
        //Iam not using this constructor
    }
    /**
     * Main function to print.
     * @param args is the parameter for this function
    */
    public static void main(final String[] args) {
        float degrees = 35.0f;
        float fahrenheit = (degrees * 1.8f) + 32.0f;
        System.out.println(fahrenheit);

    }
}
