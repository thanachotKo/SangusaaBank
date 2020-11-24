package SE.project.SangusaaBank.controller;

import SE.project.SangusaaBank.model.CalculatePersonal;
import SE.project.SangusaaBank.service.CalculateService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/firstpageforcredit")
public class FirstPageForCreditController {

    private CalculateService nurseAndStudentService;

    public FirstPageForCreditController(CalculateService nurseAndStudentService) {
        this.nurseAndStudentService = nurseAndStudentService;
    }

    @GetMapping
    public String getFirstPageCredit() {
        return "firstpageforcredit";
    }

    @PostMapping
    public String calculateStudentAndNurse(@ModelAttribute CalculatePersonal personal, Model model) {
        model.addAttribute("firstpageforcredit", nurseAndStudentService.calculateForStudentAndNurse(personal));
        return "firstpageforcredit";
    }
}

