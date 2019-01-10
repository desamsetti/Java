package com.company;

import java.util.LinkedList;

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
    public static void main(String[] args)
    {
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("Alice");
        linkedList.add("Alicey");
        System.out.println(linkedList);
    }
}


