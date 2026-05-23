package com.app.ourcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class controller {
	
	@GetMapping("/hi")
	public String Page() {
		return "mypage";
	}

}
