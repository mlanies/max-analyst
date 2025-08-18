package androidx.media3.datasource;

import defpackage.zr6;
import java.util.Map;

/* loaded from: classes.dex */
public final class HttpDataSource$InvalidResponseCodeException extends HttpDataSource$HttpDataSourceException {
    public final Map X;
    public final int o;

    public HttpDataSource$InvalidResponseCodeException(int i, DataSourceException dataSourceException, Map map) {
        super(zr6.h(i, "Response code: "), dataSourceException, 2004);
        this.o = i;
        this.X = map;
    }
}
