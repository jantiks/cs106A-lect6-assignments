/*
the class makes archeryTarget
 */

import acm.graphics.*;
import acm.program.*;

import java.awt.*;

public class archeryTarget extends GraphicsProgram {
    public void run() {
        int yCenter = getHeight() / 2;
        int xCenter = getWidth() / 2;

        int bigOvalSize = 72;
        int middleOvalSize = 47;
        int smallOvalSize = 20;

        GOval bigOval = new GOval(xCenter - (bigOvalSize / 2),yCenter - (bigOvalSize / 2),bigOvalSize,bigOvalSize);
        bigOval.setFilled(true);
        bigOval.setFillColor(Color.RED);
        add(bigOval);

        GOval middleOval = new GOval(xCenter - (middleOvalSize / 2),yCenter - (middleOvalSize / 2),middleOvalSize,middleOvalSize);
        middleOval.setFilled(true);
        middleOval.setFillColor(Color.white);
        add(middleOval);

        GOval smallOval = new GOval(xCenter - (smallOvalSize / 2),yCenter - (smallOvalSize / 2),smallOvalSize,smallOvalSize);
        smallOval.setFilled(true);
        smallOval.setFillColor(Color.RED);
        add(smallOval);

    }
}
