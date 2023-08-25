package controllers.member;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/member/join")
public class MemberJoinController {
    @GetMapping // /member/join
    //@RequestMapping(method = RequestMethod.GET, path="/member/join")
    public String join(Model model) {
        model.addAttribute("joinForm", new JoinForm());

        List<String> hobbies = getHobbies();
        model.addAttribute("hobbies", hobbies);

        return "member/join2";
    }

    @PostMapping
    public String joinPs(JoinForm form, Model model) { // JoinForm -> joinForm : EL 속성 추가
        //model.addAttribute("joinForm", joinForm);
        //System.out.println(form);

        List<String> hobbies = getHobbies();
        model.addAttribute("hobbies", hobbies);

        return "member/join2";
    }

    private List<String> getHobbies() {
        List<String> hobbies = Arrays.asList("자바", "JSP", "스프링", "스프링부트");

        return hobbies;
    }

    /*
    @PostMapping // /member/join
    public String joinPs(@RequestParam(name="userId", required = false, defaultValue="없는 아이디") String memId, String userPw, boolean agree) {
       System.out.printf("userId=%s, userPw=%s, agree=%s%n", memId, userPw, agree);


        return null;
    }

     */
}
