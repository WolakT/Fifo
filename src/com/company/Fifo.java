package com.company;

/**
 * Created by RENT on 2017-05-26.
 */
public class Fifo <dataType>{
    private Node tempLast;
    private Node tempFirst;

    public void push (dataType data){
       if(tempLast == null){
           tempLast = new Node(data);
           tempFirst = tempLast;

       } else {
           Node newNode = new Node(data);
           tempLast.setNext(newNode);
           ///newNode.setNext(tempLast);
           tempLast = newNode;
       }


    }
    public void pop(){
        //tempLast print
        System.out.println(tempFirst.getData());
        tempFirst = tempFirst.getNext();
    }

}
