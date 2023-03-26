package com.nico.ecommerce.service.user;

import com.nico.ecommerce.domain.user.User;
import com.nico.ecommerce.dto.UserDTO;
import com.nico.ecommerce.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    PasswordEncoder passwordEncoder;

    @Override
    public List<UserDTO> getAll() {
        List<UserDTO> userDTOList = new ArrayList<>();
        Iterable<User> userIterable = userRepository.findAll();

        Iterator<User> iterator = userIterable.iterator();
        while (iterator.hasNext()) {
            User it = iterator.next();
            userDTOList.add(new UserDTO(it.getFirstName(), it.getLastName(), it.getPoste(), it.getProfil()));
        }

        return userDTOList;
    }

    @Override
    public void postUser(UserDTO userDTO) {
        userRepository.save(getUserFromUserDTO(userDTO));
    }

    private User getUserFromUserDTO(UserDTO userDTO) {
        return new User(getUsernameFromDTO(userDTO), userDTO.getFirstName(), userDTO.getLastName(), passwordEncoder.encode(userDTO.getPassword()), userDTO.getRoles(), userDTO.getPoste(), userDTO.getProfil());
    }

    private String getUsernameFromDTO(UserDTO userDTO) {
        return userDTO.getFirstName() + " " + userDTO.getLastName();
    }
}
