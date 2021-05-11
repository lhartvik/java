package com.company.badcoder;

public class BadcodersTestUtils {
    public static Hugeobject createHugeObject(String name) {
        return new Hugeobject(
            name,
            Person.builder()
                .withName(name)
                .withAge(45)
                .withAdressse(new Adresse("Thankfully I won't need to", "Write this over", "and over. Utils are so swell"))
                .build(), new House());
    }
}
