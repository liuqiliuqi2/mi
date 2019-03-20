package com.liuqi.mi.service.Impl;

import com.liuqi.mi.dao.AdminDao;
import com.liuqi.mi.entity.Admin;
import com.liuqi.mi.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    AdminDao adminDao;
    public Admin AdminByAdmin_name(String admin_name) {
        return adminDao.AdminByAdmin_name(admin_name);
    }
}
