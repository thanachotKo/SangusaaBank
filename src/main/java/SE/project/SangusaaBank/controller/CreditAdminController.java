package SE.project.SangusaaBank.controller;

import SE.project.SangusaaBank.service.CreditService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/creditadminpage")
public class CreditAdminController {

    private CreditService studentAndNurseService;

    public CreditAdminController(CreditService studentAndNurseService) {
        this.studentAndNurseService = studentAndNurseService;
    }

    @GetMapping
    public String getStudentAndNurseAdminPage() {
        return "creditadminpage";
    }

    @PostMapping
    public void showDataNurseAndStudent (Model model) {
        model.addAttribute("creditadminpage", studentAndNurseService.findAll());
    }

}