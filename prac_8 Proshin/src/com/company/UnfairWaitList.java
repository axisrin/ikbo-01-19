package com.company;

import java.util.ArrayList;

public class UnfairWaitList <E> extends WaitList<E> {



    public UnfairWaitList(){

        list = new ArrayList<>();

    }

    public void remove(E element) {
        list.remove(element);
    }

    public void moveToBack(E element) {
        list.add(list.get(list.indexOf(element)));
        list.remove(element);
    }
}
