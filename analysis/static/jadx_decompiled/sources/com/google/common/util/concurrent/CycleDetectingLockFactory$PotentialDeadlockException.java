package com.google.common.util.concurrent;

import defpackage.a14;
import defpackage.jx6;
import defpackage.z04;
import java.util.Objects;

/* loaded from: classes.dex */
public final class CycleDetectingLockFactory$PotentialDeadlockException extends IllegalStateException {
    static {
        jx6.i(3, a14.class.getName(), "com.google.common.util.concurrent.CycleDetectingLockFactory$PotentialDeadlockException", z04.class.getName());
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        String message = super.getMessage();
        Objects.requireNonNull(message);
        StringBuilder sb = new StringBuilder(message);
        for (Throwable cause = null; cause != null; cause = cause.getCause()) {
            sb.append(", ");
            sb.append(cause.getMessage());
        }
        return sb.toString();
    }
}
