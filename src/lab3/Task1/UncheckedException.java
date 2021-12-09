package lab3.Task1;

import java.util.List;

public class UncheckedException extends RuntimeException{
    private NotValid notValid;

    public UncheckedException(final List<String> messages, final NotValid notValid) {
        super(messages.toString());
        this.notValid = notValid;
    }

    public NotValid getNotValid() {
        return notValid;
    }
}