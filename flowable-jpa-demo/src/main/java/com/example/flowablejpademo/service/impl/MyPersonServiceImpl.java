package com.example.flowablejpademo.service.impl;

import com.example.flowablejpademo.bean.Person;
import com.example.flowablejpademo.repository.PersonRepository;
import com.example.flowablejpademo.service.IMyPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyPersonServiceImpl implements IMyPersonService {
    @Autowired
    private PersonRepository personRepository;

    @Override
    public Person addPerson(Person person) {
        return personRepository.save(person);
    }
}
