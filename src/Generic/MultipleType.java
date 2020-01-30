package Generic;

public class MultipleType<T,U> {
    private T t;
    private U u;

    MultipleType(T t,U u){
        this.t = t;
        this.u = u;
    }

    public MultipleType() {

    }

    public T getT(Integer i){
        return (T) i;
    }
    public U getU(){
        return u;
    }

    public void getTU() {
        System.out.print("GetTU() ");
        System.out.print(t+"\t :");
        System.out.println(u);
    }

    public void setT(T t) {
        this.t = t;
    }

    public void setU(U u) {
        this.u = u;
    }

    public void mulitleType(T t,U u){
        this.t = t;
        this.u = u;
    }
}
