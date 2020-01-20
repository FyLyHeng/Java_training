package date.time;

public class Main {
    public static void main(String[] args) {
        Dates myDate=new Dates();
        myDate.showDate();
        System.out.println(myDate.myDate);
        myDate.showFormatDT("E, MMM dd yyyy");
    }
}
