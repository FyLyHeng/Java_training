package Access_level;

class Main_pro extends Protected_class {
    private int x = 2001;

    public static void main(String[] args) {
        Protected_class myPro = new Protected_class();

        System.out.println(myPro.toString());

        TestProtectedMethod protectedMethod = new TestProtectedMethod();
        protectedMethod.msg();
    }
}
