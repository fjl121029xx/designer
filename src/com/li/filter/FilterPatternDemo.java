package com.li.filter;

import com.li.filter.impl.AndCriteria;
import com.li.filter.impl.CriteriaFemale;
import com.li.filter.impl.CriteriaMale;
import com.li.filter.impl.CriteriaSingle;

import java.util.ArrayList;
import java.util.List;

/**
 * 过滤器模式
 * <p>
 * 过滤器模式（Filter Pattern）或标准模式（Criteria Pattern）是一种设计模式，这种模式允许开发人员使用不同的标准来过滤一组对象，
 * 通过逻辑运算以解耦的方式把它们连接起来。这种类型的设计模式属于结构型模式，它结合多个标准来获得单一标准
 * <p>
 * 实现
 * <p>
 * 我们将创建一个 Person 对象、Criteria 接口和实现了该接口的实体类，来过滤 Person 对象的列表。
 * CriteriaPatternDemo，我们的演示类使用 Criteria 对象，基于各种标准和它们的结合来过滤 Person 对象的列表。
 * <p>
 * 步骤 1 创建一个类，在该类上应用标准。 Person.java
 * 步骤 2 为标准（Criteria）创建一个接口。 Criteria.java
 * 步骤 3 创建实现了 Criteria 接口的实体类。 CriteriaMale.java CriteriaFemale.java CriteriaSingle.java AndCriteria.java OrCriteria.java
 * 步骤4 使用不同的标准（Criteria）和它们的结合来过滤 Person 对象的列表。 CriteriaPatternDemo.java
 * 步骤 5 验证输出。
 */
public class FilterPatternDemo {

    public static void main(String[] args) {


        List<Person> persons = new ArrayList<>();

        persons.add(new Person("Robert", "Male", "Single"));
        persons.add(new Person("John", "Male", "Married"));
        persons.add(new Person("Laura", "Female", "Married"));
        persons.add(new Person("Diana", "Female", "Single"));
        persons.add(new Person("Mike", "Male", "Single"));
        persons.add(new Person("Bobby", "Male", "Single"));

        Criteria criteriaMale = new CriteriaMale();
        Criteria criteriaFemale = new CriteriaFemale();
        Criteria criteriaSingler = new CriteriaSingle();

        Criteria criteriaAnd = new AndCriteria(criteriaFemale, criteriaSingler);

        List<Person> result = criteriaAnd.meeetCriteria(persons);

        printPerson(result);


    }

    private static void printPerson(List<Person> persons) {

        for (Person person : persons) {

            System.out.println(person);
        }
    }
}
