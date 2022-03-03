package com.hamdytechy.todo;

import java.util.Date;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;


@Controller
@SessionAttributes("name")
public class TodoController {
	
	
	@Autowired
	TodoService service;
	
	@RequestMapping(value = "/list-todos", method = RequestMethod.GET)
	public String showTodo(ModelMap model) {
		//To display on the Browser use addAtribute
		model.addAttribute("todos", service.retrieveTodos("in28Minutes"));
		return "list-todos";
	}
	
	//Form on Display
	@RequestMapping(value = "/add-todo", method = RequestMethod.GET)
	public String ViewTodo(ModelMap model) {
		model.addAttribute("todo", new Todo(0, "in28Minutes", "", new Date(), false));
		return "todo";
	}
	
	//Form Page on Submission
	@RequestMapping(value = "/add-todo", method = RequestMethod.POST)
	public String AddTodo(ModelMap model, @Valid Todo todo, BindingResult result) {
		if(result.hasErrors()) {
			return "todo";
		}
		service.addTodo("in28minutes", todo.getDesc(), new Date(), false);
		//model.clear();
		return "redirect:list-todos";
	}
	
	//Update Button Redirects Here 
			@RequestMapping(value = "/update-todo", method = RequestMethod.GET)
			public String updateTodo(ModelMap model, @RequestParam int id) {
			//model.addAttribute("todo", new Todo(0, "in28Minutes", "", new Date(), false));	
			Todo todo = service.retrieveTodo(id);
			model.addAttribute("updateTodo", todo);
				return "updatetodo";
			}
	
			//Update Page on Submission
			@RequestMapping(value = "/update-todo", method = RequestMethod.POST)
			public String submitUpdateTodo(ModelMap model, @RequestParam int id) {
				return "redirect:list-todos";
			}
	
	//Delete Button Redirects Here 
		@RequestMapping(value = "/delete-todo", method = RequestMethod.GET)
		public String DeleteTodo(ModelMap model, @RequestParam int id) {
			service.deleteTodo(id);
			return "redirect:list-todos";
		}
	
}
	
