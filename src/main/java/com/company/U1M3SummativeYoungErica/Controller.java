package com.company.U1M3SummativeYoungErica;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Random;
import javax.validation.Valid;
import java.util.*;

import static javax.swing.UIManager.get;

@RestController
public class Controller {


    private List<Answer> answerList;
    private List<Word> wordList;
    private List<Quote> quoteList;
    private String answer;
    static Random random = new Random();

    public Controller() {
        this.wordList = new ArrayList<>();

        this.wordList.add(new Word("Class: ", "A class describes a particular kind of object. It can contain related methods and data members (variables). "));
        this.wordList.add(new Word("Constructor: ", "A special type of instance method that creates a new object. "));
        this.wordList.add(new Word("Declaration: ", " A statement that creates a variable, method, or class identifier"));
        this.wordList.add(new Word("Instantiate: ", "To allocate storage for an object in memory (involves the keyword *new)."));
        this.wordList.add(new Word("Method:", "a collection of code found within a class. If the data members of a class are nouns, the methods are the verbs (the action)."));

        this.wordList.add(new Word("Parameter: ", "a variable or object passed into a method."));
        this.wordList.add(new Word("Initialize: ", "an assignment that sets the starting value of a variable."));
        this.wordList.add(new Word("Assign: ", "to set the data of a variable (involves the equal sign)."));
        this.wordList.add(new Word("array:", "a fixed-size collection of data of the same type, which can hold zero or more items: "));
        this.wordList.add(new Word("boolean:", "a primitive type, holding only two values – true or false:"));


        this.quoteList = new ArrayList<>();

        this.quoteList.add(new Quote("The Pessimist Sees Difficulty In Every Opportunity. The Optimist Sees Opportunity In Every Difficulty.","-Winston Churchill"));
        this.quoteList.add(new Quote("Life is 10% what happens to you and 90% how you react to it.","-Charles R. Swendole"));
        this.quoteList.add(new Quote("Reading Is To The Mind, As Exercise Is To The Body.", "-Brian Tracy"));
        this.quoteList.add(new Quote("It does not matter how slowly you go as long as you do not stop.", "-Confucius"));
        this.quoteList.add(new Quote( "Positivity, confidence, and persistence are key in life, so never give up on yourself.", "-Khalid"));

        this.quoteList.add(new Quote( "The only person you are destined to become is the person you decide to be.", "–Ralph Waldo Emerson"));
        this.quoteList.add(new Quote( "Life is not measured by the number of breaths we take, but by the moments that take our breath away.", "–Maya Angelou"));
        this.quoteList.add(new Quote( "Challenges are what make life interesting and overcoming them is what makes life meaningful.", "–Joshua J. Marine"));
        this.quoteList.add(new Quote("The mind is everything. What you think you become.", "-Buddha" ));
        this.quoteList.add(new Quote("Life isn't about getting and having, it's about giving and being.", "-Kevin Kruse"));


                this.answerList = new ArrayList<>();

        this.answerList.add(new Answer("Don't count on it.", ""));
        this.answerList.add(new Answer("Concentrate and ask again.", ""));
        this.answerList.add(new Answer("Without a doubt.", ""));
        this.answerList.add(new Answer("Not Likely", ""));
        this.answerList.add(new Answer("It's possible", ""));
        this.answerList.add(new Answer("Try again later.", ""));


    }

    @RequestMapping(value = "/words", method = RequestMethod.GET)
    public Word getDefinition() {
        return wordList.get(random.nextInt(wordList.size()));
    }

    @RequestMapping(value = "/quotes", method = RequestMethod.GET)
    public Quote getQuote() {
        return quoteList.get(random.nextInt(quoteList.size()));
    }

    @RequestMapping(value = "/magic", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.OK)
    public Answer postQuestion(@RequestBody Answer response) {


        Answer randomAnswer = answerList.get(random.nextInt(answerList.size()));
        //get the answer from randomAnswer
        String answerString = randomAnswer.getAnswer();
        //set the Answer to respond

        response.setAnswer(answerString);

        return response;

    }


}
