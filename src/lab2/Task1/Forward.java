package lab2.Task1;

public class Forward extends Defender{
    final boolean isDefending = false;
    final boolean isAttacking = true;

    static {
        System.out.println("This object inherited some Forward variables.");
    }
    public Forward() {
        System.out.println("FWD, his parameters are:");
        System.out.println("is using hands: " + isUsingHands);
        System.out.println("is defending: " + isDefending);
        System.out.println("is moving: " + isMoving);
        System.out.println("is attacking: " + isAttacking);
    }
}
