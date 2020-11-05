package com.company;

import java.util.ArrayList;

public class BoundedWaitList<E> extends WaitList<E> {

    private int size;

    BoundedWaitList(int size){

        this.size = size;
        list = new ArrayList<>(size);

    }

    public int getSize() {
        return size;
    }

    @Override
    public void add(Object element) {
        if (list.size()==size)
            return;
        else
            super.add(element);
    }

    @Override
    public String toString() {
        String string;
        return list.toString();
    }

}
