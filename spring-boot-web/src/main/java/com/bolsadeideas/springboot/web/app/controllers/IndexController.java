package com.bolsadeideas.springboot.web.app.controllers;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
	
	@GetMapping({"/index", "/", "/home"})
	//@PostMapping("/index")
	//@RequestMapping(value="/index", method=RequestMethod.GET)
	/*public String index(ModelMap model) {
		model.addAttribute("titulo", "Hola Spring Framework! ModelMap");
		return "index";
	}
	public ModelAndView index(ModelAndView mv) {
		mv.addObject("titulo", "Hola Spring Framework! modelandview");
		mv.setViewName("index");
		return mv;
	}
	public String index(Map<String,Object> map) {
		map.put("titulo", "Hola Spring Framework! Map");
		return "index";
	}*/
	public String index(Model model) {
		model.addAttribute("titulo", "Hola Spring Framework! Model");
		return "index";
	}
}
