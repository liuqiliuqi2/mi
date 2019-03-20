package com.liuqi.mi.service;

import com.liuqi.mi.entity.Versioncolorrelation;

import java.util.List;

public interface VersioncolorrelationService {

    List<Versioncolorrelation> getColorNameByVersionId(int versionId);

    List<Versioncolorrelation> getPictureSrcByVersionIdAndColorId(int versionId, int colorId);

}
