package com.example.deepa_000.practice;


public class Questions {

    public String  mQuestions[]={
            "Which is the First Planet in the solar system?",
            "Which is the Second Planet in the solar system?",
            "Which is the Third Planet in the solar system?",
            "Which is the Fourth Planet in the solar system?",
            "Which is the Fifth Planet in the solar system?",
            "Which is the Sixth Planet in the solar system?",
            "Which is the Seventh Planet in the solar system?",
            "Which is the Eighth Planet in the solar system?",
            "Which is the Ninth Planet in the solar system?"
    };

    private String mChoice[][]={
            {"mercury","venus","mars","saturn"},
            {"mercury","venus","mars","saturn"},
            {"mercury","venus","mars","earth"},
            {"mercury","venus","mars","jupiter"},
            {"mercury","venus","mars","jupiter"},
            {"mercury","venus","mars","saturn"},
            {"mercury","uranus","mars","saturn"},
            {"mercury","neptune","mars","saturn"},
            {"mercury","venus","pluto","saturn"},

    };

    private String mCorrectAnswers[]={"mercury","venus","earth","mars","jupiter","saturn","uranus","neptune","pluto"};

    public String getQuestion(int a)
    {
        String question=mQuestions[a];
        return question;
    }

    public String getChoice1(int a)
    {
        String choice=mChoice[a][0];
        return choice;
    }

    public String getChoice2(int a)
    {
        String choice=mChoice[a][1];
        return choice;
    }
    public String getChoice3(int a)
    {
        String choice=mChoice[a][2];
        return choice;
    }
    public String getChoice4(int a)
    {
        String choice=mChoice[a][3];
        return choice;
    }

    public String getCorrectAnswer(int a)
    {
        String answer=mCorrectAnswers[a];
        return answer;
    }
}
