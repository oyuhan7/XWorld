/***********************************************************************************************************************
 * Han Yu Chinese This code belongs to XWorld Flight simulate game.
 * https://github.com/oyuhan7/XWorld
 * Welcome copy it. But welcome honest use.
 */

import java.awt.Graphics;
import java.awt.Frame;
import java.lang.Math;

public class FlightIcon extends Frame {

    int xLW1 = 100 , yLW1 = 150 , xLW2 = 200 , yLW2 = 140;
    int xRW1 = 200 , yRW1 = 140 , xRW2 = 300 , yRW2 = 150;
    int xLEng = 170 , yLEng = 150 , wLEng = 10 , hLEng = 10 , rLEng = 5;
    int xREng = 220 , yREng = 150 , wREng = 10 , hREng = 10 , rREng = 5;
    int xLT1 = 130 , yLT1 = 157 , xLT2 = 170 , yLT2 = 157;
    int xRT1 = 230 , yRT1 = 157 , xRT2 = 270 , yRT2 = 157;
    int xLVT1 = 175 , yLVT1 = 150 , xLVT2 = 170 , yLVT2 = 95;
    int xRVT1 = 225 , yRVT1 = 150 , xRVT2 = 230 , yRVT2 = 95;
    int xT = 0 , yT = 0;
    int xR = 200 , yR = 140;
    int Theta = 0;

