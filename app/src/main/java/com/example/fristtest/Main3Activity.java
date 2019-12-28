package com.example.fristtest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Main3Activity extends AppCompatActivity {
    private ListView list;
    private List<String>class_name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        list = findViewById(R.id.list);

        initData();
        final ArrayAdapter adapter = new ArrayAdapter <>(
                Main3Activity.this,

                android.R.layout.simple_list_item_1,
                class_name //数据名
        );


        //给ListView设置Adapter
        list.setAdapter( adapter );

        //给Item设置点击弹出提示信息监听事件
        list.setOnItemClickListener( new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView <?> parent, View view, int position, long id) {
                String data = (String )parent.getItemAtPosition( position );

                Intent intent = new Intent( Main3Activity.this, Main4Activity.class );
                startActivity( intent );
            }
        } );

    }

    private void initData() {

        class_name = new ArrayList<>(  );
        class_name.add( "Android应用程序开发" );
        class_name.add( "移动应用程序测试" );
        class_name.add( "高等数学" );
        class_name.add( "高职英语" );
        class_name.add( "Java程序设计语言" );
        class_name.add( "Android游戏开发" );
        class_name.add( "心理健康" );
        class_name.add( "体育" );
        class_name.add( "HTML_CSS");


    }
}
