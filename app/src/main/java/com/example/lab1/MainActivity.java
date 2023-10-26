package com.example.lab1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    EditText etColor;
    Button buttonOK;
    TextView ErrorMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etColor = (EditText) findViewById(R.id.editColor);
        buttonOK = (Button) findViewById(R.id.btnOK);
        ErrorMessage = findViewById(R.id.error);
    }

    public void Change_color(View v) {
        //Очистить сообщение ошибки
        if (ErrorMessage.getText().length() != 0){
            ErrorMessage.setText("");
        }

        String color = etColor.getText().toString();

        //Если цвет не красный, голубой или синий, то исключение
        try {
            if (!(color.equals("red") | color.equals("green") | color.equals("blue") | color.equals("Red") | color.equals("Green") | color.equals("Blue"))){
                throw new Exception("wrong color");
            }
        }
        catch (Exception e){
            ErrorMessage.setText("Invalid color. Enter a color: red, green or blue");
            return;
        }

        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("color", color);
        startActivity(intent);
    }
}
