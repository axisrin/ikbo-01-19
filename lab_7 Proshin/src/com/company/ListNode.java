package com.company;

public class ListNode<AnyType> {

    int index;
    AnyType data;
    ListNode<AnyType> next;

    ListNode(AnyType data) {

        this.data = data;
        this.index = 0;
    }

    public AnyType getData() {
        return data;
    }

    public ListNode<AnyType> getNext() {
        return next;
    }

    public void setIndex(int index) {

        this.index = index;

    }

    ListNode(AnyType data , ListNode<AnyType> next , int index) {

        this.data = data;
        this.next = next;
        this.index = index;

    }

    public void setNext(ListNode<AnyType> next) {
        this.next = next;
    }

    public void setData(AnyType data) {
        this.data = data;
    }

    public int getIndex() {
        return index;
    }
}
