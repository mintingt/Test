package com.example.fristtest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText Et_zh;
    private EditText Et_mm;
    private Button Bt_login,Bt_tc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Et_mm = findViewById(R.id.ET_mm);
        Et_zh = findViewById(R.id.Et_zh);
        Bt_login = findViewById(R.id.Bt_login);
        Bt_tc = findViewById(R.id.Bt_tc);
        Bt_login.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent();
        switch (v.getId()) {
            case R.id.Bt_login:
                String username = Et_zh.getText().toString();

                String password =Et_mm.getText().toString();

                if ("xia".equals(Et_zh.getText().toString()) && "123".equals(Et_mm.getText().toString())) {

                    intent = new Intent(MainActivity.this, Main2Activity.class);
                    intent.putExtra( "id",Et_zh.getText().toString());
                    startActivity(intent);
                }else
                    Toast.makeText(MainActivity.this,"账号或密码错误",Toast.LENGTH_LONG).show();
                break;

        }

    }
}
