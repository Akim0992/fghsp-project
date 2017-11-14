package roche.fghsp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import roche.fghsp.model.Component;
import roche.fghsp.repository.ComponentRepository;


@Controller
@RequestMapping("/component")
public class ComponentController {
	
    @Autowired
    private ComponentRepository compRep; 
	
	
    @GetMapping({"/{id}","/details/{id}"})
    public String index(Model model, @PathVariable("id") String id) {
    	
    	Component component = compRep.findOne(id);
        model.addAttribute("component", component);

        return "components/details";
    }

}
