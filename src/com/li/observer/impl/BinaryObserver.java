package com.li.observer.impl;

import com.li.observer.Observer;
import com.li.observer.Subject;

public class BinaryObserver extends Observer {

    public BinaryObserver(Subject subject) {

        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {

        System.out.println("Binary String : " +
                Integer.toBinaryString(subject.getState()));
    }
}
