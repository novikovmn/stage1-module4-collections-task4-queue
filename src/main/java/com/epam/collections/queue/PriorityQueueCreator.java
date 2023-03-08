package com.epam.collections.queue;

import java.util.*;

public class PriorityQueueCreator {
    public PriorityQueue<String> createPriorityQueue(List<String> firstList, List<String> secondList) {
        PriorityQueue<String> result = new PriorityQueue<>((s1, s2) -> -(s1.compareTo(s2)));
//        ArrayList<String> first = new ArrayList<>(firstList);
//        ArrayList<String> second = new ArrayList<>(secondList);
//        first.addAll(second);
//        result.addAll(first);

        result.addAll(firstList);
        result.addAll(secondList);

        return result;
    }
}
