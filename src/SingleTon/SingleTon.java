package SingleTon;

public class SingleTon {

    //this is var name singleTon with return type class name 'SingleTon'
    private static SingleTon singleTon = null;


    String str;

    //this is constructor and make it to private
    private SingleTon() {
        str = "invoked SingleTon constructor";
    }

    //this is method name 'getInstance' with return type is Class name 'SingleTon'
    static SingleTon getInstance() {
        if (singleTon == null)
            singleTon = new SingleTon();

        return singleTon;
    }
}
