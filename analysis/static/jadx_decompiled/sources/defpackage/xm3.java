package defpackage;

/* loaded from: classes2.dex */
public final class xm3 extends gle {
    public final wm3 c;

    public xm3(wm3 wm3Var) {
        this.c = wm3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xm3) && tpa.f(this.c, ((xm3) obj).c);
    }

    public final int hashCode() {
        wm3 wm3Var = this.c;
        if (wm3Var == null) {
            return 0;
        }
        return wm3Var.hashCode();
    }

    @Override // defpackage.zje
    public final String toString() {
        return "CONTACT_INFO_BY_PHONE.Response(contact=" + String.valueOf(this.c) + ')';
    }
}
