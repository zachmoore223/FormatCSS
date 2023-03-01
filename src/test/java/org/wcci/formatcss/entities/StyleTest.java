package org.wcci.formatcss.entities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StyleTest {

    @Test
    void constructorTest() {
        Style testerStyle = new Style ("Red-Grey","black", "white", "green", "blue", "white");
        assertEquals("Red-Grey", testerStyle.getName());
        assertEquals("black", testerStyle.getBodyBackgroundColor());
        assertEquals("white", testerStyle.getH1Color());
        assertEquals("green", testerStyle.getH2Color());
        assertEquals("blue", testerStyle.getH3Color());
        assertEquals("white", testerStyle.getpColor());
    }

    @Test
    void constructorTest2() {
        Style testerStyle = new Style ("Pink-Grey", "darkgrey", "darkred", "rgb(231, 231, 231)", "white", "black");
        assertEquals("Pink-Grey", testerStyle.getName());
        assertEquals("darkgrey", testerStyle.getBodyBackgroundColor());
        assertEquals("darkred", testerStyle.getH1Color());
        assertEquals("rgb(231, 231, 231)", testerStyle.getH2Color());
        assertEquals("white", testerStyle.getH3Color());
        assertEquals("black", testerStyle.getpColor());
    }
}