package Class_person;

public class Main {
    public static void main(String[] args) {
        Person myPerson=new Person();
        String fullName="";
        int Age;
        fullName=myPerson.fName+" "+myPerson.lName;
        Age=myPerson.age;
        System.out.println("Output by main class");
        System.out.println("Name is "+fullName);
        System.out.println("Age is "+Age);
        // call method form class person
        System.out.println("==================");
        myPerson.Output();
    }
}
