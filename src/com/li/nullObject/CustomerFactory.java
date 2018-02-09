package com.li.nullObject;

import com.li.nullObject.impl.NullCustomer;
import com.li.nullObject.impl.RealCustomer;

public class CustomerFactory {

    private static final String[] names = {"Rob", "Joe", "Julie"};

    public static AbstractCustomer getCustomer(String name) {

        for (int i = 0; i < names.length; i++) {

            if (names[i].equalsIgnoreCase(name)) {

                return new RealCustomer(name);
            }

        }
        return new NullCustomer();
    }
}
