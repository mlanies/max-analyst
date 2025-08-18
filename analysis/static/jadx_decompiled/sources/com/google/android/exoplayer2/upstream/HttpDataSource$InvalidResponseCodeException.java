package com.google.android.exoplayer2.upstream;

import defpackage.z24;
import defpackage.z7b;
import java.util.Map;

/* loaded from: classes.dex */
public final class HttpDataSource$InvalidResponseCodeException extends HttpDataSource$HttpDataSourceException {
    public final int c;
    public final Map o;

    public HttpDataSource$InvalidResponseCodeException(int i, String str, DataSourceException dataSourceException, Map map, z24 z24Var) {
        super(z7b.h(26, i, "Response code: "), dataSourceException, z24Var, 2004);
        this.c = i;
        this.o = map;
    }
}
