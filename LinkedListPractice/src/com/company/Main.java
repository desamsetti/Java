package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        LinkedList l1 = new LinkedList();


        l1.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);

        l1.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = null;

        l1.push(5);

        l1.insertAfter(l1.head,6);

        l1.append(7);


        l1.delete(5);

        l1.deleteNode(2);

        l1.append(11);

        Node newNode = l1.middleNode(l1.head);
        System.out.println(newNode.data);

        //l1.printList();
        //System.out.println(l1.getCount());

    }
}
