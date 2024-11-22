package com.gmail.box.avpog;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static com.gmail.box.avpog.Utils.NumberUtils.getSum;
import static com.gmail.box.avpog.Utils.WordUtils.getShortestWord;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


/**
 * Unit test for simple App.
 */
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
        // WHY NPE with List.of? Is it on stage where I am creating array?
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
        //assert result.isEmpty();
        //assertTrue(result.isPresent());
        assertEquals(81, result.get());
    }

    @Test
    void isGetSumCalculatingNullAndNegative() {
        //given
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(null, 1, 5, -10, 15, 50));
        //when
        Optional<Integer> result = getSum(numbers);
        //then
        //assert result.isEmpty();
        //assertTrue(result.isPresent());
        assertEquals(61, result.get());
    }
}



