package com.liuqi.mi.service.Impl;

import com.liuqi.mi.common.phoneVerCode.SendMessage;
import com.liuqi.mi.dao.MemberDao;
import com.liuqi.mi.entity.Member;
import com.liuqi.mi.entity.Product;
import com.liuqi.mi.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    MemberDao memberDao;

    public List<Member> getAllMember(Member member) {
        return memberDao.getAllMember(member);
    }

    public Member getMemberByMember_id(int member_id) {
        return memberDao.getMemberByMember_id(member_id);
    }

    public Member getMember_id() {
        return memberDao.getMember_id();
    }

    public int getMemberCount(Member member) {
        return memberDao.getMemberCount(member);
    }

    public int InsertMember(Member member) {
        return memberDao.InsertMember(member);
    }

    public int UpdateMember(Member member) {
        return memberDao.UpdateMember(member);
    }

    public int member_del(int member_id) {
        return memberDao.member_del(member_id);
    }

    public int member_Moredel(List<Integer> member_ids) {
        if(member_ids==null||member_ids.size()<=0) {
            return 0;
        }
        return memberDao.member_Moredel(member_ids);
    }

    public int UpdateMember_state(int member_id, String member_state) {
        return memberDao.UpdateMember_state(member_id,member_state);
    }

    public int Reset_password(int member_id) {
        return memberDao.Reset_password(member_id);
    }

}
