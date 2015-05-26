/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pearson.cabservice.controller;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import pearson.cabservice.model.Employee;
import pearson.cabservice.model.Project;
import pearson.cabservice.service.EmployeeService;
import pearson.cabservice.service.ProjectService;

/**
 *
 * @author heshanjayasinghe
 */
@Controller
public class EmployeeController {
    
     @Autowired
        private EmployeeService employeeservice;
	

    @RequestMapping(value = "/", method = RequestMethod.GET)
	public String listProjects(ModelMap map) 
	{
		map.addAttribute("project", new Project());
		//map.addAttribute("bookList", employeeManager.getAllEmployees());
		
		return "addProject";
	}
        
    @RequestMapping(value = "/employee/add",method = RequestMethod.POST)
    public String getProject(@ModelAttribute(value="employee") Employee employee, BindingResult result) {
        try {
            employeeservice.addEmployee(employee);
               
		return "redirect:/index.jsp";

        } catch (ClassNotFoundException ex) {
          
        } catch (SQLException ex) {
            
        }
       // model.addAttribute("book", book);
        return "project";
    }
    



 /*   @RequestMapping(value = "/movie", method = RequestMethod.GET)
    public String getMovie(@ModelAttribute(value="employee") String name, ModelMap model) {

      return "redirect:/index.jsp";

    } */
    
    @RequestMapping(value = "/welcome")
	public ModelAndView listP() 
	{
	ModelAndView modelAndView = new ModelAndView("hello");
        modelAndView.addObject("msg", "hello");
            return modelAndView;
	}
        

}


    

