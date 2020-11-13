package com.example.gameshow.Model;

public class Custom {
    private int idCustom; // id custom
    private int idGame; // id Game được chơi.
    private int idQuestion; // id câu hỏi được sử dung

    public Custom() {
    }

    public Custom(int idCustom, int idGame, int idQuestion) {
        this.idCustom = idCustom;
        this.idGame = idGame;
        this.idQuestion = idQuestion;
    }

    public int getIdCustom() {
        return idCustom;
    }

    public void setIdCustom(int idCustom) {
        this.idCustom = idCustom;
    }

    public int getIdGame() {
        return idGame;
    }

    public void setIdGame(int idGame) {
        this.idGame = idGame;
    }

    public int getIdQuestion() {
        return idQuestion;
    }

    public void setIdQuestion(int idQuestion) {
        this.idQuestion = idQuestion;
    }
}
