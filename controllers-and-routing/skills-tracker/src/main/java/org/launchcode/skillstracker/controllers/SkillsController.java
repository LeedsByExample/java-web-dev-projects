package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class SkillsController {

    @GetMapping
    @ResponseBody
    public String programmingLanguages() {
        return "<html>" +
                "<body>" +
                "<h1>Skills Tracker" +
                "<h2>We have a few skills we would like to learn. Here is the list!" +
                "<ol> " +
                "<li>Java</li>" +
                "<li>Python</li>" +
                "<li>SQL</li>" +
                "</ol>" +
                "</h2>" +
                "</h1>" +
                "</body>" +
                "</html>";
    }




    @GetMapping("form")
    @ResponseBody
    public String skillsForm() {
        return "<html>" +
                "<body>" +
                    "<form action='form' method='post'>" + //not sure if this is right? check\\
                "<h3>Name:" +
                    "<input type='text' name='name' id='name'/>" +
                "</h3>" +
                "<label for='languagesOne'>Choose a language:</label>" +
                    "<select id='languagesOne' name='languagesOne'>" +
                        "<option value='Java'>Java</option>" +
                        "<option value='Python'>Python</option>" +
                        "<option value='SQL'>SQL</option>" +
                    "</select>" +
                "<br></br>" +
                "<label for='languagesTwo'>Choose a language:</label>" +
                    "<select id='languagesTwo' name='languagesTwo'>" +
                        "<option value='Java'>Java</option>" +
                        "<option value='Python'>Python</option>" +
                        "<option value='SQL'>SQL</option>" +
                    "</select>" +
                "<br></br>" +
                "<label for='languagesThree'>Choose a language:</label>" +
                    "<select id='languagesThree' name='languagesThree'>" +
                        "<option value='Java'>Java</option>" +
                        "<option value='Python'>Python</option>" +
                        "<option value='SQL'>SQL</option>" +
                    "</select>" +
                "<br></br>" +
                "<input type='submit' value='Submit'/>" +
                "</form>" +
                "</body>" +
                "</html>";
    }

    //form handler test
    @PostMapping("form")
    @ResponseBody
    public String formRequestHandler(@RequestParam String name, String languagesOne, String languagesTwo, String languagesThree) {
        return "<html>" +
                "<h1>" + name + "</h1>" +
                "</html>";
    }
}

//2. At localhost:8080/form, add a form that lets the user enter their name and choose their favorite, second favorite, and third favorite programming languages on your list. Use select elements for each of the rankings. Just as with the exercises, we will use @GetMapping().