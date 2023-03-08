package com.epam.collections.queue;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        List<Integer> list = new ArrayList<>();

        ArrayDeque<Integer> dishes = new ArrayDeque<>();
        for (int i = 1; i <= numberOfDishes; i++) {
            dishes.add(i);
        }

        int i = 1;
        while (!dishes.isEmpty()) {
            Integer dish = dishes.poll();
            if (i % everyDishNumberToEat == 0) {
                list.add(dish);
            } else {
                dishes.add(dish);
            }
            i++;
        }

        return list;
    }
}
