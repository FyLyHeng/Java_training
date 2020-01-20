package CovariantReturn;

public class TestClass extends SuperClass {


    /**
     * this is override getInfo() of SuperClass
     * @return
     */
    TestClass getInfo(){

        super.getInfo();
        System.out.println("Testing invoked");
        System.out.println(this.getClass());
        return this;
    }
}
