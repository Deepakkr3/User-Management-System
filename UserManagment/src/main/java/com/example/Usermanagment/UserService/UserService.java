package com.example.Usermanagment.UserService;

import com.example.Usermanagment.UserModel.UserModel;
import com.example.Usermanagment.UserRepo.IUserRepo;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
@Service
public class UserService {
    @Autowired
    IUserRepo userRepo;

    public String postAddUser(UserModel newValue) {
        userRepo.save(newValue);
        return "added values through UserModel";

    }

    public String addUsers(List<UserModel> newUser) {
        userRepo.saveAll(newUser);
        return "added User";

    }

    public List<UserModel> getUsers() {

        return (List<UserModel>) userRepo.findAll();
    }

    public UserModel getRoomById(Integer id) {
        return userRepo.findById(id).get();
    }

    public String update(Integer id,  Long myNumber) {
        UserModel UserUpdate = userRepo.findById(id).orElse(null);
        if (UserUpdate != null) {
            UserUpdate.setPhoneNumber(myNumber);
            userRepo.save(UserUpdate);
            return "User updated successfully";
        }
        return "not found";
    }
    public String removeUserByIds (List < Integer > ids) {
        userRepo.deleteAllById(ids);
            return "User remove by id ";
        }
}





