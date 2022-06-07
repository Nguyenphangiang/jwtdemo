package com.example.demologin.service;

import com.example.demologin.model.AppRole;
import com.example.demologin.repo.IRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AppRoleService implements IAppRoleService {
    @Autowired
    private IRoleRepository roleRepository;

    @Override
    public Iterable<AppRole> findAll() {
        return roleRepository.findAll();
    }

    @Override
    public Optional<AppRole> findById(Long id) {
        return roleRepository.findById(id);
    }

    @Override
    public AppRole save(AppRole appRole) {
        return roleRepository.save(appRole);
    }

    @Override
    public void remove(Long id) {
        roleRepository.deleteById(id);
    }
}
