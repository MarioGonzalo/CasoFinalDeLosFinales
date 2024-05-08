package org.example;

public class Tweet {
    private String mensaje;
    private UserAccount autor;

    public Tweet( UserAccount autor, String mensaje) {
        this.mensaje = mensaje;
        this.autor = autor;
    }

    public String getMensaje() {
        return mensaje;
    }

    public UserAccount getAutor() {
        return autor;
    }
}
