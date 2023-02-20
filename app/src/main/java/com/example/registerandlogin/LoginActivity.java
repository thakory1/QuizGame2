package com.example.registerandlogin;

//Importing all necessary components
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Button;
public class LoginActivity extends AppCompatActivity {

    EditText inputEmail, inputPassword;
    Button buttonLoginPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().hide(); //Hide action bar

        inputEmail = findViewById(R.id.inputEmail); //Assigns inputEmail object to text field for email on display
        inputPassword = findViewById(R.id.inputPassword); //Assigns inputPassword object to text field for password on display
        buttonLoginPage = findViewById(R.id.buttonLoginPage); //Assigns buttonLoginPage object to login button on display
        buttonLoginPage.setOnClickListener(new View.OnClickListener() { //Sets a listener for when the login button is clicked
            @Override
            public void onClick(View view) { //Creates method that on click calls for checkCredentials method
                checkCredentials(); //Calls method
            }
        });
    }

    private void checkCredentials() { //Creates method called check credentials to validate user input
        String email = inputEmail.getText().toString(); //Takes user input for Email and assigns it to string variable email
        String password = inputPassword.getText().toString(); //Takes user input for Password and assigns it to string variable password

        if (email.isEmpty() || !email.contains("@")) //Checks user input field for email to see if it is empty or whether or not it contains the "@" symbol
        {
            showError(inputEmail, "Invalid Email"); //Calls showError method to alert user of invalid input for email
        }
        else if (password.isEmpty()) //Checks user input field for password to see if it is empty
        {
            showError(inputPassword, "Invalid Password"); //Calls showError method to alert user of invalid input for password
        }
        else
        {
            Toast.makeText(this, "Call Login Method", Toast.LENGTH_SHORT).show(); //Instead of going to previous page I decided to show a quick toast because returning to previous page would be counter-intuitive
        }

    }

    private void showError(EditText input, String s) { //Creates showError method that takes EditText and string objects as parameter
        input.setError(s); //Tells input to set error to string that was input
        input.requestFocus();

    }
}