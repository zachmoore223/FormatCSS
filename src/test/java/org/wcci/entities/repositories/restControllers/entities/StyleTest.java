package org.wcci.entities.repositories.restControllers.entities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StyleTest {

    @Test
    void constructorTest() {
        Style testerStyle = new Style ("black", "white", "green", "blue", "white");
        assertEquals("black", testerStyle.getBackgroundColor());
        assertEquals("white", testerStyle.getH1Color());
        assertEquals("green", testerStyle.getH2Color());
        assertEquals("blue", testerStyle.getH3Color());
        assertEquals("white", testerStyle.getPColor());
    }

    @Test
    void constructorTest2() {
        Style testerStyle = new Style ("darkgrey", "darkred", "rgb(231, 231, 231)", "white", "black");
        assertEquals("darkgrey", testerStyle.getBackgroundColor());
        assertEquals("darkred", testerStyle.getH1Color());
        assertEquals("rgb(231, 231, 231)", testerStyle.getH2Color());
        assertEquals("white", testerStyle.getH3Color());
        assertEquals("black", testerStyle.getPColor());
    }
}