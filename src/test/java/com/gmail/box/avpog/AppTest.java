package com.gmail.box.avpog;

import org.junit.jupiter.api.Test;

import java.util.*;

import static com.gmail.box.avpog.Utils.NumberUtils.getSum;
import static com.gmail.box.avpog.Utils.NumberUtils.multiplyOddNumber;
import static com.gmail.box.avpog.Utils.WordUtils.getShortestWord;
import static com.gmail.box.avpog.Utils.WordUtils.wordsCount;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    void isGetShortestWordSimpleTest() {
        //given
        ArrayList<String> words = new ArrayList<>(List.of("Fish", "Dog", "Stereolithography"));
        //when
        Optional<String> result = getShortestWord(words);
        //then
        assertEquals("Dog", result.get());
    }

    @Test
    void isGetShortestWordSpaceIgnoring() {
        //given
        ArrayList<String> words = new ArrayList<>(List.of("", "Fish", "Dog", "Stereolithography"));
        //when
        Optional<String> result = getShortestWord(words);
        //then
        assertEquals("Dog", result.get());
    }

    @Test
    void isGetShortestWordIgnoringNull() {
        //given
        ArrayList<String> words = new ArrayList<>(Arrays.asList("", null, "Fish", "Dog", "Stereolithography"));
        //when
        Optional<String> result = getShortestWord(words);
        //then
        //assert result.isEmpty();
        //assertTrue(result.isPresent());
        assertEquals("Dog", result.get());
    }

    @Test
    void isGetSumCalculating() {
        //given
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 5, 10, 15, 50));
        //when
        Optional<Integer> result = getSum(numbers);
        //then
        assertEquals(81, result.get());
    }

    @Test
    void isGetSumCalculatingNullAndNegative() {
        //given
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(null, 1, 5, -10, 15, 50));
        //when
        Optional<Integer> result = getSum(numbers);
        //then
        assertEquals(61, result.get());
    }

    @Test
    void isMultiplyOddNumberWorking() {
        // given
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(null, 1, 5, 10, -15, 50));
        // when
        Optional<List<Integer>> actualNumbers = multiplyOddNumber(numbers);
        ArrayList<Integer> expectedNumbers = new ArrayList<>(Arrays.asList(2, 10, -30));
        // then
        assertEquals(expectedNumbers, actualNumbers.orElse(Collections.emptyList()));
    }

    @Test
    void isMultiplyOddNumberEmpty() {
        // given
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList());
        // when
        Optional<List<Integer>> actualNumbers = multiplyOddNumber(numbers);
        ArrayList<Integer> expectedNumbers = new ArrayList<>(Arrays.asList());
        // then
        assertEquals(expectedNumbers, actualNumbers.orElse(Collections.emptyList()));
    }

    @Test
    void wordsCountWorking() {
        // given
        ArrayList<String> words = new ArrayList<>(Arrays.asList(null, "", "Fish", "Dog", "Stereolithography"));
        // when
        Optional<Integer> actualCount = wordsCount(words);
        int expectedCount = 3;
        // then
        assertEquals(expectedCount, actualCount.orElse(0));
    }

    @Test
    void wordsCountEmpty() {
        // given
        ArrayList<String> words = new ArrayList<>(Arrays.asList());
        // when
        Optional<Integer> actualCount = wordsCount(words);
        int expectedCount = 0;
        // then
        assertEquals(expectedCount, actualCount.orElse(0));
    }

}






