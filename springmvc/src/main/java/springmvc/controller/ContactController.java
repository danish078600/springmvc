package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.model.User;

@Controller
public class ContactController {
	@RequestMapping("/contact")
	public String showForm()
	{
		return "contact";
	}
	@RequestMapping(path = "/processform",method = RequestMethod.POST )
	public String handelForm(@ModelAttribute User user,Model model)
	{
//		System.out.println("user email"+useremail);
//		System.out.println("user name"+ username);
//		System.out.println("user password"+ password);
//		User user=new User();
//		user.setEmail(useremail);
//		user.setUsername(username);
//		user.setPassword(password);
		System.out.println(user);
//		model.addAttribute("name",username);
//		model.addAttribute("email",useremail);
//		model.addAttribute("password",password);
//		
		model.addAttribute("user",user);
		return "success";
	}
}
