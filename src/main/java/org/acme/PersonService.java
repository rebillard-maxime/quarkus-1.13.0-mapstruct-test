package org.acme;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class PersonService {
    public Person loadPerson() {
        return new Person("Bob", "Miller");
    }
}
