package com.digi.service.impl;
import com.digi.dto.requesdto.UserDTO;
import com.digi.model.UserEntity;
import com.digi.service.UserService;
import com.digi.validator.UserValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private PasswordEncoder passwordEncoder;
    @Override
    public UserEntity creatUser(UserDTO userDTO) {
        UserValidator.passwordValidator(userDTO.getPassword());
        UserValidator.yearValidator(userDTO.getYear());
        //chprcac yearValidator-@

        UserEntity userEntity = new UserEntity();
        userEntity.setId(0);
        userEntity.setName(userDTO.getName());
        userEntity.setSurname(userDTO.getSurname());
        userEntity.setYear(userDTO.getYear());
        userEntity.setEmail(userDTO.getEmail());
        userEntity.setPassword(passwordEncoder.encode(userDTO.getPassword()));
        return null;
    }
}
