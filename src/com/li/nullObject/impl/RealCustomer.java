package com.li.nullObject.impl;

import com.li.nullObject.AbstractCustomer;

public class RealCustomer extends AbstractCustomer {

    public RealCustomer(String name) {

        this.name = name;
    }

    @Override
    public boolean isNil() {
        return false;
    }

    @Override
    public String getName() {
        return name;
    }
}
