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

        String a ="CREATE TABLE game (" +
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
                db.execSQL(a);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
