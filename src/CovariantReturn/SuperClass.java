package CovariantReturn;

public class SuperClass {


    SuperClass getInfo(){
        System.out.println("Super class invoked");
        return this;
    }
}
