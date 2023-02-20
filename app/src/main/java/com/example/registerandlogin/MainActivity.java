package com.example.registerandlogin;

//Importing all necessary components
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide(); //Hide action bar
        Intent switchActivity = new Intent(MainActivity.this, MainActivity2.class); //Creates switchActivity Intent, tells system to switch to MainActivity2.clas
        new Handler().postDelayed(new Runnable() { //Creates handler
            @Override
            public void run() {startActivity(switchActivity);} //Creates method that calls the start activity method to switch activity to MainActivity2
        }, 3000); //Waits 3 seconds and then switches activity

    }
}