package defpackage;

/* loaded from: classes2.dex */
public final class uf0 {
    public static final uf0 e = new uf0(null, null, new tf0(false, false), new sf0(false, false));
    public final rx0 a;
    public final dhc b;
    public final tf0 c;
    public final sf0 d;

    public uf0(rx0 rx0Var, dhc dhcVar, tf0 tf0Var, sf0 sf0Var) {
        this.a = rx0Var;
        this.b = dhcVar;
        this.c = tf0Var;
        this.d = sf0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uf0)) {
            return false;
        }
        uf0 uf0Var = (uf0) obj;
        return tpa.f(this.a, uf0Var.a) && tpa.f(this.b, uf0Var.b) && tpa.f(this.c, uf0Var.c) && tpa.f(this.d, uf0Var.d);
    }

    public final int hashCode() {
        rx0 rx0Var = this.a;
        int iHashCode = (rx0Var == null ? 0 : rx0Var.hashCode()) * 31;
        dhc dhcVar = this.b;
        return this.d.hashCode() + ((this.c.hashCode() + ((iHashCode + (dhcVar != null ? dhcVar.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        return "BadNetworkIndicatorConfig(calcNetworkStatusConfig=" + this.a + ", reportNetworkStatusConfig=" + this.b + ", signalingConfig=" + this.c + ", debugLoggingConfig=" + this.d + ")";
    }
}
