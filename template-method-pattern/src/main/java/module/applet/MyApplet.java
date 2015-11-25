package module.applet;

import java.applet.Applet;
import java.awt.*;

public class MyApplet extends Applet {
    String message;

    public MyApplet() {
    }

    public void init() {
        this.message = "Hello World, I\'m alive!";
        this.repaint();
    }

    public void start() {
        this.message = "Now I\'m starting up...";
        this.repaint();
    }

    public void stop() {
        this.message = "Oh, now I\'m being stopped...";
        this.repaint();
    }

    public void destroy() {
        this.message = "Goodbye, cruel world";
        this.repaint();
    }

    public void paint(Graphics g) {
        g.drawString(this.message, 5, 15);
    }
}