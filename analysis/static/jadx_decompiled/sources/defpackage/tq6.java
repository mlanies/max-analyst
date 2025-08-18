package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class tq6 extends AtomicReference implements zl4, jq6 {
    public final String X;
    public final xtc Y;
    public final f2a Z;
    public final je7 a;
    public final int b;
    public final String c;
    public final String o;
    public final AtomicBoolean s0 = new AtomicBoolean();
    public long t0;

    public tq6(f2a f2aVar, je7 je7Var, int i, String str, String str2, String str3, xtc xtcVar) {
        this.a = je7Var;
        this.b = i;
        this.c = str;
        this.o = str2;
        this.X = str3;
        this.Y = xtcVar;
        this.Z = f2aVar;
    }

    public final void a(boolean z) {
        if (this.s0.compareAndSet(false, true)) {
            xtc xtcVar = this.Y;
            if (!xtcVar.h()) {
                xtcVar.g();
            }
            if (z) {
                hm9.n("uq6", "cancelUpload");
                bk5 bk5Var = (bk5) get();
                if (bk5Var != null) {
                    synchronized (bk5Var) {
                        try {
                            if (!bk5Var.b) {
                                if (bk5Var.a != null && !bk5Var.a.x0) {
                                    bk5Var.a.d();
                                }
                                bk5Var.b = true;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            }
        }
    }

    public final void b(String str, eq6 eq6Var) {
        if (this.s0.get()) {
            return;
        }
        this.Y.b(new v05(this, str, eq6Var, 7));
    }

    @Override // defpackage.zl4
    public final void g() {
        a(true);
    }

    @Override // defpackage.zl4
    public final boolean h() {
        return this.s0.get();
    }
}
