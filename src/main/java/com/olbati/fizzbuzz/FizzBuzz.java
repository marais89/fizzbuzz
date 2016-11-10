package com.olbati.fizzbuzz;

import com.google.common.base.Preconditions;

/**
 * Created by marais on 08/11/2016.
 */
public class FizzBuzz {

    public String proceed(int input) {
        Preconditions.checkArgument(input >= 1);
        Preconditions.checkArgument(input <= 100);

        if (isMultipleOf3(input) && isMultipleOf5(input)) {
            return "fizzbuzz";
        }
        if (isMultipleOf3(input)) {
            return "fizz";
        }
        if (isMultipleOf5(input)) {
            return "buzz";
        }
        return Integer.toString(input);
    }

    private boolean isMultipleOf3(int input) {
        return input % 3 == 0;
    }

    private boolean isMultipleOf5(int input) {
        return input % 5 == 0;
    }
}
