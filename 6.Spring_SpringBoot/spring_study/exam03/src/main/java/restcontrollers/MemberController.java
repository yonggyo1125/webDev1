package restcontrollers;

import controllers.member.JoinForm;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import models.member.DuplicateMemberException;
import models.member.JoinService;
import models.member.Member;
import models.member.MemberDao;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/member")
@RequiredArgsConstructor
public class MemberController {
    private final MemberDao memberDao;
    private final JoinService joinService;

    @GetMapping("/{id}")
    public ResponseEntity<Member> info(@PathVariable("id") String userId) {
        Member member = memberDao.get(userId);

        return ResponseEntity.ok(member);
    }

    @GetMapping("/list")
    public List<Member> list() {
        List<Member> members = memberDao.getList();

        return members;
    }

    /*
    @GetMapping("/hello")
    public String hello() {

        return "Hello!!";
    }
     */
    @GetMapping("/hello")
    public void hello() {
        System.out.println("Hello!!!!");
    }

    /**
    @PostMapping("/register")
    public ResponseEntity<Object> register(@RequestBody JoinForm form) {

        joinService.join(form);

        //return ResponseEntity.status(HttpStatus.CREATED).build();

        //return ResponseEntity.status(HttpStatus.CREATED).body(form);

        return ResponseEntity.created(URI.create("/member/login")).build();
    }
    */
    @PostMapping("/register")
    public ResponseEntity<Object> register(@RequestBody @Valid JoinForm form, Errors errors, HttpServletResponse response) {
        if (errors.hasErrors()) {
            String messages = errors.getAllErrors()
                        .stream().map(o -> o.getDefaultMessage())
                    .collect(Collectors.joining(","));

            throw new RuntimeException(messages);
        }



        joinService.join(form);

        return ResponseEntity.created(URI.create("/member/login")).build();

    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<JSONData<Object>> errorHandler(Exception e) {

       JSONData<Object> data = new JSONData<>();
       data.setSuccess(false);
       data.setMessage(e.getMessage());
       data.setStatus(HttpStatus.BAD_REQUEST);

       return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(data);
    }
}
