package org.softuni.kaizer.service;

import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

    boolean createUser();
}
