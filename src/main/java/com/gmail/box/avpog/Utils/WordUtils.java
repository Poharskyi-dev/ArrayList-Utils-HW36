package com.gmail.box.avpog.Utils;

import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.Optional;

public class WordUtils {

    public static Optional<String> getShortestWord(List<String> words) {

        String shortestWord = null;

        if (words == null || words.isEmpty()) {
            return Optional.empty();
        }

        for (String word : words) {
            if (word == null || word.length() < 2) {
                continue;
            }
            if (shortestWord == null || word.length() < shortestWord.length()) {
                shortestWord = word;
            }
        }
        if (shortestWord == null) {
            return Optional.empty();
        } else {
            return Optional.of(shortestWord);
        }
    }


}
