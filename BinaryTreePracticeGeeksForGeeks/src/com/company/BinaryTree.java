package com.company;

public class BinaryTree {

    public class Node{
        int data;
        Node leftChild;
        Node rightChild;

        Node(int d){
            this.data = d;
        }
    }

    Node root;

    public void inOrder(Node focusNode){
        if(focusNode!=null){
            inOrder(focusNode.leftChild);
            System.out.println(focusNode.data);
            inOrder(focusNode.rightChild);
        }
    }

    public void preOrder(Node focusNode){
        if(focusNode!=null){
            System.out.println(focusNode.data);
            inOrder(focusNode.leftChild);
            inOrder(focusNode.rightChild);
        }
    }

    public void postOrder(Node focusNode){
        if(focusNode!=null){
            inOrder(focusNode.leftChild);
            inOrder(focusNode.rightChild);
            System.out.println(focusNode.data);
        }
    }



    public void addNode(int key)
    {
        //Creating a new Node with the key and name values
        Node newNode = new Node(key);

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
                if (key < focusNode.data) {
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


    public Node findNode(int key){
        Node focusNode = root;
        if(focusNode == null){
            return null;
        }
        while(focusNode.data!=key){
            if(key<focusNode.data){
                focusNode = focusNode.leftChild;
            }
            else{
                focusNode = focusNode.rightChild;
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
        while (focusNode.data != key)
        {
            //While loop till the key value is equal to the focusNode.key value

            //Setting the parent to focusNode value
            parent = focusNode;

            //If statement to check if the key value is less than focusNode.key value
            if (key < focusNode.data) {
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

    public boolean isSameTree(Node root1,Node root2){
        if(root1==null && root2==null){
            return true;
        }
        if(root1==null || root2==null){
            return false;
        }

        return root1.data==root2.data &&
                isSameTree(root1.leftChild,root2.leftChild) &&
                isSameTree(root1.rightChild,root2.rightChild);
    }


/*
    public boolean deleteNode(int data){
        Node focusNode  = root;
        Node parent = root;
        boolean isItALeftChild = true;
        while(focusNode.data!=data){
            parent = focusNode;

            if(data<focusNode.data){
                isItALeftChild = true;
                focusNode = focusNode.leftChild;
            }
            else{
                isItALeftChild = true;
                focusNode = focusNode.rightChild;
            }
            if(focusNode == null){
                return false;
            }
        }
        // If the FocusNode is a Leaf Node
        if(focusNode.leftChild==null && focusNode.rightChild==null){
            if(focusNode==root){
                root = null;
            }
            else if(isItALeftChild){
                parent.leftChild = null;
            }
            else{
                parent.rightChild = null;
            }
        }
        else if(focusNode.rightChild == null){
            if(focusNode==root){
                root = parent.leftChild;
            }
            else if(isItALeftChild){
                parent.leftChild = focusNode.rightChild;
            }
            else{
                parent.rightChild = focusNode.rightChild;
            }
        }
        else if(focusNode.leftChild==null){
            if(focusNode==root){
                root = parent.rightChild;
            }
            else if(isItALeftChild){
                parent.leftChild = focusNode.rightChild;
            }
            else{
                parent.rightChild = focusNode.rightChild;
            }
        }
        else{
            Node replacement = getReplacement(focusNode);

            if(focusNode==root){
                root = replacement;
            }
            else if(isItALeftChild){
                parent.leftChild = replacement;
            }
            else{
                parent.rightChild = replacement;
            }
        }
        return true;
    }


    public Node getReplacement(Node replacedNode){
        Node replacement = replacedNode;
        Node focusNode = replacedNode.rightChild;

        while(focusNode!=null){
            replacement = focusNode;

            focusNode = focusNode.leftChild;
        }

        if(replacement!=replacedNode.rightChild){
            replacement.leftChild = replacement.rightChild;
            replacement.rightChild = replacedNode.rightChild;
        }
        return replacement;
    }
    */
}
