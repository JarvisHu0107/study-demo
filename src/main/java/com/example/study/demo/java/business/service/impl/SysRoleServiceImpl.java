package com.example.study.demo.java.business.service.impl;

import com.example.study.demo.java.business.mapper.master.SysRoleMapper;
import com.example.study.demo.java.business.service.SysRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/** master
 * @author admin
 * @version 1.0
 * @date 2020/6/4 16:47
 */
@Service
public class SysRoleServiceImpl implements SysRoleService {
    @Autowired
    private SysRoleMapper sysRoleMapper;

    /**
     * @Transactional  如果方法需要事务   不加value使用primary
     */
    @Override
    public int countSysRole() {
        return sysRoleMapper.countSysRole();
    }
}
