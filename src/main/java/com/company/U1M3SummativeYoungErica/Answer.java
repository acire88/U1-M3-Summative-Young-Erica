package com.company.U1M3SummativeYoungErica;

import javax.validation.constraints.NotEmpty;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Answer {
    private String answer;
    private String question;

    public Answer(){}

    public Answer(String answer, String question){
        this.answer = answer;
        this.question = question;
    }

    public String getAnswer() {

       return answer;
    }


    public void setAnswer(String answer){

        this.answer = answer;
    }
    public String getQuestion(){

        return question;
    }
    public void setQuestion(String question){
        this.question = question;
    }
}
