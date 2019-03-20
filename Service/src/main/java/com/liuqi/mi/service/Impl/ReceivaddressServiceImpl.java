package com.liuqi.mi.service.Impl;

import com.liuqi.mi.dao.ReceivaddressDao;
import com.liuqi.mi.entity.Receivaddress;
import com.liuqi.mi.service.ReceivaddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReceivaddressServiceImpl implements ReceivaddressService {

    @Autowired
    ReceivaddressDao receivaddressDao;

    public List<Receivaddress> getReceivaddressByMember_id(int member_id) {
        return receivaddressDao.getReceivaddressByMember_id(member_id);
    }

    public int InsertReceivaddress(Receivaddress receivaddress) {
        return receivaddressDao.InsertReceivaddress(receivaddress);
    }

    public int UpdateReceivaddress(Receivaddress receivaddress) {
        return receivaddressDao.UpdateReceivaddress(receivaddress);
    }
}
