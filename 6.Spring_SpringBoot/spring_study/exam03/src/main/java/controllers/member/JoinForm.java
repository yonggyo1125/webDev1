package controllers.member;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.util.List;

@Data
public class JoinForm {
    private String type = "private";

    @NotBlank
    private String userId;

    @NotBlank
    private String userPw;

    @NotBlank
    private String userPwRe;

    @NotBlank
    private String userNm;
    private String email;
    private String mobile;
    private List<String> hobby;
    private String intro;
    private boolean agree;
}
