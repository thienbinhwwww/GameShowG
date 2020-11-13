package com.example.gameshow.Model;

public class QuestionDetail {
    private int idQuestionDetail;
    private int idQuestion; // id câu hỏi.

    public QuestionDetail() {
    }

    public QuestionDetail(int idQuestionDetail, int idQuestion) {
        this.idQuestionDetail = idQuestionDetail;
        this.idQuestion = idQuestion;
    }

    public int getIdQuestionDetail() {
        return idQuestionDetail;
    }

    public void setIdQuestionDetail(int idQuestionDetail) {
        this.idQuestionDetail = idQuestionDetail;
    }

    public int getIdQuestion() {
        return idQuestion;
    }

    public void setIdQuestion(int idQuestion) {
        this.idQuestion = idQuestion;
    }
}
