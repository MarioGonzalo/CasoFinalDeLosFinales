package org.example;

public class Main {
    public static void main(String[] args) {
        UserAccount user = new UserAccount("pepe", "Ayayaa@212");
        UserAccount user2 = new UserAccount("pepe2", "Ayayaya@212");
        System.out.println(user.getEmail());
        user.setAlias("pepe");
        System.out.println(user.getAlias());
        user.follow(user2);
        user2.follow(user);
        System.out.println(user.getSiguiendo());
        System.out.println(user2.getSeguidores());
        user.tweet("Hola");
        System.out.println(user.getTuits());
        System.out.println(user2.getTimeline());
        System.out.println(user.toString());
        Tweet t = new Tweet(user, "Hola");
        DirectMessage dm = new DirectMessage(user, user2,"Hola");
        System.out.println(t.getMensaje());
        System.out.println(dm.getReceiver());
        Retweet rt = new Retweet(user, t, "Hola");
        System.out.println(rt.getOriginalTweet());
        System.out.println(rt.getMensaje());
    }
}