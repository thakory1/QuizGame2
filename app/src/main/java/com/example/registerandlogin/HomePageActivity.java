package com.example.registerandlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomePageActivity extends AppCompatActivity {

    Button rulesButton;
    Button startButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        rulesButton = (Button)findViewById(R.id.rulesButton); //Assigns rules button object to rules button on display
        rulesButton.setOnClickListener(new rulesButtonListener());

        startButton = (Button)findViewById(R.id.startButton);
        startButton.setOnClickListener(new startButtonListener());

    }

    class rulesButtonListener implements View.OnClickListener{ //Makes a class for rules button listener
        @Override
        public void onClick(View view) { //Method for when the rules button is clicked
            //Toast.makeText(MainActivity.this, "Class implements OnClickListener", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(HomePageActivity.this, RulesActivity.class)); //Tells system to switch to Rules Activity when rules button is clicked
        }
    }

    class startButtonListener implements View.OnClickListener{ //Makes a class for start button listener
        @Override
        public void onClick(View view) { //Method for when the rules button is clicked
            //Toast.makeText(MainActivity.this, "Class implements OnClickListener", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(HomePageActivity.this, QuizActivity.class)); //Tells system to switch to Rules Activity when rules button is clicked
        }
    }
}