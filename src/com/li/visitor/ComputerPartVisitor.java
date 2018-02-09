package com.li.visitor;

import com.li.visitor.impl.Computer;
import com.li.visitor.impl.KeyBoard;
import com.li.visitor.impl.Monitor;
import com.li.visitor.impl.Mouse;

public interface ComputerPartVisitor {

    void visit(Computer computer);
    void visit(Mouse mouse);
    void visit(KeyBoard keyBoard);
    void visit(Monitor monitor);
}
