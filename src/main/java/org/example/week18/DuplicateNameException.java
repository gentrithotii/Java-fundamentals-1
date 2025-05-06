package org.example.week18;

public class DuplicateNameException extends RuntimeException {
    private String name;

    public DuplicateNameException(String message) {
        super(message);
    }

    public DuplicateNameException(String message, String name) {
        this(message);
        this.name = name;
    }
}
