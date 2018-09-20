//package com.leavemanagementview.demo.Controllers;
//
//import com.leavemanagementview.demo.Model.AppliedLeave;
//import com.leavemanagementview.demo.Model.Employee;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.SessionAttribute;
//import org.springframework.web.client.RestTemplate;
//import org.springframework.web.servlet.ModelAndView;
//
//@Controller
//public class ManagerController {
//    @Autowired
//    RestTemplate restTemplate;
//
//    @RequestMapping(value = "/ManagerLeaves", method = RequestMethod.GET)
//    public ModelAndView getAllManagerLeaves(@SessionAttribute("employee")Employee employee) {
//        System.out.println("employee: "+employee.getUsername());
//
//        ResponseEntity<AppliedLeave[]> response = restTemplate.getForEntity("http://localhost:8082/getAllManagerLeave", AppliedLeave[].class,employee.getUsername());
//        AppliedLeave[] appliedLeaves = response.getBody();
//
//        ModelAndView modelAndView=new ModelAndView();
//        modelAndView.setViewName("employeeHome");
//        modelAndView.addObject(appliedLeaves);
//
//        return modelAndView;
//    }
//}
