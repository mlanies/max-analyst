package com.google.android.exoplayer2.upstream;

import defpackage.z24;

/* loaded from: classes.dex */
public final class HttpDataSource$InvalidContentTypeException extends HttpDataSource$HttpDataSourceException {
    /* JADX WARN: Illegal instructions before constructor call */
    public HttpDataSource$InvalidContentTypeException(String str, z24 z24Var) {
        String strValueOf = String.valueOf(str);
        super(strValueOf.length() != 0 ? "Invalid content type: ".concat(strValueOf) : new String("Invalid content type: "), z24Var, 2003);
    }
}
