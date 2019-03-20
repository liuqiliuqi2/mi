package com.liuqi.mi.dao;

import com.liuqi.mi.entity.Version;

import java.util.List;

public interface VersionDao {

    List<Version> VersionBypid(int pid);
}
