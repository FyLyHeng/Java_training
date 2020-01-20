package Access_level;

public class Private_class {
    private String name="Liza";
    private String email="Liza@gmail.com";
    private int age=22;

    @Override
    public String toString() {
        //return super.toString();
        return name+"\n"+email+"\n"+age;
    }
}
