package com.thishkt.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn1 = (Button)findViewById(R.id.button2);
        btn1.setOnClickListener(click_num1);

        Button btn2 = (Button)findViewById(R.id.button3);
        btn2.setOnClickListener(click_num2);

        Button btn3 = (Button)findViewById(R.id.button4);
        btn3.setOnClickListener(click_num3);

        Button btn4 = (Button)findViewById(R.id.button7);
        btn4.setOnClickListener(click_num4);

        Button btn5 = (Button)findViewById(R.id.button6);
        btn5.setOnClickListener(click_num5);

        Button btn6 = (Button)findViewById(R.id.button5);
        btn6.setOnClickListener(click_num6);

        Button btn7 = (Button)findViewById(R.id.button9);
        btn7.setOnClickListener(click_num7);

        Button btn8 = (Button)findViewById(R.id.button10);
        btn8.setOnClickListener(click_num8);

        Button btn9 = (Button)findViewById(R.id.button8);
        btn9.setOnClickListener(click_num9);

        Button btn_re = (Button)findViewById(R.id.restart);
        btn_re.setOnClickListener(click_restart);
    }
    private View.OnClickListener click_num1 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            TextView number = (TextView)findViewById(R.id.textView2);
            number.setText("1");
        }
    };
    private View.OnClickListener click_num2 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            TextView number = (TextView)findViewById(R.id.textView2);
            number.setText("2");
        }
    };
    private View.OnClickListener click_num3 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            TextView number = (TextView)findViewById(R.id.textView2);
            number.setText("3");
        }
    };
    private View.OnClickListener click_num4 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            TextView number = (TextView)findViewById(R.id.textView2);
            number.setText("4");
        }
    };
    private View.OnClickListener click_num5 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            TextView number = (TextView)findViewById(R.id.textView2);
            number.setText("5");
        }
    };
    private View.OnClickListener click_num6 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            TextView number = (TextView)findViewById(R.id.textView2);
            number.setText("6");
        }
    };
    private View.OnClickListener click_num7 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            TextView number = (TextView)findViewById(R.id.textView2);
            number.setText("7");
        }
    };
    private View.OnClickListener click_num8 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            TextView number = (TextView)findViewById(R.id.textView2);
            number.setText("8");
        }
    };
    private View.OnClickListener click_num9 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            TextView number = (TextView)findViewById(R.id.textView2);
            number.setText("9");
        }
    };
    private View.OnClickListener click_restart = new View.OnClickListener() {
        @Override

        public void onClick(View v) {
            int count = 0;
        }
    };


    public void click_out(View v){

        TextView number = (TextView)findViewById(R.id.textView2);

        Intent intent = new Intent(this, MainActivity2.class);
        Bundle bundle = new Bundle();
        bundle.putString("NUM", number.getText().toString());
        intent.putExtras(bundle);
        startActivity(intent);

    }
}