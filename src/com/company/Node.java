package com.company;

/**
 * Created by RENT on 2017-05-26.
 */
public class Node <dataType> {
    private Node next;
    private dataType data;

    public Node(dataType data) {
        this.data = data;
    }

    public dataType getData() {
        return data;
    }

    public void setData(dataType data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }


}
