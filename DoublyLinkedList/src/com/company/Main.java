package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        DoublyLinkedList.Node first = new DoublyLinkedList.Node(1);
        DoublyLinkedList.Node second = new DoublyLinkedList.Node(2);
        DoublyLinkedList.Node third = new DoublyLinkedList.Node(3);
        DoublyLinkedList.Node fourth = new DoublyLinkedList.Node(4);


        doublyLinkedList.head = new DoublyLinkedList.Node(0);
        doublyLinkedList.head.next = first;
        doublyLinkedList.head.prev = null;
        first.next = second;
        first.prev=doublyLinkedList.head;

        second.prev = first;
        second.next = third;

        third.prev=second;
        third.next=fourth;

        fourth.prev = third;
        fourth.next = null;

        doublyLinkedList.push(20);

        doublyLinkedList.pushAfterGivenNode(second,25);

        doublyLinkedList.pushAtEnd(30);

        doublyLinkedList.reverse();

        doublyLinkedList.printList(doublyLinkedList.head);
    }


}
