package com.li.visitor;

import com.li.visitor.impl.Computer;
import com.li.visitor.impl.KeyBoard;
import com.li.visitor.impl.Monitor;
import com.li.visitor.impl.Mouse;

public class ComputerPartDisplayVistor implements ComputerPartVisitor {

    @Override
    public void visit(Computer computer) {

        System.out.println("Displaying Computrt");
    }

    @Override
    public void visit(Mouse mouse) {

        System.out.println("Displaying mouse");
    }

    @Override
    public void visit(KeyBoard keyBoard) {

        System.out.println("Displaying keyBoard");
    }

    @Override
    public void visit(Monitor monitor) {

        System.out.println("Displaying monitor");
    }
}
