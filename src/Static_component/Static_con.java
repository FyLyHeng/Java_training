package Static_component;

/**
 * we have only static method and properties
 * no staticClass
 */
public class Static_con {

    String fName="Liza";
    String lName="kok";
    int age=18;
    static float math=70f,cpp=80f,english=85f;


    /**
     * this is constructor
     */
    Static_con(){
        System.out.println("this is constructor of static class\nit work when create obj of class\n");
    }


    /**
     * nonstatic method
     * cant work with static properties
     */
    public void OutInfo(){
        System.out.println("Name is "+fName+" "+lName);
        System.out.println("Age is "+age);
    }


    /**
     * static method use with static properties
     * cant work with nonstatic properties
     */
    static void ShowScore(){
        float s=math+cpp+english;
        float Avg=s/3;
        System.out.println("Total Score ="+s);
        System.out.println("Avg ="+Avg);
    }


    /**
     * static block
     Is used to initialize the static data member.
     It is executed before the main method at the time of classloading.
     */
    static {
        System.out.println("static block is invoked\nit invoked when create obj of class like constructor\n");
    }



    static void aVoid(){
        System.out.println("A");
    }
    static void bVoid(){
        aVoid(); //this.aVoid() ; call static method
        System.out.println("this is B");
    }

}
