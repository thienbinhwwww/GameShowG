package com.example.gameshow.Model;

public class Question {
    private int idQuestion;
    private String question; // Câu hỏi (dạng text, nêu video,ảnh,âm thanh thì là dạng link hoặc url).
    private String answer; // Đáp án.

    public Question() {
    }

    public Question(int idQuestion, String question, String answer) {
        this.idQuestion = idQuestion;
        this.question = question;
        this.answer = answer;
    }

    public int getIdQuestion() {
        return idQuestion;
    }

    public void setIdQuestion(int idQuestion) {
        this.idQuestion = idQuestion;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
