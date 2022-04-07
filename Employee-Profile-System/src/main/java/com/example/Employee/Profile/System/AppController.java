package com.example.Employee.Profile.System;

import java.util.List;

import com.example.Employee.Profile.System.Employee;
import com.example.Employee.Profile.System.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class AppController {

    @Autowired
    private EmployeeService service;

    @RequestMapping("/")
    public String viewHomePage(Model model) {
        List<Employee> employeeDetailsList = service.listAll();
        model.addAttribute("employeeDetailsList", employeeDetailsList);

        return "index";
    }

    @RequestMapping("/add")
    public String AddEmployeePage(Model model) {
        Employee employeeDetails = new Employee();
        model.addAttribute("employeedetailsList", employeeDetails);

        return "new_employee";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String savedetails(@ModelAttribute("employeeDetails")Employee employeeDetails) {
        service.save(employeeDetails);

        return "redirect:/";
    }

    @RequestMapping("/edit/{id}")
    public ModelAndView showEditemployeePage(@PathVariable(name = "id") int id) {
        ModelAndView mav = new ModelAndView("edit_employee");
        Employee employeeDetails = service.get(id);
        mav.addObject("employeeDetails", employeeDetails);

        return mav;
    }

    @RequestMapping("/profile/{id}")
    public String profileemployee(@PathVariable(name = "id") int id) {
        service.delete(id);
        return "redirect:/";
    }
}
