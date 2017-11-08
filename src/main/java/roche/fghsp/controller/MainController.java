package roche.fghsp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import roche.fghsp.model.Solution;
import roche.fghsp.repository.SolutionRepository;


@Controller
public class MainController {
	
    @Autowired
    private SolutionRepository solRep; 
    
//    @Autowired
//    private SerieRepository serieRep; 
    
    @GetMapping({"", "/", "/home", "/home/"})
    public String index(Model model) {
        model.addAttribute("solutions", (Iterable<Solution>) solRep.findAll());
        return "index";
    }

}
