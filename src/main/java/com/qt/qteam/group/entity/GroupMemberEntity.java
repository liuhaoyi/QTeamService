package com.qt.qteam.group.entity;

import java.util.Objects;

public class GroupMemberEntity implements java.io.Serializable{
    private String groupId;
    private String jid;
    private String role;

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getJid() {
        return jid;
    }

    public void setJid(String jid) {
        this.jid = jid;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GroupMemberEntity that = (GroupMemberEntity) o;
        return Objects.equals(groupId, that.groupId) &&
                Objects.equals(jid, that.jid) &&
                Objects.equals(role, that.role);
    }

    @Override
    public int hashCode() {

        return Objects.hash(groupId, jid, role);
    }
}
