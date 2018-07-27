package com.test.demo.controller.redis;

import java.util.List;

import javax.annotation.Resource;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.test.demo.pojo.UserInfo;
import com.test.demo.serivce.UserInfoService;

@Controller
@RequestMapping("/userInfo")
public class UserInfoController {

    @Resource
    UserInfoService userInfoService;
    /**
     * 用户查询.
     * @return
     */
    @RequestMapping("/userList")
    @RequiresPermissions("userInfo:view")//权限管理;
    @ResponseBody
    public List<UserInfo> userInfo(){
        return userInfoService.getUserInfo();
    }
    
    @RequestMapping("/getUser")
    @Cacheable(value="user-key")
    @ResponseBody
    public UserInfo getUserInfo(String username) {
    	System.out.println("若下面没出现“无缓存的时候调用”字样且能打印出数据表示测试成功");  
    	return userInfoService.findByUsername(username);
    }

    /**
     * 用户添加;
     * @return
     */
    @RequestMapping("/userAdd")
    @RequiresPermissions("userInfo:add")//权限管理;
    public String userInfoAdd(){
        return "userInfoAdd";
    }

    /**
     * 用户删除;
     * @return
     */
    @RequestMapping("/userDel")
    @RequiresPermissions("userInfo:del")//权限管理;
    public String userDel(){
		return "userInfoDel";
	}
}