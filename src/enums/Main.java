package enums;

public class Main {
    public static void main(String[] args) {
        Enums myEnum=Enums.HIGH;
        System.out.println(myEnum);
        for (Enums my:Enums.values()){
            System.out.println(my);
        }
    }
}
