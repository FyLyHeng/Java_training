package Association;

class Testing
{
    String name;
    int id ;
    String dept;
    Testing(String name, int id, String dept)
    {
        this.name = name;
        this.id = id;
        this.dept = dept;
        System.out.println("Employee name is "+name+" Id is "+id+" Department is "+dept);
    }
}
//class Department
//{
//    String name, employees;
//    Department(String name, String employees)
//    {
//        this.name = name;
//        this.employees = employees;
//    }
//}
//class Organization
//{
//    String officeName,departments;
//    Organization(String officeName, String departments)
//    {
//        this.officeName = officeName;
//        this.departments = departments;
//    }
//}

class AggregationDemo{

    public static void main (String[] args) {
        Testing test1 = new Testing("liza",1,"IT");
        Testing test2 = new Testing("kok",2,"sale");
        Testing test3 =new Testing("bopha",3,"sale");

    }
}
