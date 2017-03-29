package com.person;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * Created by admin on 2017/3/23.
 */
@RestController
public class PersonController {
    @RequestMapping("/save")
    public List<Person> save(String personName) {
        Person person = new Person();
        person.setName(personName);
        return Arrays.asList(person);
    }
}
