package com.rickydoescode.kata.fizzbuzz;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class FizzBuzzTest {

    private final FizzBuzz fizzBuzz = new FizzBuzz();

    //Basic Fizz Buzz Scoring
    @Test
    void normalNumbersReturnSameNumber() {
        assertThat(fizzBuzz.play(1)).isEqualTo("1");
        assertThat(fizzBuzz.play(2)).isEqualTo("2");
        assertThat(fizzBuzz.play(4)).isEqualTo("4");
    }

    @Test
    void multiplesOfThreeReturnFizz() {
        assertThat(fizzBuzz.play(3)).isEqualTo("fizz");
        assertThat(fizzBuzz.play(9)).isEqualTo("fizz");
        assertThat(fizzBuzz.play(123)).isEqualTo("fizz");
    }

    @Test
    void multiplesOfFiveReturnBuzz() {
        assertThat(fizzBuzz.play(5)).isEqualTo("buzz");
        assertThat(fizzBuzz.play(20)).isEqualTo("buzz");
        assertThat(fizzBuzz.play(200)).isEqualTo("buzz");
    }

    @Test
    void multiplesOfThreeAndFiveReturnFizzBuzz() {
        assertThat(fizzBuzz.play(15)).isEqualTo("fizz buzz");
        assertThat(fizzBuzz.play(45)).isEqualTo("fizz buzz");
    }

    //Playing FizzBuzz Variations
    @Test
    void multiplesOfSevenReturnPop() {
        assertThat(fizzBuzz.play(7)).isEqualTo("pop");
        assertThat(fizzBuzz.play(28)).isEqualTo("pop");
        assertThat(fizzBuzz.play(77)).isEqualTo("pop");
    }

    @Test
    void multiplesOfThreeAndSevenReturnFizzPop() {
        assertThat(fizzBuzz.play(21)).isEqualTo("fizz pop");
        assertThat(fizzBuzz.play(63)).isEqualTo("fizz pop");
        assertThat(fizzBuzz.play(126)).isEqualTo("fizz pop");
    }

    @Test
    void multiplesOfFiveAndSevenReturnFizzPop() {
        assertThat(fizzBuzz.play(35)).isEqualTo("buzz pop");
        assertThat(fizzBuzz.play(70)).isEqualTo("buzz pop");
        assertThat(fizzBuzz.play(140)).isEqualTo("buzz pop");
    }

    @Test
    void multiplesOfThreeAndFiveAndSevenReturnFizzPop() {
        assertThat(fizzBuzz.play(105)).isEqualTo("fizz buzz pop");
        assertThat(fizzBuzz.play(210)).isEqualTo("fizz buzz pop");
        assertThat(fizzBuzz.play(315)).isEqualTo("fizz buzz pop");
    }

    //Creating Fizz Buzz Variations
    @Test
    void usingACustomSubstitution() {
        FizzBuzz fizzBuzz = new FizzBuzz(List.of(new Substitution(2,"fuzz")));

        assertThat(fizzBuzz.play(1)).isEqualTo("1");
        assertThat(fizzBuzz.play(2)).isEqualTo("fuzz");
        assertThat(fizzBuzz.play(8)).isEqualTo("fuzz");
    }

    @Test
    void linkingCustomSubstitutionsTogether() {
        Substitution fuzz = new Substitution(2, "fuzz");
        Substitution bizz = new Substitution(3, "bizz");
        FizzBuzz fizzBuzz = new FizzBuzz(List.of(fuzz, bizz));

        assertThat(fizzBuzz.play(4)).isEqualTo("fuzz");
        assertThat(fizzBuzz.play(9)).isEqualTo("bizz");
        assertThat(fizzBuzz.play(12)).isEqualTo("fuzz bizz");
    }
}