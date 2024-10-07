package kz.tenko.spring.mvc;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@Controller
@RequestMapping("/employee")
public class MyController {

    public MyController(){
    }

    @RequestMapping("/")
    public String showFirstView() {
        return "first-view";
    }

    @RequestMapping("/askDetails")
    public String askEmployeeDetails(Model model) {

//        Employee emp = new Employee();
//        emp.setName("Anna");
//        emp.setSurname("Petrova");
//        emp.setSalary(1500);
//        model.addAttribute("employee", emp);

        model.addAttribute("employee", new Employee());

        return "ask-emp-details-view";
    }

    @PostMapping("/showDetails")
    public String showEmpDetails(@Valid @ModelAttribute("employee") Employee emp, BindingResult bindingResult) {

//        System.out.println("surname length = " + emp.getSurname().length());

        if (bindingResult.hasErrors()) {
            return "ask-emp-details-view";
        } else {
            return "show-emp-details-view";
        }


//        String name = emp.getName();
//        emp.setName("Dude " + name);
//        String surname = emp.getSurname();
//        emp.setSurname(surname + "!");
//        int salary = emp.getSalary();
//        emp.setSalary(salary * 2);

//        return "show-emp-details-view";
    }

//    @RequestMapping("/showDetails")
//    public String showEmpDetails() {
//        return "show-emp-details-view";
//    }

//    @RequestMapping("/showDetails")
//
//    public String showEmpDetails(HttpServletRequest request, Model model) {
//
//        String empName = request.getParameter("employeeName");
//        empName = "Mrs. " + empName;
//        model.addAttribute("nameAttribute", empName);
//
//        return "show-emp-details-view";


}
























