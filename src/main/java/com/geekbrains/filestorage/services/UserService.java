package com.geekbrains.filestorage.services;

import com.geekbrains.filestorage.entities.SystemUser;
import com.geekbrains.filestorage.entities.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User findByUserName(String userName);
    boolean save(SystemUser systemUser);
}
