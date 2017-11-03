package roche.fghsp.controller;

import java.util.UUID;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import roche.fghsp.model.Product;
import roche.fghsp.repository.ProductRepository;

@Controller
public class ProductController {

	@Autowired
	private ProductRepository productRepository;

	@GetMapping("/")
	public String listProducts(Model model) {

		Iterable<Product> list = productRepository.findAll();
		model.addAttribute("products", list);
		return "list";
	}

	@GetMapping("/create")
	public String createProductForm(Model model) {
		model.addAttribute("product", new Product());
		return "create";
	}

	@PostMapping("/create")
	public String createProduct(@Valid Product product, BindingResult bindingResult) {

		if(bindingResult.hasErrors())
			return "create";

		String idTemp;
		
		idTemp = UUID.randomUUID().toString();
		System.out.println(idTemp);
		product.setId(idTemp);
		
		Product saveProduct = productRepository.save(product);
		
		System.out.println("NEW SAVED PRODUCT WITH ID : "+saveProduct.getId());
		return "redirect:/";
	}
	
	@GetMapping("/delete/{id}")
	public String deleteProduct(@PathVariable("id") String id){
		productRepository.delete(id);
		return "redirect:/";
	}
	
	@GetMapping("/edit/{id}")
	public String editProductForm(@PathVariable("id") String id, Model model){
		
		Product product = productRepository.findOne(id);
		model.addAttribute("product", product);
		
		return "edit";
	}
	
	@PostMapping("/edit")
	public String editProduct(@Valid Product product){
	
		System.out.println("SAVE EDIT PRODUCT WITH ID" +product.getId());
		productRepository.save(product);		
		return "redirect:/";
	}
	
}
