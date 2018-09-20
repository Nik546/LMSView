package com.leavemanagementview.demo.Controllers;

import com.leavemanagementview.demo.Model.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CompanyControler {

    @Autowired
    RestTemplate restTemplate;


    @PostMapping(value = "/addCompany")
    public ModelAndView Register(@ModelAttribute("company") Company company)
    {
        ModelAndView modelAndView=new ModelAndView();

        modelAndView.setViewName("addCompany");

        System.out.println("im here now");

        ResponseEntity<Company> responseEntity=restTemplate.postForEntity("http://localhost:8082/addCompany",company,Company.class);

        return modelAndView;

    }

    @RequestMapping(value = "/DeleteCompany")
    public ModelAndView getAllCompany(@ModelAttribute("company") Company company)
    {
        ModelAndView modelAndView= new ModelAndView();

        ResponseEntity<Company[]> responseEntity=restTemplate.getForEntity("http://localhost:8082/getCompany",Company[].class);
        Company[] companies= responseEntity.getBody();
        modelAndView.addObject("companies",companies);
        modelAndView.setViewName("DeleteCompany");

return modelAndView;
    }

    @RequestMapping(value = "/addCompany1")
            public ModelAndView mapping(Model model)
    {
        ModelAndView modelAndView=new ModelAndView("addCompany");

        model.addAttribute("company",new Company());
        return modelAndView;
    }
}
