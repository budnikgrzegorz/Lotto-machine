package sample;

import java.util.LinkedList;
import java.util.Random;

public class Calculations {

    public static LinkedList miniLotto() {
        LinkedList linkedList = new LinkedList();
        Random generator = new Random();

        for (int i = 0; i < 5; i++) {

            linkedList.add(generator.nextInt(41));
        }
        return linkedList;
    }

    public static LinkedList bigLotto() {
        LinkedList linkedList = new LinkedList();
        Random generator = new Random();

        for (int i = 0; i < 6; i++) {

            linkedList.add(generator.nextInt(50));
        }
        return linkedList;
    }

    public void multiLotto() {
    }

    public void eurojackpotLotto() {
    }

    int a;
}
