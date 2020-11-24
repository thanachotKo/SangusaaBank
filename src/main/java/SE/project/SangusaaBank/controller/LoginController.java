package SE.project.SangusaaBank.controller;

import SE.project.SangusaaBank.model.Customer;
import SE.project.SangusaaBank.model.Login;
import SE.project.SangusaaBank.service.CustomerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login")
public class LoginController {
    private CustomerService customerService;

    public LoginController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping
    public String getLoginPage() {
        return "login";
    }

    @PostMapping
    public String login(@ModelAttribute Login login, Model model) {
        Customer matchingCustomerContact = customerService.checkPin(login);
            if (matchingCustomerContact != null) {
                model.addAttribute("mainpage", customerService.findCustomer(login.getId()));
                return "mainpage";
            }
            else {
                return "404";
            }
    }

}
