/*
finds highest and lowest umber from the list
 */

import acm.program.*;

public class highestLowestNumber extends ConsoleProgram {
    public void run() {
        int high;
        int low;

        int a = readInt("?");
        high = a;
        low = a;
        for (int i = 0; i < 8; i++) {
            int number = readInt("?");

            if (number > high) {
                high = number;
            } else if (number < low ) {
                low = number;
            }
        }
        println("highest " + high);
        println("lowest " + low);
    }
}
