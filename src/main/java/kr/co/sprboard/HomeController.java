package kr.co.sprboard;


import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Log4j2
public class HomeController {
    @RequestMapping({"", "/"})
    public String home() {
        log.info("Welcome home!");
        return "index";
    }
}