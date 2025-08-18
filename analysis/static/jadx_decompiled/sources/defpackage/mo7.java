package defpackage;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class mo7 extends ci9 {
    public final rgg n;
    public eh7 o;
    public no7 p;
    public final int l = 0;
    public final Bundle m = null;
    public rgg q = null;

    public mo7(rgg rggVar) {
        this.n = rggVar;
        if (rggVar.b != null) {
            throw new IllegalStateException("There is already a listener registered");
        }
        rggVar.b = this;
        rggVar.a = 0;
    }

    @Override // defpackage.xm7
    public final void g() {
        rgg rggVar = this.n;
        rggVar.c = true;
        rggVar.e = false;
        rggVar.d = false;
        rggVar.j.drainPermits();
        rggVar.a();
        rggVar.h = new sx(rggVar);
        rggVar.b();
    }

    @Override // defpackage.xm7
    public final void h() {
        this.n.c = false;
    }

    @Override // defpackage.xm7
    public final void j(g2a g2aVar) {
        super.j(g2aVar);
        this.o = null;
        this.p = null;
    }

    @Override // defpackage.xm7
    public final void k(Object obj) {
        super.k(obj);
        rgg rggVar = this.q;
        if (rggVar != null) {
            rggVar.e = true;
            rggVar.c = false;
            rggVar.d = false;
            rggVar.f = false;
            this.q = null;
        }
    }

    public final void l() {
        eh7 eh7Var = this.o;
        no7 no7Var = this.p;
        if (eh7Var == null || no7Var == null) {
            return;
        }
        super.j(no7Var);
        e(eh7Var, no7Var);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append("LoaderInfo{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" #");
        sb.append(this.l);
        sb.append(" : ");
        z04.g(sb, this.n);
        sb.append("}}");
        return sb.toString();
    }
}
