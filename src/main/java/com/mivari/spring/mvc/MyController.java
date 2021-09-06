package com.mivari.spring.mvc;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/employee")
public class MyController {

    @RequestMapping("/")
    public String showFirstView() {
        return "first-view";
    }

    @RequestMapping("/askDetails")
    public String askEmploteeDetails(Model model) {

        model.addAttribute("emoloyee", new Employee());

        return "ask-emp-details-view";
    }

    //    @RequestMapping("showDetails")
//    public String showEmpDetails() {
//        return "show-emp-details-view";
//    }
    @RequestMapping("/showDetails")
    public String showEmpDetails(@ModelAttribute("employee") Employee emp) {

        String name = emp.getName();
        emp.setName("Mr " + name);

        int salary = emp.getSalary();
        emp.setSalary(salary * 10);

        return "show-emp-details-view";
    }


}
