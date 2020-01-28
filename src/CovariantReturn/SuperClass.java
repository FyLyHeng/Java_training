package CovariantReturn;

public class SuperClass {


    /**
     * this is covariant returnType
     * method name getInfo
     * @return
     */
    SuperClass getInfo(){
        System.out.println("Super class invoked");
        return this;
    }
}
