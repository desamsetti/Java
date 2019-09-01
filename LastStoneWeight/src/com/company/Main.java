package com.company;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] stonesWeight = {2,7,4,1,8,1};
        int output = lastStoneWeight(stonesWeight);
        System.out.println("The weight of the last stone is "+output);
    }

    public static int lastStoneWeight(int[] stones) {
        Queue<Integer> priorityQueue = new PriorityQueue<Integer>(Collections.<Integer>reverseOrder());
        int n = stones.length;
        if(n==0) return 0;

        for(int i=0;i<n;i++){
            priorityQueue.add(stones[i]);
        }

        while(!priorityQueue.isEmpty()){
            if(priorityQueue.size()==1){
                return priorityQueue.poll();
            }

            int y = priorityQueue.poll();

            int x = priorityQueue.poll();

            if(x!=y){
                priorityQueue.add(y-x);
            }
        }
        if(priorityQueue.size()==0) return 0;
        return priorityQueue.poll();
    }
}
