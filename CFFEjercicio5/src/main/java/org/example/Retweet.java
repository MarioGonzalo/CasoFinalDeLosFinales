package org.example;
import java.time.LocalDate;

public class Retweet extends Tweet{
    private Tweet originalTweet;
    private UserAccount sender;
    private String mensaje;
    private LocalDate time;

    public Retweet(UserAccount sender, Tweet originalTweet, String mensaje) {
        super(sender, originalTweet.getMensaje());
        this.originalTweet = originalTweet;
        this.sender = sender;
        this.mensaje = mensaje;
        this.time = LocalDate.now();
    }

    public Tweet getOriginalTweet() {
        return originalTweet;
    }

}
