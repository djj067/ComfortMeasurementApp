package com.next.easynavigationdemo.ui;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.next.easynavigationdemo.R;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UpdateActivity extends AppCompatActivity {
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
    Date date = new Date(System.currentTimeMillis());
    private String time = simpleDateFormat.format(date);
    EditText autotime;
    ImageView smile,cry,meh;
    ImageView smilefilling;
    Button submit;
    TextView textView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update);
        autotime=findViewById(R.id.editTextTime);
        autotime.setText(time);
        textView.findViewById(R.id.textView7);
        textView.setTextSize(20);
//        smile=findViewById(R.id.smile);
//        smile.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                smile.setImageResource(R.drawable.smilefilling);
//            }
//        });
//        submit.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent=new Intent(UpdateActivity.this,WeiboActivity.class);
//            }
//        });




    }

}