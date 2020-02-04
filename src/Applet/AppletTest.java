package Applet;

import java.applet.Applet;
import java.awt.*;

public class AppletTest extends Applet {

    public void print(Graphics graphics) {
        graphics.drawString("Hello Java", 25, 50);
    }
}
