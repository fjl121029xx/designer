package com.li.filter.impl;

import com.li.filter.Criteria;
import com.li.filter.Person;

import java.util.ArrayList;
import java.util.List;

public class CriteriaFemale implements Criteria {

    @Override
    public List<Person> meeetCriteria(List<Person> persons) {

        List<Person> femalePerson = new ArrayList<>();

        for (Person person : persons) {

            if (person.getGender().equalsIgnoreCase("female")) {

                femalePerson.add(person);
            }
        }
        return femalePerson;
    }
}
