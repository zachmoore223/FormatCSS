package org.wcci.entities.repositories.restControllers.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity()
public class Style {
    @Id
    @GeneratedValue() //generate new id for each new style, starting at 1
    private long styleID;
    private String name;
    private String bodyBackgroundColor;
    private String h1Color;
    private String h2Color;
    private String h3Color;
    private String pColor;

    public Style(String name, String bodyBackgroundColor, String h1Color, String h2Color, String h3Color, String pColor){
        this.name = name;
        this.bodyBackgroundColor = bodyBackgroundColor;
        this.h1Color = h1Color;
        this.h2Color = h2Color;
        this.h3Color = h3Color;
        this.pColor = pColor;
    }
    protected Style() {
    }
    public String getName(){
        return name;
    }
    public long getStyleID (){return this.styleID;}

    public void setStyleID(final long styleID){
        this.styleID = styleID;
    }
    public String getBodyBackgroundColor() {
        return bodyBackgroundColor;
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

    public String getpColor() {
        return pColor;
    }
}
