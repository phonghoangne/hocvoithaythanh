package org.OOP;

import java.util.List;

public interface Action
{
    public boolean insert(Person person, List<Person> persons);

    public boolean update(Person person,List<Person> persons);
}
