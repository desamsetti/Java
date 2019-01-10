package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        BinaryTree theTree = new BinaryTree();

        BinaryTree newTree = new BinaryTree();

        BinaryTree t1 = new BinaryTree();

        BinaryTree t2 = new BinaryTree();

        BinaryTree t3 = new BinaryTree();

        BinaryTree t4 = new BinaryTree();

        t1.addNode(50,"One");
        t2.addNode(50,"One");

        /*t3.addNode(10,"One");
        t3.addNode(5,"One");
        t3.addNode(6,"One");
        t3.addNode(8,"One");
        t3.addNode(7,"One");
        t3.addNode(4,"One");*/
        t3.addNode(10,"One");
        t3.addNode(5,"One");
        t3.addNode(4,"One");
        t3.addNode(12,"One");
        t3.addNode(11,"One");
        t3.addNode(14,"One");
        t3.addNode(15,"One");

        t4.addNode(10,"One");
        t4.addNode(16,"One");
        t4.addNode(-3,"One");
        t4.addNode(5,"One");
        t4.addNode(6,"One");
        t4.addNode(11,"One");



        theTree.addNode(50,"The Boss");
        theTree.addNode(25,"Vice President");
        theTree.addNode(15,"Office Manager");
        theTree.addNode(30,"Secretary");
        theTree.addNode(75,"Sales Manager");
        theTree.addNode(85,"Salesman 1");

        newTree.addNode(50,"One");
        newTree.addNode(30,"Two");
        newTree.addNode(24,"Three");
        newTree.addNode(5,"Four");
        newTree.addNode(28,"Five");
        newTree.addNode(45,"Six");
        newTree.addNode(98,"Seven");
        newTree.addNode(52,"Eight");
        newTree.addNode(60,"Nine");


        /*System.out.println("The size of the tree is "+t3.size(t3.root));
        System.out.println("The height of the tree is "+t3.Height(t3.root));
        List<Integer> l1 = new ArrayList<Integer>();
        System.out.println("The rootToLeafSum is "+t4.rootToLeafSum(t4.root,18,l1));

        System.out.print("The nodes are : ");
        for(int i=l1.size()-1;i>=0;i--)
        {
            System.out.print("-> "+ l1.get(i));
        }
        System.out.println();
        //System.out.println("Checking if the Binary Tree is a Binary Search Tree : "+t4.BinaryTreeAndBinarySearchTree(t4.root));
        System.out.println("Checking if the Binary Tree is a Binary Search Tree : "+t4.isBST(t4.root,-4,17));
        System.out.println("Checking if the Binary Tree is a Binary Search Tree : "+newTree.isBST(newTree.root,5,98));*/

        /*System.out.println("The Level Order Traverse is : ");
        newTree.levelOrderTraverse(newTree.root);
        System.out.println();



        System.out.print("This is PREORDER  : ");
        newTree.preOrder(newTree.root);
        System.out.println();

        System.out.print("This is INORDER   : ");
        newTree.inOrder(newTree.root);
        System.out.println();

        System.out.print("This is POSTORDER : ");
        newTree.postOrder(newTree.root);
        System.out.println();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Key to Remove : ");
        int keyVal1 = sc.nextInt();
        newTree.deleteNode(keyVal1);

        System.out.println("The size of the tree is "+newTree.size(newTree.root));


        System.out.print("This is PREORDER  : ");
        newTree.preOrder(newTree.root);
        System.out.println();

        System.out.print("This is INORDER   : ");
        newTree.inOrder(newTree.root);
        System.out.println();

        System.out.print("This is POSTORDER : ");
        newTree.postOrder(newTree.root);
        System.out.println();


        System.out.print("Checking if the two trees are the same : ");
        System.out.print(t1.sameTree(t1.root,t2.root));*/

        /*System.out.print("The Recursive Post Order values are :");
        newTree.postOrder(newTree.root);
        System.out.println();
        newTree.iterativePostOrder(newTree.root);
        System.out.println();*/
        /*System.out.print("The Recursive PreOrder values are :");
        newTree.preOrder(newTree.root);
        System.out.println();
        System.out.print("The Iterative PreOrder values are : ");
        newTree.iterativePreOrder(newTree.root);*/
        System.out.print("The Recurse InOrder values are :");
        newTree.inOrder(newTree.root);
        System.out.println();
        System.out.print("The Iterative InOrder values are :");
        newTree.iterativeInOrder(newTree.root);
        System.out.println();

        newTree.levelByLevelOrderPrinting(newTree.root);

        System.out.print("The Level Order Traverse elements are : ");
        newTree.levelOrderTraverse(newTree.root);
        System.out.println();
        System.out.print("The Reverse Level Order Traverse elements are : ");
        newTree.reverseLevelOrderTraversePrinting(newTree.root);
        System.out.println();
        System.out.print("The Spiral Printing of Level Order Traverse elements is : ");
        newTree.levelOrderSpiralTraverse(newTree.root);


        /*System.out.println("Search for a Node : ");

        int keyVal = sc.nextInt();

        System.out.println(newTree.findNode(keyVal));*/


        //sc.close();

    }
}
