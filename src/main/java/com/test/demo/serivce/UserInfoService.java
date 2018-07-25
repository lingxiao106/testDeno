package com.test.demo.serivce;

import com.test.demo.pojo.UserInfo;
import org.springframework.stereotype.Service;


public interface UserInfoService {

    UserInfo findByUsername(String username);
}
