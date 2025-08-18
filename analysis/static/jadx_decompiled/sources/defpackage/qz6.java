package defpackage;

import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class qz6 extends g0 {
    public ArrayList h;
    public int i;
    public int j;
    public AtomicInteger k;
    public Throwable l;
    public Map m;
    public final /* synthetic */ rz6 n;

    public qz6(rz6 rz6Var) {
        this.n = rz6Var;
        if (rz6Var.b) {
            return;
        }
        p();
    }

    public static void o(qz6 qz6Var, int i, g0 g0Var) {
        g0 g0VarQ;
        Throwable th;
        synchronized (qz6Var) {
            g0VarQ = g0Var == qz6Var.s() ? null : g0Var == qz6Var.r(i) ? qz6Var.q(i) : g0Var;
        }
        if (g0VarQ != null) {
            g0VarQ.a();
        }
        if (i == 0) {
            qz6Var.l = g0Var.c();
            qz6Var.m = g0Var.a;
        }
        if (qz6Var.k.incrementAndGet() != qz6Var.j || (th = qz6Var.l) == null) {
            return;
        }
        qz6Var.j(th, qz6Var.m);
    }

    @Override // defpackage.g0
    public final boolean a() {
        if (this.n.b) {
            p();
        }
        synchronized (this) {
            try {
                if (!super.a()) {
                    return false;
                }
                ArrayList arrayList = this.h;
                this.h = null;
                if (arrayList == null) {
                    return true;
                }
                for (int i = 0; i < arrayList.size(); i++) {
                    g0 g0Var = (g0) arrayList.get(i);
                    if (g0Var != null) {
                        g0Var.a();
                    }
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.g0
    public final synchronized Object e() {
        g0 g0VarS;
        try {
            if (this.n.b) {
                p();
            }
            g0VarS = s();
        } catch (Throwable th) {
            throw th;
        }
        return g0VarS != null ? g0VarS.e() : null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001b  */
    @Override // defpackage.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean f() {
        /*
            r1 = this;
            monitor-enter(r1)
            rz6 r0 = r1.n     // Catch: java.lang.Throwable -> Lb
            boolean r0 = r0.b     // Catch: java.lang.Throwable -> Lb
            if (r0 == 0) goto Ld
            r1.p()     // Catch: java.lang.Throwable -> Lb
            goto Ld
        Lb:
            r0 = move-exception
            goto L1e
        Ld:
            g0 r0 = r1.s()     // Catch: java.lang.Throwable -> Lb
            if (r0 == 0) goto L1b
            boolean r0 = r0.f()     // Catch: java.lang.Throwable -> Lb
            if (r0 == 0) goto L1b
            r0 = 1
            goto L1c
        L1b:
            r0 = 0
        L1c:
            monitor-exit(r1)
            return r0
        L1e:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qz6.f():boolean");
    }

    public final void p() {
        if (this.k != null) {
            return;
        }
        synchronized (this) {
            try {
                if (this.k == null) {
                    this.k = new AtomicInteger(0);
                    int size = this.n.a.size();
                    this.j = size;
                    this.i = size;
                    this.h = new ArrayList(size);
                    for (int i = 0; i < size; i++) {
                        g0 g0Var = (g0) ((ide) this.n.a.get(i)).get();
                        this.h.add(g0Var);
                        g0Var.m(new pz6(this, i), qq1.a);
                        if (!g0Var.f()) {
                        }
                    }
                }
            } finally {
            }
        }
    }

    public final synchronized g0 q(int i) {
        g0 g0Var;
        ArrayList arrayList = this.h;
        g0Var = null;
        if (arrayList != null && i < arrayList.size()) {
            g0Var = (g0) this.h.set(i, null);
        }
        return g0Var;
    }

    public final synchronized g0 r(int i) {
        ArrayList arrayList;
        arrayList = this.h;
        return (arrayList == null || i >= arrayList.size()) ? null : (g0) this.h.get(i);
    }

    public final synchronized g0 s() {
        return r(this.i);
    }
}
