package org.wcci.entities.repositories.restControllers.restControllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.wcci.entities.repositories.restControllers.entities.Style;

@Controller
public class StyleController {
    @GetMapping("/index")
    public String index() {
        return "indexTemplate.html";
    }
    @GetMapping("/css/{styleSheetID}.css")
     public String getStyleSheet(Model model, @PathVariable int styleSheetID){
        Style testerStyle1 = new Style("darkgrey", "darkred", "rgb(231, 231, 231",
                "white", "black");
        Style testerStyle2 = new Style( "grey", "rgb(255, 175, 188);", "rgb(255, 195, 195)",
                "rgb(211, 211, 211)", "white");
        Style blankStyle = new Style( "white", "black", "black",
                "black", "black");

        model.addAttribute("styleSheetID", styleSheetID);
    if (styleSheetID==1) {
        model.addAttribute("bodyBackgroundColor", testerStyle1.getBackgroundColor());
        model.addAttribute("h1Color", testerStyle1.getH1Color());
        model.addAttribute("h2Color", testerStyle1.getH2Color());
        model.addAttribute("h3Color", testerStyle1.getH3Color());
        model.addAttribute("pColor", testerStyle1.getPColor());
    }
    else if (styleSheetID==2){
        model.addAttribute("bodyBackgroundColor", testerStyle2.getBackgroundColor());
        model.addAttribute("h1Color", testerStyle2.getH1Color());
        model.addAttribute("h2Color", testerStyle2.getH2Color());
        model.addAttribute("h3Color", testerStyle2.getH3Color());
        model.addAttribute("pColor", testerStyle2.getPColor());
    }
    else{
            model.addAttribute("bodyBackgroundColor", blankStyle.getBackgroundColor());
            model.addAttribute("h1Color", blankStyle.getH1Color());
            model.addAttribute("h2Color", blankStyle.getH2Color());
            model.addAttribute("h3Color", blankStyle.getH3Color());
            model.addAttribute("pColor", blankStyle.getPColor());
        }
//
//
//        if (styleSheetID == 1){
//            model.addAttribute("bodyBackgroundColor", "darkgrey");
//        } else if (styleSheetID == 2){
//            model.addAttribute("bodyBackgroundColor", "grey");
//        } else {
//            model.addAttribute("bodyBackgroundColor", "white");
//        }
//
//        if (styleSheetID == 1){
//            model.addAttribute("h1Color", "darkred");
//        } else if (styleSheetID == 2){
//            model.addAttribute("h1Color", "rgb(255, 175, 188)");
//        } else {
//            model.addAttribute("h1Color", "black");
//        }
//
//        if (styleSheetID == 1){
//            model.addAttribute("h2Color", "darkred");
//        } else if (styleSheetID == 2){
//            model.addAttribute("h2Color", "rrgb(255, 195, 195);");
//        } else {
//            model.addAttribute("h2Color", "black");
//        }
//
//        if (styleSheetID == 1){
//            model.addAttribute("h3Color", "white");
//        } else if (styleSheetID == 2){
//            model.addAttribute("h3Color", "rgb(211, 211, 211)");
//        } else {
//            model.addAttribute("h3Color", "black");
//        }
//
//        if (styleSheetID == 1){
//            model.addAttribute("pColor", "black");
//        } else if (styleSheetID == 2){
//            model.addAttribute("pColor", "white");
//        } else {
//            model.addAttribute("pColor", "black");
//        }

        return "cssTemplate.css";
    }

    @GetMapping ("/demo/{num}")
    public String formatIndex (Model model, @PathVariable int num){
        model.addAttribute("num", num);
        return "indexTemplate.html";
    }


}
