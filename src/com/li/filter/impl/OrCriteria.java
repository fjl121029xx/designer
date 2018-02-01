package com.li.filter.impl;

import com.li.filter.Criteria;
import com.li.filter.Person;

import java.util.List;

public class OrCriteria implements Criteria {

    private Criteria criteria;
    private Criteria otherCriteria;

    public OrCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meeetCriteria(List<Person> persons) {

        List<Person> firstCriteriaItems = criteria.meeetCriteria(persons);
        List<Person> otherCriteriaItems = otherCriteria.meeetCriteria(persons);

        for (Person person : otherCriteriaItems) {

            if (!firstCriteriaItems.contains(person)) {

                firstCriteriaItems.add(person);
            }
        }

        return firstCriteriaItems;
    }
}
