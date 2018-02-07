package com.li.command.impl;

import com.li.command.Order;
import com.li.command.Stock;

public class BuyStock implements Order {

    private Stock abcStock;

    public BuyStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {

        abcStock.buy();
    }
}
