package com.varvashevich;

import java.util.*;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        Set<Integer> trainSet = new HashSet<>();
        Map<Integer, Integer> trainMap = new HashMap<>();
        List<Integer> trainList = new ArrayList<>();

        Long startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            trainList.add(i);
        }
        Long finishTime = System.nanoTime();
        System.out.println("TimeAddingList:" + (finishTime - startTime));

        startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            trainSet.add(i);
        }
        finishTime = System.nanoTime();
        System.out.println("TimeAddingSet:" + (finishTime - startTime));

        startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            trainMap.put(i, i);
        }
        finishTime = System.nanoTime();
        System.out.println("TimePuttingMap:" + (finishTime - startTime));

        Iterator<Integer> myIterator = trainList.iterator();
        while (myIterator.hasNext()) {
            Integer nextInt = myIterator.next();
            if (nextInt.equals(666)) {
                myIterator.remove();
            }
        }
        List<Integer> listWithoutThree = trainList.stream().filter(x -> !x.equals(3)).collect(Collectors.toList());
    }
}