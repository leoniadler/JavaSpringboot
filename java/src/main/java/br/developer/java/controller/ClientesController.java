package br.developer.java.controller;

import java.util.List;
import java.util.Map;
import java.util.Optional;

//import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
//import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
//import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.developer.java.entity.Clientes;
//import br.developer.java.repository.Cliente;
import br.developer.java.repository.ClientesRepository;




@Controller
@RequestMapping (value = "/clientes")
public class ClientesController {
	
	@Autowired
	private ClientesRepository repository;
	
		
	
	
//	  @GetMapping("/cadastrar")
//	  public String cadastrar(@ModelAttribute("cliente") Clientes cliente) {
//		  return "/clientes/cadastro";
//	  }
	
	  @RequestMapping(value = "/cadastrar",  method = RequestMethod.GET)
		public String cadastrar(@ModelAttribute("cliente") Clientes cliente) {
			return "/clientes/cadastro";
		}
	  

	  
	  @GetMapping("/listar")
	  public String listar(ModelMap model) {
		  model.addAttribute("clientes", repository.findAll());
		  return "/clientes/listar";
	  }
	  
//	  @RequestMapping(value = "/listar", method = RequestMethod.GET)
//		public String listar(ModelMap model) {
//			List<Clientes> clientes =  Clientes.listAll();
//			model.addAttribute("clientes", clientes);
//			return "/clientes/listar";
//		}
	  
	  
	  @PostMapping("/salvar")
	  public String salvar(@ModelAttribute("cliente") Clientes cliente, RedirectAttributes attr) {
		  repository.save(cliente);
		  attr.addFlashAttribute("success", "Cliente adicionado com sucesso");
		  return "redirect:/clientes/listar";
		//Ou cadastrar
	  }
	  
//	  @RequestMapping(value = "/delete/{cliente}", method = RequestMethod.DELETE)
//		public String delete(@PathVariable("clientes") Integer cliente) {
//			ClientesRepository.deleteById(cliente);
//			return "redirect:/clientes/listar";
//			
//		}
	  
//	  @RequestMapping(value = "/delete/{clientes}", method = RequestMethod.GET)
//		public String delete(@PathVariable("cliente") Integer cliente) {
//			Clientes.delete(cliente);
//			return "redirect:/clientes/listar";
//		}
	  
	  @GetMapping("/alterar/{id}")
	  public ModelAndView alterar(@PathVariable("id")Long id) {
		  
		  ModelAndView mv = new ModelAndView();
		  mv.setViewName("Clientes/alterar");
		  Clientes cliente = repository.getOne(id);
		  mv.addObject("cliente", cliente);
		  return mv;
		  
	  }
	  
//	  @RequestMapping(value = "/alterar/{id}", method = RequestMethod.GET)
//		public String alterar(@PathVariable("id") Integer id, Model model) {
//			Optional<Clientes> byId = repository.getById(id);
//			if(byId.isPresent()) {
//				model.addAttribute("cliente", byId.get());
//			}
//			return "clientes/listar";
//	  }
	  
	  
	  
	  @PostMapping("/alterar/")
	  public ModelAndView alterar(Clientes clientes) {
		  ModelAndView mv = new ModelAndView();
		  repository.save(clientes);
		  mv.setViewName("redirect:/clientes/listar");
		  return mv;
		  }
	  
	  @GetMapping("/excluir/{id}")
	  public String excluir(@PathVariable("id")Long id) {
		  repository.deleteById(id);
		  return "redirect:/clientes/listar";
	  }
	  
	  
	  
}
