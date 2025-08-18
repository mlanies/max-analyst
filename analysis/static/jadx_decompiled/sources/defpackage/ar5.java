package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class ar5 extends iqd implements w66 {
    public final wq5 a;
    public final kde b;
    public final ol0 c;

    public ar5(wq5 wq5Var, t66 t66Var, ol0 ol0Var) {
        this.a = wq5Var;
        this.b = t66Var;
        this.c = ol0Var;
    }

    @Override // defpackage.w66
    public final wq5 b() {
        return new yq5(this.a, this.b, this.c, 0);
    }

    @Override // defpackage.iqd
    public final void l(erd erdVar) {
        try {
            Object obj = this.b.get();
            Objects.requireNonNull(obj, "The initialSupplier returned a null value");
            this.a.c(new zq5(erdVar, obj, this.c));
        } catch (Throwable th) {
            c37.B(th);
            iz4.c(th, erdVar);
        }
    }
}
