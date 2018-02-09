package com.li.visitor.impl;

import com.li.visitor.ComputerPart;
import com.li.visitor.ComputerPartVisitor;

public class KeyBoard implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {

        computerPartVisitor.visit(this);
    }
}
