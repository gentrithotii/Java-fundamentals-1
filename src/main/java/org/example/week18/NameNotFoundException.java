package org.example.week18;

public class NameNotFoundException extends RuntimeException {
    private String name;

    public NameNotFoundException(String message) {
        super(message);
    }
}
