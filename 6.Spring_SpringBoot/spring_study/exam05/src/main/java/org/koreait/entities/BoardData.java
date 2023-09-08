package org.koreait.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data @Builder
@NoArgsConstructor @AllArgsConstructor
public class BoardData extends BaseEntity {
    @Id @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String subject;

    @Lob
    @Column(nullable = false)
    private String content;

    @ManyToOne(fetch=FetchType.LAZY) // 지연로딩
    @JoinColumn(name="userNo")
    @ToString.Exclude
    private Member member;

    @ManyToMany(fetch=FetchType.LAZY)
    @ToString.Exclude
    private List<HashTag> tags = new ArrayList<>();
}
