package defpackage;

/* loaded from: classes2.dex */
public final class ye0 {
    public final int a;
    public final int b;

    public ye0(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ye0)) {
            return false;
        }
        ye0 ye0Var = (ye0) obj;
        return this.a == ye0Var.a && this.b == ye0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackgroundLocalTopBarColors(primary=");
        sb.append(this.a);
        sb.append(", secondary=");
        return zr6.j(sb, this.b, ")");
    }
}
