package com.example.registerandlogin;

public class QuestionLibrary {

    private String mQuestions [] = {
            "What is Naruto's favorite place to eat called?",
            "Who is the youngest Kazekage to ever exist?",
            "Which one of these characters was an official double-spy at one point?",
            "Who is the father/mother of all ninjutsu?"
    };

    private String mChoices [][] = {
            {"Ichiraku Ramen", "Yakiniku", "Curry of Life", "Chips"},
            {"Naruto Uzumaki", "Hiruzen Sarutobi", "Gaara", "Mei Terumi"},
            {"Kabuto Yakushi", "Itachi Uchicha", "Orochimaru", "Neji Hyuga"},
            {"Madara Uchiha", "Hashirama Senju", "Indra Otsutsuki", "Neji Hyuga"}
    };

    private String mCorrectAnswer [] = {"Ichiraku Ramen", "Gaara", "Itachi Uchicha", "Indra Otsutsuki"};


    public String getQuestion(int a) {
        String question = mQuestions[a];
        return question;
    }

    public String getChoice1(int a) {
        String choice0 = mChoices[a][0];
        return choice0;
    }

    public String getChoice2(int a) {
        String choice1 = mChoices[a][1];
        return choice1;
    }

    public String getChoice3(int a) {
        String choice2 = mChoices[a][2];
        return choice2;
    }

    public String getChoice4(int a) {
        String choice3 = mChoices[a][3];
        return choice3;
    }

    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswer[a];
        return answer;
    }
}
