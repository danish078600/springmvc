package springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	@RequestMapping("/home")
	public String home(Model model)
	{
		System.out.println("home url");
		model.addAttribute("name", "danish shaikh");
		List<String> friends=new ArrayList<String>();
		friends.add("ayaz");
		friends.add("ahad");
		model.addAttribute("f", friends);
		return "index";
	}
	@RequestMapping("/help")
	public ModelAndView help()
	{
		System.out.println("help controller");
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("name","danish");
		LocalDateTime now=LocalDateTime.now();
		modelAndView.addObject("date",now);
		modelAndView.setViewName("help");
		return modelAndView;
	}
}
