package web.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import web.models.User;
import web.servise.UserSer;
import web.servise.UserServise;

import java.util.List;

@Controller
public class UserControl {

    private final UserSer userServise;
    @Autowired
    public UserControl(UserSer userServise){
        this.userServise=userServise;
    }

    @GetMapping("/users")
    public String findAll(Model model) {
        List<User> users = userServise.findAll();
        model.addAttribute("users", users);
        return "user-list";
    }

    @GetMapping("/users-create")
    public String creatUserForm(User user) {
        return "user-create";
    }

    @PostMapping("/users-create")
    public String createUser(User user) {
        userServise.save(user);
        return "redirect:/users";
    }

    @GetMapping("/user-delete/{id}")
    public String deleteUser(@PathVariable("id") Integer id) {
        userServise.delete(id);
        return "redirect:/users";
    }

    @GetMapping("/user-update/{id}")
    public String updateUserForm(@PathVariable("id") Integer id, Model model) {
        User user=userServise.findById(id);
        model.addAttribute("user", user);
        return "user-update";
    }

    @PostMapping("/user-update")
    public String uddateUser(User user) {
        userServise.update(user);
        return "redirect:/users";
    }

}















