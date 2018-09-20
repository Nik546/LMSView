package com.leavemanagementview.demo.Controllers;

import com.leavemanagementview.demo.Model.AppliedLeave;
import com.leavemanagementview.demo.Model.Employee;
import com.leavemanagementview.demo.Model.LeaveApply;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;


@Controller
@SessionAttributes("employee")
public class LoginController {

public String name;

    @Autowired
    RestTemplate restTemplate;

//    @ModelAttribute("employee")
//    public Employee setEmployee()
//    {
//        return new Employee();
//    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ModelAndView first(@ModelAttribute("employee") Employee employee,Model model) {


        name=employee.getUsername();
        System.out.println(employee.getPassword());
        if (employee.getUsername().equals("admin")) {
            System.out.println("im here");
            ResponseEntity<Employee[]> responseEntity = restTemplate.postForEntity("http://localhost:8082/validate", employee, Employee[].class);
            ModelAndView modelAndView = new ModelAndView();
            Employee employee1=getEmp();
            if ((employee1.getPassword()).equals(employee.getPassword())) {
                modelAndView.setViewName("orgHome");
            }
            else
            {
                modelAndView.setViewName("login");
            }

            return modelAndView;
        }
        else
            {
            ResponseEntity<Employee[]> responseEntity = restTemplate.postForEntity("http://localhost:8082/validate", employee, Employee[].class);
            ModelAndView modelAndView = new ModelAndView();
            Employee employee1=getEmp();
            System.out.println(employee.getPassword()+employee1.getPassword());
            if ((employee1.getPassword()).equals(employee.getPassword()))
            {

//                ResponseEntity<LeaveApply[]> response = restTemplate.getForEntity("http://localhost:8082/getAllLeave", LeaveApply[].class,employee.getUsername());
//                LeaveApply[] leaveApply = response.getBody();
                model.addAttribute(new AppliedLeave());
//                System.out.println("hi");
//                modelAndView.addObject("leavesApply",leaveApply);


                modelAndView.setViewName("employeeHome");
            }
            else
            {
                System.out.println("oh no");
                modelAndView.setViewName("login");
            }

            return modelAndView;

        }
    }

        public Employee getEmp()
        {
            ResponseEntity<Employee> response = restTemplate.getForEntity("http://localhost:8082/getEmployee", Employee.class);
            Employee employee1 = response.getBody();

            return employee1;
        }
    }


