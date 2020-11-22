package com.example.gameshow.SQLite;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.gameshow.Model.Game;

import java.util.ArrayList;
import java.util.List;

public class GameDAO {
    private Sqlite sqlite;

    public GameDAO(Sqlite sqlite) {
        this.sqlite = sqlite;
    }
    public List<Game> getAll(){
        List<Game> gameList = new ArrayList<>();
        String get_all = "select * from game";
        SQLiteDatabase db = sqlite.getReadableDatabase();
        Cursor cursor = db.rawQuery(get_all,null);
        cursor.moveToFirst();
        while (!cursor.isAfterLast()){
            int idGame;
            String gameName;
            String time;
            int maxNumberOfTeam;
            int numberOfTeam;
            int maxNumberOfMemberTeam;
            int numberOfQuestion;
            String userNameAdmin;
            idGame = cursor.getInt(cursor.getColumnIndex("idGame"));
            gameName = cursor.getString(cursor.getColumnIndex("gameName"));
            time = cursor.getString(cursor.getColumnIndex("time"));
            maxNumberOfTeam = cursor.getInt(cursor.getColumnIndex("maxNumberOfTeam"));
            numberOfTeam = cursor.getInt(cursor.getColumnIndex("numberOfTeam"));
            maxNumberOfMemberTeam = cursor.getInt(cursor.getColumnIndex("maxNumberOfMemberTeam"));
            numberOfQuestion= cursor.getInt(cursor.getColumnIndex("numberOfQuestion"));
            userNameAdmin = cursor.getString(cursor.getColumnIndex("userNameAdmin"));
            Game game = new Game(idGame,gameName,time,maxNumberOfTeam,
                    numberOfTeam,maxNumberOfMemberTeam,numberOfQuestion,userNameAdmin);
            gameList.add(game);
            cursor.moveToNext();
        }
        cursor.close();
        return gameList;
    }
}
