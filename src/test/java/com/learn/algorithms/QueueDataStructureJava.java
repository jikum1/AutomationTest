package com.learn.algorithms;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDataStructureJava {

    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>();
        queue.add("one");
        queue.add("two");
        queue.add("three");

        System.out.println("Queue Remove " + queue.remove());
    }

}
