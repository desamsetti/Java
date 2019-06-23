package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class LinkedListOne<T> {
    //Properties
    Node<T> head;
    int count;

    //Constructors
    public LinkedListOne()
    {
        head = null;
        count = 0;
    }

    public LinkedListOne(Node newHead)
    {
        head = newHead;
        count = 1;
    }


    //Methods

    //add
    public void add(T newData)
    {
        Node<T> temp = new Node(newData);
        Node<T> current = head;
        while(current.getNext()!=null)
        {
            current = current.getNext();
        }
        temp.setNext(temp);
        count++;
    }

    //get
    public T get(int index)
    {
        //if(index<=0)
        //{
         //   return -1;
        //}
        Node<T> current = head;
         for(int i = 1; i<index;i++)
         {
             current = current.getNext();
         }
         return current.getData();
    }



    //size
    public int size()
    {
        return count;
    }



    //isEmpty
    public boolean isEmpty()
    {
        return head==null;
    }


    //remove
    public void remove()
    {
        //Remove from the back side of the list
        Node<T> current= head;
        while(current.getNext().getNext()!=null)
        {
            current = current.getNext();
        }
        current.setNext(null);
        count--;
    }


    //reversePrint
    public static void reversePrint(Node head){
        Node current = head;
        List<Integer> list = new ArrayList<Integer>();
        while(current!=null){
            list.add((Integer)current.data);
            current = current.next;
        }
        for(int i=list.size()-1;i>0;i--){
            System.out.println(list.get(i));
        }
    }
}