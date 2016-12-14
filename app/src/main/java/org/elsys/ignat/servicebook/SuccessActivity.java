package org.elsys.ignat.servicebook;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SuccessActivity extends AppCompatActivity {

    String userName="";
    String passWord="";
    private SQLiteDatabase mydatabase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success);
//        mydatabase = openOrCreateDatabase("service_book",MODE_PRIVATE,null);
//        mydatabase.execSQL("CREATE TABLE IF NOT EXISTS users(username VARCHAR,password VARCHAR);");
//        mydatabase.execSQL("INSERT INTO TutorialsPoint VALUES('ignat437@gmail.com','admin123');");
//        Cursor resultSet = mydatabase.rawQuery("Select * from users",null);
//        resultSet.moveToFirst();
//        userName = resultSet.getString(1);
//        passWord = resultSet.getString(2);
//        TextView usernameView = (TextView)findViewById(R.id.username);
//        TextView passwordView = (TextView)findViewById(R.id.password);
//        usernameView.setText(userName);
//        passwordView.setText(passWord);
    }



}