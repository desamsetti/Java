package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Printer printer = new Printer(50,false);
        System.out.println("Initial page count = "+printer.getPagesPrinted());
        //Here Encapsulation is being used because, we are using the get method and not the pages printed directly.
        int pagesPrinted = printer.printPages(4);
        System.out.println("Pages printed was = "+pagesPrinted+" new total print count for printer = "+printer.getPagesPrinted());
        pagesPrinted = printer.printPages(2);
        System.out.println("Pages printed was = "+pagesPrinted+" new total print count for printer = "+printer.getPagesPrinted());

    }
}
