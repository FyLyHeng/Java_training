package call.property;

public class Main {
    public static void main(String[] args) {
        ByValue myVal=new ByValue();
        System.out.println("Before change "+myVal.data);
        myVal.change(500);
        System.out.println("After change "+myVal.data);

        System.out.println("=========================");

        System.out.println("Before change "+myVal.data);
        myVal.change1(myVal);
        System.out.println("After change "+myVal.data);

    }
}
