package com.liuqi.mi.dao;

import com.liuqi.mi.entity.Admin;

public interface AdminDao {

    Admin AdminByAdmin_name(String admin_name);

    int InsertAdmin(Admin admin);
}
