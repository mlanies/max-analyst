package defpackage;

import java.io.Closeable;

/* loaded from: classes.dex */
public final class xf implements Closeable {
    public final int a;
    public final o43 b;

    public xf(int i, v84 v84Var) {
        this.a = i;
        this.b = v84Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.b.close();
    }
}
