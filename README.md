# GET STYLE
* GET STYLE 1: curl -s -X GET http://localhost:8080/css/1 -H 'Content-Type: application/json'

# POST STYLE:
* 1st style: curl -X POST http://localhost:8080/css -H 'Content-Type: application/json' -d '
 {"name": "Red-Grey", "bodyBackgroundColor": "darkgrey", "h1Color": "darkred", "h2Color":
 "rgb(187, 2, 2)", "h3Color": "white", "pColor": "black"}'

* 2nd style: curl -X POST http://localhost:8080/css -H 'Content-Type: application/json' -d '
{"name": "Pink-Grey","bodyBackgroundColor": "grey", "h1Color": "rgb(255, 175, 188)", "h2Color":
 "rgb(255, 195, 195)", "h3Color": "rgb(211, 211, 211)", "pColor": "white"}'

# PUT STYLE:
* PUT STYLE 1: curl -s -X PUT http://localhost:8080/css/1 -H 'Content-Type: application/json'


# DELETE STYLE:
* DELETE STYLE 1: curl -s -X DELETE http://localhost:8080/css/1 -H 'Content-Type: application/json'

# Overview

* CSS has many "knobs" -- size, color, etc, ....
* We want the ability to store "good" combinations of settings and make them available as a stylesheet.
* a prototype with three different colors, simple CSS that has everything connected together
* hard coded style sheet as stylesheet 1
* (Hardcoded examples) "As a graphic designer, I need to be able to modify the colors for a given styleNumber, so my stylesheets are purchased by developers."
* Example:
    * (Hardcoded examples) "As salesperson, I need to be able to display two stylesheets with the same structure but different colors, so I can do demos and sell this investors."
      Development team: "oh, thats medium-to-small" (DONE! - Simple two css sheets setup)
    * (READONLY User) "As a website developer, I need to be able to download CSS based on styleNumber, so my site is pretty." (Done! css/# is now linkable as they're created!)
    * (WRITING User) "As a graphic designer, I need to be able to modify the colors for a given styleNumber or remove styles that are no longer needed, so my stylesheets are purchased by developers." (in process!!!)
*
# Requirements

* First requirement
* Second requirement

# Reviews API

* First endpoint
* Second endpoint
