package com.company;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class BinaryTree {

    //Creating the class Node to use its objects as the nodes of the Binary Tree
    class Node {
        //Creating the Data members key and name along with left child and right child of the Node
        int key;
        String name;

        Node leftChild;
        Node rightChild;

        //Constructor to initialize the Node
        Node(int key, String name) {
            this.key = key;
            this.name = name;
        }

        public String toString() {
            return name + " has a key " + key;
        }
    }//End of Node Class


        //Creating the root of type Node
        Node root;

    /**
     * Name : public void addNode(int key,String name)
     * Purpose : To add a Node to the Binary Tree by taking the inputs key and name.
     * @param key
     * @param name
     */
    public void addNode(int key,String name)
        {
            //Creating a new Node with the key and name values
            Node newNode = new Node(key,name);

            //Checking if the root is null and assigning the root as the new created Node.
            if(root==null)
            {
                root = newNode;
            }
            else
            {
                //Else creating the focusNode and parent node to traverse through the Tree to add the Node at the correct position.
                Node focusNode = root;
                Node parent;
                while(true) {
                    //While loop
                    parent = focusNode;
                    //Setting the parent node to focusNode
                    if (key < focusNode.key) {
                        //If statement to check if the key value is less than focusNode.key and assigning the focusNode to focusNode.leftChild
                        focusNode = focusNode.leftChild;
                        if (focusNode == null) {
                            //If the focusNode is null then parent.leftChild is newNode
                            parent.leftChild = newNode;
                            return;
                        }
                    } else {
                        //Else setting the newNode on the right side of the tree
                        focusNode = focusNode.rightChild;
                        //Assigning the focusNode as the focusNode.rightChild
                        if (focusNode == null) {
                            //If the focusNode is null then parent.rightChild is newNode
                            parent.rightChild = newNode;
                            return;
                        }
                    }
                }//End of while loop
            }//End of else

        }//End of addNode()


    /**
     * Name : public void inOrder(Node focusNode)
     * Purpose : INORDER traverse is one of the three types of Depth First Traversal.
     * The INORDER traverse is LEFT, ROOT, RIGHT.
     * @param focusNode
     */
    public void inOrder(Node focusNode)
    {

        //Checking if the focusNode is not null
        if(focusNode!=null)
        {
            //Calling the inOrder on leftChild of the focusNode
            inOrder(focusNode.leftChild);

            //Printing the focusNode.key
            System.out.print(focusNode.key+" ");

            //Calling the inOrder on rightChild of the focusNode
            inOrder(focusNode.rightChild);
        }
    }//End of inOrder()


    /**
     * Name : public void preOrder(Node focusNode)
     * Purpose : PREORDER traverse is one of the three types of Depth First Traversal.
     * The INORDER traverse is ROOT, LEFT, RIGHT.
     * @param focusNode
     */
    public void preOrder(Node focusNode)
    {
        //Checking if the focusNode is not null
        if(focusNode!=null)
        {
            //Printing the focusNode.key
            System.out.print(focusNode.key+ " ");

            //Calling the preOder on the leftChild of focusNode
            preOrder(focusNode.leftChild);

            //Calling the preOrder on the rightChild of focusNode
            preOrder(focusNode.rightChild);
        }
    }//End of preOder()


    /**
     * Name : public void postOrder(Node focusNode)
     * Purpose : POSTORDER traverse is one of the three types of Depth First Traversal.
     * The POSTORDER traverse is LEFT, RIGHT, ROOT.
     * @param focusNode
     */
    public void postOrder(Node focusNode)
    {
        //If statement to check if the focusNode is not null
        if(focusNode!=null)
        {
            //Calling the postOrder on the leftChild of focusNode
            postOrder(focusNode.leftChild);

            //Calling the postOrder on the rightChild of focusNode
            postOrder(focusNode.rightChild);

            //Printing the focusNode.key
            System.out.print(focusNode.key+ " ");
        }
    }//End of postOrder()


    /**
     * Name : public Node findNode(int key)
     * Purpose : To find the node based on the key value.
     * @param key
     * @return
     */
    public Node findNode(int key)
    {
        //Creating a focusNode with the key value
        Node focusNode = root;
        if(focusNode==null)
        {
            //If statement to check if the focusNode value is null and return null
            return null;
        }
        while(focusNode.key != key)
        {
            //Whilee loop till the focusNode key is equal to key value
            if(key<focusNode.key)
            {
                //Setting the focusNode to focusNode.leftChild
                focusNode = focusNode.leftChild;
            }
            else
            {
                //Setting the focusNode to focusNode.rightChild
                focusNode = focusNode.rightChild;
            }
        }
        //Returning the focusNode
        return focusNode;
    }


    /**
     * Name : public boolean deleteNode(int key)
     * Purpose : To delete a node based on the key value given.
     * @param key
     * @return
     */
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

    /**
     * Name : public Node getReplacement(Node replacedNode)
     * Purpose : To get the replacement node for deleting a node.
     * @param replacedNode
     * @return
     */
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


    /**
     * Name : public boolean sameTree(Node root1,Node root2)
     * Purpose : Checking if two Binary Trees are the same
     * @param root1
     * @param root2
     * @return
     */
    public boolean sameTree(Node root1,Node root2)
    {
        //If statement to check if the root1 and root2 are null and returning true
        if(root1==null && root2==null)
        {
            return true;
        }
        //If statement to check if either of root1 or root2 are null and returning false
        if(root1==null || root2==null)
        {
            return false;
        }
        //Returning the root1.key==root2.key && sameTree(root1.leftChild,root2.leftChild) && sameTree(root1.rightChild,root2.rightChild)
            return root1.key==root2.key &&
                    sameTree(root1.leftChild,root2.leftChild) &&
                    sameTree(root1.rightChild,root2.rightChild);
    }//End of sameTree()


    /**
     * Name : public int size(Node root1)
     * Purpose : To return the numbere of nodes in the Binary Tree.
     * @param root1
     * @return
     */
    public int size(Node root1)
    {
        //If statement to check if the root1 is null and return 0
        if(root1 == null)
        {
            return 0;
        }
            //Variables int leftSize assigned the size(root1.leftChild) and int rightSize assigned the size(root1.rightChild)
            int leftSize = size(root1.leftChild);
            int rightSize = size(root1.rightChild);

            //Returning leftSize+rightSize+1
            return leftSize+rightSize+1;
    }//End of size()


    /**
     * Name : public int Height(Node root1)
     * Purpose : Returning the Maximum height of a Binary Tree
     * @param root1
     * @return
     */
    public int Height(Node root1) {
        //If statement to check if the root1 is null and return 0
        if (root1 == null) {
            return 0;
        }

        //Variables int leftHeight assigned Height(root1.leftChild) and int rightHeight assigned Height(root1.rightChild)
        int leftHeight = Height(root1.leftChild);
        int rightHeight = Height(root1.rightChild);

        //Returning 1+Math.max(leftHeight,rightHeight)
        return 1 + Math.max(leftHeight, rightHeight);
    }//End of Height()


    /**
     * Name : public boolean rootToLeafSum(Node root1,int sum,List<Integer> value)
     * Purpose : To check if the Binary Tree has a path which sums up to the value given as sum
     * @param root1
     * @param sum
     * @param value
     * @return
     */
    public boolean rootToLeafSum(Node root1,int sum,List<Integer> value)
    {
        //If statement to check if the root1 is null and return false
     if(root1==null)
     {
         return false;
     }
     //If statement to check if the root1 left child is null and root1 right child is null, to check if it is a leaf node
     if(root1.leftChild==null &&  root1.rightChild==null)
     {
         //If statement to check if the sum is equal to root1.key value
         if(sum==root1.key)
         {
             //Adding the root1.key value to the list value and return true
             value.add(root1.key);
             return true;
         }
         else
         {
             //Else return false
             return false;
         }
     }//End of if

        //If statement to check if the rootToLeafSum(root1.leftChild,sum-root1.key,value) is true and then adding the root1.key to list and return true
     if(rootToLeafSum(root1.leftChild,sum-root1.key,value))
     {
         value.add(root1.key);
         return true;
     }
     //If statement to check if the rootToLeafSum(root1.rightChild,sum-root1.key,value) is true and then adding the root1.key to list andn return true
     if(rootToLeafSum(root1.rightChild,sum-root1.key,value))
     {
         value.add(root1.key);
         return true;
     }

     return false;
    }//End of rootToLeaf


    /*public Boolean BinaryTreeAndBinarySearchTree(Node root1)
    {
        int counter1=0;
        int counter2=0;
        if(root1==null)
        {
            return true;
        }
        if(root1.leftChild.key<root1.key)
        {
            BinaryTreeAndBinarySearchTree(root1.leftChild);
            counter1 = counter1+1;
        }
        if(root1.rightChild.key>root1.key)
        {
            BinaryTreeAndBinarySearchTree(root1.rightChild);
            counter2 = counter2+1;
        }
        if(counter1==1 && counter2==0)
        {
            return true;
        }
        return false;
    }*/


    /**
     * Name : public boolean isBST(Node root1,int min,int max)
     * Purpose : To check if the Binary Tree is a Binary Search Tree or not
     * @param root1
     * @param min
     * @param max
     * @return
     */
    public boolean isBST(Node root1,int min,int max)
    {
        //If statement to check if root1 is equal to null and return true
        if(root1 == null)
        {
            return true;
        }
        //If statement to check if root1.key value is less than or equal to min or root1.key value is greater than max and then return false
        if(root1.key<=min || root1.key>max)
        {
            return false;
        }

        //Returning isBST(root1.leftChild,min,root1.key) && isBST(root1.rightChild,root1.key,max)
        return isBST(root1.leftChild,min,root1.key) &&
                isBST(root1.rightChild,root1.key,max);
    }//End of isBST()


    /**
     * Name : public void levelOrderTraverse(Node root1)
     * Purpose : BreadthFirst Search or Level Order Traverse works by Traversing level wise.
     * @param root1
     */
    public void levelOrderTraverse(Node root1)
    {
        //If statement to check if the root value is equal to null and return
        if (root1 == null)
        {
            return;
        }

        //Queue<Node> q = new LinkedList<Node>() created to add the values to the queue.
        Queue<Node> q = new LinkedList<Node>();

        //Adding the root1 value to q.
        q.add(root1);

        //While loop till q is empty()
        while (!q.isEmpty())
        {
            //root1 value set to q.poll() to get the element from the queue
            root1 = q.poll();

            //Printing the root1.key value
            System.out.print(root1.key + " ");

            //If statement to check if the root1 left child is not null and then adding the root1 left child to q
            if (root1.leftChild != null)
            {
                q.add(root1.leftChild);
            }
            //If statement to check if the root1 right child is not null and then adding the root1 right child to q
            if (root1.rightChild != null)
            {
                q.add(root1.rightChild);
            }
        }//End of while loop

    }//End of levelOrderTraverse()

    public void iterativePostOrder(Node root1){
        if(root1 == null)
        {
            return;
        }
        Stack<Node> s1 = new Stack<Node>();
        Stack<Node> s2 = new Stack<Node>();

        s1.push(root1);
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
        System.out.print("The Iterative Post Order values are : ");
        while(!s2.isEmpty())
        {
            root1 = s2.pop();
            System.out.print(root1.key + " ");
        }
    }

    public void iterativePreOrder(Node root1)
    {
        if(root1 == null)
        {
            return;
        }
        Stack<Node> s1 = new Stack<Node>();
        s1.push(root1);

        while(!s1.isEmpty())
        {
            root1 = s1.pop();
            System.out.print(root1.key + " ");
            if(root1.rightChild!=null)
            {
                s1.push(root1.rightChild);
            }
            if(root1.leftChild!=null)
            {
                s1.push(root1.leftChild);
            }
        }
    }


    public void iterativeInOrder(Node root1)
    {
        if(root1==null)
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
        /*while(!s1.isEmpty())
        {
          a  root1 = s1.pop();
            if(root1.leftChild!=null)
            {
                s1.push(root1.leftChild);
            }
        }*/
    }

    public void levelByLevelOrderPrinting(Node root1)
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
                System.out.print(root1.key + " ");
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
            }
            System.out.println();
            System.out.println();
        }
        System.out.println();
    }

    public void reverseLevelOrderTraversePrinting(Node root1)
    {
        if(root1 == null)
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




    public void levelOrderSpiralTraverse(Node root1)
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
                System.out.print(root1.key + " ");

                if(root1.rightChild!=null)
                {
                    q2.add(root1.rightChild);
                }
                if(root1.leftChild!=null)
                {
                    q2.add(root1.leftChild);
                }
            }

            while(!q2.isEmpty())
            {
                root1 = q2.poll();
                System.out.print(root1.key + " ");
                if(root1.leftChild!=null)
                {
                    q1.add(root1.leftChild);
                }
                if(root1.rightChild!=null)
                {
                    q1.add(root1.rightChild);
                }

            }


        }
        System.out.println();
    }

    public void levelOrderTraverseSpiralUsingStack(Node root1)
    {
        if(root1 == null)
        {
            return;
        }
        Stack<Node> s1 = new Stack<Node>();
        Stack<Node> s2 = new Stack<Node>();

        s1.push(root1);
        while(!s1.isEmpty() || !s1.isEmpty())
        {
            while(!s1.isEmpty())
            {
                root1 = s1.pop();
                System.out.print(root1.key + " ");

                if(root1.rightChild!=null)
                {
                    s2.add(root1.rightChild);
                }
                if(root1.leftChild!=null)
                {
                    s2.add(root1.leftChild);
                }
            }

            while(!s2.isEmpty())
            {
                root1 = s2.pop();
                System.out.print(root1.key + " ");
                if(root1.leftChild!=null)
                {
                    s1.add(root1.leftChild);
                }
                if(root1.rightChild!=null)
                {
                    s1.add(root1.rightChild);
                }
            }
        }
        System.out.println();
    }



    public Node leastCommonAncestorBinarySearchTree(Node root1,Node n1,Node n2)
    {
        if(root1==null)
        {
            return null;
        }
        else if(root1.key>Math.max(n1.key,n2.key))
        {
            return leastCommonAncestorBinarySearchTree(root1.leftChild,n1,n2);
        }
        else if(root1.key<Math.min(n1.key,n2.key))
        {
            return leastCommonAncestorBinarySearchTree(root1.rightChild,n1,n2);
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

}