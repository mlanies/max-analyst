package defpackage;

/* loaded from: classes.dex */
public final class d81 extends hqd {
    public final o9g F0;
    public final je7 G0;

    public d81(fk3 fk3Var, o9g o9gVar) {
        super(fk3Var);
        this.F0 = o9gVar;
        this.G0 = tu0.r(3, new x5(24, this));
    }

    @Override // defpackage.hqd
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public final void A(il6 il6Var) {
        fk3 fk3Var = (fk3) this.a;
        fk3Var.setId(Long.hashCode(il6Var.w0));
        fk3Var.setTitle(il6Var.Y);
        boolean z = il6Var.v0 instanceof xk6;
        long j = il6Var.b;
        if (z) {
            fk3Var.E(j, null, null);
            fk3Var.setAvatarOverlay((od0) this.G0.getValue());
        } else {
            fk3Var.setAvatarOverlay(null);
            String str = il6Var.o;
            if (str == null) {
                str = "";
            }
            fk3Var.E(j, il6Var.c, str);
        }
        fk3Var.setDescription(il6Var.t0);
        fk3Var.setTime(il6Var.Z);
        fk3Var.C(il6Var.s0);
        int i = il6Var.u0;
        fk3Var.A(i == 1);
        fk3Var.B(i == 2);
        fk3Var.R0 = il6Var.a;
        fk3Var.P0 = this.F0;
    }
}
