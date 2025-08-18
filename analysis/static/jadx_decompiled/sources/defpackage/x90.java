package defpackage;

/* loaded from: classes.dex */
public final class x90 {
    public final String a;
    public final pa0 b;

    public x90(String str, pa0 pa0Var) {
        if (str == null) {
            throw new NullPointerException("Null cameraIdString");
        }
        this.a = str;
        if (pa0Var == null) {
            throw new NullPointerException("Null cameraConfigId");
        }
        this.b = pa0Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof x90)) {
            return false;
        }
        x90 x90Var = (x90) obj;
        return this.a.equals(x90Var.a) && this.b.equals(x90Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "CameraId{cameraIdString=" + this.a + ", cameraConfigId=" + this.b + "}";
    }
}
