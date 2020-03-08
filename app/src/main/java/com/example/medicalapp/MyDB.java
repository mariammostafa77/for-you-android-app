package com.example.medicalapp;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class MyDB extends SQLiteOpenHelper {

    Context c;
    public static String DBNAME="mydb";
    public static int VERSION=1;
    public MyDB(@Nullable Context context) {
        super(context, DBNAME, null, VERSION);
        c=context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        try{
            String qry="create table User(email TEXT PRIMARY KEY,username TEXT,password TEXT)";
            db.execSQL(qry);
            Toast.makeText(c, "Table created successfully", Toast.LENGTH_SHORT).show();
        }catch (Exception e){
            Log.e("MyDB","Creation Error",e);
        }

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
    public boolean insert(String username,String email,String password){
        try {
            String qry="insert into User values('"+email+"','"+username+"','"+password+"')";
            SQLiteDatabase db=getWritableDatabase();
            db.execSQL(qry);
            Toast.makeText(c, "Table Inserted successfully", Toast.LENGTH_SHORT).show();
            return true;
        }catch (Exception e) {
            Log.e("MyDB","Insertion Error",e);
            return  false;
        }

    }
    public Cursor userLoginCheck(String email,String password){
        try{
            String qry="Select username, password from User where email='"+email+"' ";
            SQLiteDatabase db=getWritableDatabase();
            Cursor c=db.rawQuery(qry,null);
            return c;
        }catch (Exception e){
            Log.e("MyDB","LogIn Error",e);
            return null;
        }
    }
}
