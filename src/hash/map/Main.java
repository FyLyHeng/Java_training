package hash.map;

public class Main {
    public static void main(String[] args) {
        Hash myHash=new Hash();
        myHash.input("cambodia","PP");
        myHash.input("Thailand","BK");
        myHash.input("Chain","Beijing");
        myHash.output();
        myHash.remove("cambodia");
        myHash.output();
        myHash.outKey();
        myHash.outValue();
    }
}
