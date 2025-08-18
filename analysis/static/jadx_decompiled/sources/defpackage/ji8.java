package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class ji8 implements ri8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ si8 b;

    public /* synthetic */ ji8(si8 si8Var, int i) {
        this.a = i;
        this.b = si8Var;
    }

    @Override // defpackage.ri8
    public final void b(oh8 oh8Var) {
        switch (this.a) {
            case 0:
                this.b.f.s.K0();
                break;
            case 1:
                ii8 ii8Var = this.b.f;
                if (ii8Var.s.W() != null) {
                    ii8Var.s(oh8Var);
                    ii8Var.e.getClass();
                    fm9.F(new sad(-6));
                    break;
                }
                break;
            case 2:
                this.b.f.s.V();
                break;
            case 3:
                this.b.f.s.D();
                break;
            case 4:
                this.b.f.s.L0();
                break;
            case 5:
                this.b.f.s.prepare();
                break;
            case 6:
                this.b.f.s.stop();
                break;
            case 7:
                ii8 ii8Var2 = this.b.f;
                x4b x4bVar = ii8Var2.s;
                if (!oaf.c0(x4bVar, ii8Var2.p)) {
                    if (x4bVar != null && x4bVar.t1(1)) {
                        x4bVar.pause();
                        break;
                    }
                } else {
                    oaf.I(x4bVar);
                    break;
                }
                break;
            case 8:
                this.b.f.s.J0();
                break;
            case 9:
                this.b.f.s.f0();
                break;
            case 10:
                this.b.f.g(oh8Var, true);
                break;
            default:
                x4b x4bVar2 = this.b.f.s;
                if (x4bVar2 != null && x4bVar2.t1(1)) {
                    x4bVar2.pause();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ ji8(si8 si8Var, e5c e5cVar) {
        this.a = 1;
        this.b = si8Var;
    }
}
