package SingleTon;

/**
 * this class is singleTon class that access with name as that of a class name method
 */
public class SingleTon01 {
    private static SingleTon01 single_instance = null;
    public String str;


    private SingleTon01() {
        if (single_instance == null) {
            str = "Welcome to DataFlair";
        }
    }

    public static SingleTon01 singleTon01(){
        if (single_instance == null){
            single_instance = new SingleTon01();
        }
        return single_instance;
    }
}
