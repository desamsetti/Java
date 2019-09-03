package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;


public class KthLargest {
    private final PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
    private final int k;
    public KthLargest(int k, int[] nums) {
        this.k = k;
        for (Integer i : nums) {
            minHeap.add(i);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }
    }

    public int add(int val) {
        minHeap.add(val);
        if (minHeap.size() > k) {
            minHeap.poll();
        }
        return minHeap.peek();
    }
}
