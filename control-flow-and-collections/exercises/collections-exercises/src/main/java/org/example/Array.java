package org.example;
import java.util.Arrays;

public class Array {
    // PARTS 1 AND 2
//    public static void array() {
//        int[] integerArray = {1, 1, 2, 3, 5, 8};
//        for(int item : integerArray) {
//            if (!(item % 2 == 0)) {
//                System.out.println(item);
//            }
//        }
//    }

    //PARTS 3 AND 4
    public static void array() {
        String str = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] strArray = str.split("\\.");
        System.out.println(Arrays.toString(strArray));
    }
}
