package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here


        LinkedList list1 = new LinkedList();

        list1.head = new LinkedList.Node(1);

        LinkedList.Node second = new LinkedList.Node(2);


        LinkedList.Node third = new LinkedList.Node(5);

        LinkedList.Node fourth = new LinkedList.Node(2);

        LinkedList.Node fifth = new LinkedList.Node(1);

        list1.head.next = second;

        second.next = third;

        third.next = fourth;

        fourth.next = fifth;

        fifth.next = null;

        System.out.println(list1.palindromeLinkedList(list1.head));

        /*//Creating a LinkedList
        LinkedList list1 = new LinkedList();

        //Setting up the head of the LinkedList to 1
        list1.head = new LinkedList.Node(1);

        //Creating other nodes and setting their values
        LinkedList.Node second = new LinkedList.Node(2);
        LinkedList.Node third = new LinkedList.Node(3);


        //Linking all the Nodes

        list1.head.next = second;
        second.next = third;


        System.out.print("Printing the LinkedList : ");
        list1.printList();
        System.out.println();

        System.out.println("After pushing the fourth node at the start");
        list1.push(4);
        list1.printList();
        System.out.println();



        //Creating new node
        LinkedList.Node fourth = new LinkedList.Node(4);
        System.out.print("Printing after inserting 5 after 2");
        list1.insertAfter(second,5);
        list1.printList();

        System.out.println();
        list1.append(10);
        System.out.println("Printing the list after appending 10 at the end");
        list1.printList();

        System.out.println();
        list1.delete(10);
        System.out.println("After deleting 10 from the LinkedList");
        list1.printList();
        System.out.println();

        list1.deleteNode(3);
        System.out.println("After deleting Node at position 3");
        list1.printList();

        System.out.println();
        System.out.println("Printing the Length of the LinkedList : " + list1.getCountRecursive(list1.head));

        System.out.println();
        //System.out.println("Searching for an element in the LinkedList : "+list1.search(list1.head,2));
        System.out.println("Searching for an element in the LinkedList : "+list1.searchRecursive(list1.head,2));*/
    }
}
