package com.company.badcoder;

import static java.util.Objects.requireNonNull;

public class Person {

    public final Adresse adresse;
    public final String name;
    public final int age;

    public Person(PersonBuilder personBuilder) {
        adresse = requireNonNull(personBuilder.adressse);
        name = requireNonNull(personBuilder.name);
        age = requireNonNull(personBuilder.age);
    }

    public static PersonBuilder builder(){return new PersonBuilder();}

    public static class PersonBuilder{
        private String name;
        private Integer age;
        private Adresse adressse;

        public Person build(){
            return new Person(this);
        }

        public PersonBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public PersonBuilder withAge(Integer age) {
            this.age = age;
            return this;
        }

        public PersonBuilder withAdressse(Adresse adressse) {
            this.adressse = adressse;
            return this;
        }
    }
}
