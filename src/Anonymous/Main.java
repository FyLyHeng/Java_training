package Anonymous;

import java.io.IOException;
import java.nio.CharBuffer;

public class Main {
    public static void main(String[] args) {

        /**
         * Runnable is a InterfaceClass
         * need to override method run() in Interface Class
         * Runnable now is a inner class of Main Class
         * it call anonymous class
         */
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("child Thread");
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
        System.out.println("Main Thread");

    }
}
