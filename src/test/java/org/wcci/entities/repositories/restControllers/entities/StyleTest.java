package org.wcci.entities.repositories.restControllers.entities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StyleTest {

    @Test
    void constructorTest() {
        Style testerStyle = new Style ("red", "black", "white", "green", "blue", "white");
        assertEquals("red", testerStyle.getName());
        assertEquals("black", testerStyle.getBackgroundColor());
        assertEquals("white", testerStyle.getH1Color());
        assertEquals("green", testerStyle.getH2Color());
        assertEquals("blue", testerStyle.getH3Color());
        assertEquals("white", testerStyle.getPColor());
    }
}