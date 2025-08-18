package defpackage;

/* loaded from: classes.dex */
public final class ve1 implements ol7 {
    public final boolean X;
    public final boolean Y;
    public final long Z;
    public final gg1 a;
    public final String b;
    public final String c;
    public final boolean o;
    public final Integer s0;
    public final long t0;

    public ve1(gg1 gg1Var, String str, String str2, boolean z, boolean z2, boolean z3, long j, Integer num) {
        this.a = gg1Var;
        this.b = str;
        this.c = str2;
        this.o = z;
        this.X = z2;
        this.Y = z3;
        this.Z = j;
        this.s0 = num;
        this.t0 = gg1Var.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ve1)) {
            return false;
        }
        ve1 ve1Var = (ve1) obj;
        return tpa.f(this.a, ve1Var.a) && tpa.f(this.b, ve1Var.b) && tpa.f(this.c, ve1Var.c) && this.o == ve1Var.o && this.X == ve1Var.X && this.Y == ve1Var.Y && this.Z == ve1Var.Z && tpa.f(this.s0, ve1Var.s0);
    }

    @Override // defpackage.ol7
    public final long getItemId() {
        return this.t0;
    }

    @Override // defpackage.ol7
    public final boolean h(ol7 ol7Var) {
        return this.t0 == ol7Var.getItemId();
    }

    public final int hashCode() {
        int iM = h4f.m(ms2.d(ms2.d(ms2.d(rh4.d(rh4.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.o), 31, this.X), 31, this.Y), 31, this.Z);
        Integer num = this.s0;
        return iM + (num == null ? 0 : num.hashCode());
    }

    @Override // defpackage.ol7
    /* renamed from: l */
    public final int getI0() {
        return 1;
    }

    @Override // defpackage.ol7
    public final Object n(Object obj) {
        ve1 ve1Var = (ve1) ((ol7) obj);
        kl7 kl7VarL = j1e.l();
        String str = this.b;
        String str2 = ve1Var.b;
        if (!tpa.f(str, str2)) {
            kl7VarL.add(new se1(str2));
        }
        Integer num = this.s0;
        Integer num2 = ve1Var.s0;
        if (!tpa.f(num, num2)) {
            kl7VarL.add(new qe1(num2));
        }
        String str3 = this.c;
        String str4 = ve1Var.c;
        boolean zF = tpa.f(str3, str4);
        gg1 gg1Var = this.a;
        gg1 gg1Var2 = ve1Var.a;
        if (!zF || !tpa.f(gg1Var, gg1Var2) || !tpa.f(str, str2)) {
            kl7VarL.add(new pe1(gg1Var2, str2, str4));
        }
        boolean z = this.o;
        boolean z2 = ve1Var.o;
        if (z != z2 || !tpa.f(gg1Var, gg1Var2)) {
            kl7VarL.add(new re1(gg1Var2, z2));
        }
        boolean z3 = this.Y;
        boolean z4 = ve1Var.Y;
        if (z3 != z4) {
            kl7VarL.add(new te1(z4));
        }
        return j1e.d(kl7VarL);
    }

    public final String toString() {
        return "CallOpponentInfoState(opponentId=" + this.a + ", userName=" + this.b + ", avatar=" + this.c + ", hasMoreAction=" + this.o + ", isAdmin=" + this.X + ", isRaiseHand=" + this.Y + ", isRaiseHandTime=" + this.Z + ", description=" + this.s0 + ")";
    }
}
