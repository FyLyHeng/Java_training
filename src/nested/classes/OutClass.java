package nested.classes;

public class OutClass {

    /**
     * static var for OutClass
     * auto class OutClass became to static
     * we cant use non-static with static InnerClass
     */
    private static String message = "Hello Java";
    public int numberOfTest = 1;


    /**
     * static nestedClass
     */
    static class NestedStatic{

        public void message(){
            System.out.println("message from static Class "+message);
        }
    }

    /**
     * non-static class
     */
    public class NestedNonStatic{

        public void display(){
            System.out.println("Message from non-static Class "+message);
        }
    }
}
