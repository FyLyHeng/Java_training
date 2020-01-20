package exceptionAdvance;

public class SubTest extends Test {
    public SubTest(int value3) {
        this.value3 = value3;
    }


    private int value3;

    float setValue(int value3){
        this.value3 = value3;
        return super.setValue(value3+1,value3-1)+value3;
    }

}
