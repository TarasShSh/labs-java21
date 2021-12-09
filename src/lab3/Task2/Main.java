package lab3.Task2;
import java.io.IOException;

public class Main {
    public static void main(final String[] args) {
        try(final Resource file = new Resource("r-name")){
            System.out.println(file);
            file.read();
        }
        catch (IOException e){
            System.err.println("Can't read file");
        }
    }
}