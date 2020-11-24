package SE.project.SangusaaBank.controller;

import SE.project.SangusaaBank.model.Credit;
import SE.project.SangusaaBank.model.Customer;
import SE.project.SangusaaBank.model.CustomerEdit;
import SE.project.SangusaaBank.service.CustomerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/memberpageadmin")
public class MemberPageAdminController {

    private CustomerService customerService;

    public MemberPageAdminController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping
    public String getMemberAdminPage(Model model) {
        model.addAttribute("memberpageadmin", customerService.getCustomers());
        return "memberpageadmin";
    }

    @PostMapping
    public String getEditMember (@ModelAttribute CustomerEdit customerEdit, Model model) {
        System.out.println(customerEdit.getEdit());
        model.addAttribute("memberpageadmin", customerService.getCustomers());
        return "showdatacustomer";
    }

    /*@PostMapping("/show/{id}")
    public String getCustomerCredit (@PathVariable String id, Model model) {
        Customer customer = customerService.findCustomer(id);
        model.addAttribute("showdatacustomer", customer);
        return "showdatacustomer";
    }*/

}
