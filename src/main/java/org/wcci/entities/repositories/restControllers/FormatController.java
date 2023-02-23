package org.wcci.entities.repositories.restControllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class FormatController {
    @GetMapping("/styles/{styleSheetID}")
     public String getStyleSheet(Model model, @PathVariable int styleSheetID){
        model.addAttribute("styleSheetID", styleSheetID);
        return "indexTemplate.html";
    }

    @GetMapping("/index")
        public String index() {
            return "indexTemplate.html";
        }
}
