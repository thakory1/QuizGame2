package com.example.registerandlogin;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.os.Bundle;
import android.content.DialogInterface;
import androidx.appcompat.app.AlertDialog;
import android.os.Handler;

public class QuizActivity extends AppCompatActivity {

    private QuestionLibrary mQuestionLibrary = new QuestionLibrary();


    TextView mScoreView;
    private TextView mQuestionView;
    private Button mButtonChoice1;
    private Button mButtonChoice2;
    private Button mButtonChoice3;
    private Button mButtonChoice4;

    private Button mButtonChoice5;

    private String mAnswer;
    public int mScore = 0;

    int qAsked = 0;
    private int mQuestionNumber = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        mScoreView = (TextView)findViewById(R.id.score);
        mQuestionView = (TextView)findViewById(R.id.question);
        mButtonChoice1 = (Button)findViewById(R.id.choicel);
        mButtonChoice2 = (Button)findViewById(R.id.choice2);
        mButtonChoice3 = (Button)findViewById(R.id.choice3);
        mButtonChoice4 = (Button)findViewById(R.id.choice4);
        mButtonChoice5 = (Button)findViewById(R.id.choice5);

        updateQuestion();

        //Start of button listener for Button1
        mButtonChoice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Answer Confirmation Alert
                AlertDialog.Builder builder = new AlertDialog.Builder(QuizActivity.this);

                // Set the message show for the Alert time
                builder.setMessage("Are you sure you want to confirm this answer?");

                // Set Alert Title
                builder.setTitle("Just checking in...");

                // Set Cancelable false for when the user clicks on the outside the Dialog Box then it will remain show
                builder.setCancelable(false);

                // Set the positive button with yes name Lambda OnClickListener method is use of DialogInterface interface.
                builder.setPositiveButton("Yes", (DialogInterface.OnClickListener) (dialog, which) -> {
                    // When the user click yes button then app will NOT close
                    //Logic for button goes here
                    if (mButtonChoice1.getText() == mAnswer){
                        //qasked=qasked +1
                        mScore = mScore + 1;
                        updateScore(mScore);
                        updateQuestion();


                    }
                    else if(mButtonChoice1.getText() != mAnswer){
                        //qasked=qasked +1
                        mScore = mScore - 1;
                        updateScore(mScore);
                        updateQuestion();


                    }
                });

                // Set the Negative button with No name Lambda OnClickListener method is use of DialogInterface interface.
                builder.setNegativeButton("No", (DialogInterface.OnClickListener) (dialog, which) -> {
                    // If user click no then dialog box is canceled.

                    dialog.cancel();
                });

                // Create the Alert dialog
                AlertDialog alertDialog = builder.create();
                // Show the Alert Dialog box
                alertDialog.show();

