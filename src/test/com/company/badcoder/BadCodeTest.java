package com.company.badcoder;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BadCodeTest {
    @Test
    void bad_test_fullName_should_be_full() {
        Assertions.assertEquals(
            "Otherbad Coderson",
            BadCode.fullName(new Hugeobject(
                "Otherbad",
                Person.builder()
                    .withName("Badal")
                    .withAge(45)
                    .withAdressse(new Adresse("This", "Is Getting", "Tedious"))
                    .build(), new House()))
        );
    }

    @Test
    void worse_test() {
        Hugeobject whatever = BadcodersTestUtils.createHugeObject("Whatever");
        Assertions.assertEquals(
            "Whatever Coderson",
            BadCode.fullName(whatever));
    }
}