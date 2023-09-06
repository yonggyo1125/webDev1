package org.koreait.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name="es_member")
@Data @Builder
@AllArgsConstructor @NoArgsConstructor
public class Member {
    @Id @GeneratedValue
    private Long userNo;
    private String userId;
    private String userPw;
    private String userNm;
    @Lob
    private String introduction;

    @CreationTimestamp
    private LocalDateTime regDt;

    @UpdateTimestamp
    private LocalDateTime modDt;
}
