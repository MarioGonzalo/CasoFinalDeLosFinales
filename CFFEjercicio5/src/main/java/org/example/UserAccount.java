package org.example;


import java.util.ArrayList;
import java.util.List;

public class UserAccount {
    private String alias;
    private String email;
    private List<UserAccount> siguiendo = new ArrayList<>();
    private List<UserAccount> seguidores = new ArrayList<>();
    private List<Tweet> tuits = new ArrayList<>();
    private List<Tweet> timeline = new ArrayList<>();

    public UserAccount(String alias, String email) {
        for (int i = 0; i < alias.length(); i++){
            if((alias.charAt(i) == 'A') && (alias.charAt(i) == 'B') || (alias.charAt(i) == 'C') || (alias.charAt(i) == 'D') || (alias.charAt(i) == 'E') || (alias.charAt(i) == 'F') || (alias.charAt(i) == 'G') || (alias.charAt(i) == 'H') || (alias.charAt(i) == 'I') || (alias.charAt(i) == 'J') || (alias.charAt(i) == 'K') || (alias.charAt(i) == 'L') || (alias.charAt(i) == 'M') || (alias.charAt(i) == 'N') || (alias.charAt(i) == 'O') || (alias.charAt(i) == 'P') || (alias.charAt(i) == 'Q') || (alias.charAt(i) == 'R') || (alias.charAt(i) == 'S') || (alias.charAt(i) == 'T') || (alias.charAt(i) == 'U') || (alias.charAt(i) == 'V') || (alias.charAt(i) == 'W') || (alias.charAt(i) == 'X') || (alias.charAt(i) == 'Y') || (alias.charAt(i) == 'Z') || (alias.charAt(i) == 'a') || (alias.charAt(i) == 'b') || (alias.charAt(i) == 'c') || (alias.charAt(i) == 'd') || (alias.charAt(i) == 'e') || (alias.charAt(i) == 'f') || (alias.charAt(i) == 'g') || (alias.charAt(i) == 'h') || (alias.charAt(i) == 'i') || (alias.charAt(i) == 'j') || (alias.charAt(i) == 'k') || (alias.charAt(i) == 'l') || (alias.charAt(i) == 'm') || (alias.charAt(i) == 'n') || (alias.charAt(i) == 'o') || (alias.charAt(i) == 'p') || (alias.charAt(i) == 'q') || (alias.charAt(i) == 'r') || (alias.charAt(i) == 's') || (alias.charAt(i) == 't') || (alias.charAt(i) == 'u') || (alias.charAt(i) == 'v') || (alias.charAt(i) == 'w') || (alias.charAt(i) == 'x') || (alias.charAt(i) == 'y') || (alias.charAt(i) == 'z') || (alias.charAt(i) == '0') || (alias.charAt(i) == '1') || (alias.charAt(i) == '2') || (alias.charAt(i) == '3') || (alias.charAt(i) == '4') || (alias.charAt(i) == '5') || (alias.charAt(i) == '6') || (alias.charAt(i) == '7') || (alias.charAt(i) == '8') || (alias.charAt(i) == '9')) {
                this.alias = alias;
            } else {
                System.out.println("Alias inválido, no puede contener símbolos especiales");
                this.alias = null;
                break;
            }
        }
        for (int i = 0; i < email.length(); i++){
            if (email.charAt(i) == '@') {
                this.email = email;
            }
        } if (this.email == null) {
            System.out.println("Email inválido, debe contener un @");
        }
    }

    public String getAlias() {
        if (alias == null) {
            return "Alias inválido, no puede contener símbolos especiales";
        } else {
            return alias;
        }
    }

    public String getEmail() {
        if (email != null) {
            return email;
        }else {
            return "Email inválido, debe contener un @";
        }
    }

    public void setAlias(String alias) {
        for (int i = 0; i < alias.length(); i++){
        if((alias.charAt(i) == 'A') && (alias.charAt(i) == 'B') || (alias.charAt(i) == 'C') || (alias.charAt(i) == 'D') || (alias.charAt(i) == 'E') || (alias.charAt(i) == 'F') || (alias.charAt(i) == 'G') || (alias.charAt(i) == 'H') || (alias.charAt(i) == 'I') || (alias.charAt(i) == 'J') || (alias.charAt(i) == 'K') || (alias.charAt(i) == 'L') || (alias.charAt(i) == 'M') || (alias.charAt(i) == 'N') || (alias.charAt(i) == 'O') || (alias.charAt(i) == 'P') || (alias.charAt(i) == 'Q') || (alias.charAt(i) == 'R') || (alias.charAt(i) == 'S') || (alias.charAt(i) == 'T') || (alias.charAt(i) == 'U') || (alias.charAt(i) == 'V') || (alias.charAt(i) == 'W') || (alias.charAt(i) == 'X') || (alias.charAt(i) == 'Y') || (alias.charAt(i) == 'Z') || (alias.charAt(i) == 'a') || (alias.charAt(i) == 'b') || (alias.charAt(i) == 'c') || (alias.charAt(i) == 'd') || (alias.charAt(i) == 'e') || (alias.charAt(i) == 'f') || (alias.charAt(i) == 'g') || (alias.charAt(i) == 'h') || (alias.charAt(i) == 'i') || (alias.charAt(i) == 'j') || (alias.charAt(i) == 'k') || (alias.charAt(i) == 'l') || (alias.charAt(i) == 'm') || (alias.charAt(i) == 'n') || (alias.charAt(i) == 'o') || (alias.charAt(i) == 'p') || (alias.charAt(i) == 'q') || (alias.charAt(i) == 'r') || (alias.charAt(i) == 's') || (alias.charAt(i) == 't') || (alias.charAt(i) == 'u') || (alias.charAt(i) == 'v') || (alias.charAt(i) == 'w') || (alias.charAt(i) == 'x') || (alias.charAt(i) == 'y') || (alias.charAt(i) == 'z') || (alias.charAt(i) == '0') || (alias.charAt(i) == '1') || (alias.charAt(i) == '2') || (alias.charAt(i) == '3') || (alias.charAt(i) == '4') || (alias.charAt(i) == '5') || (alias.charAt(i) == '6') || (alias.charAt(i) == '7') || (alias.charAt(i) == '8') || (alias.charAt(i) == '9')) {
            this.alias = alias;
        } else {
                System.out.println("Alias inválido, no puede contener símbolos especiales");
                this.alias = null;
                break;
            }
        }
    }

    public void setEmail(String email) {
        for (int i = 0; i < email.length(); i++){
            if (email.charAt(i) == '@') {
                this.email = email;
            }

        }
        if (this.email == null) {
            System.out.println("Email inválido, debe contener un @");
        }
    }

    public List<UserAccount> getSiguiendo() {
        return siguiendo;
    }

    public List<UserAccount> getSeguidores() {
        return seguidores;
    }

    public List<Tweet> getTuits() {
        return tuits;
    }

    public List<Tweet> getTimeline() {
        return timeline;
    }

    public void follow(UserAccount user) {
        if (user != this && !siguiendo.contains(user)) {
            siguiendo.add(user);
            user.seguidores.add(this);
        }
    }

    public void tweet(String mensaje) {
        Tweet t = new Tweet(this, mensaje);
        tuits.add(t);
        for (UserAccount u : seguidores) {
            u.timeline.add(t);
        }
    }

    @Override
    public String toString() {
        return "alias= '" + alias + '\'' +
                ", email= '" + email + '\'';
    }
}
