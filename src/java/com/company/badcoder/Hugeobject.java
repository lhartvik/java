package com.company.badcoder;

import java.util.Objects;

public class Hugeobject {

    public final String name;
    public final Person person;
    public final House house;

    public Hugeobject(String name, Person person, House house) {
        this.name = Objects.requireNonNull(name);
        this.person = Objects.requireNonNull(person);
        this.house = Objects.requireNonNull(house);
    }
}
