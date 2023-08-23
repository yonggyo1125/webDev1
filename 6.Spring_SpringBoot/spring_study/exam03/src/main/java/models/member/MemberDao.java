package models.member;

import lombok.RequiredArgsConstructor;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class MemberDao {

    private final JdbcTemplate jdbcTemplate;


    public boolean register(Member member) {
        String hash = BCrypt.hashpw(member.getUserPw(), BCrypt.gensalt(12));

        String sql = "INSERT INTO member (userId, userPw, userNm) VALUES (?,?,?)";
        int affectedRows = jdbcTemplate.update(sql, member.getUserId(), hash, member.getUserNm());

        return affectedRows > 0;
    }

    public List<Member> getList() {
        String sql = "SELECT * FROM member ORDER BY regDt DESC";

        List<Member> members = jdbcTemplate.query(sql, (rs, i) -> {

                return Member.builder()
                        .userNo(rs.getLong("userNo"))
                        .userId(rs.getString("userId"))
                        .userPw(rs.getString("userPw"))
                        .userNm(rs.getString("userNm"))
                        .regDt(rs.getTimestamp("regDt").toLocalDateTime())
                        .build();
        });

        return members;
    }

    public Member get(String userId) {
        String sql = "SELECT * FROM member WHERE userId = ?";
        Member member = jdbcTemplate.queryForObject(sql, new RowMapper<Member>() {
            @Override
            public Member mapRow(ResultSet rs, int rowNum) throws SQLException {
                return null;
            }
        }, userId);

        return member;
    }
}
