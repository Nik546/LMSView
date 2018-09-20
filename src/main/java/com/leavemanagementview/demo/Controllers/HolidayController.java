package com.leavemanagementview.demo.Controllers;
import com.leavemanagementview.demo.Model.Employee;
import com.leavemanagementview.demo.Model.Holiday;
import com.leavemanagementview.demo.Model.LeaveApply;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HolidayController {

    @Autowired
    RestTemplate restTemplate;
    @PostMapping(value = "/addHoliday")
    public ModelAndView Register(@ModelAttribute("holiday") Holiday holiday)
    {
        ModelAndView modelAndView=new ModelAndView();

        modelAndView.setViewName("addHoliday");

        ResponseEntity<Holiday> responseEntity=restTemplate.postForEntity("http://localhost:8082/addHoliday",holiday,Holiday.class);

        return modelAndView;

    }

    @RequestMapping(value = "/addHoliday1", method = RequestMethod.GET)
    public ModelAndView mapping(Model model)
    {
     ModelAndView modelAndView= new ModelAndView("addHoliday") ;
     model.addAttribute(new Holiday());
     return modelAndView;
    }
    public Holiday[] getAllHoliday(@ModelAttribute LeaveApply leaveApply)
    {
//        ModelAndView modelAndView=new ModelAndView();

//        modelAndView.setViewName("login");
        System.out.println(" Model:"+leaveApply.getUsername());

        ResponseEntity<Holiday[]> responseEntity=restTemplate.postForEntity("http://localhost:8082/getHoliday",leaveApply,Holiday[].class);
        Holiday[] holiday=responseEntity.getBody();
//        modelAndView.addObject("holiday", holiday);
//        return modelAndView;
        return holiday;

    }
}
