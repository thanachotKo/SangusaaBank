package SE.project.SangusaaBank.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/choosetyperegister")
public class ChooseTypeRegisterController {

    @GetMapping
    public String getChooseTypePage(){
        return "choosetyperegister";
    }

    @PostMapping
    public String getRegisterPage () {
        return "register";
    }

    @PostMapping("/register2")
    public String getRegsiterPage2 () {
        return "register2";
    }
}