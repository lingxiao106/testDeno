package com.test.demo.dao;

import com.test.demo.pojo.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserInfoRepository extends JpaRepository<UserInfo, Integer> {

    UserInfo findByUsername(String username);
}
