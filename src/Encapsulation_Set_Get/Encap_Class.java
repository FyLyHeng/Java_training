package Encapsulation_Set_Get;

public class Encap_Class {
    private String name="";
    private String email="";
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Encap_Class() {
    }

    public Encap_Class(String name, String email, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }
    private void outPut(){
        System.out.println("method out private");
    }
    public void outPrivate(){
        outPut();
    }

    @Override
    public String toString() {
//        //return super.toString();
        return name+"\n"+email+"\n"+age;
    }
}
