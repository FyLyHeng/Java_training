package constructorS;

public class ConsOverloading {
    private double width, hight, depth;

    ConsOverloading(double w, double h, double d) {
        width = w;
        hight = h;
        depth = d;
    }

    ConsOverloading(){

        width = hight=depth = 0;
    }

    ConsOverloading(double num){
        width = hight = depth = num;
    }

    /**
     * returnType double method
     * @return
     */
    double valume() {
        return width * hight * depth;
    }


}
