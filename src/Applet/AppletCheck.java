package Applet;

import java.applet.Applet;
import java.awt.*;

public class AppletCheck extends Applet {
    int squareSize = 50;

    @Override
    public void init() {
        String squareSizeParam = getParameter ("squareSize");
        parseSquareSize (squareSizeParam);

        String colorParam = getParameter ("color");
        Color fg = parseColor (colorParam);

        setBackground (Color.black);
        setForeground (fg);
    }

    private void parseSquareSize(String param){
        if (param == null) return;
        try {
            squareSize = Integer.parseInt (param);
        } catch (Exception e) {
            // Let default value remain
        }
    }
    //https://www.tutorialspoint.com/java/java_applet_basics.htm

    private Color parseColor (String param){
        return null;
    }

    public void paint (Graphics graphics){}

}
