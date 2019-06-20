package it.prova.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import it.prova.dto.AutoreDTO;
import it.prova.dto.LibroDTO;
import it.prova.model.Autore;
import it.prova.model.Libro;
import it.prova.service.AutoreService;
import it.prova.service.LibroService;
import it.prova.validator.AutoreValidator;

@Controller
@RequestMapping("/libro/*")
public class LibroController {

	@Autowired
	private LibroService libroService;

	@Autowired
	private AutoreService autoreService;

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true, 10));
	}

	@RequestMapping(value = "search", method = RequestMethod.GET)
	public String search() {
		return "libro/search";
	}

	@RequestMapping(value = "list", method = { RequestMethod.POST, RequestMethod.GET })
	public String list(@ModelAttribute("libroCommand") LibroDTO libroDTOInstance, Model model) {
		Libro example = LibroDTO.buildLibroInstanceForFindByExample(libroDTOInstance);
//		model.addAttribute("listLibri", libroService.findByExample(example));
		
		model.addAttribute("listLibri", libroService.listAllLibri());
//System.out.println( libroService.listAllLibri().get(0).getAutore());
		return "libro/list";
	}

	@RequestMapping(value = "create", method = RequestMethod.GET)
	public String create(Model model) {
		model.addAttribute("libroCommand", new LibroDTO());
		model.addAttribute("listaAutori", autoreService.listAllAutori());
		return "libro/create";
	}

	@RequestMapping(value = "save", method = RequestMethod.POST)
	public String save(@ModelAttribute("libroCommand") LibroDTO libroDTOInstance, BindingResult result, Model model
	/* ,HttpServletRequest req */) {

//		// se la validazione fallisce
//		new AutoreValidator().validate(libroDTOInstance, result);
//		if (result.hasErrors()) {
//			return "libro/create";
//		}

		Libro libroNuovo = LibroDTO.buildLibroInstance(libroDTOInstance);
//		libroNuovo.setAutore(new Autore(libroDTOInstance.getAutore().getId()));
		libroService.inserisciNuovo(libroNuovo);
		model.addAttribute("listLibri", libroService.listAllLibri());
		return "/libro/list";
	}
}
