package defpackage;

import java.io.Closeable;
import javax.inject.Provider;

/* loaded from: classes.dex */
public final class e14 implements Closeable {
    public Provider X;
    public Provider Y;
    public Provider Z;
    public Provider a;
    public sy4 b;
    public Provider c;
    public nw4 o;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ((gqc) ((h45) this.Y.get())).close();
    }
}
