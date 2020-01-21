package Anonymous;

/**
 * outClass is Interface class
 */
public interface AnonymousInterface {
    void look();
}

/**
 * inner class
 */
class TestingAnonymous{
    public static void main(String[] args) {

        /**
         * create class and obj of Interface class
         * it call anonymousClass
         * Out class is Interface need to override all method
         */
        AnonymouAbstract anAbstract = new AnonymouAbstract() {

            @Override
            void look() {
                System.out.println("override method of InterfaceClass look()");
            }
        };
        anAbstract.look();
    }
}
