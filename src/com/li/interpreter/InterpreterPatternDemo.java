package com.li.interpreter;

import com.li.interpreter.impl.AndExpression;
import com.li.interpreter.impl.OrExpression;
import com.li.interpreter.impl.TerminalExpression;

/**
 * 解释器模式
 * <p>
 * 解释器模式（Interpreter Pattern）提供了评估语言的语法或表达式的方式，它属于行为型模式。
 * 这种模式实现了一个表达式接口，该接口解释一个特定的上下文。这种模式被用在 SQL 解析、符号处理引擎等。
 * <p>
 * 介绍
 * <p>
 * 意图：给定一个语言，定义它的文法表示，并定义一个解释器，这个解释器使用该标识来解释语言中的句子。
 * <p>
 * 主要解决：对于一些固定文法构建一个解释句子的解释器。
 * <p>
 * 何时使用：如果一种特定类型的问题发生的频率足够高，那么可能就值得将该问题的各个实例表述为一个简单语言中的句子。
 * 这样就可以构建一个解释器，该解释器通过解释这些句子来解决该问题。
 * <p>
 * 如何解决：构件语法树，定义终结符与非终结符。
 * <p>
 * 关键代码：构件环境类，包含解释器之外的一些全局信息，一般是 HashMap。
 * <p>
 * 应用实例：编译器、运算表达式计算。
 * <p>
 * 优点： 1、可扩展性比较好，灵活。 2、增加了新的解释表达式的方式。 3、易于实现简单文法。
 * 缺点： 1、可利用场景比较少。 2、对于复杂的文法比较难维护。 3、解释器模式会引起类膨胀。 4、解释器模式采用递归调用方法。
 * <p>
 * 使用场景： 1、可以将一个需要解释执行的语言中的句子表示为一个抽象语法树。
 * 2、一些重复出现的问题可以用一种简单的语言来进行表达。
 * 3、一个简单语法需要解释的场景。
 * <p>
 * 注意事项：可利用场景比较少，JAVA 中如果碰到可以用 expression4J 代替。
 * <p>
 * 实现
 * <p>
 * 我们将创建一个接口 Expression 和实现了 Expression 接口的实体类。定义作为上下文中主要解释器的 TerminalExpression 类。
 * 其他的类 OrExpression、AndExpression 用于创建组合式表达式。
 * InterpreterPatternDemo，我们的演示类使用 Expression 类创建规则和演示表达式的解析。
 * <p>
 * 步骤 1 创建一个表达式接口。 pression.java
 * 步骤 2 创建实现了上述接口的实体类。 TerminalExpression.java OrExpression.java AndExpression.java
 * 步骤 3 InterpreterPatternDemo 使用 Expression 类来创建规则，并解析它们。 InterpreterPatternDemo.java
 * 步骤 4 验证输出。
 */
public class InterpreterPatternDemo {

    public static void main(String[] args) {

        Expression isMale = getMaleExpression();
        Expression isMarried = getMarriedWomanExpression();

        System.out.println("John is male? : " + isMale.interpret("john"));
        System.out.println("Julie is a married women? : " + isMarried.interpret("Married Julie"));
    }

    public static Expression getMaleExpression() {

        Expression robert = new TerminalExpression("Robert");
        Expression john = new TerminalExpression("john");

        return new OrExpression(robert, john);
    }

    public static Expression getMarriedWomanExpression() {

        Expression julir = new TerminalExpression("julie");
        Expression married = new TerminalExpression("married");

        return new AndExpression(julir, married);
    }
}
