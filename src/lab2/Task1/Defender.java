package lab2.Task1;

public class Defender extends Goalkeeper{
    final boolean isUsingHands = false;
    final boolean isMoving = true;


    static {
        System.out.println("This object inherited some Defender variables.");
    }
    public Defender() {
        System.out.println("DEF, his parameters are:");
        System.out.println("is using hands: " + isUsingHands);
        System.out.println("is defending: " + isDefending);
        System.out.println("is moving: " + isMoving);
    }
}
