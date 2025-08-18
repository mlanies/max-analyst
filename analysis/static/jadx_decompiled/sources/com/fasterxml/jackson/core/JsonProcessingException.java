package com.fasterxml.jackson.core;

import defpackage.wa7;

/* loaded from: classes.dex */
public class JsonProcessingException extends JacksonException {
    public final wa7 a;

    public JsonProcessingException(String str, wa7 wa7Var, NumberFormatException numberFormatException) {
        super(str, numberFormatException);
        this.a = wa7Var;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String message = super.getMessage();
        if (message == null) {
            message = "N/A";
        }
        wa7 wa7Var = this.a;
        if (wa7Var == null) {
            return message;
        }
        StringBuilder sb = new StringBuilder(100);
        sb.append(message);
        if (wa7Var != null) {
            sb.append("\n at ");
            sb.append(wa7Var.toString());
        }
        return sb.toString();
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return getClass().getName() + ": " + getMessage();
    }
}
