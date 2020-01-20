package Abstracts;

abstract class person implements Inter1{
    String name="default name";
    String email="default@gmail.com";
    String sex="defaultSex";
    int age = 1;

    /**
     * we can ues this my child class
     * example in main
     */
    person(){
        System.out.println("this is constructor of abstractClass");
    }

    /**
     * override output from Inter1(interface)
     */
    public abstract void output();

    /**
     * local method
     */
    public abstract void DateIn();
}
