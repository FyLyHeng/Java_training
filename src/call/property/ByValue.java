package call.property;

public class ByValue {
    int data=50;
    void change(int data){

        data=data+100;//changes will be in the local variable only
    }
    void change1(ByValue copy){

        copy.data=copy.data+100;//changes will be in the instance variable
    }
}
