package cz.cvut.fel.add.taskmanager.beans;

import cz.cvut.fel.czm.add.taskmanager.dao.PersonDao;
import cz.cvut.fel.czm.add.taskmanager.dao.entities.Person;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@RequestScoped
public class PersonBean {

    @Inject
    private PersonDao personDao;

    private Person person;

    @PostConstruct
    private void init() {
        loadPerson(1L);
    }

    private void loadPerson(long id) {
        this.person = this.personDao.getPerson(id);
    }

    public Person getPerson() {
        return this.person;
    }

}
