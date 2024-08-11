package org.OOP;

import java.util.List;

public interface Service {

    public boolean   delete(Integer id, List<Person> persons);

    public Person findById(Integer id,List<Person> persons);


}
