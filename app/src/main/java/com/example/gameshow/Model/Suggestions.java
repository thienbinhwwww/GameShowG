package com.example.gameshow.Model;

public class Suggestions {
    private int idSuggestions;
    private int suggestions;

    public Suggestions() {
    }

    public Suggestions(int idSuggestions, int suggestions) {
        this.idSuggestions = idSuggestions;
        this.suggestions = suggestions;
    }

    public int getIdSuggestions() {
        return idSuggestions;
    }

    public void setIdSuggestions(int idSuggestions) {
        this.idSuggestions = idSuggestions;
    }

    public int getSuggestions() {
        return suggestions;
    }

    public void setSuggestions(int suggestions) {
        this.suggestions = suggestions;
    }
}
