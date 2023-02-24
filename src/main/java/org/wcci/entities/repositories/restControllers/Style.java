package org.wcci.entities.repositories.restControllers;

public class Style {
    String backgroundColor;
    String h1Color;
    String h2Color;
    String h3Color;
    String pColor;

    public Style(String backgroundColor, String h1Color, String h2Color, String h3Color, String pColor){
        this.backgroundColor = backgroundColor;
        this.h1Color = h1Color;
        this.h2Color = h2Color;
        this.h3Color = h3Color;
        this.pColor = pColor;
    }

    public String getBackgroundColor() {
        return backgroundColor;
    }

    public String getH1Color() {
        return h1Color;
    }

    public String getH2Color() {
        return h2Color;
    }

    public String getH3Color() {
        return h3Color;
    }

    public String getPColor() {
        return pColor;
    }
}
