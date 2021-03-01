package io.pragra.inclass;

import java.io.IOException;

public class InvalidGuestName extends IOException {
    public InvalidGuestName(String S) {
        super(S);
    }
}
