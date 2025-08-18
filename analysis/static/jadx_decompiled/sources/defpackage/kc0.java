package defpackage;

/* loaded from: classes.dex */
public final class kc0 {
    public final String a;
    public final int b;
    public final ha0 c;

    public kc0(String str, int i, ha0 ha0Var) {
        this.a = str;
        this.b = i;
        this.c = ha0Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kc0)) {
            return false;
        }
        kc0 kc0Var = (kc0) obj;
        if (this.a.equals(kc0Var.a) && this.b == kc0Var.b) {
            ha0 ha0Var = kc0Var.c;
            ha0 ha0Var2 = this.c;
            if (ha0Var2 == null) {
                if (ha0Var == null) {
                    return true;
                }
            } else if (ha0Var2.equals(ha0Var)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003;
        ha0 ha0Var = this.c;
        return (ha0Var == null ? 0 : ha0Var.hashCode()) ^ iHashCode;
    }

    public final String toString() {
        return "VideoMimeInfo{mimeType=" + this.a + ", profile=" + this.b + ", compatibleVideoProfile=" + this.c + "}";
    }
}
