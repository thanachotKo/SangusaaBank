package SE.project.SangusaaBank.controller;

import SE.project.SangusaaBank.model.Customer;
import SE.project.SangusaaBank.model.CustomerHelp;
import SE.project.SangusaaBank.service.CustomerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/register")
public class RegisterController {
    private CustomerService customerService;

    public RegisterController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping
    public String getRegisterPage(Model model) {
        model.addAttribute("allCustomers", customerService.getCustomers());
        return "register";
    }
    @PostMapping
    public String registerCustomer(@ModelAttribute CustomerHelp customerHelp, Model model) {
        customerService.storeCustomer(customerService.createSetCustomer(customerHelp));
        model.addAttribute("mainpage", customerService.getCustomers());
        return "mainpage";
    }
}
