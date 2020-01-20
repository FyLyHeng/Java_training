package Static_component;

public class Static_counter {

        static int count=0;//will get memory only once and retain its value


    /**
     * incrementing 1 when create obj
     * return new value and save new value
     */
    Static_counter(){
            count++;//incrementing the value of static variable
            System.out.println(count);
        }



}
