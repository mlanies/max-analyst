package defpackage;

/* loaded from: classes.dex */
public final class eq implements ol7 {
    public final aq a;
    public final Boolean b;

    public eq(aq aqVar, Boolean bool) {
        this.a = aqVar;
        this.b = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eq)) {
            return false;
        }
        eq eqVar = (eq) obj;
        return this.a == eqVar.a && tpa.f(this.b, eqVar.b);
    }

    @Override // defpackage.ol7
    public final long getItemId() {
        return this.a.ordinal();
    }

    @Override // defpackage.ol7
    public final boolean h(ol7 ol7Var) {
        return getItemId() == ol7Var.getItemId();
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Boolean bool = this.b;
        return iHashCode + (bool == null ? 0 : bool.hashCode());
    }

    @Override // defpackage.ol7
    /* renamed from: l */
    public final int getI0() {
        return 0;
    }

    @Override // defpackage.ol7
    public final Object n(Object obj) {
        ol7 ol7Var = (ol7) obj;
        eq eqVar = ol7Var instanceof eq ? (eq) ol7Var : null;
        if (eqVar == null) {
            return null;
        }
        Boolean bool = this.b;
        Boolean bool2 = eqVar.b;
        if (tpa.f(bool, bool2)) {
            return null;
        }
        return new cq(bool2);
    }

    public final String toString() {
        return "AppearanceModeItem(mode=" + this.a + ", isSelected=" + this.b + ")";
    }
}
