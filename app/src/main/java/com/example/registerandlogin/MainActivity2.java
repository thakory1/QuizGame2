package com.example.registerandlogin;

//Importing all necessary components
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.os.Bundle;
import android.content.Intent;
import android.util.Log;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {

    Button lButton; //Create button object for login
    Button rButton; //Create button object for register


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        getSupportActionBar().hide(); //Hide action bar

        lButton = (Button)findViewById(R.id.loginButton); //Assigns login button object to login button on display
        rButton = (Button)findViewById(R.id.registerButton); //Assigns register button object to register button on display

        lButton.setOnClickListener(new lButtonListener()); //Sets a listener for when the login button is clicked
        rButton.setOnClickListener(new rButtonListener()); //Sets a listener for when the register button is clicked
    }

    class lButtonListener implements View.OnClickListener{ //Makes a class for login button listener
        @Override
        public void onClick(View view) { //Method for when the login button is clicked
            //Toast.makeText(MainActivity.this, "Class implements OnClickListener", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(MainActivity2.this, LoginActivity.class)); //Tells system to switch to Login Activity when login button is clicked
        }
    }

    class rButtonListener implements View.OnClickListener{ //Makes a class for register button listener
        @Override
        public void onClick(View view) { //Method for when the register button is clicked
            //Toast.makeText(MainActivity.this, "Class implements OnClickListener", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(MainActivity2.this, RegisterActivity.class)); //Tells system to switch to Register Activity when register button is clicked
        }
    }
}