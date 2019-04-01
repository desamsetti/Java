package com.company;

public class DoublyLinkedList {
    Node head;
    static class Node{
        int data;
        Node prev;
        Node next;

        Node(int d){
            this.data = d;
        }
    }


    public void printList(Node head){
        if(head==null){
            System.out.println("No nodes");
        }
        else{
            Node current = head;
            while(current!=null){
                System.out.println(current.data);
                current = current.next;
            }
        }
    }

    public Node getNewNode(int d){
        Node newNode = new Node(d);
        newNode.prev = null;
        newNode.next = null;
        return newNode;
    }

    public void push(int d){
        Node newNode = getNewNode(d);
        if(head==null){
            head = newNode;
        }
        else{
            newNode.next = head;
            newNode.prev = null;

            if(head!=null){
                head.prev = newNode;
            }
            head = newNode;
        }
    }

    public void pushAfterGivenNode(Node givenNode, int d){
        Node newNode = getNewNode(d);

        if(head==null){
            System.out.println("Error");
        }

        Node current = givenNode;
        newNode.next = current.next;
        current.next = newNode;
        newNode.prev = current;

        if(newNode.next!=null){
            newNode.next.prev = newNode;
        }
    }

    public void pushAtEnd(int d){
        Node newNode = getNewNode(d);
        if(head==null){
            head = newNode;
            return;
        }
        else{
            Node current = head;
            while(current.next!=null){
                current = current.next;
            }

            current.next = newNode;
            newNode.prev = current;
            newNode.next = null;
        }
    }
    void reverse() {
        Node temp = null;
        Node current = head;

        /* swap next and prev for all nodes of
         doubly linked list */
        while (current != null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
        }

        /* Before changing head, check for the cases like empty
         list and list with only one node */
        if (temp != null) {
            head = temp.prev;
        }
    }


}
