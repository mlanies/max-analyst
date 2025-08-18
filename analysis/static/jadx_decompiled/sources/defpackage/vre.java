package defpackage;

/* loaded from: classes.dex */
public final class vre implements ol7 {
    public final String a;
    public final Boolean b;

    public vre(String str, Boolean bool) {
        this.a = str;
        this.b = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vre)) {
            return false;
        }
        vre vreVar = (vre) obj;
        return tpa.f(this.a, vreVar.a) && tpa.f(this.b, vreVar.b);
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
        vre vreVar = ol7Var instanceof vre ? (vre) ol7Var : null;
        if (vreVar == null) {
            return null;
        }
        Boolean bool = this.b;
        Boolean bool2 = vreVar.b;
        if (tpa.f(bool, bool2)) {
            return null;
        }
        return new tre(bool2);
    }

    public final String toString() {
        return "ThemeItem(theme=" + this.a + ", isSelected=" + this.b + ")";
    }
}
