package com.next.easynavigationdemo.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.next.easynavigationdemo.R;

public class Functionality extends AppCompatActivity {
    private ImageView happy1,happy2,happy3,happy4,happy5,happy6,happy7,ok1,meh1,sad1,angry1;
    private ImageView submit,back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_functionality);
        happy1=findViewById(R.id.imageView13);
        happy2=findViewById(R.id.imageView21);
        happy3=findViewById(R.id.imageView27);
        happy4=findViewById(R.id.imageView35);
        happy5=findViewById(R.id.imageView41);
        happy6=findViewById(R.id.imageView46);
        happy7=findViewById(R.id.imageView51);
        ok1=findViewById(R.id.imageView15);
        meh1=findViewById(R.id.imageView16);
        sad1=findViewById(R.id.imageView17);
        angry1=findViewById(R.id.imageView18);
        submit=findViewById(R.id.imageView11);
        back=findViewById(R.id.imageView10);
        happy1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                happy1.setImageResource(R.drawable.happyfilling);
                ok1.setImageResource(R.drawable.ok);
                meh1.setImageResource(R.drawable.meh);
                sad1.setImageResource(R.drawable.sad);
                angry1.setImageResource(R.drawable.angry);

                }
        });
        ok1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                happy1.setImageResource(R.drawable.happy);
                ok1.setImageResource(R.drawable.okfilling);
                meh1.setImageResource(R.drawable.meh);
                sad1.setImageResource(R.drawable.sad);
                angry1.setImageResource(R.drawable.angry);

            }
        });
        meh1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                happy1.setImageResource(R.drawable.happy);
                ok1.setImageResource(R.drawable.ok);
                meh1.setImageResource(R.drawable.mehfilling);
                sad1.setImageResource(R.drawable.sad);
                angry1.setImageResource(R.drawable.angry);

            }
        });
        sad1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                happy1.setImageResource(R.drawable.happy);
                ok1.setImageResource(R.drawable.ok);
                meh1.setImageResource(R.drawable.meh);
                sad1.setImageResource(R.drawable.sadfilling);
                angry1.setImageResource(R.drawable.angry);

            }
        });
        angry1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                happy1.setImageResource(R.drawable.happy);
                ok1.setImageResource(R.drawable.ok);
                meh1.setImageResource(R.drawable.meh);
                sad1.setImageResource(R.drawable.sad);
                angry1.setImageResource(R.drawable.angryfilling);

            }
        });

        happy2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                happy2.setImageResource(R.drawable.happyfilling);
            }
        });
        happy3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                happy3.setImageResource(R.drawable.happyfilling);
            }
        });
        happy4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                happy4.setImageResource(R.drawable.happyfilling);
            }
        });
        happy5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                happy5.setImageResource(R.drawable.happyfilling);
            }
        });
        happy6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                happy6.setImageResource(R.drawable.happyfilling);
            }
        });
        happy7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                happy7.setImageResource(R.drawable.happyfilling);
            }
        });
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Functionality.this,Physical.class);
                Toast.makeText(Functionality.this,"Functionality submit successfully",Toast.LENGTH_SHORT).show();
                startActivity(intent);

            }
        });
    }
}