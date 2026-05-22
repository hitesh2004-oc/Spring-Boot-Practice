package com.app.ourcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
//@RequestMapping("/hello")
public class OurController {
	
//	@GetMapping("/hi")
//	public String Page() {
//		return "mypage";
//	}

	
	@GetMapping("/hi")
  public ModelAndView displayMyResponse() {
  	ModelAndView mav = new ModelAndView();
  	mav.addObject("Message","We are Learning SpringBoot");
  	mav.setViewName("Data");
		return mav;
	}
}
