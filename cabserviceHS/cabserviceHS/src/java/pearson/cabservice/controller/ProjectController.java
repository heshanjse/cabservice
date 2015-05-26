/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pearson.cabservice.controller;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
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
import pearson.cabservice.model.Project;
import pearson.cabservice.service.EmployeeService;
import pearson.cabservice.service.ProjectService;

/**
 *
 * @author heshanjayasinghe
 */
@Controller
public class ProjectController {
    
  
    
     @Autowired
        private ProjectService projectservice;
	

    @RequestMapping(value = "/", method = RequestMethod.GET)
	public String listProjects(ModelMap map) 
	{
		map.addAttribute("project", new Project());
		//map.addAttribute("bookList", employeeManager.getAllEmployees());
		
		return "addProject";
	}
        
    @RequestMapping(value = "/project/add",method = RequestMethod.POST)
    public String getProject(@ModelAttribute(value="project") Project project, BindingResult result) {
        try {

               projectservice.addProject(project);
		return "redirect:/index.jsp";

        } catch (ClassNotFoundException ex) {
           
        } catch (SQLException ex) {
            
        }
       // model.addAttribute("book", book);
        return "project";
    }
    
    @RequestMapping(method = RequestMethod.GET)
	public ModelAndView listEmployees() {
		Map<String, Object> model = new HashMap<String, Object>();
        	//System.out.println(projectService.listProjects());
		//model.put("employees",  EmployeeService.);
		//model.put("projects",  projectService.listProjects());
		
		
		return new ModelAndView("addEmployee", model);
		
	}
    
}
