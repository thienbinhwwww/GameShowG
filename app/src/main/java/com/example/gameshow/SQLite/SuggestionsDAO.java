package com.example.gameshow.SQLite;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.gameshow.Model.Suggestions;

import java.util.ArrayList;
import java.util.List;

public class SuggestionsDAO {
    private Sqlite sqlite;

    public SuggestionsDAO(Sqlite sqlite) {
        this.sqlite = sqlite;
    }
    public List<Suggestions> getAll(){
        List<Suggestions> suggestionsList = new ArrayList<>();
        String get_all = "select * from suggestions";
        SQLiteDatabase db = sqlite.getReadableDatabase();
        Cursor cursor = db.rawQuery(get_all,null);
        cursor.moveToFirst();
        while (!cursor.isAfterLast()){
            int idSuggestions, suggestions;
            idSuggestions = cursor.getInt(cursor.getColumnIndex("idSuggestions"));
            suggestions = cursor.getInt(cursor.getColumnIndex("suggestions"));
            Suggestions suggestions1 = new Suggestions(idSuggestions,suggestions);
            suggestionsList.add(suggestions1);
            cursor.moveToNext();
        }
        cursor.close();
        return suggestionsList;
    }
}
