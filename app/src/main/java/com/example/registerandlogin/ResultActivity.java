package com.example.registerandlogin;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;
import android.os.Bundle;

public class ResultActivity extends AppCompatActivity {

    TextView mScoreView;
    QuizActivity a = new QuizActivity(); //create instance of quizactivity
    int result = a.mScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);




        mScoreView = (TextView)findViewById(R.id.score);
        updateScore(result);
    }

    public void updateScore(int point) {
        mScoreView.setText(result);
    }
}