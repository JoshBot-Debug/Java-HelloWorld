/**
* Hello world trials Aug 24 2020 20:40
*
* @author  Joshua Joseph Myers
* @version 1.0
* @since   Aug 24 2020
*/
public class Hello {
    public static void main(final String[] args) {
        // Define a sting
        final String data = "SUCCESS";

        // Define a list of strings
        final String[] a = {"One","Two","Three","Tada!!!"};
        
        /*
        * You cannot call a private method inside a static method.
        * You have to init the class to call the method
        */
        final Hello world = new Hello(a);

        world.app(data);
    }

    /**
     * This is the constructor, it accepts one param on construction.
     * 
     * @param initData A list of strings
     */
    public Hello(final String[] initData){
        for (String line : initData) {
            System.out.println(line);
        }
    }

    /**
     * This is a method that accepts a string.
     * every variable or class that does not change once defined should be final.
     * 
     * @param txt A string
     */
    private void app(final String txt) {
        System.out.println(txt);
    }
}