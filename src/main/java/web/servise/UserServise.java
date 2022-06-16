package web.servise;

import web.models.User;

import java.util.List;

public interface UserServise {

    public void save(User user);
    public User update(User user);
    public List<User> getAll();
    public User getUserById(Integer id);
    public void delete(Integer id);
}
