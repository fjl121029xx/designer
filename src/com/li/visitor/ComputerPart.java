package com.li.visitor;

public interface ComputerPart {

    void accept(ComputerPartVisitor computerPartVisitor);
}
