package controllers.member;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/members")
public class MembersController {
    @GetMapping
    public String list(@ModelAttribute SearchForm form) {
        System.out.println(form);
        return "member/list";
    }
}
