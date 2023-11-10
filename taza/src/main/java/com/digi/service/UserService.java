package com.digi.service;

import com.digi.dto.requesdto.UserDTO;
import com.digi.model.UserEntity;
;
public interface UserService {
    UserEntity creatUser(UserDTO userDTO);

}
