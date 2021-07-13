package com.next.easynavigationdemo.ui;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.next.easynavigationdemo.R;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UpdateActivity extends AppCompatActivity {
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
    Date date = new Date(System.currentTimeMillis());
    private String time = simpleDateFormat.format(date);
    private TextView autotime;
    private ImageView smile,cry,meh;
    private ImageView smilefilling;
    private  TextView textView;
    private RadioGroup radioGroup,radioGroup2;
    private CheckBox checkBox1,checkBox2,checkBox3,checkBox4;
    private RadioButton one,otw,two,one2,otw2,two2;
    private ImageView submit,back,forward;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update);
        autotime=findViewById(R.id.time);
        autotime.setText(time);
        checkBox1=findViewById(R.id.checkbox4);
        checkBox2=findViewById(R.id.checkbox2);
        checkBox3=findViewById(R.id.checkbox);
        checkBox4=findViewById(R.id.checkbox3);
        one=findViewById(R.id.radioButton3);
        otw=findViewById(R.id.radioButton5);
        two=findViewById(R.id.radioButton6);
        one2=findViewById(R.id.radioButton7);
        otw2=findViewById(R.id.radioButton8);
        two2=findViewById(R.id.radioButton9);
        radioGroup=findViewById(R.id.radiogroup);
        radioGroup2=findViewById(R.id.radiogroup2);
        submit=findViewById(R.id.submit);
        back=findViewById(R.id.back);
        forward=findViewById(R.id.forward);

        checkBox1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                one.setVisibility(View.VISIBLE);
                otw.setVisibility(View.VISIBLE);
                two.setVisibility(View.VISIBLE);
                radioGroup.setVisibility(View.VISIBLE);

            }
        });
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){
             @Override
            public void onCheckedChanged(RadioGroup group, int checkId) {
                 switch (checkId){
                    case R.id.radioButton3:
                                                Toast.makeText(UpdateActivity.this,"you chose:"+one.getText(),Toast.LENGTH_SHORT).show();
                                             break;
                    case R.id.radioButton5:
                                                Toast.makeText(UpdateActivity.this,"you chose:"+otw.getText(),Toast.LENGTH_SHORT).show();
                                               break;
                    case R.id.radioButton6:
                        Toast.makeText(UpdateActivity.this,"you chose:"+two.getText(),Toast.LENGTH_SHORT).show();
                                       default:
                                               break;
                                   }
                           }
       });
        checkBox2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                radioGroup2.setVisibility(View.VISIBLE);
                radioGroup.setVisibility(View.INVISIBLE);
            }
        });
        radioGroup2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(RadioGroup group, int checkId) {
                switch (checkId){
                    case R.id.radioButton7:
                        Toast.makeText(UpdateActivity.this,"you chose:"+one.getText(),Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.radioButton8:
                        Toast.makeText(UpdateActivity.this,"you chose:"+otw.getText(),Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.radioButton9:
                        Toast.makeText(UpdateActivity.this,"you chose:"+two.getText(),Toast.LENGTH_SHORT).show();
                    default:
                        break;
                }
            }
        });
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(UpdateActivity.this,Functionality.class);
                startActivity(intent);

            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(UpdateActivity.this,WeiboActivity.class);
                startActivity(intent);
            }
        });
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