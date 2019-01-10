package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        BinaryTree newTree = new BinaryTree();

        newTree.addNode(50);
        newTree.addNode(30);
        newTree.addNode(24);
        newTree.addNode(5);
        newTree.addNode(28);
        newTree.addNode(45);
        newTree.addNode(98);
        newTree.addNode(52);
        newTree.addNode(60);


        System.out.print("The Recursive PreOrder is  : ");
        newTree.preOrder(newTree.root);
        System.out.println();

        System.out.print("The Recursive InOrder is   : ");
        newTree.inOrder(newTree.root);
        System.out.println();

        System.out.print("The Recursive PostOrder is : ");
        newTree.postOrder(newTree.root);
        System.out.println();

        System.out.print("Enter a key value to delete : ");
        /*Scanner sc = new Scanner(System.in);
        int keyVal = sc.nextInt();
        newTree.deleteNode(keyVal);*/

        /*System.out.print("The Iterative PreOrder is  : ");
        newTree.iterativePreOrder(newTree.root);
        System.out.println();

        System.out.print("The Iterative InOrder is   : ");
        newTree.iterativeInOrder(newTree.root);
        System.out.println();

        System.out.print("The Iterative PostOrder is : ");
        newTree.iterativePostOrder(newTree.root);
        System.out.println();*/

        System.out.println("The size of the tree is : "+newTree.size(newTree.root));
        System.out.println();
        System.out.println("The height of the tree is : "+newTree.Height(newTree.root));
        System.out.println();


        //sc.close();



    }
}
