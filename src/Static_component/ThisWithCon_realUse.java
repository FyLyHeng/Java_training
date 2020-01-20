package Static_component;

public class ThisWithCon_realUse {
    Long id;
    String name;
    String role;
    String db;
    Long salary;
    ThisWithCon_realUse(){}

    ThisWithCon_realUse(Long id,String name,String role,String db){
        this.id = id;
        this.name = name;
        this.role = role;
        this.db = db;
    }
    ThisWithCon_realUse(Long id,String name,String role,String db,Long salary){
        this(id,name,role,db);
        this.salary = salary;
    }

    /**
     * we can call constructor into method
     */
    void out(){
        System.out.println();

    }


    /**
     * this: to pass as an argument in the method
     */
    void printMe(ThisWithCon_realUse obj){
        System.out.println("invoked printMe()");
        System.out.println("Id "+id +" name "+name +" role "+role+" DB "+db);
    }

    void printAll(){
        printMe(this);
        System.out.println("slary "+salary);
    }


    /**
     * this: to pass as argument in the constructor call
     * It is useful if we have to use one object in multiple classes
     */
    Test test;// create vai dataType is class(ThisAccess)

    ThisWithCon_realUse(Test test){
        this.test = test;
    }

    void pintData(){
        System.out.println(test.key +"  "+ test.value);
    }
}
