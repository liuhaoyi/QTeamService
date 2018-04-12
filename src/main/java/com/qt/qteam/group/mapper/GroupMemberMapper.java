package com.qt.qteam.group.mapper;

import com.qt.qteam.group.entity.GroupEntity;
import com.qt.qteam.group.entity.GroupMemberEntity;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface GroupMemberMapper {

    @Select("SELECT groupId,jid,role FROM group_member WHERE groupId = #{groupId}")
    @Results({
    })
    List<GroupMemberEntity> getGroupMemberByGroupId(String groupId);
}
