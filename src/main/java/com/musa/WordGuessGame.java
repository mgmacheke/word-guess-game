package com.musa;

import java.util.Scanner;
import java.util.TreeMap;

public class WordGuessGame {
    public static void main(String[] args) {
        TreeMap<String, String> wordMap = new TreeMap<>();
        TreeMap<String, String> wordsMap = new TreeMap<>();
        wordsMap.put("JAVA", "A popular programming language.");
        wordsMap.put("SPRING", "A Java framework for enterprise applications.");
        wordsMap.put("KAFKA", "A distributed streaming platform.");
        wordsMap.put("CAMUNDA", "A BPM tool for process automation.");
        wordsMap.put("HASURA", "GraphQL engine for APIs.");

        String[] keys = wordsMap.keySet().toArray(new String[0]);
        String selectedWord = keys[(int) (Math.random() * keys.length)];
        String hintWord = wordsMap.get(selectedWord);

        System.out.println("Welcome to the word guess game!");
        System.out.println("The hint word is " + hintWord);
        System.out.println("Guess the word:");

        Scanner scanner = new Scanner(System.in);
        String guessedWord = scanner.nextLine().toUpperCase();

        if (guessedWord.equals(selectedWord)) {
            System.out.println("You guessed correctly!");
        }else
            System.out.println("You guessed incorrectly! the correct word is " + selectedWord);
    }
}
