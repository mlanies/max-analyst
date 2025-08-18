package ru.ok.android.externcalls.sdk.api;

import defpackage.au1;

/* loaded from: classes2.dex */
public class ExternApiException extends RuntimeException {
    private final int errorCode;
    private final String extendedError;

    public ExternApiException(String str, Throwable th) {
        this(str, th, 0, null);
    }

    public int getErrorCode() {
        return this.errorCode;
    }

    public String getExtendedError() {
        return this.extendedError;
    }

    @Override // java.lang.Throwable
    public String toString() {
        return au1.h(new StringBuilder("ExternApiException{errorCode="), this.errorCode, '}');
    }

    public ExternApiException(String str, Throwable th, int i) {
        this(str, th, i, null);
    }

    public ExternApiException(String str, Throwable th, int i, String str2) {
        super(str, th);
        this.errorCode = i;
        this.extendedError = str2;
    }
}
