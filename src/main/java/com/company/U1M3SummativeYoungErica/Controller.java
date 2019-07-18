package com.company.U1M3SummativeYoungErica;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class Controller {
        private String[] Quotes;

    public Controller() {

        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
     String[] Quotes = {"q1", "q2", "q3", "q4", "q5", "q6", "q7", "q8", "q9", "q10"};

        Random Quote = new Random();
    }




    @RequestMapping(value = "/Quote", method = RequestMethod.GET)
    public String[] getQuotes(@RequestBody Controller quotes) {
            return Quotes;
        }

    // for (int i = 0; i < Quotes.length; i++)

}
