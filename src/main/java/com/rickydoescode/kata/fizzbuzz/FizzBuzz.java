package com.rickydoescode.kata.fizzbuzz;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    private List<Substitution> substitutions = new ArrayList<>();

    public FizzBuzz() {}

    public FizzBuzz(List<Substitution> substitutions) {
        this.substitutions = substitutions;
    }

    public String play(int input) {
        StringBuilder word = new StringBuilder();
        for (Substitution substitution : substitutions) {
            if (input % substitution.getValue() == 0) {
                word.append(substitution.getWord() + " ");
            }
        }
        String wordValue = word.toString().trim();
        if (wordValue.length() > 0) {
            return wordValue;
        }

        if (input % 3 == 0 && input % 5 == 0) {
            if (input % 7 == 0) {
                return "fizz buzz pop";
            }
            return "fizz buzz";
        } else if (input % 3 == 0 && input % 7 == 0) {
            return "fizz pop";
        } else if (input % 5 == 0 && input % 7 == 0) {
            return "buzz pop";
        }
        if (input % 3 == 0) {
            return "fizz";
        }
        if (input % 5 == 0) {
            return "buzz";
        }
        if (input % 7 == 0) {
            return "pop";
        }
        return input + "";
    }
}
