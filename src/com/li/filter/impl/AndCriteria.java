package com.li.filter.impl;

import com.li.filter.Criteria;
import com.li.filter.Person;

import java.util.List;

public class AndCriteria implements Criteria {

    private Criteria criteria;
    private Criteria otherCriteria;

    public AndCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meeetCriteria(List<Person> persons) {

        List<Person> firstCriteriaPersons = criteria.meeetCriteria(persons);
        return otherCriteria.meeetCriteria(firstCriteriaPersons);
    }
}
