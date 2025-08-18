package defpackage;

/* loaded from: classes2.dex */
public final class h2e extends lz {
    public final je7 c;
    public final je7 d;
    public final zi5 e;
    public rx f;
    public final g2e g;

    public h2e(l20 l20Var, khe kheVar, khe kheVar2, zi5 zi5Var) {
        super(l20Var);
        this.g = new g2e(this);
        this.c = kheVar;
        this.d = kheVar2;
        this.e = zi5Var;
    }

    @Override // defpackage.lz
    public final void a() {
        b(this.f, new Exception("cancelled"));
    }

    @Override // defpackage.lz
    public final qy9 d() {
        qy9 qy9VarD = super.d();
        if (qy9VarD != null) {
            return qy9VarD;
        }
        rx rxVar = this.f;
        if (rxVar != null) {
            return rxVar;
        }
        this.f = new rx();
        f20 f20Var = this.a.f;
        if (f20Var.j == 4) {
            om9.a(f20Var.l, 1, true).e(this.g);
        } else {
            String str = f20Var.h;
            if (oag.t(str)) {
                str = f20Var.b;
            }
            ((av6) this.d.getValue()).a(str, new w4d(26, this));
        }
        return this.f;
    }
}
