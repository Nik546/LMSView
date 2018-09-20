package com.leavemanagementview.demo.Controllers;

import com.leavemanagementview.demo.Model.Company;
import com.leavemanagementview.demo.Model.Employee;
import com.leavemanagementview.demo.Model.LeaveApply;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DeletingController {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping(value = "/deleteNowEmp")
    public ModelAndView deleteEmployee(@ModelAttribute Employee employee)
    {
        System.out.println(employee.getUsername());
        ResponseEntity<Employee> responseEntity=restTemplate.postForEntity("http://localhost:8082/deleteEmployee",employee,Employee.class);

        return new ModelAndView("DeleteEmployee");

    }

    @RequestMapping(value = "/deleteNow")
    public ModelAndView deleteCompany(@ModelAttribute Company company)
    {
        System.out.println(company.getCompanyName());
        ResponseEntity<Company> responseEntity=restTemplate.postForEntity("http://localhost:8082/deleteCompany",company,Company.class);

        return new ModelAndView("DeleteCompany");

    }

    @RequestMapping(value = "/deleteNowLeave")
    public ModelAndView deleteLeave(@ModelAttribute LeaveApply leaveApply)
    {

        ResponseEntity<LeaveApply> responseEntity=restTemplate.postForEntity("http://localhost:8082/deleteNowLeave",leaveApply,LeaveApply.class);
        return new ModelAndView("employeeHome");
    }
}
