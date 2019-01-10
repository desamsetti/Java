package com.company;

public class Queue {
    int[] queue = new int[5];
    int front;
    int rear;
    int size;


    public void enqueue(int data)
    {
        System.out.println("Called");
        if(!isFull())
        {
            queue[rear] = data;
            rear = (rear + 1) % 5;
            size = size + 1;
        }
        else
        {
            System.out.println("The queue is full");
        }
    }

    public int dequeue()
    {
        int data = queue[front];
        if(!isEmpty())
        {
            front = (front + 1) % 5;
            size = size - 1;

        }
        else
        {
            System.out.println("The queue is empty");
        }
        return data;
    }

    public void show()
    {
        System.out.println("Elements : ");
        for(int i=0;i<size%5;i++)
        {
            System.out.println(queue[(front+i)%5]);
        }
    }


    public int getSize()
    {
        return size;
    }


    public boolean isEmpty()
    {
        //if(size==0)
        if(getSize()==0)
        {
         return true;
        }
        return false;
    }

    public boolean isFull()
    {
        //if(size==5)
        if(getSize()==5)
        {
            return true;
        }
        return false;
    }

    public int peek()
    {
        return queue[front];
    }

    public int elementAt(int index)
    {
        return queue[index];
    }


    public Queue weave(Queue q1,Queue q2)
    {
        Queue q3 = new Queue();
        for(int i=0;i<q1.getSize()||i<q2.getSize();i++)
        {
            //System.out.println(q1.elementAt(i));
            q3.enqueue(q1.elementAt(i));
            q3.enqueue(q2.elementAt(i));
            //q3.enqueue(q2.elementAt(i));
        }
        return q3;
    }

    /*public Queue weave(Queue q1,Queue q2)
    {
        Queue q3 = new Queue();
        while(q1.getSize()!=0||q2.getSize()!=0)
        {
            if(q1.getSize()>0)
            {
                q3.enqueue(q1.peek());
                q1.dequeue();
            }
            if(q2.getSize()>0)
            {
                q3.enqueue(q2.peek());
                q2.dequeue();
            }
        }
        return q3;
    }*/

}
