package com.epam.collections.queue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class PriorityQueueCreator {
    public PriorityQueue<String> createPriorityQueue(List<String> firstList, List<String> secondList) {
        ArrayList<String> first = new ArrayList<>(firstList);
        ArrayList<String> second = new ArrayList<>(secondList);
        first.addAll(second);
        return new PriorityQueue<String>((s1, s2) -> -(s1.compareTo(s2)));
    }
}
