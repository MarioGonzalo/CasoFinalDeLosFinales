package org.example;

import java.time.LocalDate;

public class Tweet {
    private String mensaje;
    private UserAccount sender;
    private LocalDate time;

    public Tweet(UserAccount sender, String mensaje) {
        if (mensaje.length() < 140) {
            this.mensaje = mensaje;
        } else {
            System.out.println("Mensaje inválido, no puede superar los 140 caracteres");
            this.mensaje = null;
        }
        this.sender = sender;
        this.time = LocalDate.now();
    }

    public String getMensaje() {
        return mensaje;
    }

    public UserAccount getSender() {
        return sender;
    }

    public LocalDate getTime() {
        return time;
    }

    @Override
    public String toString() {
        return "mensaje= '" + mensaje + '\'' +
                ", sender= " + sender +
                ", time= " + time;
    }


}
