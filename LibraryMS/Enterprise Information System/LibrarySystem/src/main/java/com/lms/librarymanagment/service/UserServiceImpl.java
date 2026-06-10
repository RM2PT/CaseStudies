package com.lms.librarymanagment.service;

import com.lms.librarymanagment.domain.UsersDomain;
import com.lms.librarymanagment.repository.UsersRepository;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.lang.model.element.ModuleElement;
import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UsersRepository usersRepository;



    @Override
    public List<UsersDomain> getUsers() {
        return usersRepository.findAll();
        }
   @Override
   public UsersDomain saveUsers(UsersDomain usersDomain){
        return usersRepository.save(usersDomain);
   }
   @Override
    public UsersDomain getSingleUser(Long id) {
       Optional<UsersDomain> usersDomain = usersRepository.findById(id);
       if (usersDomain.isPresent()){
           return usersRepository.getReferenceById(id);
       }
       throw new RuntimeException("user not found");

   }
   @Override
    public void deleteUser(Long id){
        usersRepository.deleteById(id);

//        Optional <UsersDomain> usersDomain = usersRepository.findById(id);
//        if (usersDomain.isPresent()) {
//            usersRepository.deleteById(id);
//        }
//        throw new RuntimeException("user not found");
   }

    @Override
    public UsersDomain updateUsers(UsersDomain usersDomain) {
        return usersRepository.save(usersDomain);
    }
}
