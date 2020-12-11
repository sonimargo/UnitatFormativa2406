package com.TestUF_2406.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IniciController 
{

	@RequestMapping(value = { "/biblioteca" })	
	public String inicio(Model model) 
	{
		return "inicio/webHome.html";
	}
	
	
	@RequestMapping(value = { "webIncio" })	
	public String webIncio(Model model) 
	{
		return "inicio/webHome.html";
	}

}
