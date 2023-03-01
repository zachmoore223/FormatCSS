package org.wcci.formatcss.templateController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.wcci.formatcss.repositories.StyleRepository;

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
    public String getStyleSheet(Model model, @PathVariable long styleSheetID) {
        model.addAttribute("style", styleRepository.findById(styleSheetID).get());
        return "cssTemplate.css";
    }

    @GetMapping("/demo/{num}")
    public String formatIndex(Model model, @PathVariable int num) {
        model.addAttribute("num", num);
        model.addAttribute("styles", styleRepository.findAll());
        return "indexTemplate.html";
    }


}
