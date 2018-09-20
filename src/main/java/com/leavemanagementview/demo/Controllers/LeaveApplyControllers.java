package com.leavemanagementview.demo.Controllers;

import com.leavemanagementview.demo.Model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class LeaveApplyControllers {

    @Autowired
    LoginController loginController;

    @Autowired
    HolidayController holidayController;

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping(value = "/empLeave")
    public ModelAndView empLeave(Model model) {
        ModelAndView modelAndView = new ModelAndView();
        model.addAttribute("leaveapply", new LeaveApply());
        modelAndView.setViewName("employeeLeave");
        return modelAndView;
    }

    @PostMapping(value = "/employeeLeave")
    public ModelAndView applyLeave(@ModelAttribute("leaveapply") LeaveApply leaveApply) {
        ModelAndView modelAndView = new ModelAndView();

        Holiday[] holiday=holidayController.getAllHoliday(leaveApply);



        for (int i=0;i<holiday.length;i++)
        {
            while((holiday[i].getType()).equals(leaveApply.getType()))
            {
                System.out.println(holiday[i].getNoOfHolidays());
                System.out.println(leaveApply.getNoOfDays());
                while(holiday[i].getNoOfHolidays()>=leaveApply.getNoOfDays())
                {
                    System.out.println("im here");
                    ResponseEntity<LeaveApply> responseEntity = restTemplate.postForEntity("http://localhost:8082/applyleave", leaveApply, LeaveApply.class);


                    modelAndView.setViewName("employeeHome");

                    return modelAndView;
                }


            }
        }

        return new ModelAndView("login");
    }


    @RequestMapping(value = "/leaves",method = RequestMethod.GET)
    public ModelAndView getAllLeaves(@SessionAttribute("employee")Employee employee,Model model) {


        ResponseEntity<LeaveApply[]> responseEntity=restTemplate.postForEntity("http://localhost:8082/getAllLeave",employee,LeaveApply[].class);

        LeaveApply[] leaveApply = responseEntity.getBody();

        ResponseEntity<LeaveApply[]> responseEntity1=restTemplate.postForEntity("http://localhost:8082/getAllManagerLeave",employee,LeaveApply[].class);

        LeaveApply[] leaveApplies=responseEntity1.getBody();


//        List<ApprovedLeave> approvedLeave=new ArrayList<>();
        ResponseEntity<ApprovedLeave[]> responseEntity2=restTemplate.postForEntity("http://localhost:8082/getApprovedLeave",employee,ApprovedLeave[].class);

        ApprovedLeave[] approvedLeave=responseEntity2.getBody();

        for(int i=0;i<approvedLeave.length;i++)
        {
            System.out.println(approvedLeave[i].getUsername());
            System.out.println(approvedLeave[i].getReason());
        }
        model.addAttribute("appliedLeave",new ApprovedLeave());
        model.addAttribute("leaveApply",new LeaveApply());
//        model.addAttribute()
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("employeeHome");
        modelAndView.addObject("approvedLeave",approvedLeave);
        modelAndView.addObject("leavesApply",leaveApply);
        modelAndView.addObject("leaveapplies",leaveApplies);

        return modelAndView;
    }

}
