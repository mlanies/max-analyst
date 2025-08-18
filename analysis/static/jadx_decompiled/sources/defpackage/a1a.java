package defpackage;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class a1a extends AtomicInteger implements zl4 {
    public final d1a a;
    public final f2a b;
    public Serializable c;
    public volatile boolean o;

    public a1a(d1a d1aVar, f2a f2aVar) {
        this.a = d1aVar;
        this.b = f2aVar;
    }

    @Override // defpackage.zl4
    public final void g() {
        if (this.o) {
            return;
        }
        this.o = true;
        this.a.a(this);
        this.c = null;
    }

    @Override // defpackage.zl4
    public final boolean h() {
        return this.o;
    }
}
