package defpackage;

/* loaded from: classes.dex */
public final class go6 implements ol7 {
    public final String a;
    public final Boolean b;

    public go6(String str, Boolean bool) {
        this.a = str;
        this.b = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof go6)) {
            return false;
        }
        go6 go6Var = (go6) obj;
        return tpa.f(this.a, go6Var.a) && tpa.f(this.b, go6Var.b);
    }

    @Override // defpackage.ol7
    public final long getItemId() {
        return this.a.hashCode();
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
        go6 go6Var = ol7Var instanceof go6 ? (go6) ol7Var : null;
        if (go6Var == null) {
            return null;
        }
        Boolean bool = this.b;
        Boolean bool2 = go6Var.b;
        if (tpa.f(bool, bool2)) {
            return null;
        }
        return new fo6(bool2);
    }

    public final String toString() {
        return "HostItem(host=" + this.a + ", isSelected=" + this.b + ")";
    }
}
