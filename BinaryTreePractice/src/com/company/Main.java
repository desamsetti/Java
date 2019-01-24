package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        BinaryTree theTree = new BinaryTree();
        theTree.addNode(50);
        theTree.addNode(25);
        theTree.addNode(15);
        theTree.addNode(30);
        theTree.addNode(75);
        theTree.addNode(85);

        theTree.preOrder(theTree.root);
        theTree.deleteNode(25);
        System.out.println(" ");
        theTree.preOrder(theTree.root);


    }
}
