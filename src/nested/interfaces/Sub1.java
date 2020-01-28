package nested.interfaces;

/**
 * implements InnerInterf (inner interface class)
 * not implements InterfSuper (outer interface class)
 */
public class Sub1 implements InterfSuper.InterfInner{


    @Override
    public void show() {
        System.out.println("invoked sub1()");
    }
}
