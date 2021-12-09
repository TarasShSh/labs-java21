package lab2.Task1;

public class Goalkeeper {
    final boolean isUsingHands = true;
    final boolean isDefending = true;

    static {
        System.out.println("This object inherited some Goalkeeper variables.");
    }
    public Goalkeeper() {
        System.out.println("GK, parameters are:");
        System.out.println("is using hands: " + isUsingHands);
        System.out.println("is defending: " + isDefending);
    }
}
