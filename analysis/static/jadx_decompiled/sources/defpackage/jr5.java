package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class jr5 extends p0 {
    public final int X;
    public final int Y;
    public final b66 c;
    public final boolean o;

    public jr5(wq5 wq5Var, dme dmeVar, int i, int i2) {
        super(wq5Var);
        this.c = dmeVar;
        this.o = false;
        this.X = i;
        this.Y = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.wq5
    public final void g(vae vaeVar) {
        wq5 wq5Var = this.b;
        boolean z = wq5Var instanceof kde;
        b66 b66Var = this.c;
        if (!z) {
            wq5Var.c(new ir5(vaeVar, b66Var, this.o, this.X, this.Y));
            return;
        }
        try {
            Object obj = ((kde) wq5Var).get();
            if (obj == null) {
                b05.a(vaeVar);
                return;
            }
            try {
                Object objMo131apply = b66Var.mo131apply(obj);
                Objects.requireNonNull(objMo131apply, "The mapper returned a null Publisher");
                ypb ypbVar = (ypb) objMo131apply;
                if (!(ypbVar instanceof kde)) {
                    ((wq5) ypbVar).d(vaeVar);
                    return;
                }
                try {
                    Object obj2 = ((kde) ypbVar).get();
                    if (obj2 == null) {
                        b05.a(vaeVar);
                    } else {
                        vaeVar.f(new lsc(vaeVar, obj2));
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
