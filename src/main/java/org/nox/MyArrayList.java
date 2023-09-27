package org.nox;

import java.util.ArrayList;

public class MyArrayList<T> {
    private ArrayList<T> list = new ArrayList<>();

    public void addElement(T element) throws ArrayListFullException {
        if (list.size() >= 10) {
            throw new ArrayListFullException();
        }
        list.add(element);
    }
}
