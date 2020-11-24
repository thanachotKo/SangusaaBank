package SE.project.SangusaaBank.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/mainpage-notlogin")
public class MainPageNotLoginController {

    @GetMapping
    public String getMainPageNotLogin() {
        return "mainpage-notlogin";
    }

}
