package lorgat.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import lorgat.model.User;
import lorgat.service.Services;


@Controller
public class UserController {
	
	@Autowired
	private Services us;
	
	@RequestMapping(value= "/user/add", method = RequestMethod.POST)
	public String add(@Valid @ModelAttribute("user") User user, BindingResult result, ModelMap model){
				
			if(user.getUserid() == 0){
				us.persist(user);
			}else{
				us.update(user);
			}
			
			 return "redirect:" + "../users/list";
		
	}
	
	@RequestMapping("/remove/{id}")
    public String remove(@PathVariable("id") int id){
		
        us.delete(id);
        return "redirect:" + "../users/list";
    }
	
	 @RequestMapping("/edit/{id}")
	    public String edit(@PathVariable("id") int id, Model model){
	        model.addAttribute("user", us.findById(id));
	        
	        return "/users/add";
	 }
	
}
