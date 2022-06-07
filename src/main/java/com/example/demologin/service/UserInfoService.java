package com.example.demologin.service;

import com.example.demologin.model.UserInfo;
import com.example.demologin.repo.IUserInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class UserInfoService implements IUserInfoService{
    @Autowired
    private IUserInfoRepository userInfoRepository;

    @Override
    public Iterable<UserInfo> findAll() {
        return userInfoRepository.findAll();
    }

    @Override
    public Optional<UserInfo> findById(Long id) {
        return userInfoRepository.findById(id);
    }

    @Override
    public UserInfo save(UserInfo userInfo) {
        return userInfoRepository.save(userInfo);
    }

    @Override
    public void remove(Long id) {
        userInfoRepository.deleteById(id);
    }
}
