package com.example.Usermanagment.UserRepo;

import com.example.Usermanagment.UserModel.UserModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepo extends CrudRepository<UserModel,Integer> {


}
