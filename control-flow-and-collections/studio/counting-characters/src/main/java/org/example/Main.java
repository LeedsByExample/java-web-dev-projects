package org.example;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static org.example.CharacterCounter.charCount;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a sentence: ");
        String quote = input.nextLine();

        charCount(quote);

        input.close();

    }
}


//for (Map.Entry<String,String> features : hashmap.entrySet()){
//        System.out.println(features.getKey()+": "+features.getValue());
//        }