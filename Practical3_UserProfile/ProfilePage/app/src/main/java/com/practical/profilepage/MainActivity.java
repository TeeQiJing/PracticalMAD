package com.practical.profilepage;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView1, textView2, textView3, textView4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Change this to your layout file

        // Initialize TextViews
        textView1 = findViewById(R.id.textView2); // Assuming this is the ID of the first TextView
        textView2 = findViewById(R.id.textView3); // ID of second TextView
        textView3 = findViewById(R.id.textView4); // ID of third TextView
        textView4 = findViewById(R.id.textView7); // ID of fourth TextView

        // Set click listeners
        textView1.setOnClickListener(view -> setSelectedTextView(textView1));
        textView2.setOnClickListener(view -> setSelectedTextView(textView2));
        textView3.setOnClickListener(view -> setSelectedTextView(textView3));
        textView4.setOnClickListener(view -> setSelectedTextView(textView4));
    }

    private void setSelectedTextView(TextView selectedTextView) {
        // Reset all TextViews to default styles
        resetTextViews();

        // Apply the selected styles to the clicked TextView
        selectedTextView.setBackgroundResource(R.drawable.text_lines); // Change this to your drawable
        selectedTextView.setTextColor(getResources().getColor(R.color.reverse_primary)); // Change this to your color resource
    }

    private void resetTextViews() {
        // Reset styles for all TextViews
        textView1.setBackgroundColor(Color.TRANSPARENT); // Set to transparent or default background
        textView1.setTextColor(getResources().getColor(R.color.normal_text)); // Use normal_text color

        textView2.setBackgroundColor(Color.TRANSPARENT);
        textView2.setTextColor(getResources().getColor(R.color.normal_text)); // Use normal_text color

        textView3.setBackgroundColor(Color.TRANSPARENT);
        textView3.setTextColor(getResources().getColor(R.color.normal_text)); // Use normal_text color

        textView4.setBackgroundColor(Color.TRANSPARENT);
        textView4.setTextColor(getResources().getColor(R.color.normal_text)); // Use normal_text color
    }
}