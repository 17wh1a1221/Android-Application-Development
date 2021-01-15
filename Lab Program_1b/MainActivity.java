package com.example.aad_1b;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv;
    Button bt;
    EditText et;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView)findViewById(R.id.textView1);
        bt = (Button)findViewById(R.id.button);
        et = (EditText)findViewById(R.id.editText);
    }

    public void onClickBtn(View view) {
        String str = et.getText().toString();
        tv.setText("Hello "+str+"!");
    }
}