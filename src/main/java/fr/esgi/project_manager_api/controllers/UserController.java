package fr.esgi.project_manager_api.controllers;

import fr.esgi.project_manager_api.models.User;
import fr.esgi.project_manager_api.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
@AllArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping
    public User create(@RequestBody User newUser){
        return userService.create(newUser);
    }

    @GetMapping("/all")
    public List<User> getAll(){
        return userService.readAll();
    }

}
