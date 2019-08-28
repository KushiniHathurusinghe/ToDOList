package com.example.todolist;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class dbHelper extends SQLiteOpenHelper {


    public dbHelper(Context context) {
        super(context, db.DB_NAME, null , db.DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        String createTable = "CREATE TABLE " + db.TaskEntry.TABLE + " ( " +
                db.TaskEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                db.TaskEntry.COL_TASK_TITLE + " TEXT NOT NULL);";

        sqLiteDatabase.execSQL(createTable);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + db.TaskEntry.TABLE);
        onCreate(sqLiteDatabase);
    }
}
