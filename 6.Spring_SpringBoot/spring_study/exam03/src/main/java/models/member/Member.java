package models.member;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import java.time.LocalDateTime;

@Data @Builder
@NoArgsConstructor @AllArgsConstructor
public class Member {
    private long userNo;
    private String userId;

    @JsonIgnore
    private String userPw;

    private String userNm;
    private LocalDateTime regDt;
}
