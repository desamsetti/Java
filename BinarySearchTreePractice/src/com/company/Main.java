package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        BinarySearchTree bst = new BinarySearchTree();

        BinarySearchTree newTree = new BinarySearchTree();
        bst.addNode(50);
        bst.addNode(30);
        bst.addNode(24);
        bst.addNode(5);
        bst.addNode(28);
        bst.addNode(45);
        bst.addNode(98);
        bst.addNode(52);
        bst.addNode(60);


        newTree.addNode(50);
        newTree.addNode(30);
        newTree.addNode(24);
        newTree.addNode(5);
        newTree.addNode(28);
        newTree.addNode(45);
        newTree.addNode(98);
        newTree.addNode(52);
        newTree.addNode(60);



        System.out.print("This is PREORDER  : ");
        newTree.preOrderTraverse(newTree.root);
        System.out.println();

        System.out.print("This is INORDER   : ");
        newTree.inOrderTraverse(newTree.root);
        System.out.println();

        System.out.print("This is POSTORDER : ");
        newTree.postOrderTraverse(newTree.root);
        System.out.println();



        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Key to Remove : ");
        int keyVal1 = sc.nextInt();
        newTree.deleteNode(keyVal1);

        System.out.print("This is PREORDER  : ");
        newTree.preOrderTraverse(newTree.root);
        System.out.println();

        System.out.print("This is INORDER   : ");
        newTree.inOrderTraverse(newTree.root);
        System.out.println();

        System.out.print("This is POSTORDER : ");
        newTree.postOrderTraverse(newTree.root);
        System.out.println();




    }
}
