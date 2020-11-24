package SE.project.SangusaaBank.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/showdatacustomer")
public class ShowDataController {

    @GetMapping
    public String getPageShowData () {
        return "showdatacustomer";
    }

}
