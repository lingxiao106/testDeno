package com.test.demo.serivce;

import com.test.demo.pojo.UserInfo;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserInfoService {

    UserInfo findByUsername(String username);

    List<UserInfo> getUserInfo();
}
