package defpackage;

/* loaded from: classes.dex */
public final class wb0 {
    public final int a;
    public final int b;
    public final boolean c;
    public final boolean d;

    public wb0(int i, int i2, boolean z, boolean z2) {
        this.a = i;
        this.b = i2;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof wb0)) {
            return false;
        }
        wb0 wb0Var = (wb0) obj;
        return this.a == wb0Var.a && this.b == wb0Var.b && this.c == wb0Var.c && this.d == wb0Var.d;
    }

    public final int hashCode() {
        return ((((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ (this.c ? 1231 : 1237)) * 1000003) ^ (this.d ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FeatureSettings{cameraMode=");
        sb.append(this.a);
        sb.append(", requiredMaxBitDepth=");
        sb.append(this.b);
        sb.append(", previewStabilizationOn=");
        sb.append(this.c);
        sb.append(", ultraHdrOn=");
        return au1.j(sb, this.d, "}");
    }
}
