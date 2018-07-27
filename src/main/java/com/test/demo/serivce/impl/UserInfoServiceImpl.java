package com.test.demo.serivce.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.test.demo.dao.UserInfoRepository;
import com.test.demo.pojo.UserInfo;
import com.test.demo.serivce.UserInfoService;

@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Resource
    private UserInfoRepository userInfoRepository;

    @Override
    public UserInfo findByUsername(String username){
        return userInfoRepository.findByUsername(username);
    }

    @Override
    public List<UserInfo> getUserInfo() {
        return userInfoRepository.findAll();
    }

}
