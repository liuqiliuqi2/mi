package com.liuqi.mi.service.Impl;

import com.liuqi.mi.dao.VersioncolorrelationDao;
import com.liuqi.mi.entity.Versioncolorrelation;
import com.liuqi.mi.service.VersioncolorrelationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VersioncolorrelationServiceImpl implements VersioncolorrelationService {

    @Autowired
    VersioncolorrelationDao versioncolorrelationDao;

    public List<Versioncolorrelation> getColorNameByVersionId(int versionId) {
        return versioncolorrelationDao.getColorNameByVersionId(versionId);
    }

    public List<Versioncolorrelation> getPictureSrcByVersionIdAndColorId(int versionId, int colorId) {
        return versioncolorrelationDao.getPictureSrcByVersionIdAndColorId(versionId, colorId);
    }
}
