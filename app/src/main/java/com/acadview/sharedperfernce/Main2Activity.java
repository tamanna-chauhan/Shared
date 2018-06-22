package com.acadview.sharedperfernce;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView hello,bye,goodBye;
    String userName,userAge,userClass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

//        get the refernce
        hello = findViewById(R.id.hello);
        bye = findViewById(R.id.bye);
        goodBye = findViewById(R.id.gdbye);

//        1SHaredpref strt here
        SharedPreferences sp = getSharedPreferences("detail",MODE_PRIVATE);

        userName = sp.getString("name","none");
        userClass = sp.getString("class","none");
        userAge = sp.getString("age","none");

//        set the value to textView
        hello.setText(userName);
        bye.setText(userAge);
        goodBye.setText(userName);



    }
}
