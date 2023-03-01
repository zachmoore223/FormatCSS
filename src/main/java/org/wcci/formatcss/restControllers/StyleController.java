package org.wcci.formatcss.restControllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.wcci.formatcss.entities.Style;
import org.wcci.formatcss.repositories.StyleRepository;

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

    //curl -X GET http://localhost:8080/css/1 -H 'Content-Type: application/json'
    //curl -X GET http://localhost:8080/css/2 -H 'Content-Type: application/json'
    @GetMapping("/css/{css_id}")
    public Style getStyle(@PathVariable final long css_id) {
        return styleRepository.findById(css_id).get();
    }

    //use form to create new style
    @PostMapping("/css")
    public Style addStyle(@RequestParam String name, @RequestParam String bodyBackgroundColor, @RequestParam String h1Color,
                          @RequestParam String h2Color, @RequestParam String h3Color,
                          @RequestParam String pColor) {
        final Style style = new Style(name, bodyBackgroundColor, h1Color, h2Color, h3Color, pColor);
        return styleRepository.save(style);
    }


    //curl for PUT requires the generated ID value (which matches css/ add {css_id} path variable)
    /* curl -X PUT http://localhost:8080/css/2 -H 'Content-Type: application/json' -d '
     {"styleID":2, "name": "Pink-Grey","bodyBackgroundColor": "black", "h1Color": "rgb(255, 175, 188)", "h2Color":
     "rgb(255, 195, 195)", "h3Color": "rgb(211, 211, 211)", "pColor": "white"}' */
    @PutMapping("/css/{css_id}")
    public void putStyle(@PathVariable final long css_id, final @RequestBody Style style) throws Exception {
        if (style.getStyleID() != css_id) {
            throw new Exception("Style body has id " + style.getStyleID() + " but url had id " + css_id);
        }
        styleRepository.save(style);
    }

    //curl -X DELETE http://localhost:8080/css/1 -H 'Content-Type: application/json'
    @DeleteMapping("/css/{css_id}")
    public void deleteStyle(@PathVariable final long css_id) {
        styleRepository.delete(styleRepository.findById(css_id).get());
    }

}
