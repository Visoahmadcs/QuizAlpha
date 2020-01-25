package com.example.quiz;

public class Questions {


    public String[] mQuestion = {

            "None",
            "What is the First Alphabet of English?",
            "What is the Second Alphabet of English?",
            "What is the Third Alphabet of English?",
            "What is the Fourth Alphabet of English?",
            "What is the Fifth Alphabet of English?",
            "What is the Sixth Alphabet of English?",
            "What is the Seventh Alphabet of English?",
            "What is the Eight  Alphabet of English?",
            "What is the Ninth Alphabet of English?",
            "What is the Tenth Alphabet of English?",
            "What is the Eleventh Alphabet of English?",
            "What is the Teveleth Alphabet of English?",
            "What is the Thirteen Alphabet of English?",
            "What is the Fourteen Alphabet of English?",
            "What is the Fifteen Alphabet of English?",
            "What is the Sixteen Alphabet of English?",
            "What is the Seventeen Alphabet of English?",
            "What is the Eighteenth Alphabet of English?",
            "What is the Nineteenth Alphabet of English?",
            "What is the Twentieth Alphabet of English?",
            "What is the Twenty first Alphabet of English? ",
            "What is the Twenty Second Alphabet of English?",
            "What is the Twenty Third Alphabet of English?",
            "What is the twenty fourth Alphabet of English?",
            "what is the twenty fifth Alphabet of English?"
    };

    public String[][] mChoices = {
            {"None", " ", " ", " "},
            {"A", "b", "c", "d"},                          //0
            {"c", "b", "e", "f"},                          //1
            {"u", "c", "f", "q"},                          //2
            {"q", "x", "d", "z"},                          //3
            {"c", "B", "e", "f"},                          //4
            {"u", "C", "f", "q"},                          //5
            {"b", "g", "E", "o"},                          //6
            {"j", "h", "s", "m"},                          //7
            {"q", "i", "k", "f"},                          //8
            {"w", "j", "c", "y"},                          //9
            {"m", "k", "I", "q"},                          //10
            {"c", "n", "e", "l"},                          //11
            {"u", "v", "m", "s"},                          //12
            {"p", "x", "n", "z"},                          //13
            {"b", "o", "e", "w"},                          //14
            {"p", "e", "r", "q"},                          //15
            {"q", "s", "k", "G"},                          //16
            {"w", "t", "r", "y"},                          //17
            {"n", "s", "d", "z"},                          //18
            {"b", "o", "t", "w"},                          //19
            {"j", "w", "u", "q"},                          //20
            {"q", "v", "k", "G"},                          //21
            {"w", "r", "U", "y"},                          //22
            {"n", "V", "d", "x"},                          //23
            {"b", "o", "U", "y"},                          //24
            {"j", "z", "p", "q"},                          //25
    };

    private String[] mCorrectAnswer = {"None", "A", "b", "c", "d", "e",
            "f", "g", "h", "i", "j",
            "k", "l", "m", "n", "o",
            "p", "q", "r", "s", "t",
            "u", "v", "w", "x", "y",
            "z"
    };

    public String getQuestion(int a) {
        String question = mQuestion[a];
        return question;
    }

    public String getChoice1(int a) {
        String choice = mChoices[a][0];
        return choice;
    }

    public String getChoice2(int a) {
        String choice = mChoices[a][1];
        return choice;
    }

    public String getChoice3(int a) {
        String choice = mChoices[a][2];
        return choice;
    }

    public String getchoice4(int a) {
        String choice = mChoices[a][3];
        return choice;
    }

    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswer[a];
        return answer;
    }
}
