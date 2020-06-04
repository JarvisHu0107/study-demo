package com.example.study.demo.java.business.controller;

import com.example.study.demo.java.business.service.SysRoleService;
import com.example.study.demo.java.business.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/** 多数据源 -- 测试用例
 * @author admin
 * @version 1.0
 * @date 2020/6/4 16:34
 */
@RestController
public class MultiDataSourceControllerTest {
    @Autowired
    private SysRoleService sysRoleService;
    @Autowired
    private UserService userService;

    @GetMapping("/slaveCountUser")
    public int countUser() {
        return userService.countUser();
    }


    @GetMapping("/masterCountSysRole")
    public int countSysRole() {
        return sysRoleService.countSysRole();
    }
}
