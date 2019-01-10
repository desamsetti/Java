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

    public void addNode(int key) {
        Node newNode = new Node(key);
        if (root == null) {
            root = newNode;
        } else {
            Node parent = root;
            Node focusNode = root;
            while (true) {
                parent = focusNode;
                if (key < focusNode.key) {
                    focusNode = focusNode.leftChild;
                    if (focusNode == null) {
                        parent.leftChild = newNode;
                        break;
                    }
                } else {
                    focusNode = focusNode.rightChild;
                    if (focusNode == null) {
                        parent.rightChild = newNode;
                        break;
                    }
                }
            }
        }
    }


    public void inOrder(Node root1) {
        if (root1 != null) {
            inOrder(root1.leftChild);
            System.out.print(root1.key + " ");
            inOrder(root1.rightChild);
        }
    }


    public void preOrder(Node root1)
    {
        if(root1 != null)
        {
            System.out.print(root1.key + " ");
            preOrder(root1.leftChild);
            preOrder(root1.rightChild);
        }
    }

    public void postOrder(Node root1)
    {
        if(root1 != null)
        {
            postOrder(root1.leftChild);
            postOrder(root1.rightChild);
            System.out.print(root1.key + " ");
        }
    }


    public Node findNode(int key) {
        if (root == null) {
            return null;
        }
        Node newNode = new Node(key);
        Node focusNode = root;
        Node parent = root;

        while (key != focusNode.key) {
            if (key < focusNode.key) {
                focusNode = focusNode.leftChild;
            } else {
                focusNode = focusNode.rightChild;
            }
        }
        return focusNode;
    }


    public boolean deleteNode(int key) {

        Node focusNode = root;
        Node parent = root;

        boolean isItALeftChild = true;

        while (key < focusNode.key) {
            parent = focusNode;
            if (focusNode == null) {
                return false;
            }
            if (key < focusNode.key) {
                isItALeftChild = true;
                focusNode = focusNode.leftChild;
            } else {
                isItALeftChild = true;
                focusNode = focusNode.rightChild;
            }
        }

        if (focusNode.leftChild == null && focusNode.rightChild == null) {
            if (focusNode == root) {
                root = null;
            }
            if (isItALeftChild) {
                parent.leftChild = null;
            } else {
                parent.rightChild = null;
            }
        } else if (focusNode.rightChild == null) {
            if (focusNode == root) {
                root = focusNode.leftChild;
            } else if (isItALeftChild) {
                parent.leftChild = focusNode.leftChild;
            } else {
                parent.rightChild = focusNode.leftChild;
            }
        } else if (focusNode.leftChild == null) {
            if (focusNode == root) {
                root = focusNode.rightChild;
            } else if (isItALeftChild) {
                parent.leftChild = focusNode.rightChild;
            } else {
                parent.rightChild = focusNode.rightChild;
            }
        } else {
            Node newNode = getReplacement(focusNode);

            if (focusNode == root) {
                root = newNode;
            } else if (isItALeftChild) {
                parent.leftChild = newNode;
            } else {
                parent.rightChild = newNode;
            }
        }
        return true;
    }

    public Node getReplacement(Node replacedNode) {
        //Node replacementParent = replacedNode;
        //Creating replacement and focusNode of types Node
        Node replacement = replacedNode;
        Node focusNode = replacedNode.rightChild;

        //While loop till the focusNode does not equal to null
        while (focusNode != null) {
            //replacementParent = replacement;
            //Setting the replacement to focusNode
            replacement = focusNode;

            //Setting the focusNode to focusNode.leftChild
            focusNode = focusNode.leftChild;
        }//End of while loop

        //If statement to check if the replacement is not equal to replacedNode.rightChild
        if (replacement != replacedNode.rightChild) {
            //Setting the replacement.leftChild to replacement.rightChild
            replacement.leftChild = replacement.rightChild;

            //Setting the replacement.rightChild to replacedNode.rightChild
            replacement.rightChild = replacedNode.rightChild;
        }

        return replacement;
    }//End of getReplacement()


    public boolean sameTree(Node root1, Node root2) {
        if (root1 == null && root2 == null) {
            return true;
        }
        if (root1 == null || root2 == null) {
            return false;
        }

        return root1.key == root2.key &&
                sameTree(root1.leftChild, root2.leftChild) &&
                sameTree(root1.rightChild, root2.rightChild);
    }


    public int Height(Node root1) {
        if (root1 == null) {
            return 0;
        }
        int leftHeight = Height(root1.leftChild);
        int rightHeight = Height(root1.rightChild);
        return 1 + Math.max(leftHeight, rightHeight);
    }


    public int size(Node root1) {
        if (root1 == null) {
            return 0;
        }
        int leftSize = size(root1.leftChild);
        int rightSize = size(root1.rightChild);
        return 1 + leftSize + rightSize;
    }


    public boolean rootToLeafSum(Node root1, int sum, List<Integer> value) {
        if (root1 == null) {
            return false;
        }

        if (root1.leftChild == null && root1.rightChild == null) {
            if (sum == root1.key) {
                value.add(root.key);
                return true;
            } else {
                return false;
            }

        }
        if (rootToLeafSum(root1.leftChild, sum - root1.key, value)) {
            value.add(root1.key);
            return true;
        }


        if (rootToLeafSum(root1.rightChild, sum - root1.key, value)) {
            value.add(root1.key);
            return true;
        }
        return false;
    }


    public boolean isBST(Node root1, int min, int max) {
        if (root1 == null) {
            return true;
        }
        if (root1.key <= min || root1.key > max) {
            return false;
        }

        return isBST(root1.leftChild, min, root1.key) && isBST(root1.rightChild, root1.key, max);
    }


    public void levelOrderTraverse(Node root1) {
        if (root1 == null) {
            return;
        }

        Queue<Node> q = new LinkedList<Node>();
        q.add(root1);
        while (!q.isEmpty()) {
            root1 = q.poll();
            System.out.print(root1.key + " ");
            if (root1.leftChild != null) {
                q.add(root1.leftChild);
            }
            if (root1.rightChild != null) {
                q.add(root1.rightChild);
            }
        }
    }



    public void iterativePostOrder(Node root1)
    {
        if(root1 == null)
        {
            return;
        }
        Stack<Node> s1 = new Stack<Node>();
        Stack<Node> s2 = new Stack<Node>();

        s1.add(root1);
        while(!s1.isEmpty())
        {
            root1 = s1.pop();
            s2.push(root1);
            if(root1.leftChild!=null)
            {
                s1.push(root1.leftChild);
            }
            if(root1.rightChild!=null)
            {
                s1.push(root1.rightChild);
            }
        }

        while(!s2.isEmpty())
        {
            root1 = s2.pop();
            System.out.print(root1.key + " ");
        }
    }



    public void iterativePreOrder(Node root1) {
        if (root1 == null) {
            return;
        }
        Stack<Node> s1 = new Stack<Node>();
        s1.push(root1);
        while (!s1.isEmpty()) {
            root1 = s1.pop();
            System.out.print(root1.key + " ");
            if (root1.rightChild != null) {
                s1.push(root1.rightChild);
            }
            if (root1.leftChild != null) {
                s1.push(root1.leftChild);
            }
        }
    }

    public void iterativeInOrder(Node root1)
    {
        if(root1 == null)
        {
            return;
        }
        Stack<Node> s1 = new Stack<Node>();
        while(true)
        {
            if(root1!=null)
            {
                s1.push(root1);
                root1 = root1.leftChild;
            }
            else
            {
                if(s1.isEmpty())
                {
                    break;
                }
                root1 = s1.pop();
                System.out.print(root1.key + " ");
                root1 = root1.rightChild;
            }

        }

    }



    public void iterativePostOrderOneStack(Node root1)
    {
        if(root1 == null)
        {
            return;
        }
        Stack<Node> s = new Stack<Node>();

        s.push(root1);
        Node current = root1;
        while(current!=null || !s.isEmpty())
        {
            root1 = s.pop();
            if(root1.leftChild!=null)
            {
                root1 = root1.leftChild;
            }
        }
    }












}
