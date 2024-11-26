package com.gmail.box.avpog.Utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class NumberUtils {

    public static Optional<Integer> getSum(List<Integer> numbers) {
        if (numbers == null || numbers.isEmpty()) {
            return Optional.empty();
        }

        int sum = 0;
        for (Integer number : numbers) {
            if (number == null) {
                continue;
            }
            sum += number;
        }
        return Optional.of(sum);
    }

    public static Optional<List<Integer>> multiplyOddNumber(List<Integer> numbers) {
        ArrayList<Integer> newNumbers = new ArrayList<>();
        if (numbers == null || numbers.isEmpty()) {
            return Optional.empty();
        }
        for (Integer number : numbers) {
            if (number != null && number % 2 != 0) {
                newNumbers.add(number * 2);
            }
        }
        if (newNumbers.isEmpty()) {
            return Optional.empty();
        } else {
            return Optional.of(newNumbers);
        }

    }
}
