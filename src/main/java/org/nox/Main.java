package org.nox;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws ArrayListFullException {
        MyArrayList<Integer> arrayList = new MyArrayList<>();
        arrayList.addElement(1);
        arrayList.addElement(2);
        arrayList.addElement(3);
    }
}