package com.company;

import java.util.LinkedList;
import java.util.Stack;

public class Queuey<T> {



    LinkedList<T> queue = new LinkedList();

    public Queuey()
    {
        queue = new LinkedList();
    }

    //Is the queue empty
    public boolean isEmpty()
    {
        return queue.isEmpty();
    }

    //What is the size of the queue
    public int size()
    {
        return queue.size();
    }

    //Enqueueing an item
    public void enqueue(T n)
    {
        queue.addLast(n);
    }

    public T dequeue()
    {
        return (T)queue.remove(0);
    }

    //Peek at the first item
    public T peek()
    {
        return (T)queue.get(0);
    }




    public static void main(String[] args) {
        // write your code here
        /*Queuey numberQueue = new Queuey();
        numberQueue.enqueue(5);
        numberQueue.enqueue(7);
        numberQueue.enqueue(6);
        System.out.println("First out "+numberQueue.dequeue());
        System.out.println("Second out "+numberQueue.dequeue());
        System.out.println("Third out "+numberQueue.dequeue());*/

        Stack<Integer> stacky = new Stack<Integer>();
        stacky.push(1);
        stacky.push(2);
        System.out.println(stacky.pop() + " ");
        System.out.println("Peek : "+ stacky.peek());
        System.out.println(stacky.pop() + " ");
        System.out.println("Size : " + stacky.size());



    }
}
