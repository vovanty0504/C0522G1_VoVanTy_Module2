package ss16_binary_file_serialization.execise1.copy_file.exception;

public class FileExistsException extends Exception{
    public FileExistsException(String message) {
        super(message);
    }
}
