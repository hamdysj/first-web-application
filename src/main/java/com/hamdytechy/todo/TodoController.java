package com.hamdytechy.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.hamdytechy.login.UserValidationService;

@Controller
@SessionAttributes("name")
public class TodoController {
	
	
	@Autowired
	TodoService service;
	
	@RequestMapping(value = "/list-todos", method = RequestMethod.GET)
	public String showTodo(ModelMap model) {
		model.addAttribute("todos", service.retrieveTodos("in28Minutes"));
		return "list-todos";
	}
	
	//Form on Display
	@RequestMapping(value = "/add-todo", method = RequestMethod.GET)
	public String ViewTodo() {
		return "todo";
	}
	
	//Form Page on Submission
	@RequestMapping(value = "/add-todo", method = RequestMethod.POST)
	public String AddTodo() {
		return "redirect:list-todos";
	}
	
}
	
