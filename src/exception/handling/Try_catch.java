package exception.handling;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Try_catch {
    public void tryCatchBlock() {
        try {
            int a = 0;
            int b = 100;
            int c = b / a;
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println(e);
            System.out.println("warning found!!");
        }
    }

    public void nestTryCatch() {
        try {
            String a = "abc";
            //int i= Integer.parseInt(a);
            try {
                String st = null;
                System.out.println(st.length());
            } catch (StringIndexOutOfBoundsException e) {
                System.out.println(e);
                System.out.println("StringIndex not fond");
            }
            try {
                PrintWriter pw;
                pw = new PrintWriter("jtp.txt");
                pw.println("saved");
            } catch (FileNotFoundException f) {
                System.out.println(f);
                System.out.println("FileNot");
            }
            System.out.println("File saved successfully");
        } catch (Exception Ab) {
            System.out.println(Ab);
            System.out.println("warning found!!");
        }
    }

    public void multiCatchBlock() {
        try {
            int[] a = new int[5];
            a[6] = 100;
            System.out.println(a[6]);
        } catch (ArrayIndexOutOfBoundsException a) {
            System.out.println(a);
        } catch (ArrayStoreException as) {
            System.out.println(as);
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("error found!!");
        }
    }

    public void finallyBlock() {
        try {
            int data = 25 / 5;
            System.out.println(data);
        } catch (NullPointerException ne) {
            System.out.println(ne.getMessage());
        } finally {
            System.out.println("rest of the code...");
        }
    }

    public void finallyBlock1() {
        try {
            int data = 25 / 0;
            System.out.println(data);
        } catch (ArithmeticException e) {
            System.out.println(e);
        } finally {
            System.out.println("finally block is always executed");
        }
        System.out.println("rest of the code...");
    }


    //throw can be a try catch block in short way.
    //throw stand for catch exception block
    // catch (Exception e) print(e); == throw Exception(e);
    public void throwEX() {
        try {
        int age = 0;
        if (age < 18)
            throw new ArithmeticException("not valid");
        else
            System.out.println("welcome to vote");
        }catch (Exception e) {
            System.out.println(e);
        }
    }


    public void m() throws Exception {
        throw new Exception("device error");//checked exception
    }

    public void p() {
        try {
            m();// undirected.
        } catch (Exception e) {
            System.out.println("exception handled");
        }
    }


}
