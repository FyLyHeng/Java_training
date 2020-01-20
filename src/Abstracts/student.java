package Abstracts;


/**
 * this class extends from person(abstract class)
 * need to override all method
 */
class student extends person {
    student(){}
    student(String name,String sex,String email,int age){
        this.name = name;
        this.sex = sex;
        this.email = email;
        this.age = age;

    }

    /**
     * local value private modified
     */
    float cpp=100f,java=90f,db=70f;
    String Build="B",Class="M9",room="109";


     public void output(){
        System.out.print(name);
        System.out.println(email);
        System.out.println(sex);
        System.out.println(age);
        System.out.println(Build);
        System.out.println(Class);
        System.out.println(room);
         System.out.println(score());
         System.out.println(Avg());
    }

     float score(){
         return  cpp+java+db;
     }

     double Avg(){
         double age=score()/3;
         return age;
     }



    @Override
    public void input() {
    }

    @Override
    public void show() {
    }

    @Override
    public void DateIn() {
    }

    }
