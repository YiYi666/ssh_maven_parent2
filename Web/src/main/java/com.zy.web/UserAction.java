package com.zy.web;

import com.opensymphony.xwork2.ActionSupport;
import com.zy.entity.User;
import com.zy.service.UserService;

public class UserAction extends ActionSupport {
    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @Override
    public String execute() throws Exception {
        User user = new User();
        user.setUserName("123");
        userService.saveUser(user);
        return super.execute();
    }
}
