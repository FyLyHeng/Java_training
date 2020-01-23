package SingleTon;

public class SingleTon {

    private static SingleTon singleTon = null;
    String str;

    private SingleTon() {
        str = "invoked SingleTon constructor";
    }

    static SingleTon getInstance() {
        if (singleTon == null)
            singleTon = new SingleTon();

        return singleTon;
    }
}
