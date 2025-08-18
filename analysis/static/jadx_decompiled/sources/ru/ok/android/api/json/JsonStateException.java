package ru.ok.android.api.json;

import defpackage.z7;

/* loaded from: classes2.dex */
public final class JsonStateException extends IllegalStateException {
    public static JsonStateException a(int i) {
        return new JsonStateException("Expected " + z7.U(93) + " was " + z7.U(i));
    }

    public static JsonStateException b(int i) {
        return new JsonStateException("Expected " + z7.U(125) + " was " + z7.U(i));
    }

    public static JsonStateException c(int i) {
        return new JsonStateException("Expected " + z7.U(39) + " was " + z7.U(i));
    }

    public static JsonStateException d(int i) {
        return new JsonStateException("Expected value was ".concat(z7.U(i)));
    }
}
