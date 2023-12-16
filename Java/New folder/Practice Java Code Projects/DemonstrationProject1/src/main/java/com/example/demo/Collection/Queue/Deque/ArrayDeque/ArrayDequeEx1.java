package com.example.demo.Collection.Queue.Deque.ArrayDeque;

import java.util.ArrayDeque;

public class ArrayDequeEx1 {
    public static void main(String[]  args){
        ArrayDeque<Integer> adq = new ArrayDeque<>();

        System.out.println(adq.size());

        adq.offer(111);

        adq.offerFirst(222);

        adq.offerLast(333);

        System.out.println(adq);

        System.out.println(adq.pop());
        System.out.println(adq);

        System.out.println(adq.poll());
        System.out.println(adq);

    }
}
