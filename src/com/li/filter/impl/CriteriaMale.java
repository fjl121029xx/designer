package com.li.filter.impl;

import com.li.filter.Criteria;
import com.li.filter.Person;

import java.util.ArrayList;
import java.util.List;

public class CriteriaMale implements Criteria {
    @Override
    public List<Person> meeetCriteria(List<Person> persons) {

        List<Person> malePerson = new ArrayList<>();
        for (Person person : persons) {

            if (person.getGender().equalsIgnoreCase("male")) {

                malePerson.add(person);
            }
        }
        return malePerson;
    }
}
