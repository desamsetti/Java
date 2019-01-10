package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Queue q1 = new Queue();
        q1.enqueue(5);
        q1.enqueue(6);
        //q1.enqueue(7);


        Queue q2 = new Queue();
        q2.enqueue(500);
        q2.enqueue(600);
        //q.enqueue(12);
        //q.dequeue();
        //q.dequeue();
        //q.dequeue();
        //q.dequeue();
        //q.dequeue();
        //q.dequeue();


        Queue q3 = new Queue();
        q3 = q3.weave(q1,q2);
        System.out.println("Size is : "+ q3.getSize());
        q3.show();

        //q.show();

    }


}
