package controllers;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
    /**
    @GetMapping("/greet")
    public String hello() {
        return "hello"; // /WEB-INF/view/hello.jsp
    }
    */

    @GetMapping("/greet")
    public ModelAndView hello() {
        ModelAndView mv = new ModelAndView();
        mv.addObject("name", "이이름");
        mv.setViewName("hello");

        return mv;
    }

    @GetMapping("/test")
    public String test(HttpServletRequest request) {
        System.out.println(request.getContextPath());


        return "hello";
    }
}