    public void paint(Graphics g) {

        g.drawLine((int)(xR+(xLW1-xR)*Math.cos(Math.toRadians(Theta))-(yLW1-yR)*Math.sin(Math.toRadians(Theta))+xT),
                (int)(yR+(xLW1-xR)*Math.sin(Math.toRadians(Theta))+(yLW1-yR)*Math.cos(Math.toRadians(Theta))+yT),
                (int)(xR+(xLW2-xR)*Math.cos(Math.toRadians(Theta))-(yLW2-yR)*Math.sin(Math.toRadians(Theta))+xT),
                (int)(yR+(xLW2-xR)*Math.sin(Math.toRadians(Theta))+(yLW2-yR)*Math.cos(Math.toRadians(Theta))+yT));
        g.drawLine((int)(xR+(xRW1-xR)*Math.cos(Math.toRadians(Theta))-(yRW1-yR)*Math.sin(Math.toRadians(Theta))+xT),
                (int)(yR+(xRW1-xR)*Math.sin(Math.toRadians(Theta))+(yRW1-yR)*Math.cos(Math.toRadians(Theta))+yT),
                (int)(xR+(xRW2-xR)*Math.cos(Math.toRadians(Theta))-(yRW2-yR)*Math.sin(Math.toRadians(Theta))+xT),
                (int)(yR+(xRW2-xR)*Math.sin(Math.toRadians(Theta))+(yRW2-yR)*Math.cos(Math.toRadians(Theta))+yT));
        g.drawOval((int)(xR+(xLEng+rLEng-xR)*Math.cos(Math.toRadians(Theta))-(yLEng+rLEng-yR)*Math.sin(Math.toRadians(Theta))-rLEng+xT),
                (int)(yR+(xLEng+rLEng-xR)*Math.sin(Math.toRadians(Theta))+(yLEng+rLEng-yR)*Math.cos(Math.toRadians(Theta))-rLEng+yT),
                wLEng,hLEng);
        g.drawOval((int)(xR+(xREng+rREng-xR)*Math.cos(Math.toRadians(Theta))-(yREng+rREng-yR)*Math.sin(Math.toRadians(Theta))-rREng+xT),
                (int)(yR+(xREng+rREng-xR)*Math.sin(Math.toRadians(Theta))+(yREng+rREng-yR)*Math.cos(Math.toRadians(Theta))-rREng+yT),
                wREng,hREng);
        g.drawLine((int)(xR+(xLT1-xR)*Math.cos(Math.toRadians(Theta))-(yLT1-yR)*Math.sin(Math.toRadians(Theta))+xT),
                (int)(yR+(xLT1-xR)*Math.sin(Math.toRadians(Theta))+(yLT1-yR)*Math.cos(Math.toRadians(Theta))+yT),
                (int)(xR+(xLT2-xR)*Math.cos(Math.toRadians(Theta))-(yLT2-yR)*Math.sin(Math.toRadians(Theta))+xT),
                (int)(yR+(xLT2-xR)*Math.sin(Math.toRadians(Theta))+(yLT2-yR)*Math.cos(Math.toRadians(Theta)))+yT);
        g.drawLine((int)(xR+(xRT1-xR)*Math.cos(Math.toRadians(Theta))-(yRT1-yR)*Math.sin(Math.toRadians(Theta))+xT),
                (int)(yR+(xRT1-xR)*Math.sin(Math.toRadians(Theta))+(yRT1-yR)*Math.cos(Math.toRadians(Theta))+yT),
                (int)(xR+(xRT2-xR)*Math.cos(Math.toRadians(Theta))-(yRT2-yR)*Math.sin(Math.toRadians(Theta))+xT),
                (int)(yR+(xRT2-xR)*Math.sin(Math.toRadians(Theta))+(yRT2-yR)*Math.cos(Math.toRadians(Theta))+yT));
        g.drawLine((int)(xR+(xLVT1-xR)*Math.cos(Math.toRadians(Theta))-(yLVT1-yR)*Math.sin(Math.toRadians(Theta))+xT),
                (int)(yR+(xLVT1-xR)*Math.sin(Math.toRadians(Theta))+(yLVT1-yR)*Math.cos(Math.toRadians(Theta))+yT),
                (int)(xR+(xLVT2-xR)*Math.cos(Math.toRadians(Theta))-(yLVT2-yR)*Math.sin(Math.toRadians(Theta))+xT),
                (int)(yR+(xLVT2-xR)*Math.sin(Math.toRadians(Theta))+(yLVT2-yR)*Math.cos(Math.toRadians(Theta))+yT));
        g.drawLine((int)(xR+(xRVT1-xR)*Math.cos(Math.toRadians(Theta))-(yRVT1-yR)*Math.sin(Math.toRadians(Theta))+xT),
                (int)(yR+(xRVT1-xR)*Math.sin(Math.toRadians(Theta))+(yRVT1-yR)*Math.cos(Math.toRadians(Theta))+yT),
                (int)(xR+(xRVT2-xR)*Math.cos(Math.toRadians(Theta))-(yRVT2-yR)*Math.sin(Math.toRadians(Theta))+xT),
                (int)(yR+(xRVT2-xR)*Math.sin(Math.toRadians(Theta))+(yRVT2-yR)*Math.cos(Math.toRadians(Theta))+yT));

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
        /*
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
        */
    }

