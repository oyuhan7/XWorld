import java.awt.Graphics;
import java.awt.Frame;
import java.lang.Math;

public class FlightIcon extends Frame {

    public void paint(Graphics g) {
        /*
        g.drawLine(100,150,200,140);
        g.drawLine(200,140,300,150);
        g.drawOval(170,150,10,10);
        g.drawOval(220,150,10,10);
        g.drawLine(130,157,170,157);
        g.drawLine(230,157,270,157);
        g.drawLine(175,150,170,95);
        g.drawLine(225,150,230,95);
        */
        //x=x+t y=y+t t=-20
        /*
        g.drawLine(80,130,180,120);
        g.drawLine(180,120,280,130);
        g.drawOval(150,130,10,10);
        g.drawOval(200,130,10,10);
        g.drawLine(110,137,150,137);
        g.drawLine(210,137,250,137);
        g.drawLine(155,130,150,75);
        g.drawLine(205,130,210,75);
        */
        //x=x+(x-x)cos0-(y-y)sin0 y=y+(x-x)sin0+(y-y)cos0 0=30
        //T(200,140)

        g.drawLine((int)(200+(100-200)*Math.cos(Math.toRadians(30))-(150-140)*Math.sin(Math.toRadians(30))),
                (int)(140+(100-200)*Math.sin(Math.toRadians(30))+(150-140)*Math.cos(Math.toRadians(30))),
                (int)(200+(200-200)*Math.cos(Math.toRadians(30))-(140-140)*Math.sin(Math.toRadians(30))),
                (int)(140+(200-200)*Math.sin(Math.toRadians(30))+(140-140)*Math.cos(Math.toRadians(30))));
        g.drawLine((int)(200+(200-200)*Math.cos(Math.toRadians(30))-(140-140)*Math.sin(Math.toRadians(30))),
                (int)(140+(200-200)*Math.sin(Math.toRadians(30))+(140-140)*Math.cos(Math.toRadians(30))),
                (int)(200+(300-200)*Math.cos(Math.toRadians(30))-(150-140)*Math.sin(Math.toRadians(30))),
                (int)(140+(300-200)*Math.sin(Math.toRadians(30))+(150-140)*Math.cos(Math.toRadians(30))));
        g.drawOval((int)(200+(170+5-200)*Math.cos(Math.toRadians(30))-(150+5-140)*Math.sin(Math.toRadians(30))-5),
                (int)(140+(170+5-200)*Math.sin(Math.toRadians(30))+(150+5-140)*Math.cos(Math.toRadians(30))-5),
                10,10);
        g.drawOval((int)(200+(220+5-200)*Math.cos(Math.toRadians(30))-(150+5-140)*Math.sin(Math.toRadians(30))-5),
                (int)(140+(220+5-200)*Math.sin(Math.toRadians(30))+(150+5-140)*Math.cos(Math.toRadians(30))-5),
                10,10);
        g.drawLine((int)(200+(130-200)*Math.cos(Math.toRadians(30))-(157-140)*Math.sin(Math.toRadians(30))),
                (int)(140+(130-200)*Math.sin(Math.toRadians(30))+(157-140)*Math.cos(Math.toRadians(30))),
                (int)(200+(170-200)*Math.cos(Math.toRadians(30))-(157-140)*Math.sin(Math.toRadians(30))),
                (int)(140+(170-200)*Math.sin(Math.toRadians(30))+(157-140)*Math.cos(Math.toRadians(30))));
        g.drawLine((int)(200+(230-200)*Math.cos(Math.toRadians(30))-(157-140)*Math.sin(Math.toRadians(30))),
                (int)(140+(230-200)*Math.sin(Math.toRadians(30))+(157-140)*Math.cos(Math.toRadians(30))),
                (int)(200+(270-200)*Math.cos(Math.toRadians(30))-(157-140)*Math.sin(Math.toRadians(30))),
                (int)(140+(270-200)*Math.sin(Math.toRadians(30))+(157-140)*Math.cos(Math.toRadians(30))));
        g.drawLine((int)(200+(175-200)*Math.cos(Math.toRadians(30))-(150-140)*Math.sin(Math.toRadians(30))),
                (int)(140+(175-200)*Math.sin(Math.toRadians(30))+(150-140)*Math.cos(Math.toRadians(30))),
                (int)(200+(170-200)*Math.cos(Math.toRadians(30))-(95-140)*Math.sin(Math.toRadians(30))),
                (int)(140+(170-200)*Math.sin(Math.toRadians(30))+(95-140)*Math.cos(Math.toRadians(30))));
        g.drawLine((int)(200+(225-200)*Math.cos(Math.toRadians(30))-(150-140)*Math.sin(Math.toRadians(30))),
                (int)(140+(225-200)*Math.sin(Math.toRadians(30))+(150-140)*Math.cos(Math.toRadians(30))),
                (int)(200+(230-200)*Math.cos(Math.toRadians(30))-(95-140)*Math.sin(Math.toRadians(30))),
                (int)(140+(230-200)*Math.sin(Math.toRadians(30))+(95-140)*Math.cos(Math.toRadians(30))));

    }

    public FlightIcon() {

        super("XWorld Flight Icon");
        setSize(400,400);
        setVisible(true);

    }

    public static void main(String[] args) {

        new FlightIcon();

    }

}
