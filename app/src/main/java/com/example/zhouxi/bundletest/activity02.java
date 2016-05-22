package com.example.zhouxi.bundletest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class activity02 extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);

        textView = (TextView) findViewById(R.id.context);

        Intent intent = getIntent();

        StringBuffer str = new StringBuffer();

        Bundle bundle = intent.getBundleExtra("bundle");

        str.append("usr:"+bundle.getString("name") +"\n"+ "psd:"+ bundle.getString("psd")+"\n"+"sex:"+bundle.getString("sex"));

        textView.setText(str.toString());





    }
}
