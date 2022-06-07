package com.example.demologin.service;

import com.example.demologin.model.AppUser;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface IAppUserService extends IGeneralService<AppUser>, UserDetailsService {
    AppUser findByUsername(String username);

    Iterable<AppUser> findAll();

    AppUser saveAdmin(AppUser appUser);
}
