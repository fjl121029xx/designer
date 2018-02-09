package com.li.visitor.impl;

import com.li.visitor.ComputerPart;
import com.li.visitor.ComputerPartVisitor;

public class Computer implements ComputerPart {

    ComputerPart[] parts;

    public Computer() {
        this.parts = new ComputerPart[]{new Mouse(), new Monitor(), new KeyBoard()};
    }

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {

        for (int i = 0; i < parts.length; i++) {

            parts[i].accept(computerPartVisitor);
        }

        computerPartVisitor.visit(this);
    }
}
