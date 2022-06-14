package web.dao;

import web.models.User;

import java.util.List;

public interface UserDaoInterface {
    public void save(User user);
    public User update(User user);
    public List<User> findAll();
    public User findById(Integer id);
    public void delete(Integer id);
}
