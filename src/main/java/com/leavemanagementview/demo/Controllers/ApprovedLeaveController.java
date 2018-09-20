package com.leavemanagementview.demo.Controllers;

import com.leavemanagementview.demo.Model.ApprovedLeave;
import com.leavemanagementview.demo.Model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


@Controller
public class ApprovedLeaveController {

    @Autowired
    RestTemplate restTemplate;

    @PostMapping(value = "/addApprovedLeave")
    public ModelAndView ApprovedLeaves(@ModelAttribute ApprovedLeave approvedLeave)
    {
        ResponseEntity<ApprovedLeave[]> responseEntity=restTemplate.postForEntity("http://localhost:8082/addApprovedLeave",approvedLeave,ApprovedLeave[].class);

        ModelAndView modelAndView=new ModelAndView("employeeHome");
        return modelAndView;
    }

//    @RequestMapping(value = "/getApprovedLeave")
//    public ModelAndView getApprovedLeaves(@SessionAttribute Employee employee)
//    {
//        ResponseEntity<ApprovedLeave[]> responseEntity=restTemplate.postForEntity("http://localhost:8082/addApprovedLeave",employee.getUsername(),ApprovedLeave[].class);
//        ModelAndView modelAndView=new ModelAndView("employeeHome");
//        modelAndView.addObject(responseEntity.getBody());
//        return modelAndView;
//    }
}
