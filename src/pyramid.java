/*
this class makes a pyramid
 */
import acm.graphics.*;
import acm.program.*;

public class pyramid extends GraphicsProgram {
    private static final int brickWidth = 30;
    private static final int brickHeight = 12;
    private static final int bricksCount = 14;

    public void run() {
        int center = getWidth() / 2;
        int height = getHeight();
        for (int i = bricksCount; i >= 0; i--) {

            if (i % 2 == 0) {
                for (int j = i / 2; j >= 0; j--) {
                    int x1 = center + (j * brickWidth);
                    int x2 = center - (j * brickWidth);
                    int y = height - ((14 - i) * brickHeight);

                    GRect rect1 = new GRect(x1, y, brickWidth, brickHeight);
                    GRect rect2 = new GRect(x2, y, brickWidth, brickHeight);

                    add(rect1);
                    add(rect2);
                }
            } else {
                for (int j = ((i / 2) + 1); j >= 0; j--) {
                    int x1 = center + ((j * brickWidth) - (brickWidth / 2));
                    int x2 = center - ((j * brickWidth) - (brickWidth / 2));
                    int y = height - ((14 - i) * brickHeight);

                    GRect rect1 = new GRect(x1, y, brickWidth, brickHeight);
                    GRect rect2 = new GRect(x2, y, brickWidth, brickHeight);

                    add(rect1);
                    add(rect2);
                }
            }

        }
    }
}
