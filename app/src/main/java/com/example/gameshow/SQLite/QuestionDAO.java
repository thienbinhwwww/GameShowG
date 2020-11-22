package com.example.gameshow.SQLite;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.gameshow.Model.Question;

import java.util.ArrayList;
import java.util.List;

public class QuestionDAO {
    private Sqlite sqlite;

    public QuestionDAO(Sqlite sqlite) {
        this.sqlite = sqlite;
    }
    public List<Question> getAll(){
        List<Question> questionList = new ArrayList<>();
        String get_all = "select * from question";
        SQLiteDatabase db = sqlite.getReadableDatabase();
        Cursor cursor = db.rawQuery(get_all,null);
        cursor.moveToFirst();
        while (!cursor.isAfterLast()){
            int idQuestion;
            String question, answer;
            idQuestion = cursor.getInt(cursor.getColumnIndex("idQuestion"));
            question = cursor.getString(cursor.getColumnIndex("question"));
            answer = cursor.getString(cursor.getColumnIndex("answer"));
            Question question1 = new Question(idQuestion,question,answer);
            questionList.add(question1);
            cursor.moveToNext();
        }
        cursor.close();
        return questionList;
    }
}
