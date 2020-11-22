package com.example.gameshow.SQLite;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.gameshow.Model.Member;

import java.util.ArrayList;
import java.util.List;

public class MemberDAO {
    private Sqlite sqlite;

    public MemberDAO(Sqlite sqlite) {
        this.sqlite = sqlite;
    }
    public List<Member> getAll(){
        List<Member> memberList = new ArrayList<>();
        String get_all = "select * from member";
        SQLiteDatabase db = sqlite.getReadableDatabase();
        Cursor cursor = db.rawQuery(get_all,null);
        cursor.moveToFirst();
        while (!cursor.isAfterLast()){
            int idMember;
            String useName, status;
            idMember = cursor.getInt(cursor.getColumnIndex("idMember"));
            useName = cursor.getString(cursor.getColumnIndex("useName"));
            status = cursor.getString(cursor.getColumnIndex("status"));
            Member member = new Member(idMember,useName,status);
            memberList.add(member);
            cursor.moveToNext();
        }
        cursor.close();
        return memberList;
    }
}
