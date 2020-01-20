package Abstracts;

/**
 * student extends from person(abstract)
 * extends from student
 * no need to override all
 * can user all method in both
 */
public class Teacher extends student{
    String name;

    @Override
    public void output() {
        System.out.println("Teacher name  = " + name);
    }


    @Override
    public void show(){

    }


    public void demo() {
        System.out.println("Name = " + name);
    }


    /**
     * constructor Teacher
     * @param name
     */
    public Teacher(String name) {
        this.name = name;
    }
}
