package defpackage;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class nr5 extends p0 {
    public final b66 c;
    public final int o;

    public nr5(i28 i28Var, jj9 jj9Var, int i) {
        super(i28Var);
        this.c = jj9Var;
        this.o = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.wq5
    public final void g(vae vaeVar) {
        wq5 wq5Var = this.b;
        boolean z = wq5Var instanceof kde;
        b66 b66Var = this.c;
        if (!z) {
            wq5Var.c(new mr5(vaeVar, b66Var, this.o));
            return;
        }
        try {
            Object obj = ((kde) wq5Var).get();
            if (obj == null) {
                b05.a(vaeVar);
                return;
            }
            try {
                Iterator it = ((Iterable) b66Var.mo131apply(obj)).iterator();
                try {
                    if (it.hasNext()) {
                        vaeVar.f(new pr5(vaeVar, it));
                    } else {
                        b05.a(vaeVar);
                    }
                } catch (Throwable th) {
                    c37.B(th);
                    b05.b(th, vaeVar);
                }
            } catch (Throwable th2) {
                c37.B(th2);
                b05.b(th2, vaeVar);
            }
        } catch (Throwable th3) {
            c37.B(th3);
            b05.b(th3, vaeVar);
        }
    }
}
