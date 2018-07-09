package sample;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;

public class Calculations {

    public static LinkedList miniLotto() {
//        Creating a list of numbers
        LinkedList<Integer> linkedList = new LinkedList();
//        Creating an instance of a random number class
        Random generator = new Random();
//        Loop execution which after each run will generate a random number that will be added to the previously created list
        for (int i = 0; i < 5; i++) {
            linkedList.add(generator.nextInt(41));
//            Sorting from the smallest value to the largest
            Collections.sort(linkedList);
        }
        return linkedList;
    }

    public static LinkedList bigLotto() {
        //        Creating a list of numbers
        LinkedList linkedList = new LinkedList();
        //        Creating an instance of a random number class
        Random generator = new Random();
        //        Loop execution which after each run will generate a random number that will be added to the previously created list
        for (int i = 0; i < 6; i++) {
            linkedList.add(generator.nextInt(50));
            //            Sorting from the smallest value to the larges
            Collections.sort(linkedList);
        }
        return linkedList;
    }

    public void multiLotto() {
    }

    public void eurojackpotLotto() {
    }

    int a;
}
