package by.rodevich.touragency.controllers;

import by.rodevich.touragency.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/resource")
    public Map<String, Object> home() {
        return userService.create();
    }
}
