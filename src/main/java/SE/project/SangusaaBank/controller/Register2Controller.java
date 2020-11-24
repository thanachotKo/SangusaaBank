package SE.project.SangusaaBank.controller;

import SE.project.SangusaaBank.model.Customer;
import SE.project.SangusaaBank.service.CustomerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/register2")
public class Register2Controller {

    private CustomerService customerService;

    public Register2Controller(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping
    public String getRegister2Page() {
        return "register2";
    }

    @PostMapping
    public String createCustomer(@ModelAttribute Customer customer, Model model){
        customerService.createCustomer(customer);
        model.addAttribute("mainpage", customer);
        return "mainpage";
    }
}
