package web.servise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.UserDao;
import web.models.User;

import java.util.List;

@Service
@Transactional
public class UserServiseImpl implements UserServise {

    private final UserDao userDao;
    @Autowired
    public UserServiseImpl(UserDao userDaoInterface) {
        this.userDao = userDaoInterface;
    }

    @Override
    public void save(User user) {
        userDao.save(user);
    }

    @Override
    public User update(User user) {
        return userDao.update(user);
    }

    @Override
    public List<User> getAll() {
        return userDao.getAll();
    }

    @Override
    public User getUserById(Integer id) {
        return userDao.getUserById(id);
    }

    @Override
    public void delete(Integer id) {
        userDao.delete(id);
    }

}
