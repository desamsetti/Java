package com.company;

import java.util.Queue;
import java.util.Stack;

public class LinkedList {
    Node head;


    public void printList(){
        Node n = head;
        while(n!=null){
            System.out.println(n.data);
            n = n.next;
        }
    }


    public void push(int new_data){
        Node newNode = new Node(new_data);

        newNode.next = head;
        head = newNode;
    }

    public void insertAfter(Node prev_node,int new_data){
        if(prev_node==null){
            System.out.println("The given previous node cannot be null");
        }else{
            Node newNode = new Node(new_data);
            newNode.next = prev_node.next;
            prev_node.next = newNode;
            System.out.println();
        }
    }

    public void append(int new_data){
        Node newNode = new Node(new_data);
        Node focusNode = head;
        while(focusNode.next!=null){
            focusNode = focusNode.next;
        }
        focusNode.next = newNode;
    }



    public void delete(int key){
        Node temp = head;
        Node prev = null;

        if(temp!=null && temp.data==key){
            head = temp.next;
            return;
        }
        while(temp!=null && temp.data!=key){
            prev = temp;
            temp = temp.next;
        }

        if(temp==null) return;
        prev.next = temp.next;
    }


    public void deleteNode(int position){
        if(head==null){
            return;
        }
        Node temp = head;
        if(position==0){
            head = temp.next;
        }


        for(int i=0;i<position-1;i++){
            temp = temp.next;
        }
        if(temp==null|| temp.next==null){
            return;
        }
        Node next = temp.next.next;

        temp.next = next;
    }



    public void deleteList(){
        head = null;
    }


    public int getCount(){
        Node temp = head;
        int count = 0;
        while(temp!=null){
            temp = temp.next;
            count++;
        }
        return count;
    }

    public int getCountRecursive(Node head){
        if(head==null){
            return 0;
        }else{
            return 1+getCountRecursive(head.next);
        }
    }


    public Boolean search(Node head,int x){
        Node current = head;
        while(current!=null){
            if(current.data==x){
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public Boolean searchRecursive(Node heaad,int x){
        if(head==null){
            return false;
        }else if(head.data==x){
            return true;
        }
        else{
            return search(head.next,x);
        }
    }


    public Node middleNode(Node head) {
        int count = getCount();
        Node temp = head;
        if(count%2!=0) {
            int counter = 0;

            while (temp != null && counter != (count / 2)) {
                temp = temp.next;
                counter++;
            }
            return temp;
        }else{
            int counter = 0;
            while(temp!=null && counter!=(count / 2)){
                temp = temp.next;
                counter++;
            }
            return temp;
        }

    }


    /*public static LinkedList reverseLinkedList(Node head){
        LinkedList newList = new LinkedList();
        if(head==null){
            return newList;
        }
        else{
            Stack<Node> s1 = new Stack<Node>();
            Node current = head;
            while(current!=null){

                s1.push(current);
                current = current.next;
            }
            while(!s1.isEmpty())
            {
                newList.append(s1.pop().data);
            }
        }
        return newList;
    }*/
    public Node reverse(Node node) {
        Node prev = null;
        Node current = node;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }

    public static LinkedList addTwoNumbers(Node l1, Node l2) {
        Queue<Integer> q1 = new java.util.LinkedList<Integer>();
        Queue<Integer> q2 = new java.util.LinkedList<Integer>();

        Node current1 = l1;
        while(current1!=null){
            ((java.util.LinkedList<Integer>) q1).push(current1.data);
            current1 = current1.next;
        }

        int x = 0;
        while(!q1.isEmpty()){
            x *= 10;
            x += q1.poll();

        }
        Node current2 = l2;
        while(current2!=null){
            ((java.util.LinkedList<Integer>) q2).push(current2.data);
            current2 = current2.next;
        }

        int y = 0;
        while(!q2.isEmpty()){
            y *= 10;
            y += q2.poll();

        }

        int total = x+y;
        LinkedList newList = new LinkedList();

        while(total!=0){
            newList.push(total%10);
            total /= 10;
        }

        
        return newList;
    }
}
