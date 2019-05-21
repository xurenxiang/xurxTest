package com.xu.spring.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.xu.spring.bean.User;


@Controller
@RequestMapping("/home")
public class HomeController {
	
	@RequestMapping(value="/hello", method=RequestMethod.POST)
	public ModelAndView hello(HttpServletRequest request, User user, Map<String, Object> map){
		System.out.println(map.getClass().toString());
		ModelAndView view = new ModelAndView("home");
		view.addObject("user", user);
		return view;
	}

}
