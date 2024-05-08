package org.example;

public class DirectMessage extends Tweet {
    private UserAccount receiver;

    public DirectMessage(UserAccount sender, UserAccount receiver, String mensaje) {
        super(sender, mensaje);
        this.receiver = receiver;
    }

    public UserAccount getReceiver() {
        return receiver;
    }

    @Override
    public String toString() {
        return "mensaje= '" + getMensaje() + '\'' +
                ", sender= " + getSender() +
                ", receiver= " + receiver +
                ", time= " + getTime();
    }
}
