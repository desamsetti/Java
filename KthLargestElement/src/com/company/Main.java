package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        KthLargest kthLargest = new KthLargest(3,new int[]{4,5,8,2,10,15});
        System.out.println(kthLargest.add(3));
        System.out.println(kthLargest.add(5));
        System.out.println(kthLargest.add(10));
        System.out.println(kthLargest.add(9));
        System.out.println(kthLargest.add(4));
        System.out.println(kthLargest.add(15));
        System.out.println(kthLargest.add(20));
    }
}
