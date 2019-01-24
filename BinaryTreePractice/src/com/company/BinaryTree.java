package com.company;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class BinaryTree {
    class Node {
        int key;
        Node leftChild;
        Node rightChild;

        Node(int key) {
            this.key = key;
        }
    }

        Node root;

        public void addNode(int key)
        {
            Node newNode = new Node(key);
            if(root==null)
            {
                root = newNode;
            }
            else
            {
                Node focusNode = root;
                Node parent = root;
                while(true)
                {
                    parent = focusNode;
                    if(key<focusNode.key)
                    {
                        focusNode = focusNode.leftChild;
                        if(focusNode==null)
                        {
                            parent.leftChild = newNode;
                            return;
                        }
                    }
                    else
                    {
                        focusNode = focusNode.rightChild;
                        if(focusNode==null)
                        {
                            parent.rightChild=newNode;
                            return;
                        }
                    }
                }
            }
        }



        public void inOrder(Node root)
        {
            if(root!=null)
            {
                inOrder(root.leftChild);
                System.out.print(root.key + " ");
                inOrder(root.rightChild);
            }
        }

        public void postOrder(Node root)
        {
            if(root!=null)
            {
                postOrder(root.leftChild);
                postOrder(root.rightChild);
                System.out.print(root.key);
            }
        }




        public Node findNode(int key)
        {
            Node focusNode = root;
            if(focusNode==null)
            {
                return null;
            }
            while(focusNode.key!=key)
            {
                if(key<focusNode.key)
                {
                    focusNode=focusNode.leftChild;
                }
                else
                {
                    focusNode=focusNode.rightChild;
                }
            }
            return focusNode;
        }


    public boolean deleteNode(int key) {
        //Creating the focusNode and parent and initializing them to root
        Node focusNode = root;
        Node parent = root;

        //Boolean variable isItALeftChild set to true
        boolean isItALeftChild = true;
        while (focusNode.key != key)
        {
            //While loop till the key value is equal to the focusNode.key value

            //Setting the parent to focusNode value
            parent = focusNode;

            //If statement to check if the key value is less than focusNode.key value
            if (key < focusNode.key) {
                //Setting the isItALeftChild to true and focusNode to focusNode.leftChild
                isItALeftChild = true;
                focusNode = focusNode.leftChild;
            } else {
                //Else setting the isItALeftChild to false and focusNode to focusNode.rightChild
                isItALeftChild = false;
                focusNode = focusNode.rightChild;
            }

            //If the focusNode is null then return false
            if (focusNode == null) {
                return false;
            }
        }//End of while loop

        //If statement to check if the focusNode leftChild and rightChild is null or if the focusNode is a leaf node
        if (focusNode.leftChild == null && focusNode.rightChild == null) {
            if (focusNode == root) {
                //If the focusNode is the root then root value is set to null
                root = null;
            } else if (isItALeftChild) {
                //Else if it is a left child then setting the left child to null
                parent.leftChild = null;
            } else {
                //Else if if it is a right child then settiing the right child to null
                parent.rightChild = null;
            }
        }//End of if
        else if (focusNode.rightChild == null)
        {
            //Else if the focusNode right child is null
            if (focusNode == root) {
                //If the focusNode is th e root then making the root as the focusNode left child
                root = focusNode.leftChild;
            } else if (isItALeftChild) {
                //Else if it is a left child then making the parent left child set to focusNode left child
                parent.leftChild = focusNode.leftChild;
            } else {
                //Else if it is a right child then making the parent right child as focusNode left child
                parent.rightChild = focusNode.leftChild;
            }
        }//End of else if
        else if (focusNode.leftChild == null)
        {
            //Checking if the focusNode left child is null
            if (focusNode == root)
            {
                //If the focusNode is the root then setting the root as the focusNode right child
                root = focusNode.rightChild;
            }
            else if (isItALeftChild)
            {
                //Else if it is a left child then setting the parent left child as the focusNode right child
                parent.leftChild = focusNode.rightChild;
            }
            else
            {
                //Else setting the parent right child as the focusNode right child
                parent.rightChild = focusNode.rightChild;
            }
        }//End of else if
        else
        {
            //If the node to be deleted is not a leaf node
            //Creating a Node replacement and then calling the getReplacement() method
            Node replacement = getReplacement(focusNode);

            //If statement to check if the focusNode is the root and assigning the root as the replacement
            if (focusNode == root) {
                root = replacement;
            } else if (isItALeftChild) {
                //Checking if the replacement is a left child then parent left child is set as replacement
                parent.leftChild = replacement;
            } else {
                //Else setting the parent right child as replacement
                parent.rightChild = replacement;
            }
        }
        return true;
    }//End of deleteNode()





    public Node getReplacement(Node replacedNode) {
        //Node replacementParent = replacedNode;
        //Creating replacement and focusNode of types Node
        Node replacement = replacedNode;
        Node focusNode = replacedNode.rightChild;

        //While loop till the focusNode does not equal to null
        while (focusNode != null)
        {
            //replacementParent = replacement;
            //Setting the replacement to focusNode
            replacement = focusNode;

            //Setting the focusNode to focusNode.leftChild
            focusNode = focusNode.leftChild;
        }//End of while loop

        //If statement to check if the replacement is not equal to replacedNode.rightChild
        if(replacement!=replacedNode.rightChild)
        {
            //Setting the replacement.leftChild to replacement.rightChild
            replacement.leftChild = replacement.rightChild;

            //Setting the replacement.rightChild to replacedNode.rightChild
            replacement.rightChild = replacedNode.rightChild;
        }

        return replacement;
    }//End of getReplacement()


    public void preOrder(Node root)
    {
        if(root!=null)
        {
            System.out.print(root.key + " ");
            preOrder(root.leftChild);
            preOrder(root.rightChild);
        }
    }

    public boolean sameTree(Node root1,Node root2)
    {
        if(root1==null && root2==null)
        {
            return true;
        }
        if(root1==null||root2==null)
        {
            return false;
        }
        return root1.key == root2.key
                && sameTree(root1.leftChild,root2.leftChild)
                && sameTree(root1.rightChild,root2.rightChild);
    }

    public int size(Node root1)
    {
        if(root1==null)
        {
            return 0;
        }
        int leftSize = size(root1.leftChild);
        int rightSize = size(root1.rightChild);
        return 1+leftSize+rightSize;
    }


    public int Height(Node root1)
    {
        if(root1==null)
        {
            return 0;
        }
        int leftSize = Height(root1.leftChild);
        int rightSize = Height(root1.rightChild);
        return 1+Math.min(leftSize,rightSize);
    }


    public boolean rootToLeftSizeSum(Node root1, int sum, List<Integer> value)
    {
        if(root1==value)
        {
            return false;
        }
        if(root1.leftChild==null && root1.rightChild==null)
        {
            if(sum==root1.key)
            {
                value.add(root1.key);
                return true;
            }
            else
            {
                return false;
            }

        }
        if(rootToLeftSizeSum(root1.rightChild,sum-root1.key,value))
        {
            value.add(root1.key);
            return true;
        }
        return false;
    }


    public boolean isBST(Node root1,int min,int max)
    {
        if(root1 == null)
        {
            return true;
        }
        if(root1.key<=min || root1.key>max)
        {
            return false;
        }
        return isBST(root1.leftChild,min,root1.key) &&
                isBST(root1.rightChild,max,root1.key);
    }



    public void levelOrderTraverse(Node root1)
    {
        if(root1==null)
        {
            return;
        }
        Queue<Node> q = new LinkedList<Node>();
        q.add(root1);
        while(!q.isEmpty())
        {
            root1 = q.poll();
            System.out.print(root1.key);

            if(root1.leftChild!=null)
            {
                q.add(root1.leftChild);
            }
            if(root1.rightChild!=null)
            {
                q.add(root1.rightChild);
            }
        }
    }


    public void levelByLevelOrderPrinting(Node root1)
    {
        if(root1==null)
        {
            return;
        }
        Queue<Node> q1 = new LinkedList<Node>();
        Queue<Node> q2 = new LinkedList<Node>();
        q1.add(root1);
        while(!q1.isEmpty() || !q2.isEmpty())
        {
            while(!q1.isEmpty())
            {
                root1 = q1.poll();
                System.out.print(root1.key+" ");
                if(root1.leftChild!=null)
                {
                    q2.add(root1.leftChild);
                }
                if(root1.rightChild!=null)
                {
                    q2.add(root1.rightChild);
                }
            }
            System.out.println();
            System.out.println();

            while(!q2.isEmpty())
            {
                root1 = q2.poll();
                System.out.print(root1.key+ " ");
                if(root1.leftChild!=null)
                {
                    q1.add(root1.leftChild);
                }
                if(root1.rightChild!=null)
                {
                    q1.add(root1.rightChild);
                }
                System.out.println();
                System.out.println();
            }
            System.out.println();
        }
    }


    public void reverseLevelOrderTraversePrinting(Node root1)
    {
        if(root1==null)
        {
            return;
        }
        Queue<Node> q = new LinkedList<Node>();
        Stack<Node> s = new Stack<Node>();
        q.add(root1);
        while(!q.isEmpty())
        {
            root1 = q.poll();
            s.push(root1);
            if(root1.rightChild!=null)
            {
                q.add(root1.rightChild);
            }
            if(root1.leftChild!=null)
            {
                q.add(root1.leftChild);
            }
        }

        while(!s.isEmpty())
        {
            root1 = s.pop();
            System.out.print(root1.key + " ");
        }
    }


    public void levelOrderSpiralTraerse(Node root1)
    {
        if(root1 == null)
        {
            return;
        }
        Queue<Node> q1 = new LinkedList<Node>();
        Queue<Node> q2 = new LinkedList<Node>();

        q1.add(root1);
        while(!q1.isEmpty() || !q2.isEmpty())
        {
            while(!q1.isEmpty())
            {
                root1 = q1.poll();
                System.out.print(root1.key +" ");

                if(root1.rightChild!=null)
                {
                    q2.add(root1.rightChild);
                }
                if(root1.leftChild!=null)
                {
                    q2.add(root1.leftChild);
                }
            }
        }

        while(!q2.isEmpty())
        {
            root1 = q2.poll();
            System.out.print(root1.key+" ");

            if(root1.leftChild!=null)
            {
                q1.add(root1.leftChild);
            }
            if(root1.rightChild!=null)
            {
                q1.add(root1.rightChild);
            }
        }
        System.out.println();
    }









    public Node lowestCommonAncestBinarySearchTree(Node root1,Node n1,Node n2)
    {
        if(root1.key>Math.max(n1.key,n2.key))
        {
            return lowestCommonAncestBinarySearchTree(root1.leftChild,n1,n2);
        }
        else if(root1.key<Math.min(n1.key,n2.key))
        {
            return lowestCommonAncestBinarySearchTree(root1.rightChild,n1,n2);
        }
        else
        {
            return root1;
        }
    }

    public Node lowestCommonAncestorBinaryTree(Node root1, Node n1,Node n2) {
        if (root1 == null) {
            return null;
        }
        //if(n1.key==root1.key || n2.key==root1.key)
        if (root1 == n1 || root1 == n2) {
            return root1;
        }

        Node left = lowestCommonAncestorBinaryTree(root1.leftChild, n1, n2);
        Node right = lowestCommonAncestorBinaryTree(root1.rightChild, n1, n2);

        if (left != null && right != null) {
            return root1;
        }
        if (left == null && right == null) {
            return null;
        }
        return left!=null?left:right;
    }


}