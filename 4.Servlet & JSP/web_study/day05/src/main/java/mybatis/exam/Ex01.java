package mybatis.exam;

import mybatis.MyConnection;
import org.apache.ibatis.session.SqlSession;

public class Ex01 {
    public static void main(String[] args) {
        SqlSession sqlSession = MyConnection.getSqlSession();
    }
}
