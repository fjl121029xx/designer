package com.li.filter.impl;

import com.li.filter.Criteria;
import com.li.filter.Person;

import java.util.ArrayList;
import java.util.List;

public class CriteriaSingle implements Criteria {

    @Override
    public List<Person> meeetCriteria(List<Person> persons) {

        List<Person> singlePersons = new ArrayList<>();

        for (Person person : persons) {

            if (person.getMaritalStatus().equalsIgnoreCase("single")){

                singlePersons.add(person);
            }
        }
        return singlePersons;
    }
}
