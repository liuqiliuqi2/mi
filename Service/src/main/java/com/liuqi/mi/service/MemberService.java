package com.liuqi.mi.service;

import com.liuqi.mi.entity.Member;

import java.util.List;

public interface MemberService {

    List<Member> getAllMember(Member member);

    Member getMemberByMember_id(int member_id);

    Member getMember_id();

    int getMemberCount(Member member);

    int InsertMember(Member member);

    int UpdateMember(Member member);

    int member_del(int member_id);

    int member_Moredel(List<Integer> member_ids);

    int UpdateMember_state(int member_id, String member_state);

    int Reset_password(int member_id);

}
