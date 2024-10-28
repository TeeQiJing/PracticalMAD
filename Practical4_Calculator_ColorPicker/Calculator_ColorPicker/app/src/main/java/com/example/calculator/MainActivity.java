package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText text1, text2;
    private TextView result;
    private CheckBox redCB, greenCB, blueCB;
    private LinearLayout region;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text1 = findViewById(R.id.num1);
        text2 = findViewById(R.id.num2);
        result = findViewById(R.id.result);
        redCB = findViewById(R.id.redCheckBox);
        greenCB = findViewById(R.id.greenCheckBox);
        blueCB = findViewById(R.id.blueCheckBox);
        region = findViewById(R.id.LLColor);
    }


    public void calc(View view) {
        String num1 = text1.getText().toString();
        String num2 = text2.getText().toString();
        if(!TextUtils.isEmpty(num1) && !TextUtils.isEmpty(num2)) {
            double value1 = Double.parseDouble(num1);
            double value2 = Double.parseDouble(num2);
            double resultNum = value1 + value2;
            if (!Double.isNaN(resultNum) && !Double.isInfinite(resultNum))
//                result.setText(String.valueOf(resultNum));
                result.setText(String.format("%.2f", resultNum));
            else
                Toast.makeText(this, "Invalid Input", Toast.LENGTH_SHORT).show();
        }else
            Toast.makeText(this, "Please Enter 2 Numbers!", Toast.LENGTH_SHORT).show();
    }

    public void changeColor(View view) {
//        if(redCB.isChecked()){
//            region.setBackgroundColor(Color.RED);
////            region.setBackgroundColor(Color.parseColor("FF0000"));
////            region.setBackgroundColor(Color.rgb(255,0,0));
////            region.setBackgroundColor(Color.rgb(255,0,0));
//
////            float[] hsl = {0, 1f, 0.5f};  // HSL values for red
////            int rgbColor = androidx.core.graphics.ColorUtils.HSLToColor(hsl);
////            region.setBackgroundColor(rgbColor);
//
//        }else if(blueCB.isChecked()){
//            region.setBackgroundColor(Color.BLUE);
//        } else if (greenCB.isChecked()) {
//            region.setBackgroundColor(Color.GREEN);
//        }else {
//            region.setBackgroundColor(0); // Default BG Color
//        }

//        More powerful code (Only Change Color When There is Only One Checkbox Checked, Something like Radio Button)
        int checkedCount = 0;
        int color = 0;  // Default background color

        // Check each checkbox and count how many are checked
        if (blueCB.isChecked()) {
            checkedCount++;
            color = Color.BLUE;
        }
        if (greenCB.isChecked()) {
            checkedCount++;
            color = Color.GREEN;
        }
        if (redCB.isChecked()) {
            checkedCount++;
            color = Color.RED;
        }

        // Only change background color if exactly one checkbox is checked
        if (checkedCount == 1) {
            region.setBackgroundColor(color);
        } else {
            Toast.makeText(this, "Please select only one color", Toast.LENGTH_SHORT).show();
        }
    }
}