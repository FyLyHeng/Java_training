package Generic;

public class Simple<T> {
    T t;
    Simple(T t){
        this.t = t;
    }

    public T getT() {
        return t;
    }
}
