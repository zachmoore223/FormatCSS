package org.wcci.entities.repositories.restControllers.entities;

import javax.persistence.Id;

public class Style {

    private String name;
    private String backgroundColor;
    private String h1Color;
    private String h2Color;
    private String h3Color;
    private String pColor;

    public Style(String name, String backgroundColor, String h1Color, String h2Color, String h3Color, String pColor){
        this.name = name;
        this.backgroundColor = backgroundColor;
        this.h1Color = h1Color;
        this.h2Color = h2Color;
        this.h3Color = h3Color;
        this.pColor = pColor;
    }

    public String getName() {
        return name;
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
