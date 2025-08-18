package defpackage;

import java.io.Closeable;

/* loaded from: classes.dex */
public final class e8c implements Closeable {
    public final fu0 a;
    public final eu0 b;
    public final /* synthetic */ od c;

    public e8c(od odVar, y7c y7cVar, x7c x7cVar) {
        this.c = odVar;
        this.a = y7cVar;
        this.b = x7cVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.c.a(true, true, null);
    }
}
