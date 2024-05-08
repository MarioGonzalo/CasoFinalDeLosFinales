package org.example;

public class Main {
    public static void main(String[] args) {
        UserAccount user = new UserAccount("pepe", "Ayayaa@212");
        UserAccount user2 = new UserAccount("pepe2", "Ayayaya@212");
        System.out.println(user.getEmail());
        user.setAlias("pepe");
        System.out.println(user.getAlias());
        user.follow(user2);
        System.out.println(user.getSiguiendo());
    }
}