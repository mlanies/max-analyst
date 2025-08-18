package defpackage;

/* loaded from: classes2.dex */
public final class xgf {
    public final boolean a;
    public final boolean b;

    public xgf(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xgf)) {
            return false;
        }
        xgf xgfVar = (xgf) obj;
        return this.a == xgfVar.a && this.b == xgfVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "TorchState(isAvailable=" + this.a + ", isEnabled=" + this.b + ")";
    }
}
