package com.company.refactoredbadcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RefactoredBadCodeTest {

    @Test
    void name() {
        assertEquals(
            "Banan Coderson",
            RefactoredBadCode.fullName(() -> "Banan")
        );
    }

}