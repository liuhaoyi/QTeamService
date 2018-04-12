package com.qt.qteam.group.web;

import com.qt.qteam.group.entity.GroupEntity;
import com.qt.qteam.group.entity.GroupMemberEntity;
import com.qt.qteam.group.mapper.GroupMapper;
import com.qt.qteam.group.mapper.GroupMemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GroupController {
    @Autowired
    private GroupMapper groupMapper;
    @Autowired
    private GroupMemberMapper groupMemberMapper;

    @RequestMapping("/getGroupByUserName")
    public List<GroupEntity> getGroupByUserName(String userName){
        return  groupMapper.getGroupByUserName(userName);
    }
    @RequestMapping("/getGroupMemberByGroupId")
    public List<GroupMemberEntity> getGroupMemberByGroupId(String groupId){
        return groupMemberMapper.getGroupMemberByGroupId(groupId);
    }
}
