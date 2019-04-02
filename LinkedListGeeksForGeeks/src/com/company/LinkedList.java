package com.company;

import java.util.Stack;

public class LinkedList {
    Node head;

    public static class Node{
        int data;
        Node next;

        Node(int d){data = d;}
    }

    public void printList(){
        Node n = head;
        while(n!=null)
        {
            System.out.print(n.data + "->");
            n = n.next;
        }
        System.out.println();
    }


    public void push(int new_data){
        Node newNode = new Node(new_data);

        newNode.next = head;

        head = newNode;
    }


    public void insertAfter(Node prev_node, int new_data){
        if(prev_node==null){
            System.out.println("The given previous node cannot be null");
            return;
        }
        Node new_node = new Node(new_data);

        new_node.next = prev_node.next;

        prev_node.next = new_node;
        System.out.println();
    }

    public void append(int new_data)
    {
        Node newNode = new Node(new_data);

        if(head==null){
            head = new Node(new_data);
            return;
        }
        newNode.next = null;


        Node tempNode = head;
        while(tempNode.next!=null)
        {
            tempNode = tempNode.next;
        }
        tempNode.next = newNode;
        newNode.next = null;
        return;
    }

    void delete(int key)
    {
        Node temp = head, prev = null;

        if(temp!=null && temp.data==key){
            head = temp.next;
            return;
        }

        while(temp!= null && temp.data!=key){
            prev = temp;
            temp = temp.next;
        }
        if(temp == null) return;

        prev.next = temp.next;
    }

    public void deleteNode(int position)
    {
        if(head==null)
        {
            return;
        }

        Node temp = head;

        if(position == 0){
            head = temp.next;
            return;
        }


        for(int i=0;i<position-1;i++)
        {
            temp = temp.next;
        }

        if(temp == null || temp.next == null)
        {
            return;
        }

        Node next = temp.next.next;

        temp.next = next;
    }


    public void deleteList(){
        head = null;
        //Because of automatic garbage collection
    }


    public int getCount(){
        Node temp = head;
        int count = 0;
        while(temp!=null)
        {
            temp = temp.next;
            count++;
        }
        return count;
    }

    public int getCountRecursive(Node head){
        if(head==null)
        {
            return 0;
        }
        else
        {
            return 1+getCountRecursive(head.next);
        }
    }


    public Boolean search(Node head, int x)
    {
        Node current = head;
        while(current!=null)
        {
            if(current.data == x)
            {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public Boolean searchRecursive(Node head, int x)
    {
        if(head==null)
            return false;
        else if(head.data==x)
        {
            return true;
        }
        else{
            return search(head.next,x);
        }
    }


    public Boolean palindromeLinkedList(Node head){

        //Creating a Stack
        Stack<Node> s = new Stack<Node>();
        //Creating a count variable to get the count of elements inside LinkedList
        int count = getCount();

        if(count==0){
            return true;
        }
        if(count==1){
            return true;
        }
        if(count==2){
            return head.data==head.next.data;
        }



        Node current = head;
        //Lets push all elements upto half of the count to the stack
        for(int i=0;i<count;i++){
                if(i<count/2){
                    //System.out.println(current.data);
                    s.push(current);
                    current = current.next;
                }
        }

        if(count%2!=0){
            current = current.next;
        }

        for(int i=0;i<count/2;i++){
            Node x = s.pop();
            //System.out.println(x.data+"="+current.data);
            //current = current.next;
            if(x.data!=current.data){
                return false;
            }
            current = current.next;
        }
        return true;
    }
}
