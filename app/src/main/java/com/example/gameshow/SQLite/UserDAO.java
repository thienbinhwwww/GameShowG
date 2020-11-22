package com.example.gameshow.SQLite;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.gameshow.Model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDAO {
    private Sqlite sqlite;

    public UserDAO(Sqlite sqlite) {
        this.sqlite = sqlite;
    }
    public List<User> getAll(){
        List<User> userList = new ArrayList<>();
        String get_all = "select * from user";
        SQLiteDatabase database = sqlite.getReadableDatabase();
        Cursor cursor = database.rawQuery(get_all,null);
        cursor.moveToFirst();
        while (!cursor.isAfterLast()){
            String userName,email,phoneNumber, password;
            double longitude, latitude;
            String fullName;
            userName = cursor.getString(cursor.getColumnIndex("userName"));
            email = cursor.getString(cursor.getColumnIndex("email"));
            phoneNumber = cursor.getString(cursor.getColumnIndex("phoneNumber"));
            password = cursor.getString(cursor.getColumnIndex("password"));
            longitude = cursor.getDouble(cursor.getColumnIndex("password"));
            latitude = cursor.getDouble(cursor.getColumnIndex("latitude"));
            fullName = cursor.getString(cursor.getColumnIndex("fullName"));
            User user = new User(userName,email,phoneNumber,password,longitude,latitude,fullName);
            userList.add(user);
            cursor.moveToNext();
        }
        cursor.close();
        return userList;
    }
}
