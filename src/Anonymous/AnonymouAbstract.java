package Anonymous;

abstract class AnonymouAbstract {
    abstract void look();
}

class TestAnonymousInner{
    public static void main(String[] args) {
        AnonymouAbstract anAbstract = new AnonymouAbstract() {
            @Override
            void look() {
                System.out.println("invoked inner anonymous class");
            }
        };
        anAbstract.look();
    }
}
