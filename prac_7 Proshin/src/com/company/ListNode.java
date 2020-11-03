package com.company;

public class ListNode<AnyType> {

    // The actual data
    AnyType data;
    // Reference to the next node
    ListNode<AnyType> next;
    // Reference to the prev node
    ListNode<AnyType> prev;

    boolean hasNext;

    /**
     * Constructor.
     * Note that the next and prev variables are set to null, thus this is the "root-node"
     *
     * @param data node data
     */
    ListNode(AnyType data) {
        this(null, data, null);
    }

    public ListNode<AnyType> getNext() {
        return next;
    }

    public ListNode<AnyType> getPrev() {
        return prev;
    }

    public boolean isHasNext() {
        return hasNext;
    }

    public AnyType getData() {
        return data;
    }
    /**
     * Constructor.
     *
     * @param data node data
     * @param next reference to next node
     * @param prev reference to the previous node
     */
    ListNode(ListNode<AnyType> prev, AnyType data, ListNode<AnyType> next) {
        this.data = data;
        this.next = next;
        this.prev = prev;
        if (next == null)
            this.hasNext = false;
        else
        {
            this.hasNext = true;
        }
    }
}
