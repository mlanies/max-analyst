package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class cad implements dad {
    public final AtomicBoolean a = new AtomicBoolean(false);
    public final dad b;

    public cad(dad dadVar) {
        this.b = dadVar;
    }

    @Override // defpackage.dad
    public final void a(fad fadVar) {
        if (this.a.get()) {
            return;
        }
        this.b.a(fadVar);
    }

    public final void b() {
        this.a.set(true);
    }
}
