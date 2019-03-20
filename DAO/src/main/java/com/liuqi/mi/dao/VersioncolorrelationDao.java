package com.liuqi.mi.dao;

import com.liuqi.mi.entity.Versioncolorrelation;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface VersioncolorrelationDao {

    List<Versioncolorrelation> getColorNameByVersionId(int versionId);

    List<Versioncolorrelation> getPictureSrcByVersionIdAndColorId(@Param("versionId") int versionId, @Param("colorId") int colorId);
}
