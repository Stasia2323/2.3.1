package web.servise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.UserDao;
import web.dao.UserDaoInterface;
import web.models.User;

import java.util.List;

@Service
@Transactional
public class UserServise implements UserSer {

    private final UserDaoInterface userDaoInterface;
    @Autowired
    public UserServise(UserDaoInterface userDaoInterface) {
        this.userDaoInterface = userDaoInterface;
    }

    @Override
    public void save(User user) {
        userDaoInterface.save(user);
    }

    @Override
    public User update(User user) {
        return userDaoInterface.update(user);
    }

    @Override
    public List<User> findAll() {
        return userDaoInterface.findAll();
    }

    @Override
    public User findById(Integer id) {
        return userDaoInterface.findById(id);
    }

    @Override
    public void delete(Integer id) {
        userDaoInterface.delete(id);
    }

}
