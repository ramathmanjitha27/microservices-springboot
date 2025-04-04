package com.my_projects.microservices_springboot.service;

import com.my_projects.microservices_springboot.dto.UserDTO;
import com.my_projects.microservices_springboot.repo.UserRepo;
import com.my_projects.microservices_springboot.model.User;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class UserService {
    @Autowired
    private UserRepo userRepo;

    @Autowired
    private ModelMapper modelMapper;

    public List<UserDTO> getAllUsers() {
        List<User> users = userRepo.findAll();
        return modelMapper.map(users, new TypeToken<List<UserDTO>>(){}.getType());
    }

    public UserDTO addUser(UserDTO userDTO) {
        User user = modelMapper.map(userDTO, User.class);
        user = userRepo.save(user);
        return modelMapper.map(user, UserDTO.class);
    }

    public UserDTO updateUser(UserDTO userDto){
        User user = modelMapper.map(userDto, User.class);
        user = userRepo.save(user);
        return modelMapper.map(user, UserDTO.class);
    }

    public String deleteUser(Integer id) {
        userRepo.deleteById(id);
        return "User with id: " + id + " deleted";
    }
}
