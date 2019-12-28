package com.example.fristtest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {
    private TextView t_name;
    private TextView t_class;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        initView();
    }

    private void initView() {
        t_name =findViewById( R.id.t_name );
        t_class = findViewById( R.id.t_class );
        t_class.setOnClickListener( this );

        Intent intent  = getIntent();
        String aa= intent.getStringExtra( "id" );
        t_name.setText( aa );

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.t_class:

                Intent intent = new Intent( Main2Activity.this, Main3Activity.class );
                startActivity( intent );

                break;

        }

    }
}
