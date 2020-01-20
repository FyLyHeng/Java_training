package Aggregation;

public class Car {
    Operations op; //aggregation
    long min = 1;

    long avgSpeed(long ph){
        op=new Operations(); //aggregation
        long avg = op.maxSpeed(12000,6);
        avg = min-avg+ph;
        return avg;
    }
}
