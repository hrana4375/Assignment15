package com.example.himsrana.toast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class Toast_Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toast_2);
        Toast.makeText(Toast_Activity2.this,"Inside Create",Toast.LENGTH_SHORT);

    }
}
