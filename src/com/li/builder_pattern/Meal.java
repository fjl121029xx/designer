package com.li.builder_pattern;

import java.util.ArrayList;
import java.util.List;

public class Meal {

    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {

        items.add(item);
    }

    public float getCost() {

        float costs = 0.0f;

        for (Item i : items) {

            costs += i.price();
        }

        return costs;
    }

    public void showItems() {

        for (Item i : items) {

            System.out.println("Item : " + i.name());
            System.out.println(", Packing : " + i.packing().pack());
            System.out.println(", Price : " + i.price());
        }
    }
}
