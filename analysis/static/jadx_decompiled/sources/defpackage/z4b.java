package defpackage;

/* loaded from: classes.dex */
public final class z4b extends s06 {
    public final /* synthetic */ int f = 0;
    public final Object g;

    public z4b(mue mueVar, tb8 tb8Var) {
        super(mueVar);
        this.g = tb8Var;
    }

    @Override // defpackage.s06, defpackage.mue
    public hue g(int i, hue hueVar, boolean z) {
        switch (this.f) {
            case 0:
                mue mueVar = this.e;
                hue hueVarG = mueVar.g(i, hueVar, z);
                if (mueVar.n(hueVarG.c, (kue) this.g, 0L).a()) {
                    hueVarG.j(hueVar.a, hueVar.b, hueVar.c, hueVar.d, hueVar.e, s8.g, true);
                } else {
                    hueVarG.f = true;
                }
                return hueVarG;
            default:
                return super.g(i, hueVar, z);
        }
    }

    @Override // defpackage.s06, defpackage.mue
    public kue n(int i, kue kueVar, long j) {
        switch (this.f) {
            case 1:
                super.n(i, kueVar, j);
                tb8 tb8Var = (tb8) this.g;
                kueVar.c = tb8Var;
                ib8 ib8Var = tb8Var.b;
                kueVar.b = ib8Var != null ? ib8Var.h : null;
                return kueVar;
            default:
                return super.n(i, kueVar, j);
        }
    }

    public z4b(mue mueVar) {
        super(mueVar);
        this.g = new kue();
    }
}
