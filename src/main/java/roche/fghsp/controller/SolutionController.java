package roche.fghsp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import roche.fghsp.model.Solution;
import roche.fghsp.repository.SolutionRepository;

@Controller
@RequestMapping("/solution")
public class SolutionController {

    @Autowired
    private SolutionRepository solRep; 
	
	
    @GetMapping({"/{id}","/details/{id}"})
    public String index(Model model, @PathVariable("id") String id) {
    	
    	Solution solution = solRep.findOne(id);
        model.addAttribute("solution", solution);

        return "solutions/details";
    }
	
	
	
}
