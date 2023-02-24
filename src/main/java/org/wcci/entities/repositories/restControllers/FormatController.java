package org.wcci.entities.repositories.restControllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class FormatController {

    @GetMapping("/index")
    public String index() {
        return "indexTemplate.html";
    }
    @GetMapping("/styles/{styleSheetID}.css")
     public String getStyleSheet(Model model, @PathVariable int styleSheetID){
        model.addAttribute("styleSheetID", styleSheetID);
        if (styleSheetID == 1){
            model.addAttribute("bodyBackgroundColor", "darkgrey");
        } else if (styleSheetID == 2){
            model.addAttribute("bodyBackgroundColor", "grey");
        } else {
            model.addAttribute("bodyBackgroundColor", "white");
        }
        return "cssTemplate.css";
    }

    @GetMapping ("/demo/{num}")
    public String formatIndex (Model model, @PathVariable int num){
        model.addAttribute("num", num);
        return "indexTemplate.html";
    }


}
