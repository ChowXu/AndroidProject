package com.example.zhouxi.bundletest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity{

    private  Button SignIn;
    private EditText usr ;
    private EditText psd;
    private EditText sex;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity1);

        usr = (EditText) findViewById(R.id.name);
        psd = (EditText) findViewById(R.id.psd);
        SignIn = (Button) findViewById(R.id.button);

        sex = (EditText) findViewById(R.id.sex);

        SignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SignIn();
            }
        });

    }
    public void SignIn(){
        //
        Intent intent = new Intent(this,activity02.class);


        Bundle bundle = new Bundle();


        bundle.putString("name",usr.getText().toString());
        bundle.putString("psd",psd.getText().toString());
        bundle.putString("sex",sex.getText().toString());

        intent.putExtra("bundle",bundle);
        startActivity(intent);





    }
}
