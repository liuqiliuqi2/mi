package com.liuqi.mi.dao;

import com.liuqi.mi.entity.Receivaddress;

import java.util.List;

public interface ReceivaddressDao {

    List<Receivaddress> getReceivaddressByMember_id(int member_id);

    int InsertReceivaddress(Receivaddress receivaddress);

    int UpdateReceivaddress(Receivaddress receivaddress);

}
