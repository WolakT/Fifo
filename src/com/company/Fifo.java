package com.company;

/**
 * Created by RENT on 2017-05-26.
 */
public class Fifo {
    private Node tempLast;
    private Node tempFirst;

    public void push (String data){
       if(tempLast == null){
           tempLast = new Node(data);
           tempFirst = tempLast;

       } else {
           Node newNode = new Node(data);
           newNode.setNext(tempLast);
           tempLast = newNode;
       }


    }
    public void pop(){
        //tempLast print
        System.out.println(tempLast.getData());
        tempLast = tempLast.getNext();
    }

}
