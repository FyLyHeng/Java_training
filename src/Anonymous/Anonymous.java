package Anonymous;

public class Anonymous {
    public static void main(String[] args) {

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Child thread");
            }
        }
        );
        thread.start();
        System.out.println("main thread");
    }
}
