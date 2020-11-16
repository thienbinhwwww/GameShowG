package com.example.gameshow.SQLite;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class Sqlite extends SQLiteOpenHelper {

    public Sqlite(@Nullable Context context) {
        super(context, "data.db", null, 1);
    }

    public void QueryData(String sql){
        SQLiteDatabase database = getWritableDatabase();
        database.execSQL(sql);
    }
    public Cursor GetData(String sql){
        SQLiteDatabase database = getReadableDatabase();
        return database.rawQuery(sql,null);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        String Custom ="CREATE TABLE custom (" +
                "idCustom INTEGER NOT NULL," +
                "idGame INTEGER," +
                "idQuestion INTEGER,"+
                "PRIMARY KEY(idCustom)," +
                "FOREIGN KEY(idGame) REFERENCES game(idGame)," +
                "FOREIGN KEY(idQuestion) REFERENCES question(idQuestion))";
        db.execSQL(Custom);

        String Game ="CREATE TABLE game (" +
                "idGame INTEGER NOT NULL," +
                "gameName TEXT," +
                "time TEXT," +
                "maxNumberOfTeam INTEGER," +
                "numberOfTame INTEGER," +
                "numberOfQuestion INTEGER," +
                "maxNumberOfMenberTeam INTEGER," +
                "userNameAmin TEXT," +
                "FOREIGN KEY(userNameAmin) REFERENCES user(userName)," +
                "PRIMARY KEY(idGame)" +
                ")";
                db.execSQL(Game);

        String Member = "CREATE TABLE member ("+
                "idMember INTEGER NOT NULL,"+
                "useName TEXT,"+
                "status TEXT,"+
                "FOREIGN KEY(useName) REFERENCES user(userName),"+
                "PRIMARY KEY(idMember))";
        db.execSQL(Member);

        String Question ="CREATE TABLE question ("+
                "idQuestion	INTEGER NOT NULL,"+
                "question	TEXT,"+
                "answer TEXT,"+
                "PRIMARY KEY(idQuestion))";
            db.execSQL(Question);

        String QuestionDeltai =  "CREATE TABLE questionDetail ("+
                "idQuestionDetail INTEGER NOT NULL,"+
                "idQuestion	INTEGER,"+
                "PRIMARY KEY(idQuestionDetail),"+
                "FOREIGN KEY(idQuestion) REFERENCES question(idQuestion))";
        db.execSQL(QuestionDeltai);
        String Suggestions = "CREATE TABLE suggestions ("+
                "idSuggestions	INTEGER NOT NULL,"+
                "suggestions	INTEGER,"+
                "idQuestionDetail	INTEGER,"+
                "FOREIGN KEY(idQuestionDetail) REFERENCES questionDetail(idQuestionDetail),"+
                "PRIMARY KEY(idSuggestions))";
                db.execSQL(Suggestions);
        String Team = "CREATE TABLE team ("+
                "idTeam	INTEGER NOT NULL,"+
                "teamName	TEXT,"+
                "maxNumberOfMenber	INTEGER,"+
                "NumberOfMenber	INTEGER,"+
                "point	INTEGER,"+
                "PRIMARY KEY(idTeam))";
        db.execSQL(Team);

        String User = "CREATE TABLE user ("+
                "userName	TEXT NOT NULL,"+
                "email	TEXT,"+
                "phoneNumber	TEXT,"+
                "password	TEXT,"+
                "longitude	BLOB,"+
                "latitude	BLOB,"+
                "fullName	TEXT,"+
                "PRIMARY KEY(userName))";
                db.execSQL(User);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
