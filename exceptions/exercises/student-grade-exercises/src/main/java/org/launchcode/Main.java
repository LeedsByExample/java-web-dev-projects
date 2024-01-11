package org.launchcode;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Test out your Divide() function!
        Divide(10,0);
        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");

        // Test out your CheckFileExtension() function!
        for (String student : studentFiles.keySet()) {
            int points = CheckFileExtension(studentFiles.get(student));
            System.out.println(student + ": " + points + " points");
        }
    }

    public static void Divide(int x, int y) {
        if (y==0) {
            try {
                throw new ArithmeticException("You cannot divide by 0!");
            } catch (ArithmeticException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println(x/y);
        }

    }

    public static int CheckFileExtension(String fileName)
    {
        if (fileName == null || fileName.isEmpty()) {
            try {
                throw new IllegalArgumentException("File name is null or empty!");
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
                return -1;
            }
        }

        if (fileName.endsWith(".java")) {
            return 1;
        } else {
            return 0;
        }
    }


}