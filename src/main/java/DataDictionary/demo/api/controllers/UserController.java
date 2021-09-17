package DataDictionary.demo.api.controllers;


import DataDictionary.demo.business.abstracts.UserService;
import DataDictionary.demo.entities.concretes.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/User/")
public class UserController {
    private final UserService usersService;

    @Autowired
    public UserController(UserService usersService) {
        this.usersService = usersService;
    }

    @GetMapping("getAll")
    public List<User> getAll() {
        return this.usersService.getAll();
    }

    @PostMapping("save")
    public void save(User user){
        this.usersService.add(user);
    }

    @PutMapping("update")
    public void update(User user){
        this.usersService.update(user);
    }
    @DeleteMapping("delete")
    public void delete(int id){
        this.usersService.delete(id);
    }


}
