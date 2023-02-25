package org.wcci.entities.repositories.restControllers.restControllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.wcci.entities.repositories.restControllers.entities.Style;
import org.wcci.entities.repositories.restControllers.repositories.StyleRepository;

import java.util.HashMap;

@Controller
public class StyleController {
    final StyleRepository styleRepository;

    public StyleController(@Autowired StyleRepository styleRepository) {
        this.styleRepository = styleRepository;
    }
    @GetMapping("/index")
    public String index() {
        return "indexTemplate.html";
    }

    @GetMapping("/styles")
    public Iterable<Style> getStyles() {
        return styleRepository.findAll();
    }

    @PostMapping("/styles")
    public Style postCategory(final @RequestBody Style style) {
        return styleRepository.save(style);
    }


    @GetMapping("/css/{styleSheetID}.css")
     public String getStyleSheet(Model model, @PathVariable long styleSheetID){
//        Style testerStyle1 = new Style("darkgrey", "darkred", "rgb(231, 231, 231",
//                "white", "black");
//        Style testerStyle2 = new Style( "grey", "rgb(255, 175, 188);", "rgb(255, 195, 195)",
//                "rgb(211, 211, 211)", "white");
//        Style blankStyle = new Style( "white", "black", "black",
//                "black", "black");
        //curl -X POST http://localhost:8080/styles -H 'Content-Type: application/json' -d '{"bodyBackgroundColor": "darkgrey", "h1Color": "darkred", h2Color": "rgb(231, 231, 231", h3Color": "white", pColor": "black" }'
        //curl -X GET http://localhost:8080/styles -H 'Content-Type: application/json'
        styleRepository.findById(styleSheetID).get().getBackgroundColor();
        model.addAttribute("styleSheetID", styleSheetID);
        model.addAttribute("bodyBackgroundColor", styleRepository.findById(styleSheetID).get().getBackgroundColor());
        model.addAttribute("h1Color", styleRepository.findById(styleSheetID).get().getH1Color());
        model.addAttribute("h2Color", styleRepository.findById(styleSheetID).get().getH2Color());
        model.addAttribute("h3Color", styleRepository.findById(styleSheetID).get().getH3Color());
        model.addAttribute("pColor", styleRepository.findById(styleSheetID).get().getPColor());

// CODE TO POST EACH STYLE SHEET
//    if (styleSheetID==1) {
//        model.addAttribute("bodyBackgroundColor", testerStyle1.getBackgroundColor());
//        model.addAttribute("h1Color", testerStyle1.getH1Color());
//        model.addAttribute("h2Color", testerStyle1.getH2Color());
//        model.addAttribute("h3Color", testerStyle1.getH3Color());
//        model.addAttribute("pColor", testerStyle1.getPColor());
//    }
//    else if (styleSheetID==2){
//        model.addAttribute("bodyBackgroundColor", testerStyle2.getBackgroundColor());
//        model.addAttribute("h1Color", testerStyle2.getH1Color());
//        model.addAttribute("h2Color", testerStyle2.getH2Color());
//        model.addAttribute("h3Color", testerStyle2.getH3Color());
//        model.addAttribute("pColor", testerStyle2.getPColor());
//    }
//    else{
//            model.addAttribute("bodyBackgroundColor", blankStyle.getBackgroundColor());
//            model.addAttribute("h1Color", blankStyle.getH1Color());
//            model.addAttribute("h2Color", blankStyle.getH2Color());
//            model.addAttribute("h3Color", blankStyle.getH3Color());
//            model.addAttribute("pColor", blankStyle.getPColor());
//        }

        return "cssTemplate.css";
    }

    @GetMapping ("/demo/{num}")
    public String formatIndex (Model model, @PathVariable int num){
        model.addAttribute("num", num);
        return "indexTemplate.html";
    }


}
