package com.example.gameshow.Model;

public class Game {
    private int idGame; // id game, có thể sử dụng để join game.
    private String gameName; // Tên game.
    private String time; // Thời gian bắt đầu game.
    private int maxNumberOfTeam; // Số đội được phép tham gia tối đa.
    private int numberOfTeam; // Số đội đang tham gia hiện tại;
    private int maxNumberOfMemberTeam; //Số thành viên tối đa của một đội.
    private int numberOfQuestion; // Số lượng câu hỏi tối đa.
    private String userNameAdmin; // useName người tạo game.

    public Game() {
    }

    public Game(int idGame, String gameName, String time, int maxNumberOfTeam, int numberOfTeam, int maxNumberOfMemberTeam, int numberOfQuestion, String userNameAdmin) {
        this.idGame = idGame;
        this.gameName = gameName;
        this.time = time;
        this.maxNumberOfTeam = maxNumberOfTeam;
        this.numberOfTeam = numberOfTeam;
        this.maxNumberOfMemberTeam = maxNumberOfMemberTeam;
        this.numberOfQuestion = numberOfQuestion;
        this.userNameAdmin = userNameAdmin;
    }

    public int getIdGame() {
        return idGame;
    }

    public void setIdGame(int idGame) {
        this.idGame = idGame;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getMaxNumberOfTeam() {
        return maxNumberOfTeam;
    }

    public void setMaxNumberOfTeam(int maxNumberOfTeam) {
        this.maxNumberOfTeam = maxNumberOfTeam;
    }

    public int getNumberOfTeam() {
        return numberOfTeam;
    }

    public void setNumberOfTeam(int numberOfTeam) {
        this.numberOfTeam = numberOfTeam;
    }

    public int getMaxNumberOfMemberTeam() {
        return maxNumberOfMemberTeam;
    }

    public void setMaxNumberOfMemberTeam(int maxNumberOfMemberTeam) {
        this.maxNumberOfMemberTeam = maxNumberOfMemberTeam;
    }

    public int getNumberOfQuestion() {
        return numberOfQuestion;
    }

    public void setNumberOfQuestion(int numberOfQuestion) {
        this.numberOfQuestion = numberOfQuestion;
    }

    public String getUserNameAdmin() {
        return userNameAdmin;
    }

    public void setUserNameAdmin(String userNameAdmin) {
        this.userNameAdmin = userNameAdmin;
    }
}
