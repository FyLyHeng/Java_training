package Generic;

public class Generic <T>{
    private T t;

    //constructor
    public Generic(T t) {
        this.t = t;
    }

    //constructor
    public Generic() {

    }

    public void add(T t){
        this.t = t;
    }

    public T getT() {
        return t;
    }

    /**
     * work like add(T t)
     */
//    public void setT(T t) {
//        this.t = t;
//    }
}
