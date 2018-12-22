package com.example.split;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String str = "リンゴ,500円";

        int index = str.indexOf(",");
        String result = str.substring(0,index);
        TextView texView = (TextView)findViewById(R.id.textView);
        texView.setText(result);


        //String fruit = str.split(",", 1);
    }
}
