package Exceptions;

public class DuplicateUniversityException extends Exception {
    public DuplicateUniversityException(String errorMessage) {
        super(errorMessage);
    }
}