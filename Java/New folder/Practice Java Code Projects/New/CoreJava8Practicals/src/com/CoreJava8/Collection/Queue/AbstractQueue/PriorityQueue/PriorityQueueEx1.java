package com.CoreJava8.Collection.Queue.AbstractQueue.PriorityQueue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueEx1 {
    public static void main(String args[]){
        PriorityQueue<String> queue=new PriorityQueue<String>();

        //System.out.println("head element() :"+queue.element());  //NoSuchElementException occurs because queue is empty
        System.out.println("head peek():"+queue.peek());  // and this returns null

        //queue.remove();  // NoSuchElementException occurs because queue is empty
        System.out.println(queue.poll());       // and this returns null

        queue.add("Amit");
        queue.add("Vijay");
        queue.add("Karan");
        queue.add("Jai");
        queue.add("Rahul");

        System.out.println("head element() :"+queue.element());
        System.out.println("head peek():"+queue.peek());

        System.out.println("iterating queue:");
        Iterator itr=queue.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        queue.remove();
        queue.poll();

        System.out.println("iterating after removing two elements:");
        Iterator<String> itr2=queue.iterator();
        while(itr2.hasNext()){
            System.out.println(itr2.next());
        }
    }
}
