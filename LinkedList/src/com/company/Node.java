package com.company;

public class Node<T> {
    //Properties
    Node next;
    T data;


    public Node(T newData)
    {
        data = newData;
        next = null;
    }

    public Node(T newData, Node<T> newNext)
    {
        data = newData;
        next = newNext;
    }

    //Getters and Setters
    public T getData()
    {
        return data;
    }

    public Node getNext()
    {
        return next;
    }

    public void setData(T newData)
    {
        data = newData;
    }

    public void setNext(Node<T> newNode)
    {
        next = newNode;
    }

}
