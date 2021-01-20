/*
class which shows the programm hierarchy
 */

import acm.program.*;
import acm.graphics.*;

public class programmHierarchy extends GraphicsProgram {
    int width = 100;
    int height = 40;

    public void run() {
        // adds labels
        GLabel program = new GLabel("Program",300 + 25, 100 + 20);
        GLabel consoleProgram = new GLabel("Console Program",300, 200);
        // adds rectangles
        GRect programRect = new GRect(300, 100 , width, height );
        GRect consoleProgramRect = new GRect(300, 200, width , height);

        add(programRect);

        add(consoleProgramRect);
        add(program);
        add(consoleProgram);
    }

}
