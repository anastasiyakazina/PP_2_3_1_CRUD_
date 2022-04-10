package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.Service;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @Autowired
    private Service service;

    @GetMapping(value = "/cars")
    public String printCarTable(@RequestParam(defaultValue = "5") int count, Model model) {
        model.addAttribute("cars", service.getListCars(count));
        return "cars";
    }

}
