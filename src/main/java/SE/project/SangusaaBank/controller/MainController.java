package SE.project.SangusaaBank.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping("/mainpage")
    public String getMainPage(){
        return "mainpage";
    }

}
