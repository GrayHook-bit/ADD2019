package cz.cvut.fel.czm.add.taskmanager.dao;

import cz.cvut.fel.czm.add.taskmanager.dao.entities.Person;

import javax.ejb.Stateless;

@Stateless
public class PersonDao {

    public Person getPerson(long id) {
        return new Person(id, "Petr Novák", 24);
    }

}
