package com.example.springboot_04;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    @RequestMapping("/loadform") // provide routing for endpoint /loadform
    public String loadFormPage() {
        return "formtemplate"; // return the View template formtemplate.html for endpoint /loadform
    }

    @RequestMapping("/processform")  // provide routing for endpoint /processform
    public String loadFromPage(
            @RequestParam("login") String login, Model model) { // Expecting a GET or POST parameter login; pass variable login and object model
        model.addAttribute("loginval", login); // Add attribute loginval with value login to object model
        return "confirm"; // return the View confirm.html for endpoint /processform
    }
}
