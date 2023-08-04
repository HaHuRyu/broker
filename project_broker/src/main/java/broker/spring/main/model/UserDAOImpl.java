package broker.spring.main.model;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDAOImpl implements UserDAO {

    @Autowired
    private SqlSessionTemplate sqlSession;

    @Override
    public List<UserDTO> userList() {
        return sqlSession.selectList("all");
    };


}
