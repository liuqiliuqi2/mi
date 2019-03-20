package com.liuqi.mi.service;

import com.liuqi.mi.entity.Version;

import java.util.List;

public interface VersionService {

    List<Version> VersionBypid(int pid);
}
