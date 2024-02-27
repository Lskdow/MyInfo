package inhatc.spring.MyInfo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/thymeleaf/home")
    public String home(){
        return "thymeleaf/home";
    }


    @GetMapping("/thymeleaf/resume")
    public String resume(){ return "thymeleaf/resume";}

    @GetMapping("/thymeleaf/self_info")
    public String self_info(){ return "thymeleaf/self_info";}
}
