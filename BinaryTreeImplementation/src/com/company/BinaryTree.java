package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    public static class Node{
        int key;
        Node left;
        Node right;

        Node(int data){
            this.key = data;
            this.left = null;
            this.right = null;
        }
    }
    public static Node root;
    public static Node temp = root;

    public static void inOrder(Node root){
        if(root!=null){
            inOrder(root.left);
            System.out.print(root.key  +" ");
            inOrder(root.right);
        }
    }

    public static void insert(Node temp, int key){
        Queue<Node> q = new LinkedList<Node>();
        q.add(temp);
        while(!q.isEmpty()){
            temp = q.peek();
            q.remove();
            if(temp.left == null){
                temp.left = new Node(key);
                break;
            }else{
                q.add(temp.left);
            }

            if(temp.right == null){
                temp.right = new Node(key);
                break;
            }else{
                q.add(temp.right);
            }
        }
    }


    public static void deleteDeepest(Node root,Node d_node){
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        Node temp;
        while(!queue.isEmpty()){
            temp = queue.peek();
            if(temp==d_node){
                temp = null;
                d_node = null;
                return;
            }
            if(temp.right!=null){
                if(temp.right == d_node){
                    temp.right = null;
                    d_node = null;
                    return;
                }
                else{
                    queue.add(temp.right);
                }
            }

            if(temp.left!=null){
                if(temp.left == d_node){
                    temp.left = null;
                    d_node = null;
                    return;
                }
                else{
                    queue.add(temp.left);
                }
            }
        }
    }


    public static void deletion(Node root, int key){
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);

        Node temp = null;
        Node key_node = null;

        while(!queue.isEmpty()){
            temp = queue.peek();
            if(temp.key == key){
                key_node = temp;
            }

            if(temp.left!=null){
                queue.add(temp.left);
            }
            if(temp.right!=null){
                queue.add(temp.right);
            }
        }

        int x = temp.key;
        deleteDeepest(root,temp);
        key_node.key = x;
    }

    public static void main(String[] args) {
        // write your code here
        root = new Node(10);
        root.left = new Node(11);
        root.left.left = new Node(7);
        root.right = new Node(9);
        root.right.left = new Node(15);
        root.right.right = new Node(8);


        /*System.out.print("Inorder traversal before insertion : ");
        inOrder(root);

        int key = 12;
        insert(root,key);

        System.out.println("Inorder traversal after insertion : ");
        inOrder(root);*/

        int key1 = 11;
        deletion(root,key1);

        System.out.println("Inorder traversal after deletion : ");
        inOrder(root);

    }
}
