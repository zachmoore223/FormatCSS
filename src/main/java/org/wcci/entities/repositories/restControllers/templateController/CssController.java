package org.wcci.entities.repositories.restControllers.templateController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.wcci.entities.repositories.restControllers.repositories.StyleRepository;

@Controller
public class CssController {
    final private StyleRepository styleRepository;

    public CssController(@Autowired StyleRepository styleRepository) {
        this.styleRepository = styleRepository;
    }
    @GetMapping("/index")
    public String index() {
        return "indexTemplate.html";
    }


    @GetMapping("/css/{styleSheetID}.css")
     public String getStyleSheet(Model model, @PathVariable long styleSheetID){
        styleRepository.findById(styleSheetID).get();
        model.addAttribute("styleSheetID", styleSheetID);
        model.addAttribute("bodyBackgroundColor", styleRepository.findById(styleSheetID).get().getBodyBackgroundColor());
        model.addAttribute("h1Color", styleRepository.findById(styleSheetID).get().getH1Color());
        model.addAttribute("h2Color", styleRepository.findById(styleSheetID).get().getH2Color());
        model.addAttribute("h3Color", styleRepository.findById(styleSheetID).get().getH3Color());
        model.addAttribute("pColor", styleRepository.findById(styleSheetID).get().getPColor());
        return "cssTemplate.css";
    }

    @GetMapping ("/demo/{num}")
    public String formatIndex (Model model, @PathVariable int num){
        model.addAttribute("num", num);
        model.addAttribute("styles", styleRepository.findAll());
        return "indexTemplate.html";
    }


}
