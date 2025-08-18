package defpackage;

/* loaded from: classes.dex */
public final class vjc extends g0 {
    public g0 h;

    public static void o(g0 g0Var) {
        if (g0Var != null) {
            g0Var.a();
        }
    }

    @Override // defpackage.g0
    public final boolean a() {
        synchronized (this) {
            try {
                if (!super.a()) {
                    return false;
                }
                g0 g0Var = this.h;
                this.h = null;
                o(g0Var);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.g0
    public final synchronized Object e() {
        g0 g0Var;
        g0Var = this.h;
        return g0Var != null ? g0Var.e() : null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x000f  */
    @Override // defpackage.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean f() {
        /*
            r1 = this;
            monitor-enter(r1)
            g0 r0 = r1.h     // Catch: java.lang.Throwable -> Ld
            if (r0 == 0) goto Lf
            boolean r0 = r0.f()     // Catch: java.lang.Throwable -> Ld
            if (r0 == 0) goto Lf
            r0 = 1
            goto L10
        Ld:
            r0 = move-exception
            goto L12
        Lf:
            r0 = 0
        L10:
            monitor-exit(r1)
            return r0
        L12:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Ld
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vjc.f():boolean");
    }

    public final void p(ide ideVar) {
        if (g()) {
            return;
        }
        g0 g0Var = ideVar != null ? (g0) ideVar.get() : null;
        synchronized (this) {
            try {
                if (g()) {
                    o(g0Var);
                    return;
                }
                g0 g0Var2 = this.h;
                this.h = g0Var;
                if (g0Var != null) {
                    g0Var.m(new bf5(1, this), qq1.a);
                }
                o(g0Var2);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
