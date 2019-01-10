package com.company;

import javax.swing.tree.TreeNode;

public class BinarySearchTree {

    class Node
    {
        int key;
        Node leftChild;
        Node rightChild;


        Node(int key)
        {
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
                    if(focusNode==null) {
                        parent.rightChild = newNode;
                        return;
                    }
                }
            }
        }
    }


    public void inOrderTraverse(Node focusNode)
    {
        if(focusNode!=null)
        {
            inOrderTraverse(focusNode.leftChild);

            System.out.print(focusNode.key + " ");

            inOrderTraverse(focusNode.rightChild);
        }
    }


    public void preOrderTraverse(Node focusNode)
    {
        if(focusNode!=null)
        {
            System.out.print(focusNode.key+ " ");

            preOrderTraverse(focusNode.leftChild);

            preOrderTraverse(focusNode.rightChild);
        }
    }

    public void postOrderTraverse(Node focusNode)
    {
        if(focusNode!=null)
        {
            postOrderTraverse(focusNode.leftChild);

            postOrderTraverse(focusNode.rightChild);

            System.out.print(focusNode.key + " ");
        }
    }


    public Node findNode(int key)
    {
        Node focusNode = root;
        if(focusNode==null)
        {
            return null;
        }
        while(focusNode.key != key)
        {
            if(key<focusNode.key)
            {
                focusNode = focusNode.leftChild;
            }
            else
            {
                focusNode = focusNode.rightChild;
            }
        }
        return focusNode;
    }





    public boolean deleteNode(int key)
    {
        Node focusNode = root;
        Node parent = root;
        boolean isALeftChild = true;

        while(focusNode.key!=key)
        {
            parent = focusNode;
            if(key<focusNode.key)
            {
                isALeftChild = true;
                focusNode = focusNode.leftChild;
            }
            else
            {
                isALeftChild = false;
                focusNode = focusNode.rightChild;
            }
            if(focusNode==null)
            {
                return false;
            }
        }

        if(focusNode.leftChild==null && focusNode.rightChild==null)
        {
            if(focusNode==root)
            {
                root = null;
            }
            else if(isALeftChild)
            {
                parent.leftChild = null;
            }
            else
            {
                parent.rightChild = null;
            }
        }

        else if(focusNode.rightChild==null)
        {
            if(focusNode == root)
            {
                root = parent.leftChild;
            }
            else if(isALeftChild)
            {
                parent.leftChild = focusNode.leftChild;
            }
            else
            {
                parent.rightChild = focusNode.leftChild;
            }
        }

        else if(focusNode.leftChild==null)
        {
            if(focusNode == root)
            {
                root = parent.rightChild;
            }
            else if(isALeftChild)
            {
                parent.leftChild = focusNode.rightChild;
            }
            else
            {
                parent.rightChild = focusNode.rightChild;
            }
        }
        else
        {
            Node replacement = getReplacementNode(focusNode);
            if(focusNode==root)
            {
                root = replacement;
            }
            else if(isALeftChild)
            {
                parent.leftChild = replacement;
            }
            else
            {
                parent.rightChild = replacement;
            }
        }
        return true;
    }


    public Node getReplacementNode(Node replacedNode)
    {
        Node replacementParent = replacedNode;
        Node replacement = replacedNode;
        Node focusNode = replacedNode.rightChild;

        while (focusNode != null)
        {
            replacementParent = replacement;
            replacement = focusNode;
            focusNode = focusNode.leftChild;
        }

        if(replacement!=replacedNode.rightChild)
        {
            replacement.leftChild = replacement.rightChild;
            replacement.rightChild = replacedNode.rightChild;
        }

        return replacement;
    }
}
