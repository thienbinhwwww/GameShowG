package com.example.gameshow.Model;

public class Team {
    private int idTeam; // ID đội
    private String teamName; // Tên đội;
    private int maxNumberOfMember; // Số thành viên tối đa của đội (Không được lớn hơn quy định của game).
    private int numberOfMember; // Số thanh viên đang có trong team.
    private int point; // Số điểm của đội;
    private String password; // Mật khẩu của đội (ở chế độ private).

    public Team() {
    }

    public Team(int idTeam, String teamName, int maxNumberOfMember, int numberOfMember, int point,String password) {
        this.idTeam = idTeam;
        this.teamName = teamName;
        this.maxNumberOfMember = maxNumberOfMember;
        this.numberOfMember = numberOfMember;
        this.point = point;
        this.password = password;
    }

    public int getIdTeam() {
        return idTeam;
    }

    public void setIdTeam(int idTeam) {
        this.idTeam = idTeam;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public int getMaxNumberOfMember() {
        return maxNumberOfMember;
    }

    public void setMaxNumberOfMember(int maxNumberOfMember) {
        this.maxNumberOfMember = maxNumberOfMember;
    }

    public int getNumberOfMember() {
        return numberOfMember;
    }

    public void setNumberOfMember(int numberOfMember) {
        this.numberOfMember = numberOfMember;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
