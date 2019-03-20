package com.liuqi.mi.service;

import com.liuqi.mi.entity.Receivaddress;

import java.util.List;

public interface ReceivaddressService {

    List<Receivaddress> getReceivaddressByMember_id(int member_id);

    int InsertReceivaddress(Receivaddress receivaddress);

    int UpdateReceivaddress(Receivaddress receivaddress);
}
