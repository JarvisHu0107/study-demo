package com.example.study.demo.java.business.service.impl;

import com.example.study.demo.java.business.mapper.slave.UserMapper;
import com.example.study.demo.java.business.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/** slave
 * @author admin
 * @version 1.0
 * @date 2020/6/4 16:34
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    /**
     * @Transactional(value = "slaveTransactionManager")  如果方法需要事务   指定slave库的对应事务管理器
     */
    @Override
    public int countUser() {
        return userMapper.countUser();
    }
}
