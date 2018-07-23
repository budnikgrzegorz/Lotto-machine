package sample;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;

public class Calculations {


    public static String Calcul(int flag, int incrementation, int flag2, int incrementation2) {
        //        Creating a list of numbers
        LinkedList linkedList = new LinkedList();
        //        Creating an instance of a random number class
        Random generator = new Random();
        //        Loop execution which after each run will generate a random number that will be added to the previously created list
        for (int i = 0; i < flag; i++) {
            linkedList.add(generator.nextInt(incrementation));
            //            Sorting from the smallest value to the larges
            Collections.sort(linkedList);
        }
        if (flag2 != 0) {
            //        Creating second  a list of numbers
            LinkedList linkedList2 = new LinkedList();
            linkedList2.add(generator.nextInt(incrementation2));
            //            Sorting from the smallest value to the larges
            Collections.sort(linkedList2);
            String string = linkedList.toString() + "-" + linkedList2.toString();
            return string;
        } else {
            return linkedList.toString();
        }
    }
}
