package defpackage;

/* loaded from: classes.dex */
public final class u07 extends j13 {
    public final k13 u0;
    public qz7 v0;
    public long w0;
    public volatile boolean x0;

    public u07(t24 t24Var, a34 a34Var, qy5 qy5Var, int i, Object obj, k13 k13Var) {
        super(t24Var, a34Var, 2, qy5Var, i, obj, -9223372036854775807L, -9223372036854775807L);
        this.u0 = k13Var;
    }

    @Override // defpackage.go7
    public final void a() {
        this.x0 = true;
    }

    @Override // defpackage.go7
    public final void load() {
        if (this.w0 == 0) {
            ((xu0) this.u0).b(this.v0, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            a34 a34VarB = this.b.b(this.w0);
            u1e u1eVar = this.t0;
            sa4 sa4Var = new sa4(u1eVar, a34VarB.f, u1eVar.G(a34VarB));
            while (!this.x0) {
                try {
                    int iG = ((xu0) this.u0).a.g(sa4Var, xu0.v0);
                    boolean z = false;
                    fm9.k(iG != 1);
                    if (iG == 0) {
                        z = true;
                    }
                    if (!z) {
                        break;
                    }
                } finally {
                    this.w0 = sa4Var.o - this.b.f;
                }
            }
        } finally {
            mr0.i(this.t0);
        }
    }
}
