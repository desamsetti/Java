package com.company;


public class Main {

    public static void main(String[] args) {
	// write your code here

        LinkedList l1 = new LinkedList();
        LinkedList l2 = new LinkedList();


        l1.head = new Node(2);
        Node second = new Node(4);
        Node third = new Node(3);

        l2.head = new Node(5);
        Node l2second = new Node(6);
        Node l2third = new Node(4);




        l1.head.next = second;
        second.next = third;
        third.next = null;

        l2.head.next = l2second;
        l2second.next = l2third;
        l2third.next = null;



        //l1.printList();
        LinkedList.addTwoNumbers(l1.head,l2.head).printList();

        //l2.printList();

        /*l1.push(5);

        l1.insertAfter(l1.head,6);

        l1.append(7);


        l1.delete(5);

        l1.deleteNode(2);

        l1.append(11);*/

        //Node newNode = l1.middleNode(l1.head);
        //System.out.println(newNode.data);

        //l1.printList();
        //System.out.println(l1.getCount());

    }
}
