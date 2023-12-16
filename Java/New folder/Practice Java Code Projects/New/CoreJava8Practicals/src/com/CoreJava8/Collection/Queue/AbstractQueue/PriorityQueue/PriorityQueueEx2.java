package com.CoreJava8.Collection.Queue.AbstractQueue.PriorityQueue;

import java.util.PriorityQueue;

public class PriorityQueueEx2 {
    public static void main(String args[]) {
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();

        queue.offer(21);
        queue.offer(20);
        queue.offer(15);
        queue.offer(23);
        queue.offer(13);
        queue.offer(25);
        queue.offer(11);

        System.out.println(queue);
        int s = queue.size();

        for(int i=0;i<s+1;i++) {

            System.out.println("\n"+"removed :" + queue.poll());
            System.out.println("Elements in Queue "+queue);
        }


    }
}
