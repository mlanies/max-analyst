package defpackage;

/* loaded from: classes.dex */
public final class z02 extends kbe {
    public final /* synthetic */ int Z = 0;
    public Object s0;

    public /* synthetic */ z02() {
        super(3);
    }

    @Override // defpackage.q54
    public final void w() {
        switch (this.Z) {
            case 0:
                v02 v02Var = (v02) this.s0;
                v02Var.getClass();
                b12 b12Var = (b12) v02Var.b;
                b12Var.getClass();
                v();
                b12Var.b.add(this);
                break;
            default:
                ((vn0) this.s0).m(this);
                break;
        }
    }

    public z02(vn0 vn0Var) {
        super(3);
        this.s0 = vn0Var;
    }
}
