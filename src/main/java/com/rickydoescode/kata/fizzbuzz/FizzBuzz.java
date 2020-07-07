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
        for (Substitution substitution : substitutions) {
            StringBuilder word = new StringBuilder();
            if (input % substitution.getValue() == 0) {
                word.append(substitution.getWord() + " ");
            }
            return word.toString().trim();
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
