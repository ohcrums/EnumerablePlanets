package org.launchcode.controllers;

import org.launchcode.data.Planets;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PlanetController {

    @GetMapping("")
    public String displayIndex(Model model) {
        model.addAttribute("planets", Planets.values());
        return "index";
    }
}
