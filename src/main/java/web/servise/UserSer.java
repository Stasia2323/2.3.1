package web.servise;

import web.dao.UserDao;
import web.models.User;

import java.util.List;

public interface UserSer {

    public void save(User user);
    public User update(User user);
    public List<User> findAll();
    public User findById(Integer id);
    public void delete(Integer id);
}
