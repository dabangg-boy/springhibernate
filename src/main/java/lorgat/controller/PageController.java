package lorgat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lorgat.model.User;
import lorgat.service.Services;

@Controller
public class PageController {
	
	@Autowired
	private Services us;
	
	@RequestMapping("/users/add")
	public String add(Model model) {
        model.addAttribute("user", new User());
        return "/users/add";
    }
	
	@GetMapping("users/list")
	public String list(Model model) {
		model.addAttribute("users", us.list());
        return "/users/list";
    }
}
