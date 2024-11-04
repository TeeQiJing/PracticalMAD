package com.practical.profilepageshopee;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class FeedbackActivity extends AppCompatActivity {
    RatingBar ratebar;
    TextView rateText;
    EditText feedbackShare;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);

        // Initialize views here, after setContentView
        ratebar = findViewById(R.id.RateBarFeedback);
        rateText = findViewById(R.id.TVRating);
        feedbackShare = findViewById(R.id.ETFeedback);

        ratebar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                rateText.setText("You have rated " + rating);
            }
        });
    }

    public void submitFeedback(View view) {
        String message = "Thank you for your feedback!";
        if (!feedbackShare.getText().toString().isEmpty()) {
            message += " Please enjoy your RM5 cashback: ABC123.";
        }
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
        feedbackShare.setText("");
    }
}
