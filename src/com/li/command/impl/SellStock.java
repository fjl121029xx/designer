package com.li.command.impl;

import com.li.command.Order;
import com.li.command.Stock;

public class SellStock implements Order {

    private Stock abcStock;

    public SellStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {

        abcStock.sell();
    }
}
