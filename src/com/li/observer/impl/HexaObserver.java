package com.li.observer.impl;

import com.li.observer.Observer;
import com.li.observer.Subject;

public class HexaObserver extends Observer {

    public HexaObserver(Subject subject) {

        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {

        System.out.println("Hexa String : "
                + Integer.toHexString(subject.getState()));
    }
}