                //Logic for button WAS here
                /*
                if (mButtonChoice1.getText() == mAnswer){
                    mScore = mScore + 1;
                    updateScore(mScore);
                    updateQuestion();

                }
                */


            }
        });

        //End of Button1 Listener



        //Start of button listener for Button2

        mButtonChoice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Answer Confirmation Alert
                AlertDialog.Builder builder = new AlertDialog.Builder(QuizActivity.this);

                // Set the message show for the Alert time
                builder.setMessage("Are you sure you want to confirm this answer?");

                // Set Alert Title
                builder.setTitle("Just checking in...");

                // Set Cancelable false for when the user clicks on the outside the Dialog Box then it will remain show
                builder.setCancelable(false);

                // Set the positive button with yes name Lambda OnClickListener method is use of DialogInterface interface.
                builder.setPositiveButton("Yes", (DialogInterface.OnClickListener) (dialog, which) -> {
                    // When the user click yes button then app will close
                    //Logic for button goes here
                    if (mButtonChoice2.getText() == mAnswer){
                        //qasked=qasked +1
                        mScore = mScore + 1;
                        updateScore(mScore);
                        updateQuestion();


                    }
                    else if(mButtonChoice2.getText() != mAnswer){
                        //qasked=qasked +1
                        mScore = mScore - 1;
                        updateScore(mScore);
                        updateQuestion();


                    }
                });

                // Set the Negative button with No name Lambda OnClickListener method is use of DialogInterface interface.
                builder.setNegativeButton("No", (DialogInterface.OnClickListener) (dialog, which) -> {
                    // If user click no then dialog box is canceled.

                    dialog.cancel();
                });

                // Create the Alert dialog
                AlertDialog alertDialog = builder.create();
                // Show the Alert Dialog box
                alertDialog.show();

                //Logic for button WAS here
                /*
                if (mButtonChoice1.getText() == mAnswer){
                    mScore = mScore + 1;
                    updateScore(mScore);
                    updateQuestion();

                }
                */



            }
        });

        //End of Button2 Listener

        //Start of button listener for Button3

        mButtonChoice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Answer Confirmation Alert
                AlertDialog.Builder builder = new AlertDialog.Builder(QuizActivity.this);

                // Set the message show for the Alert time
                builder.setMessage("Are you sure you want to confirm this answer?");

                // Set Alert Title
                builder.setTitle("Just checking in...");

                // Set Cancelable false for when the user clicks on the outside the Dialog Box then it will remain show
                builder.setCancelable(false);

                // Set the positive button with yes name Lambda OnClickListener method is use of DialogInterface interface.
                builder.setPositiveButton("Yes", (DialogInterface.OnClickListener) (dialog, which) -> {
                    // When the user click yes button then app will NOT close
                    //Logic for button goes here
                    if (mButtonChoice3.getText() == mAnswer){
                        //qasked=qasked +1
                        mScore = mScore + 1;
                        updateScore(mScore);
                        updateQuestion();


                    }
                    else if(mButtonChoice3.getText() != mAnswer){
                        //qasked=qasked +1
                        mScore = mScore - 1;
                        updateScore(mScore);
                        updateQuestion();


                    }
                });

                // Set the Negative button with No name Lambda OnClickListener method is use of DialogInterface interface.
                builder.setNegativeButton("No", (DialogInterface.OnClickListener) (dialog, which) -> {
                    // If user click no then dialog box is canceled.

                    dialog.cancel();
                });

                // Create the Alert dialog
                AlertDialog alertDialog = builder.create();
                // Show the Alert Dialog box
                alertDialog.show();

                //Logic for button WAS here
                /*
                if (mButtonChoice1.getText() == mAnswer){
                    mScore = mScore + 1;
                    updateScore(mScore);
                    updateQuestion();

                }
                */


            }



        });

        //End of Button3 Listener

        //Start of button listener for Button4

        mButtonChoice4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Answer Confirmation Alert
                AlertDialog.Builder builder = new AlertDialog.Builder(QuizActivity.this);

                // Set the message show for the Alert time
                builder.setMessage("Are you sure you want to confirm this answer?");

                // Set Alert Title
                builder.setTitle("Just checking in...");

                // Set Cancelable false for when the user clicks on the outside the Dialog Box then it will remain show
                builder.setCancelable(false);

                // Set the positive button with yes name Lambda OnClickListener method is use of DialogInterface interface.
                builder.setPositiveButton("Yes", (DialogInterface.OnClickListener) (dialog, which) -> {
                    // When the user click yes button then app will close
                    //Logic for button goes here
                    if (mButtonChoice4.getText() == mAnswer){
                        //qasked=qasked +1
                        mScore = mScore + 1;
                        updateScore(mScore);
                        updateQuestion();


                    }
                    else if(mButtonChoice4.getText() != mAnswer){
                        //qasked=qasked +1
                        mScore = mScore - 1;
                        updateScore(mScore);
                        updateQuestion();


                    }
                });

                // Set the Negative button with No name Lambda OnClickListener method is use of DialogInterface interface.
                builder.setNegativeButton("No", (DialogInterface.OnClickListener) (dialog, which) -> {
                    // If user click no then dialog box is canceled.

                    dialog.cancel();
                });

                // Create the Alert dialog
                AlertDialog alertDialog = builder.create();
                // Show the Alert Dialog box
                alertDialog.show();

                //Logic for button WAS here
                /*
                if (mButtonChoice1.getText() == mAnswer){
                    mScore = mScore + 1;
                    updateScore(mScore);
                    updateQuestion();

                }
                */



            }
        });

        //End of Button4 Listener

        //Start of button listener for Button5

        mButtonChoice5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Answer Confirmation Alert
                AlertDialog.Builder builder = new AlertDialog.Builder(QuizActivity.this);

                // Set the message show for the Alert time
                builder.setMessage("Are you sure you want to exit and see results?");

                // Set Alert Title
                builder.setTitle("Results");

                // Set Cancelable false for when the user clicks on the outside the Dialog Box then it will remain show
                builder.setCancelable(false);

                // Set the positive button with yes name Lambda OnClickListener method is use of DialogInterface interface.
                builder.setPositiveButton("Yes", (DialogInterface.OnClickListener) (dialog, which) -> {
                    // When the user click yes button then app will NOT close
                    //Logic for button goes here
                    startActivity(new Intent(QuizActivity.this, ResultActivity.class));
                });

                // Set the Negative button with No name Lambda OnClickListener method is use of DialogInterface interface.
                builder.setNegativeButton("No", (DialogInterface.OnClickListener) (dialog, which) -> {
                    // If user click no then dialog box is canceled.

                    dialog.cancel();
                });

                // Create the Alert dialog
                AlertDialog alertDialog = builder.create();
                // Show the Alert Dialog box
                alertDialog.show();

                //Logic for button WAS here
                /*
                if (mButtonChoice1.getText() == mAnswer){
                    mScore = mScore + 1;
                    updateScore(mScore);
                    updateQuestion();

                }
                */

            }
        });

        //End of Button5 Listener


    }


    private void updateQuestion() {

        qAsked = qAsked + 1;
        if(qAsked > 4) {
            startActivity(new Intent(QuizActivity.this, ResultActivity.class));
        }
        else {
            mQuestionView.setText(mQuestionLibrary.getQuestion(mQuestionNumber));
            mButtonChoice1.setText(mQuestionLibrary.getChoice1(mQuestionNumber));
            mButtonChoice2.setText(mQuestionLibrary.getChoice2(mQuestionNumber));
            mButtonChoice3.setText(mQuestionLibrary.getChoice3(mQuestionNumber));
            mButtonChoice4.setText(mQuestionLibrary.getChoice4(mQuestionNumber));

            mAnswer = mQuestionLibrary.getCorrectAnswer(mQuestionNumber);
            mQuestionNumber++;
        }

    }
    private void updateScore(int point) {
        mScoreView.setText("" +mScore);
    }



}