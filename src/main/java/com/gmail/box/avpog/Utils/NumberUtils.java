package com.gmail.box.avpog.Utils;

import java.util.List;
import java.util.Optional;

public class NumberUtils {

    public static Optional<Integer> getSum(List<Integer> numbers) {
        if (numbers == null || numbers.isEmpty()) {
            return Optional.empty();
        }

        int sum = 0;
        for(Integer number : numbers) {
            if (number == null) {
                continue;
            }
            sum += number;
        }
        return Optional.of(sum);
    }
}
