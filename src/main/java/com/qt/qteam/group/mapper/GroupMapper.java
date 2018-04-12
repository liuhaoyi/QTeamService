package com.qt.qteam.group.mapper;

import com.qt.qteam.group.entity.GroupEntity;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface GroupMapper {

    @Select("SELECT * FROM user_group WHERE userName = #{userName}")
    @Results({
    })
    List<GroupEntity> getGroupByUserName(String userName);
}
