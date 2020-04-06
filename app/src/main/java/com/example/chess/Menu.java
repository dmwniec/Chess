package com.example.chess;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void NewGame(View view) {
        Intent Main = new Intent(this, MainActivity.class);
        startActivity(Main);
    }

    public void Continue(View view) {
        finish();
    }
}
