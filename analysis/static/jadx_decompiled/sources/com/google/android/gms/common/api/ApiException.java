package com.google.android.gms.common.api;

/* loaded from: classes.dex */
public class ApiException extends Exception {
    public final Status a;

    /* JADX WARN: Illegal instructions before constructor call */
    public ApiException(Status status) {
        int i = status.a;
        String str = status.b;
        super(i + ": " + (str == null ? "" : str));
        this.a = status;
    }
}
