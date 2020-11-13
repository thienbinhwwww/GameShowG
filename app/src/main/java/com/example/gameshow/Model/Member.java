package com.example.gameshow.Model;

public class Member {
    private int idMember;
    private String useName; // userName người dùng.
    private String status; // trạng thái, chức vụ của người dùng.

    public Member() {
    }

    public Member(int idMember, String useName, String status) {
        this.idMember = idMember;
        this.useName = useName;
        this.status = status;
    }

    public int getIdMember() {
        return idMember;
    }

    public void setIdMember(int idMember) {
        this.idMember = idMember;
    }

    public String getUseName() {
        return useName;
    }

    public void setUseName(String useName) {
        this.useName = useName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
