package com.google.android.gms.common.api;

import defpackage.pe5;

/* loaded from: classes.dex */
public final class UnsupportedApiCallException extends UnsupportedOperationException {
    public final pe5 a;

    public UnsupportedApiCallException(pe5 pe5Var) {
        this.a = pe5Var;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return "Missing ".concat(String.valueOf(this.a));
    }
}
