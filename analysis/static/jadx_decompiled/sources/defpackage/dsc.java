package defpackage;

import java.io.Closeable;

/* loaded from: classes.dex */
public final class dsc implements ug7, Closeable {
    public final String a;
    public final csc b;
    public boolean c;

    public dsc(String str, csc cscVar) {
        this.a = str;
        this.b = cscVar;
    }

    public final void a(mm mmVar, gh7 gh7Var) {
        if (!(!this.c)) {
            throw new IllegalStateException("Already attached to lifecycleOwner".toString());
        }
        this.c = true;
        gh7Var.a(this);
        mmVar.f(this.a, this.b.e);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // defpackage.ug7
    public final void m(eh7 eh7Var, eg7 eg7Var) {
        if (eg7Var == eg7.ON_DESTROY) {
            this.c = false;
            eh7Var.Q().f(this);
        }
    }
}
