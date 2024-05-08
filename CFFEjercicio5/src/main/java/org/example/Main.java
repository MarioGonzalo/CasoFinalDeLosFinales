package org.example;

public class Main {
    public static void main(String[] args) {
        UserAccount user = new UserAccount("pepe_", "Ayayaya212");
        System.out.println(user.getEmail());
        user.setAlias("pepe");
        System.out.println(user.getAlias());
    }
}