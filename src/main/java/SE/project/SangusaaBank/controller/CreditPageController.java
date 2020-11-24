package SE.project.SangusaaBank.controller;

import SE.project.SangusaaBank.model.Credit;
import SE.project.SangusaaBank.service.CreditService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/creditpage")
public class CreditPageController {

    private CreditService service;

    public CreditPageController(CreditService service) {
        this.service = service;
    }

    @GetMapping
    public String getRegisterForStudyAndNursing (){
        return "creditpage";
    }

    @PostMapping
    public String saveCredit (@ModelAttribute Credit credit, Model model) {
        /*Boolean check = service.check(credit);

        if (check == true) {*/
        credit.setCareerId(credit.getId());
        credit.setCreditId(credit.getId());
            service.crateCredit(credit);
            model.addAttribute("creditpage", service);
            return "mainpage";
        /*}
        else {
            return "404";
        }*/
    }

}
