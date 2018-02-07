package com.li.state.impl;

import com.li.state.Context;
import com.li.state.State;

public class StopState implements State {

    @Override
    public void doAction(Context context) {

        System.out.println("Player is in stop state");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "Stop State{}";
    }
}
