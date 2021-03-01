package io.pragra.inclass;

import java.io.IOException;

public class InvalidAgeException extends IOException {
    public InvalidAgeException(String message) {
        super(message);
    }
}
