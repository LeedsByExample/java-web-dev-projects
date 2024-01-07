package org.example;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //print odd integers
        int[] integers = {1, 1, 2, 3, 5, 8};
        for (int integer : integers) {
            if (integer % 2 != 0) {
                System.out.println(integer);
            }
        }
        //separate string by word and by sentence
        String str = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] words = str.split(" ");
        System.out.println(Arrays.toString(words));
        String[] sentences = str.split("\\.");
        System.out.println(Arrays.toString(sentences));

        //Write a static method to find the sum of all the even numbers in an ArrayList. Within main, create a list with at least 10 integers and call your method on the list.
        ArrayList<Integer> numberList = new ArrayList<>();
        numberList.add(1);
        numberList.add(2);
        numberList.add(3);
        numberList.add(4);
        numberList.add(5);
        numberList.add(6);
        numberList.add(7);
        numberList.add(8);
        numberList.add(9);
        numberList.add(10);

        //System.out.println(evenNumSum(numberList));
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a word length: ");
        int wordChoice = input.nextInt();
        System.out.println(fiveLetterPrint(wordChoice));

    }

    public static int evenNumSum(ArrayList<Integer> nums) {
        int sum = 0;
        for (int i : nums) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static void fiveLetterPrint(ArrayList<String> words) {
        for (String word : words) {
            if (word.length() == 5) {
                System.out.println(word);
            }
        }
    }
}
