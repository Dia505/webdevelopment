package com.online_cake_order.online_cake_order.controller;

import com.online_cake_order.online_cake_order.dto.UserDto;
import com.online_cake_order.online_cake_order.entity.User;
import com.online_cake_order.online_cake_order.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/user")
// to inject dependency of UserService (lesser lines of code than Autowired annotation)
@RequiredArgsConstructor
public class UserController {
    // to inject dependency of UserService
    private final UserService userService;

    // Code for get data
    @GetMapping("/data")
    public String getData() {
        return "data retrieved";
    }

    // Code for creating data
    @PostMapping("/save")
    // Parameter for the data entered from front end
    public String createData(@RequestBody UserDto userDto) {
        userService.save(userDto);
        return "Created data";
    }

    // Code for get all
    @GetMapping("/getAll")
    public List<User> getAllData() {
        return userService.getAll();
    }

    @GetMapping("/getById/{id}")
    public Optional<User> getById(@PathVariable("id") Integer id) {
        return userService.getById(id);
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable("id") Integer id) {
        userService.deleteById(id);
    }
}
