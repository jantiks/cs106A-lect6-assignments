/*
this class draws checkboard
 */

import acm.program.*;
import acm.graphics.*;

public class problem1 extends GraphicsProgram {
    public void run() {
        int NROWS = 8;
        int NCOLS = 8;
        int sqrSize = getHeight() / NROWS ;

        for (int i = 0; i < NROWS; i++) {
            for (int j = 0; j < NCOLS; j++) {
                int x = j * sqrSize;
                int y = i * sqrSize;
                GRect rect = new GRect(x,y,sqrSize,sqrSize);
                rect.setFilled((i + j) % 2 != 0);
                add(rect);
            }
        }
    }
}
