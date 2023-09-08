package org.koreait.entities;

import jakarta.persistence.*;
import lombok.*;
import org.koreait.constants.Role;

import java.util.ArrayList;
import java.util.List;

@Entity
//@Table(name="es_member")
@Data @Builder
@AllArgsConstructor @NoArgsConstructor
public class Member extends BaseEntity {
    @Id @GeneratedValue
    private Long userNo;

    @Column(name="memId", length=40, unique = true, nullable = false)
    private String userId;

    @Column(length=65, nullable = false)
    private String userPw;

    @Column(length=40, nullable = false)
    private String userNm;

    @Transient
    private String introduction;

    @Enumerated(EnumType.STRING)
    private Role role;

    @OneToMany(mappedBy = "member", fetch=FetchType.LAZY, cascade = CascadeType.REMOVE)
    private List<BoardData> boardDatas = new ArrayList<>();

    @OneToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="addressId")
    @ToString.Exclude
    private Address address;
}
