package org.OOP;

import java.util.List;

public class ServiceImpl implements Service, Action{


    @Override
    public boolean delete(Integer id, List<Person> persons) {
        for (Person person : persons) {
            if (person.getId().equals(id)) {
                persons.remove(person);
                return true;
            }
        }
        return false;
    }

    @Override
    public Person findById(Integer id, List<Person> persons) {
        for (Person person : persons) {
            if (person.getId().equals(id)) {
                return person;
            }
        }
        return null;
    }

    @Override
    public boolean insert(Person person, List<Person> persons) {
        persons.add(person);
        return true;
    }

    @Override
    public boolean update(Person person, List<Person> persons) {

        for (Person p : persons) {
            if (p.getId().equals(person.getId())) {
                p.setName(person.getName());
                p.setAge(person.getAge());
                return true;
            }
        }

        return false;
    }
}