    public FlightIcon() {

        super("XWorld Flight Icon");
        setSize(400,400);
        setVisible(true);

        for (int i = 0; i < 50; i++) {
            try {
                Thread.sleep(100);
                if (i == 0) {
                    xT = xT + 5;
                    yT = yT - 5;
                    Theta = -5;
                    xR = xR + 5;
                    yR = yR - 5;
                } else if (i == 1) {
                    xT = xT + 5;
                    yT = yT - 5;
                    Theta = -5;
                    xR = xR + 5;
                    yR = yR - 5;
                } else if (i == 2) {
                    xT = xT + 5;
                    yT = yT - 5;
                    Theta = -5;
                    xR = xR + 5;
                    yR = yR - 5;
                } else if (i == 3) {
                    xT = xT + 5;
                    yT = yT - 5;
                    Theta = -5;
                    xR = xR + 5;
                    yR = yR - 5;
                } else if (i == 4) {
                    xT = xT + 5;
                    yT = yT - 5;
                    Theta = -5;
                    xR = xR + 5;
                    yR = yR - 5;
                } else if (i == 5) {
                    xT = xT - 5;
                    yT = yT + 5;
                    Theta = 5;
                    xR = xR - 5;
                    yR = yR + 5;
                } else if (i == 6) {
                    xT = xT - 5;
                    yT = yT + 5;
                    Theta = 5;
                    xR = xR - 5;
                    yR = yR + 5;
                } else if (i == 7) {
                    xT = xT - 5;
                    yT = yT + 5;
                    Theta = 5;
                    xR = xR - 5;
                    yR = yR + 5;
                } else if (i == 8) {
                    xT = xT - 5;
                    yT = yT + 5;
                    Theta = 5;
                    xR = xR - 5;
                    yR = yR + 5;
                } else if (i == 9) {
                    xT = xT - 5;
                    yT = yT + 5;
                    Theta = 5;
                    xR = xR - 5;
                    yR = yR + 5;
                } else if (i == 10) {
                    xT = xT - 5;
                    yT = yT - 5;
                    Theta = 5;
                    xR = xR - 5;
                    yR = yR - 5;
                } else if (i == 11) {
                    xT = xT - 5;
                    yT = yT - 5;
                    Theta = 5;
                    xR = xR - 5;
                    yR = yR - 5;
                } else if (i == 12) {
                    xT = xT - 5;
                    yT = yT - 5;
                    Theta = 5;
                    xR = xR - 5;
                    yR = yR - 5;
                } else if (i == 13) {
                    xT = xT - 5;
                    yT = yT - 5;
                    Theta = 5;
                    xR = xR - 5;
                    yR = yR - 5;
                } else if (i == 14) {
                    xT = xT - 5;
                    yT = yT - 5;
                    Theta = 5;
                    xR = xR - 5;
                    yR = yR - 5;
                } else if (i == 15) {
                    xT = xT + 5;
                    yT = yT + 5;
                    Theta = -10;
                    xR = xR + 5;
                    yR = yR + 5;
                } else if (i == 16) {
                    xT = xT + 5;
                    yT = yT + 5;
                    Theta = -10;
                    xR = xR + 5;
                    yR = yR + 5;
                } else if (i == 17) {
                    xT = xT + 5;
                    yT = yT + 5;
                    Theta = -5;
                    xR = xR + 5;
                    yR = yR + 5;
                } else if (i == 18) {
                    xT = xT + 5;
                    yT = yT + 5;
                    Theta = -5;
                    xR = xR + 5;
                    yR = yR + 5;
                } else if (i == 19) {
                    xT = xT + 5;
                    yT = yT + 5;
                    Theta = -5;
                    xR = xR + 5;
                    yR = yR + 5;
                } else if (i == 20) {
                    xT = xT + 0;
                    yT = yT - 0;
                    Theta = 10;
                    xR = xR + 0;
                    yR = yR - 30;
                } else if (i == 21) {
                    xT = xT + 0;
                    yT = yT - 0;
                    Theta = 20;
                    xR = xR + 0;
                    yR = yR - 0;
                } else if (i == 22) {
                    xT = xT + 0;
                    yT = yT - 0;
                    Theta = 30;
                    xR = xR + 0;
                    yR = yR - 0;
                } else if (i == 23) {
                    xT = xT + 0;
                    yT = yT - 0;
                    Theta = 40;
                    xR = xR + 0;
                    yR = yR - 0;
                } else if (i == 24) {
                    xT = xT + 0;
                    yT = yT - 0;
                    Theta = 50;
                    xR = xR + 0;
                    yR = yR - 0;
                } else if (i == 25) {
                    xT = xT + 0;
                    yT = yT - 0;
                    Theta = 60;
                    xR = xR + 0;
                    yR = yR - 0;
                } else if (i == 26) {
                    xT = xT + 0;
                    yT = yT - 0;
                    Theta = 70;
                    xR = xR + 0;
                    yR = yR - 0;
                } else if (i == 27) {
                    xT = xT + 0;
                    yT = yT - 0;
                    Theta = 80;
                    xR = xR + 0;
                    yR = yR - 0;
                } else if (i == 28) {
                    xT = xT + 0;
                    yT = yT - 0;
                    Theta = 90;
                    xR = xR + 0;
                    yR = yR - 0;
                } else if (i == 29) {
                    xT = xT + 0;
                    yT = yT - 0;
                    Theta = 100;
                    xR = xR + 0;
                    yR = yR - 0;
                } else if (i == 30) {
                    xT = xT + 0;
                    yT = yT - 0;
                    Theta = 110;
                    xR = xR + 0;
                    yR = yR - 0;
                } else if (i == 31) {
                    xT = xT + 0;
                    yT = yT - 0;
                    Theta = 120;
                    xR = xR + 0;
                    yR = yR - 0;
                } else if (i == 32) {
                    xT = xT + 0;
                    yT = yT - 0;
                    Theta = 130;
                    xR = xR + 0;
                    yR = yR - 0;
                } else if (i == 33) {
                    xT = xT + 0;
                    yT = yT - 0;
                    Theta = 140;
                    xR = xR + 0;
                    yR = yR - 0;
                } else if (i == 34) {
                    xT = xT + 0;
                    yT = yT - 0;
                    Theta = 150;
                    xR = xR + 0;
                    yR = yR - 0;
                } else if (i == 35) {
                    xT = xT + 0;
                    yT = yT - 0;
                    Theta = 160;
                    xR = xR + 0;
                    yR = yR - 0;
                } else if (i == 36) {
                    xT = xT + 0;
                    yT = yT - 0;
                    Theta = 170;
                    xR = xR + 0;
                    yR = yR - 0;
                } else if (i == 37) {
                    xT = xT + 0;
                    yT = yT - 0;
                    Theta = 180;
                    xR = xR + 0;
                    yR = yR - 0;
                } else if (i == 38) {
                    xT = xT + 0;
                    yT = yT - 0;
                    Theta = 190;
                    xR = xR + 0;
                    yR = yR - 0;
                } else if (i == 39) {
                    xT = xT + 0;
                    yT = yT - 0;
                    Theta = 200;
                    xR = xR + 0;
                    yR = yR - 0;
                } else if (i == 40) {
                    xT = xT + 0;
                    yT = yT + 5;
                    Theta = 210;
                    xR = xR + 0;
                    yR = yR + 5;
                } else if (i == 41) {
                    xT = xT + 0;
                    yT = yT + 5;
                    Theta = 220;
                    xR = xR + 0;
                    yR = yR + 5;
                } else if (i == 42) {
                    xT = xT + 0;
                    yT = yT + 5;
                    Theta = 230;
                    xR = xR + 0;
                    yR = yR + 5;
                } else if (i == 43) {
                    xT = xT + 0;
                    yT = yT + 5;
                    Theta = 240;
                    xR = xR + 0;
                    yR = yR + 5;
                } else if (i == 44) {
                    xT = xT + 0;
                    yT = yT + 5;
                    Theta = 260;
                    xR = xR + 0;
                    yR = yR + 5;
                } else if (i == 45) {
                    xT = xT + 0;
                    yT = yT + 5;
                    Theta = 280;
                    xR = xR + 0;
                    yR = yR + 5;
                } else if (i == 46) {
                    xT = xT + 0;
                    yT = yT + 5;
                    Theta = 300;
                    xR = xR + 0;
                    yR = yR + 5;
                } else if (i == 47) {
                    xT = xT + 0;
                    yT = yT + 5;
                    Theta = 320;
                    xR = xR + 0;
                    yR = yR + 5;
                } else if (i == 48) {
                    xT = xT + 0;
                    yT = yT + 5;
                    Theta = 340;
                    xR = xR + 0;
                    yR = yR + 5;
                } else if (i == 49) {
                    xT = xT + 0;
                    yT = yT + 5;
                    Theta = 360;
                    xR = xR + 0;
                    yR = yR + 5;
                }
                repaint();

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    public static void main(String[] args) {

        new FlightIcon();

    }

}
