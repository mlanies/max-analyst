package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class yy9 extends iqd implements x66 {
    public final r1a a;
    public final kde b;
    public final ol0 c;

    public yy9(q28 q28Var, t66 t66Var, m2e m2eVar) {
        this.a = q28Var;
        this.b = t66Var;
        this.c = m2eVar;
    }

    @Override // defpackage.x66
    public final qy9 d() {
        return new xy9(this.a, this.b, this.c, 0);
    }

    @Override // defpackage.iqd
    public final void l(erd erdVar) {
        try {
            Object obj = this.b.get();
            Objects.requireNonNull(obj, "The initialSupplier returned a null value");
            this.a.a(new wy9(erdVar, obj, this.c, 1));
        } catch (Throwable th) {
            c37.B(th);
            iz4.c(th, erdVar);
        }
    }
}
