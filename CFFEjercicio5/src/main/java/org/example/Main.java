package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try {
            Scanner scanner = new Scanner(file);
            String alias = scanner.nextLine();
            String email = scanner.nextLine();
            UserAccount userAccount = new UserAccount(alias, email);
            System.out.println(userAccount.toString());
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
        
    }
}