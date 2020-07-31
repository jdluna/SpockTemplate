package io.github.joxebus.service

import io.github.joxebus.beans.Person

class PersonServiceImpl implements PersonService {

    @Override
    Person create(String name, String phone) {
        Person person = new Person()
        person.with {
            it.name = name
            it.phone = phone
        }
        person
    }
}
