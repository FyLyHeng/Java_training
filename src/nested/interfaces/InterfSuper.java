package nested.interfaces;

public interface InterfSuper {

    void show();
    void stringSplit();
    void getInfo();

    //Inner interface class
    interface InterfInner {
        void show();
    }
}
