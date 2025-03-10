package org.launchcode;
import java.util.Scanner;

public class AliceStringSearch {
    public static void main(String[] args) {
        String sentence = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, ‘and what is the use of a book,’ thought Alice ‘without pictures or conversation?'";

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word to search in the following sentence: " + sentence);
        String word = input.nextLine().toLowerCase();

        boolean hasString = sentence.contains(word);
        if(hasString) {
            System.out.println("Word found!");
        } else {
            System.out.println("Word not found.");
        }
    }
}
