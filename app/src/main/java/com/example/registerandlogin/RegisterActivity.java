package com.example.registerandlogin;

//Importing all necessary components
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Button;

public class RegisterActivity extends AppCompatActivity {

    private EditText inputFirstName, inputLastName, inputBday, inputEmail, inputPassword; //Creates variables of EditText object
    Button buttonRegisterPage; //Creates button object called buttonRegisterPage

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        getSupportActionBar().hide(); //Hide action bar

        inputFirstName = findViewById(R.id.inputFirstName); //Assigns inputFirstName object to text field for first name on display
        inputLastName = findViewById(R.id.inputLastName); //Assigns inputLastName object to text field for last name on display
        inputBday = findViewById(R.id.inputBday); //Assigns inputBday object to text field for date of birth on display
        inputEmail = findViewById(R.id.inputEmail); //Assigns inputEmail object to text field for email on display
        inputPassword = findViewById(R.id.inputPassword); //Assigns inputPassword object to text field for password on display
        buttonRegisterPage = findViewById(R.id.buttonRegisterPage); //Assigns buttonRegisterPage object to register button on display
        buttonRegisterPage.setOnClickListener(new View.OnClickListener() { //Sets a listener for when the register button is clicked
            @Override
            public void onClick(View view) { //Creates method that on click calls for checkCredentials method
                checkCredentials(); //Calls method
            }
        });


    }

    private void checkCredentials() { //Creates method called check credentials to validate user input
        String firstname = inputFirstName.getText().toString(); //Takes user input for First Name and assigns it to string variable firstname
        String lastname = inputLastName.getText().toString(); //Takes user input for Last Name and assigns it to string variable lastname
        //Birthday
        String email = inputEmail.getText().toString(); //Takes user input for Email and assigns it to string variable email
        String password = inputPassword.getText().toString(); //Takes user input for Password and assigns it to string variable password

        if(firstname.isEmpty() || firstname.length() < 3 || firstname.length() > 30) //Checks user input field for first name to see if it is empty or less than 3 characters or more than 30 characters
        {
            showError(inputFirstName, "Invalid First Name"); //Calls showError method to alert user of invalid input for first name
        }
        else if (lastname.isEmpty() || lastname.length() < 3 || lastname.length() > 30) //Checks user input field for last name to see if it is empty or less than 3 characters or more than 30 characters
        {
            showError(inputLastName, "Invalid Last Name"); //Calls showError method to alert user of invalid input for last name
        }
        else if (email.isEmpty() || !email.contains("@")) //Checks user input field for email to see if it is empty or whether or not it contains the "@" symbol
        {
            showError(inputEmail, "Invalid Email"); //Calls showError method to alert user of invalid input for email
        }
        else if (password.isEmpty()) //Checks user input field for password to see if it is empty
        {
            showError(inputPassword, "Invalid Password"); //Calls showError method to alert user of invalid input for password
        }
        else
        {
            startActivity(new Intent(RegisterActivity.this, MainActivity2.class)); //Tells system to switch to MainActivity2 when register button is clicked
            Toast.makeText(this, "Registration Successful", Toast.LENGTH_SHORT).show(); //Shows a toast to user confirming successful registration
        }

    }

    private void showError(EditText input, String s) { //Creates showError method that takes EditText and string objects as parameter
        input.setError(s); //Tells input to set error to string that was input
        input.requestFocus();
    }
}