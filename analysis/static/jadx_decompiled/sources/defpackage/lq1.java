package defpackage;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class lq1 {
    public Object a;
    public oq1 b;
    public nic c;
    public boolean d;

    public final void a(Runnable runnable, Executor executor) {
        nic nicVar = this.c;
        if (nicVar != null) {
            nicVar.d(runnable, executor);
        }
    }

    public final boolean b(Object obj) {
        this.d = true;
        oq1 oq1Var = this.b;
        boolean z = oq1Var != null && oq1Var.b.i(obj);
        if (z) {
            this.a = null;
            this.b = null;
            this.c = null;
        }
        return z;
    }

    public final void c() {
        this.d = true;
        oq1 oq1Var = this.b;
        if (oq1Var == null || !oq1Var.b.cancel(true)) {
            return;
        }
        this.a = null;
        this.b = null;
        this.c = null;
    }

    public final boolean d(Throwable th) {
        this.d = true;
        oq1 oq1Var = this.b;
        boolean z = oq1Var != null && oq1Var.b.j(th);
        if (z) {
            this.a = null;
            this.b = null;
            this.c = null;
        }
        return z;
    }

    public final void finalize() {
        nic nicVar;
        oq1 oq1Var = this.b;
        if (oq1Var != null) {
            nq1 nq1Var = oq1Var.b;
            if (!nq1Var.isDone()) {
                nq1Var.j(new s0("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.a, 3));
            }
        }
        if (this.d || (nicVar = this.c) == null) {
            return;
        }
        nicVar.i(null);
    }
}
