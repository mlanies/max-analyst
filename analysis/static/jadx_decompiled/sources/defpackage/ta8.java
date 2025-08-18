package defpackage;

import android.net.Uri;
import java.io.Closeable;

/* loaded from: classes2.dex */
public final class ta8 implements la5, Closeable {
    public final la5 a;
    public final sa8 b;
    public final Uri c;

    public ta8(la5 la5Var, sa8 sa8Var) {
        this.a = la5Var;
        this.b = sa8Var;
        Uri uri = sa8Var.a.getUri();
        if (uri == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        this.c = uri;
    }

    @Override // defpackage.la5
    public final void S(pa5 pa5Var) {
        this.a.S(pa5Var);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        release();
    }

    @Override // defpackage.la5
    public final void d(long j, long j2) {
        this.a.d(j, j2);
    }

    @Override // defpackage.la5
    public final int g(na5 na5Var, lh4 lh4Var) {
        return this.a.g(na5Var, lh4Var);
    }

    @Override // defpackage.la5
    public final boolean n(na5 na5Var) {
        return this.a.n(na5Var);
    }

    @Override // defpackage.la5
    public final void release() {
        this.a.release();
        this.b.close();
    }
}
