package defpackage;

import android.util.Pair;

/* loaded from: classes.dex */
public final class hte extends rg4 {
    public final /* synthetic */ ite c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hte(ite iteVar, fi0 fi0Var) {
        super(fi0Var);
        this.c = iteVar;
    }

    @Override // defpackage.rg4, defpackage.fi0
    public final void d() {
        this.b.c();
        m();
    }

    @Override // defpackage.rg4, defpackage.fi0
    public final void f(Throwable th) {
        this.b.e(th);
        m();
    }

    @Override // defpackage.fi0
    public final void h(int i, Object obj) {
        this.b.g(i, obj);
        if (fi0.a(i)) {
            m();
        }
    }

    public final void m() {
        Pair pair;
        synchronized (this.c) {
            try {
                pair = (Pair) this.c.c.poll();
                if (pair == null) {
                    ite iteVar = this.c;
                    iteVar.b--;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (pair != null) {
            this.c.d.execute(new h76((Object) this, (Object) pair, false, 27));
        }
    }
}
