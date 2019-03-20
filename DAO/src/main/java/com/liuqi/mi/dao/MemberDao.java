package com.liuqi.mi.dao;

import com.liuqi.mi.entity.Member;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MemberDao {

    List<Member> getAllMember(Member member);

    Member getMemberByMember_id(int member_id);

    Member getMember_id();

    int getMemberCount(Member member);

    int InsertMember(Member member);

    int UpdateMember(Member member);

    int member_del(int member_id);

    int member_Moredel(@Param("member_ids") List<Integer> member_ids);

    int UpdateMember_state(@Param("member_id") int member_id, @Param("member_state") String member_state);

    int Reset_password(int member_id);









}
