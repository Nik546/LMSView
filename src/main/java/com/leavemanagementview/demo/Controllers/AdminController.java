package com.leavemanagementview.demo.Controllers;

import com.leavemanagementview.demo.Model.AppliedLeave;
import com.leavemanagementview.demo.Model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


@Controller
@SessionAttributes("employee")
public class AdminController
{
    @Autowired
    RestTemplate restTemplate;

    @RequestMapping(value = "/")
    public ModelAndView first(Model model)
    {
        System.out.println("hey you");
        ModelAndView modelAndView=new ModelAndView();
        model.addAttribute("employee",new Employee());
        Employee employee=new Employee();

        modelAndView.setViewName("login");

        return modelAndView;
    }


    @PostMapping(value = "/register")
    public ModelAndView Register(@ModelAttribute("employee") Employee employee)
{
    ModelAndView modelAndView=new ModelAndView();

modelAndView.setViewName("orgHome");

    ResponseEntity<Employee[]> responseEntity=restTemplate.postForEntity("http://localhost:8082/register",employee,Employee[].class);
//    int statusCode=responseEntity.getStatusCodeValue();
//    System.out.println(statusCode);



    return modelAndView;

}

@RequestMapping(value = "/getAllEmployee")
public ModelAndView getAllEmployee()
{
    ModelAndView modelAndView=new ModelAndView();
    modelAndView.setViewName("DeleteEmployee");
    ResponseEntity<Employee[]> responseEntity=restTemplate.getForEntity("http://localhost:8082/getAll",Employee[].class);
    Employee[] employees=responseEntity.getBody();
    modelAndView.addObject("employees",employees);
    System.out.println(employees[0].getUsername());
    return modelAndView;

}

@RequestMapping(value = "/orgHome")
    public ModelAndView mapping(Model model)
{
    model.addAttribute(new Employee());
    return new ModelAndView("orgHome");
}

    @RequestMapping(value = "/AddEmployee")
    public ModelAndView mapping1(Model model)
    {
        model.addAttribute(new Employee());
        return new ModelAndView("RegisterEmployee");
    }

}
