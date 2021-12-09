package lab3.Task4;

public class SimpleCalculations {
    public static void add(final double num1, final double num2){
        System.out.println("Addition : " + num1 + " + " + num2);
        try {
            Thread.sleep(2000);
        } catch (final InterruptedException e){
            System.out.println("Interrupted.");
            Thread.currentThread().interrupt();
        }
        System.out.println("Addition result: " + (num1 + num2));
    }

    public static void sub(final double num1, final double num2){
        System.out.println("Subtraction : " + num1 + " - " + num2);
        try {
            Thread.sleep(2000);
        } catch (final InterruptedException e){
            System.out.println("Interrupted.");
        }
        System.out.println("Subtraction result: " + (num1 - num2));
    }

    public static void multi(final double num1, final double num2){
        System.out.println("Multiplication : " + num1 + " * " + num2);
        try {
            Thread.sleep(2000);
        } catch (final InterruptedException e){
            System.out.println("Interrupted.");
        }
        System.out.println("Multiplication result: " + (num1 * num2));
    }

    public static void divide(final double num1, final double num2){
        System.out.println("Division : " + num1 + " / " + num2);
        try {
            Thread.sleep(2000);
        } catch (final InterruptedException e){
            System.out.println("Interrupted exception");
        }
        System.out.println("Division result: " + (num1 / num2));
    }
}
