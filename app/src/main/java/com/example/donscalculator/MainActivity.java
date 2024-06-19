package com.example.donscalculator;

import static java.lang.Math.floor;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText ed1;



    TextView sign_Box;
    Double num1, num2, answer;
    String sign, val_1, val_2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        ed1 = findViewById(R.id.editText);
        sign_Box = findViewById(R.id.textView3);
    }


    /*@SuppressLint("SetTextI18n")
    public void numberEvent(View view) {

        String number = ed1.getText().toString();
        switch (view.getId()){
            case R.id.button1:
                number +="1";
                break;
        }
        ed1.setText(number);
    }*/



    @SuppressLint("SetTextI18n")
    public void button0(View view) {
        ed1.setText(ed1.getText() + "0");
    }

    @SuppressLint("SetTextI18n")
    public void button1(View view) {
        ed1.setText(ed1.getText() + "1");
    }

    @SuppressLint("SetTextI18n")
    public void button2(View view) {
        ed1.setText(ed1.getText() + "2");
    }

    @SuppressLint("SetTextI18n")
    public void button3(View view) {
        ed1.setText(ed1.getText() + "3");
    }

    @SuppressLint("SetTextI18n")
    public void button4(View view) {
        ed1.setText(ed1.getText() + "4");
    }

    @SuppressLint("SetTextI18n")
    public void button5(View view) {
        ed1.setText(ed1.getText() + "5");
    }

    @SuppressLint("SetTextI18n")
    public void button6(View view) {
        ed1.setText(ed1.getText() + "6");
    }

    @SuppressLint("SetTextI18n")
    public void button7(View view) {
        ed1.setText(ed1.getText() + "7");
    }

    @SuppressLint("SetTextI18n")
    public void button8(View view) {
        ed1.setText(ed1.getText() + "8");
    }

    @SuppressLint("SetTextI18n")
    public void button9(View view) {
        ed1.setText(ed1.getText() + "9");
    }

    @SuppressLint("SetTextI18n")
    public void button_dot(View view) {
        ed1.setText(ed1.getText() + ".");
    }



    public void button_positive(View view) {
        sign = "+";
        val_1 = ed1.getText().toString();
        ed1.setText(null);
        ed1.setText("+");
        ed1.setText(null);
        sign_Box.setText("+");
    }

    public void button_negative(View view) {
        sign = "-";
        val_1 = ed1.getText().toString();
        ed1.setText(null);
        ed1.setText("-");
        ed1.setText(null);
        sign_Box.setText("-");
    }

    public void button_x(View view) {
        sign = "×";
        val_1 = ed1.getText().toString();
        ed1.setText(null);
        ed1.setText("×");
        ed1.setText(null);
        sign_Box.setText("×");
    }

    public void button_div(View view) {
        sign = "÷";
        val_1 = ed1.getText().toString();
        ed1.setText(null);
        ed1.setText("÷");
        ed1.setText(null);
        sign_Box.setText("÷");
    }

    public void button_average(View view) {
        sign = "%";
        val_1 = ed1.getText().toString();
        ed1.setText(null);
        sign_Box.setText("%");
    }




    public void button_equal(View view) {
        if (sign == null) {
            sign_Box.setText("Error!");
        } else if (ed1.getText().equals("")) {
            sign_Box.setText("Error!");
        } else if ((sign.equals("+") || sign.equals("-") || sign.equals("*") || sign.equals("/")) && val_1.equals("")) {
            sign_Box.setText("Error!");
        } else {
            switch (sign) {
                default:
                    break;

                case "+":
                    val_2 = ed1.getText().toString();
                    num1 = Double.parseDouble(val_1);
                    num2 = Double.parseDouble(val_2);
                    answer = num1 + num2;
                    ed1.setText(answer + "");
                    sign = null;
                    sign_Box.setText(null);
                    break;
                case "-":
                    val_2 = ed1.getText().toString();
                    num1 = Double.parseDouble(val_1);
                    num2 = Double.parseDouble(val_2);
                    answer = num1 - num2;
                    ed1.setText(answer + "");
                    sign = null;
                    sign_Box.setText(null);
                    break;
                case "×":
                    val_2 = ed1.getText().toString();
                    num1 = Double.parseDouble(val_1);
                    num2 = Double.parseDouble(val_2);
                    answer = num1 * num2;
                    ed1.setText(answer + "");
                    sign = null;
                    sign_Box.setText(null);
                    break;
                case "÷":
                    val_2 = ed1.getText().toString();
                    num1 = Double.parseDouble(val_1);
                    num2 = Double.parseDouble(val_2);
                    answer = num1 / num2;
                    ed1.setText(answer + "");
                    sign = null;
                    sign_Box.setText(null);
                    break;
                case "%":
                    answer = num1 / 100;
                    ed1.setText(answer + "");
                    sign = null;
                    sign_Box.setText(null);
                    break;
           }

        }
    }



    public void button_del(View view) {
        if (ed1.getText().equals("")) {
            ed1.setText(null);
        } else {
            int len = ed1.getText().length();
            String s = ed1.getText().toString();
            if (s.charAt(len - 1) == '.') {
                ed1.setText(ed1.getText().subSequence(0, ed1.getText().length() - 1));

            } else {
                ed1.setText(ed1.getText().subSequence(0, ed1.getText().length() - 1));
            }
        }
    }

    public void button_ac(View view) {

        ed1.setText(null);
        sign_Box.setText(null);
        val_1 = null;
        val_2 = null;
        sign = null;
    }



}

