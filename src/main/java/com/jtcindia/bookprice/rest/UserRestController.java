package com.jtcindia.bookprice.rest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserRestController {
	
	@GetMapping("/")
	public String loadIndex() {
		
		return "index";
	}

	@GetMapping("/msg")
	@ResponseBody
	public String index(@RequestParam("name") String name) {

		String msg="hello "+name;
		//model.addAttribute("msg", msg);
		return msg;

	}


	
	@GetMapping("/cmsg")
	@ResponseBody
	public String countryMsg(@RequestParam("cname") String cname) {

		String msg="I am going to  "+cname+"next month";
		//model.addAttribute("msg", msg);
		return msg;

	}

	

}
