package com.li.strategy;

public class Context {

    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStratrgy(int num1, int num2) {

       return this.strategy.doOperation(num1, num2);
    }
}
