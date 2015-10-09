package cn.linc.wit120.mappers;

import cn.linc.wit120.model.User;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by leostormrage on 2015/10/6.
 */
@Repository
public interface UserMapper {
    void save(User user);
    void update(User user);
    void delete(int id);
    User findById(int id);
    List<User> findAll();
}