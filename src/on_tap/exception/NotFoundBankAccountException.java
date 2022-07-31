package on_tap.exception;

import java.io.IOException;

public class NotFoundBankAccountException extends IOException {
    public NotFoundBankAccountException(String message) {
        super(message);
    }
}
