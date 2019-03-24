package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //Collections are extended from the Iterator Interface.
        //collections are List, Queue, Set, Map

        //Interfaces are the reference types which are similar to classes but contains only abstract methods
        //Interface is implemented by a Class.
        //An Interface can extend multiple Interfaces.
        //Interfaces cannot be instantiated.
        //Interfaces do not contain Constructors or Instance fields.

        //Iterator Interface provides the facility of iterating the elements only in forward direction.


        //Lists
        //Extends Iterator Interface.
        //Stores elements in a Indexed approach.
        //We can add duplicate elements(Supports Redundancy).

        //Creating a Generic List and adding Hello, ,World,100 and printing them
        List list1 = new ArrayList();
        list1.add("Hello");
        list1.add(" ");

        list1.add("World");
        list1.add(100);
        //list1.clear();
        //int lastIndex = list1.lastIndexOf(20);
        //System.out.println(lastIndex);
        list1.add(2,"     ");

        //Creating an Object variable and assigning it a value from list1 by using list1.get(index)
        Object val1 = list1.get(4);

        System.out.println(val1);

        ((ArrayList) list1).trimToSize(); //Trims array list size to a list

        //System.out.println(list1);

        //Creating a Generic ArrayList and adding Array, ,List,20 and printing them
        ArrayList arrayList1 = new ArrayList();
        arrayList1.add("Array ");
        arrayList1.add(" ");
        arrayList1.add("List");
        arrayList1.add(20);
        Object val2 = arrayList1.get(3);
        //System.out.println(val2);
        arrayList1.toArray();
        //System.out.println(arrayList1);

        //Creating a Generic LinkedList and an Integer LinkedList, adding elements and printing them
        LinkedList linkedList1 = new LinkedList();
        LinkedList<Integer> integerLinkedList = new LinkedList<Integer>();
        linkedList1.add("Linked");
        linkedList1.add(" ");
        linkedList1.add("List");
        //System.out.println(linkedList1);

        integerLinkedList.add(1);
        integerLinkedList.add(2);
        integerLinkedList.add(3);
        integerLinkedList.add(4);
        integerLinkedList.add(5);

        Object val3 = integerLinkedList.get(3);


        //System.out.println(integerLinkedList.lastIndexOf(4));
        integerLinkedList.addFirst(100);
        integerLinkedList.addLast(1000);
        //System.out.println(integerLinkedList.size());
        //System.out.println(integerLinkedList.contains(5));
        //System.out.println(integerLinkedList);


        Iterator<Integer> itr1 = integerLinkedList.iterator();


        while(itr1.hasNext()){
            Integer val = itr1.next();
            System.out.println(val);
        }

        //Priority Queues sort the data for us
        PriorityQueue<Integer> priorityQueue1 = new PriorityQueue<Integer>();
        for(Integer i=10;i>0;i--){
            priorityQueue1.add(i);
        }



        System.out.println(priorityQueue1);


        //Sets do not add duplicate elements.
        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add("John");
        hashSet.add("Joe");
        hashSet.add("Henry");
        hashSet.add("John");
        hashSet.add("Robert");
        System.out.println(hashSet);


        //TreeSet is a sorted version of a Set
        TreeSet<Integer> treeSet = new TreeSet<Integer>();
        for(Integer i=10;i>0;i--){
            treeSet.add(i);
        }

        for(Integer i:treeSet){
            System.out.print(i+", ");
        }
    }
}
