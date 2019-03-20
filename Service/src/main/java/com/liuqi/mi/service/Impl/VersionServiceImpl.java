package com.liuqi.mi.service.Impl;

import com.liuqi.mi.dao.VersionDao;
import com.liuqi.mi.entity.Version;
import com.liuqi.mi.service.VersionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VersionServiceImpl implements VersionService {

    @Autowired
    VersionDao versionDao;

    public List<Version> VersionBypid(int pid) {
        return versionDao.VersionBypid(pid);
    }
}
