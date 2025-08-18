package defpackage;

/* loaded from: classes.dex */
public final class t07 extends h13 {
    public final wu0 u0;
    public ph4 v0;
    public long w0;
    public volatile boolean x0;

    public t07(r24 r24Var, z24 z24Var, oy5 oy5Var, int i, Object obj, wu0 wu0Var) {
        super(r24Var, z24Var, 2, oy5Var, i, obj, -9223372036854775807L, -9223372036854775807L);
        this.u0 = wu0Var;
    }

    @Override // defpackage.fo7
    public final void a() {
        this.x0 = true;
    }

    @Override // defpackage.fo7
    public final void load() {
        if (this.w0 == 0) {
            this.u0.b(this.v0, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            z24 z24VarB = this.b.b(this.w0);
            t1e t1eVar = this.t0;
            ra4 ra4Var = new ra4(t1eVar, z24VarB.f, t1eVar.L(z24VarB));
            while (!this.x0) {
                try {
                    int i = this.u0.a.i(ra4Var, wu0.u0);
                    boolean z = false;
                    np8.f(i != 1);
                    if (i == 0) {
                        z = true;
                    }
                    if (!z) {
                        break;
                    }
                } finally {
                    this.w0 = ra4Var.o - this.b.f;
                }
            }
        } finally {
            kq0.f(this.t0);
        }
    }
}
