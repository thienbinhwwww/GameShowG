package com.example.gameshow.SQLite;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.gameshow.Model.Custom;

import java.util.ArrayList;
import java.util.List;

public class CustomDAO {
    private Sqlite sqlite;

    public CustomDAO(Sqlite sqlite) {
        this.sqlite = sqlite;
    }
    public List<Custom> getAll(){
        List<Custom> customList = new ArrayList<>();
        String get_all = "select * from custom";
        SQLiteDatabase db = sqlite.getReadableDatabase();
        Cursor cursor  = db.rawQuery(get_all,null);
        cursor.moveToFirst();
        while (!cursor.isAfterLast()){
            int idCustom, idGame, idQuestion;
            idCustom = cursor.getInt(cursor.getColumnIndex("idCustom"));
            idGame = cursor.getInt(cursor.getColumnIndex("idGame"));
            idQuestion = cursor.getInt(cursor.getColumnIndex("idGame"));
            Custom custom = new Custom(idCustom,idGame,idQuestion);
            customList.add(custom);
            cursor.moveToNext();
        }
        cursor.close();
        return customList;
    }
}
