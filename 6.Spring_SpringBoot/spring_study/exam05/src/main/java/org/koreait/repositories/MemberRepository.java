package org.koreait.repositories;

import org.koreait.entities.Member;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MemberRepository extends JpaRepository<Member, Long> {
    Member findByUserId(String userId);

    List<Member> findByUserNmContaining(String keyword, Pageable pageable);

    List<Member> findByUserNmContainingOrderByUserIdDesc(String keyword);

    List<Member> findByUserNmContainingOrUserIdContainingOrderByUserIdDesc(String keyword1, String keyword2);

    @Query("SELECT m FROM Member m WHERE m.userNm LIKE %:key1% OR m.userId LIKE %:key2% ORDER BY m.userId DESC")
    List<Member> getList(@Param("key1") String keyword1, @Param("key2") String keyword2);
}
