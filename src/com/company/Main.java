package com.company;

public class Main {

    public static void main(String[] args) {
	Fifo fifo = new Fifo();
	fifo.push("ala");
	fifo.push("ma");
	fifo.push("kota");
	fifo.pop();
	fifo.pop();
	fifo.pop();
//	fifo.push("psa");
//	fifo.pop();

    }
}
