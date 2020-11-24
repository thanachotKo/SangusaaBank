package SE.project.SangusaaBank.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NotFoundController {

    @RequestMapping("/404")
    public String getPageNotFound () {
        return "404";
    }

}
