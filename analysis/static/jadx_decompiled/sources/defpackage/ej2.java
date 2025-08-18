package defpackage;

/* loaded from: classes.dex */
public final class ej2 {
    public final sb8 a;
    public final gef b;

    public /* synthetic */ ej2(qb8 qb8Var, int i) {
        this((i & 1) != 0 ? null : qb8Var, (gef) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ej2)) {
            return false;
        }
        ej2 ej2Var = (ej2) obj;
        return tpa.f(this.a, ej2Var.a) && tpa.f(this.b, ej2Var.b);
    }

    public final int hashCode() {
        sb8 sb8Var = this.a;
        int iHashCode = (sb8Var == null ? 0 : sb8Var.hashCode()) * 31;
        gef gefVar = this.b;
        return iHashCode + (gefVar != null ? gefVar.hashCode() : 0);
    }

    public final String toString() {
        return "VideoPageState(mediaItem=" + this.a + ", videoContent=" + this.b + ")";
    }

    public ej2(sb8 sb8Var, gef gefVar) {
        this.a = sb8Var;
        this.b = gefVar;
    }
}
