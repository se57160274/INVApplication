package com.example.home.invapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class MainBorrow extends AppCompatActivity {

private ImageView Borrow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_borrow);

        Borrow = (ImageView) findViewById(R.id.borrow);
        Borrow.setOnClickListener(OnClickSubmittListener);


    }

    private View.OnClickListener OnClickSubmittListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent in = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(in);
        }
    };
}
