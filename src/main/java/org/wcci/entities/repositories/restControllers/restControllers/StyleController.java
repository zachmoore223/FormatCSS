package org.wcci.entities.repositories.restControllers.restControllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import org.wcci.entities.repositories.restControllers.entities.Style;
import org.wcci.entities.repositories.restControllers.repositories.StyleRepository;

import java.util.Collection;

@RestController
public class StyleController {
    final StyleRepository styleRepository;

    public StyleController(@Autowired StyleRepository styleRepository) {
        this.styleRepository = styleRepository;
    }

    @GetMapping("/styles")
    //curl -X GET http://localhost:8080/styles -H 'Content-Type: application/json'
    public Iterable<Style> getStyles() {
        return styleRepository.findAll();
    }

    @GetMapping("/styles/{style_id}")
    public Style getStyle(@PathVariable final long style_id) {
        return styleRepository.findById(style_id).get();
    }

    @PostMapping("/styles")
    /* curl -X POST http://localhost:8080/styles -H 'Content-Type: application/json' -d '
     {"bodyBackgroundColor": "darkgrey", "h1Color": "darkred", h2Color":
     "rgb(231, 231, 231", h3Color": "white", pColor": "black" }'
     */
    public Style postCategory(final @RequestBody Style style) {
        return styleRepository.save(style);
    }

}
