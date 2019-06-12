package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.addNode(1);
        binaryTree.addNode(2);
        binaryTree.addNode(3);
        binaryTree.addNode(4);
        binaryTree.addNode(5);

        BinaryTree binaryTree1 = new BinaryTree();
        binaryTree1.addNode(1);
        binaryTree1.addNode(2);
        binaryTree1.addNode(3);
        binaryTree1.addNode(4);
        binaryTree1.addNode(5);
        System.out.println(binaryTree.isSameTree(binaryTree.root,binaryTree1.root));


        binaryTree.deleteNode(5);
        binaryTree.preOrder(binaryTree.root);


    }
}
