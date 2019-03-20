package com.liuqi.mi.dao;

import com.liuqi.mi.entity.Price;
import org.apache.ibatis.annotations.Param;

public interface PriceDao {

    Price PriceByPriceSpecialOffer(@Param("price") double price, @Param("specialOffer") double specialOffer);

    int InsertPrice(Price price);
}
