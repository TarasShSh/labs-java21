package lab2.Task1;

public class Midfield extends Forward{
    final boolean isDefending = true;

    static {
        System.out.println("This object inherited some Midfield variables.");
    }
    public Midfield() {
        System.out.println("MID, parameters are:");
        System.out.println("is using hands: " + isUsingHands);
        System.out.println("is defending: " + isDefending);
        System.out.println("is moving: " + isMoving);
        System.out.println("is attacking: " + isAttacking);
    }
}
