package CovariantReturn;

public class TestClass extends SuperClass {


    /**
     * this is override getInfo() of SuperClass original method returnType is SuperClass
     * and we can change returnType (SuperClass) to (TestClass)
     * using covariant returnType
     * and
     * @return
     */
    TestClass getInfo(){

        super.getInfo();
        System.out.println("Testing invoked");
        System.out.println(this.getClass());
        return this;
    }
}
