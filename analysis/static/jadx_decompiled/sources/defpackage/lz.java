package defpackage;

import java.io.File;

/* loaded from: classes2.dex */
public abstract class lz {
    public final l20 a;
    public volatile boolean b;

    public lz(l20 l20Var) {
        this.a = l20Var;
    }

    public abstract void a();

    public final void b(rx rxVar, Throwable th) {
        if (rxVar != null) {
            rxVar.onError(th);
        }
        this.b = true;
    }

    public void c(rx rxVar, File file) {
        if (this.b) {
            return;
        }
        rxVar.e(file);
        rxVar.b();
    }

    public qy9 d() {
        String str = this.a.s;
        if (pag.l(str)) {
            return qy9.m(new File(str));
        }
        return null;
    }
}
