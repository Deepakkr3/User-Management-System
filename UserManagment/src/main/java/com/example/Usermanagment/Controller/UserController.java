package com.example.Usermanagment.Controller;

import com.example.Usermanagment.UserModel.UserModel;
import com.example.Usermanagment.UserService.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;
    @PostMapping("user")
    public String postAddUser(@RequestBody @Valid UserModel newValue){
        return  userService.postAddUser(newValue);

    }
    @PostMapping("users")
    public String addUsers(@RequestBody @Valid List<UserModel> newUser)
    {
        return userService.addUsers(newUser);
    }
    @GetMapping("getUsers")
    public List<UserModel> getUsers()
    {
        return userService.getUsers();
    }
    @GetMapping("userid/id/{id}")
    public  UserModel getRoomById(@PathVariable Integer id)
    {
        return userService.getRoomById(id);
    }

    @PutMapping("update/id/{id}")
     public String update(@PathVariable  Integer id, @RequestParam  Long myNumber){
            return userService.update(id,myNumber);
    }


    @DeleteMapping("users/ids")
    public String removeUserByIds(@RequestBody List<Integer> ids)
    {
        return userService.removeUserByIds(ids);
    }

}
