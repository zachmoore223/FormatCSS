package org.wcci.entities.repositories.restControllers.restControllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.wcci.entities.repositories.restControllers.entities.Style;
import org.wcci.entities.repositories.restControllers.repositories.StyleRepository;

@RestController
public class StyleController {
    final StyleRepository styleRepository;

    public StyleController(@Autowired StyleRepository styleRepository) {
        this.styleRepository = styleRepository;
    }

    //curl -X GET http://localhost:8080/css -H 'Content-Type: application/json'
    @GetMapping("/css")
    public Iterable<Style> getStyles() {
        return styleRepository.findAll();
    }

    @GetMapping("/css/{css_id}")
    public Style getStyle(@PathVariable final long css_id) {
        return styleRepository.findById(css_id).get();
    }

    /*1st stye:
    curl -X POST http://localhost:8080/css -H 'Content-Type: application/json' -d '
     {"bodyBackgroundColor": "darkgrey", "h1Color": "darkred", "h2Color":
     "rgb(187, 2, 2)", "h3Color": "white", "pColor": "black"}'

     2nd stye:
     curl -X POST http://localhost:8080/css -H 'Content-Type: application/json' -d '
     {"bodyBackgroundColor": "grey", "h1Color": "rgb(255, 175, 188)", "h2Color":
     "rgb(255, 195, 195)", "h3Color": "rgb(211, 211, 211)", "pColor": "white"}'

     */
    @PostMapping("/css")
    public Style postStyle(final @RequestBody Style style) {
        return styleRepository.save(style);
    }

}
