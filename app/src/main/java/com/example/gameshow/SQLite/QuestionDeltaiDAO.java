package com.example.gameshow.SQLite;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.gameshow.Model.QuestionDetail;

import java.util.ArrayList;
import java.util.List;

public class QuestionDeltaiDAO {
    private Sqlite sqlite;

    public QuestionDeltaiDAO(Sqlite sqlite) {
        this.sqlite = sqlite;
    }
    public List<QuestionDetail> getAll(){
        List<QuestionDetail> questionDetailList = new ArrayList<>();
        String get_all = "select * from questionDetai";
        SQLiteDatabase db = sqlite.getReadableDatabase();
        Cursor cursor = db.rawQuery(get_all,null);
        cursor.moveToFirst();
        while (!cursor.isAfterLast()){
            int idQuestionDetail, idQuestion;
            idQuestionDetail = cursor.getInt(cursor.getColumnIndex("idQuestionDetail"));
            idQuestion = cursor.getInt(cursor.getColumnIndex("idQuestion"));
            QuestionDetail detail = new QuestionDetail(idQuestionDetail,idQuestion);
            questionDetailList.add(detail);
            cursor.moveToNext();
        }
        cursor.close();
        return questionDetailList;
    }
}
