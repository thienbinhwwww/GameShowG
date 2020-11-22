package com.example.gameshow.SQLite;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.gameshow.Model.Team;

import java.util.ArrayList;
import java.util.List;

public class TeamDAO {
    private Sqlite sqlite;

    public TeamDAO(Sqlite sqlite) {
        this.sqlite = sqlite;
    }
    public List<Team> getAll(){
        List<Team> teamList = new ArrayList<>();
        String get_all = "select * from team";
        SQLiteDatabase db = sqlite.getReadableDatabase();
        Cursor cursor = db.rawQuery(get_all,null);
        cursor.moveToFirst();
        while (!cursor.isAfterLast()){
            int idTeam,maxNumberOfMember, numberOfMember, point;
            String teamName,password;
            idTeam = cursor.getInt(cursor.getColumnIndex("idTeam"));
            maxNumberOfMember = cursor.getInt(cursor.getColumnIndex("maxNumberOfMember"));
            numberOfMember = cursor.getInt(cursor.getColumnIndex("numberOfMember"));
            point = cursor.getInt(cursor.getColumnIndex("point"));
            teamName = cursor.getString(cursor.getColumnIndex("teamName"));
            password = cursor.getString(cursor.getColumnIndex("password"));
            Team team = new Team(idTeam,teamName,maxNumberOfMember,numberOfMember,point,password);
            teamList.add(team);
            cursor.moveToNext();
        }
        cursor.close();
        return teamList;
    }
}
