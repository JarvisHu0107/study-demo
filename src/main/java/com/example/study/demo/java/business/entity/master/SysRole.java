package com.example.study.demo.java.business.entity.master;

import lombok.Data;

import java.util.Date;

/**
 * @author admin
 * @version 1.0
 * @date 2020/6/4 16:38
 */
@Data
public class SysRole {
    private Integer roleId;
    private String roleName;
    private String roleKey;
    private Integer roleSort;
    private String dataScope;
    private String status;
    private String delFlag;

    private String createBy;
    private Date createTime;
    private String updateBy;
    private Date updateTime;
    private String remark;


}
