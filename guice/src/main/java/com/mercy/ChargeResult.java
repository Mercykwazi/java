package com.mercy;

public interface ChargeResult {
    boolean wasSuccessful();

    Object getDeclineMessage();
}
