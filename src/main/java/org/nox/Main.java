package org.nox;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws ArrayListFullException {
        MyArrayList<Integer> arrayList = new MyArrayList<>();


        for (int i = 0; i < 10; i++) {
            arrayList.addElement(i);
            System.out.println(i);
        }
        arrayList.addElement(10);


    }
}