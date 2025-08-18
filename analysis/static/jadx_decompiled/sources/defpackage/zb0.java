package defpackage;

/* loaded from: classes.dex */
public final class zb0 {
    public final int a = 0;
    public final kee b;

    public zb0(kee keeVar) {
        if (keeVar == null) {
            throw new NullPointerException("Null surfaceOutput");
        }
        this.b = keeVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zb0)) {
            return false;
        }
        zb0 zb0Var = (zb0) obj;
        return this.a == zb0Var.a && this.b.equals(zb0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "Event{eventCode=" + this.a + ", surfaceOutput=" + this.b + "}";
    }
}
