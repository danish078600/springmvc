package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ContactController {
	@RequestMapping("/contact")
	public String showForm()
	{
		return "contact";
	}
	@RequestMapping(path = "/processform",method = RequestMethod.POST )
	public String handelForm(@RequestParam(name = "email",required = true) String useremail,
							 @RequestParam("username") String username,
							 @RequestParam("password") String password, Model model)
	{
		System.out.println("user email"+useremail);
		System.out.println("user name"+ username);
		System.out.println("user password"+ password);
		model.addAttribute("name",username);
		model.addAttribute("email",useremail);
		model.addAttribute("password",password);
		
		return "success";
	}
}
