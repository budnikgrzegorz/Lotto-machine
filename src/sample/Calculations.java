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


    public static String multiLotto(int flag) {

        //        Creating a list of numbers
        LinkedList linkedList = new LinkedList();
        //        Creating an instance of a random number class
        Random generator = new Random();
        //        Loop execution which after each run will generate a random number that will be added to the previously created list
        for (int i = 0; i < flag; i++) {
            linkedList.add(generator.nextInt(50));
            //            Sorting from the smallest value to the larges
            Collections.sort(linkedList);
        }
        return linkedList.toString();
    }

    public static String eurojackpotLotto() {
        //        Creating a list of numbers
        LinkedList linkedList = new LinkedList();
        //        Creating a list of numbers
        LinkedList linkedList2 = new LinkedList();
        //        Creating an instance of a random number class
        Random generator = new Random();
        //        Loop execution which after each run will generate a random number that will be added to the previously created list
        for (int i = 0; i < 5; i++) {
            linkedList.add(generator.nextInt(50));
            //            Sorting from the smallest value to the larges
            Collections.sort(linkedList);
        }
        for (int i = 0; i < 2; i++) {
            linkedList2.add(generator.nextInt(10));
            //            Sorting from the smallest value to the larges
            Collections.sort(linkedList2);
        }
        String string = linkedList.toString() + "-" + linkedList2.toString();
        return string;
    }

    public static String ekstraPensja() {
        //        Creating a list of numbers
        LinkedList linkedList = new LinkedList();
        //        Creating a list of numbers
        LinkedList linkedList2 = new LinkedList();
        //        Creating an instance of a random number class
        Random generator = new Random();
        //        Loop execution which after each run will generate a random number that will be added to the previously created list
        for (int i = 0; i < 5; i++) {
            linkedList.add(generator.nextInt(35));
            //            Sorting from the smallest value to the larges
            Collections.sort(linkedList);
        }
        linkedList2.add(generator.nextInt(4));
        //            Sorting from the smallest value to the larges
        Collections.sort(linkedList2);

        String string = linkedList.toString() + "-" + linkedList2.toString();
        return string;
    }

}
