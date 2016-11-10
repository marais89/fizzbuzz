package com.olbati.fizzbuzz;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

/**
 * Created by marais on 08/11/2016.
 */
public class FizzBuzzTest  {

    FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    public void should_return_the_input() {
        // Arrange

        // Act

        // Assert
        assertThat(fizzBuzz.proceed(1)).isEqualTo("1");
        assertThat(fizzBuzz.proceed(2)).isEqualTo("2");
        assertThat(fizzBuzz.proceed(4)).isEqualTo("4");
    }

    @Test
    public void should_return_fizz_when_input_is_multiple_of_3() {
        // Arrange

        // Act

        // Assert
        assertThat(fizzBuzz.proceed(3)).isEqualTo("fizz");
        assertThat(fizzBuzz.proceed(6)).isEqualTo("fizz");
        assertThat(fizzBuzz.proceed(9)).isEqualTo("fizz");
    }

    @Test
    public void should_return_buzz_when_input_is_multiple_of_5() {
        // Arrange

        // Act

        // Assert
        assertThat(fizzBuzz.proceed(5)).isEqualTo("buzz");
        assertThat(fizzBuzz.proceed(10)).isEqualTo("buzz");
        assertThat(fizzBuzz.proceed(50)).isEqualTo("buzz");
    }

    @Test
    public void should_return_fizzbuzz_when_input_is_multiple_of_3_and_of_5() {
        // Arrange

        // Act

        // Assert
        assertThat(fizzBuzz.proceed(15)).isEqualTo("fizzbuzz");
        assertThat(fizzBuzz.proceed(30)).isEqualTo("fizzbuzz");
        assertThat(fizzBuzz.proceed(45)).isEqualTo("fizzbuzz");
    }

    @Test(expected = IllegalArgumentException.class)
    public void should_throw_exception_when_input_is_lesser_than_1() {
        // Arrange

        // Act
        fizzBuzz.proceed(0);

        // Assert
    }

    @Test(expected = IllegalArgumentException.class)
    public void should_throw_exception_when_input_is_greater_than_100() {
        // Arrange

        // Act
        fizzBuzz.proceed(101);

        // Assert
    }



}
