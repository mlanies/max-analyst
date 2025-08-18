package defpackage;

/* loaded from: classes.dex */
public final class j1b {
    public final int a;
    public final int b;

    public j1b(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j1b)) {
            return false;
        }
        j1b j1bVar = (j1b) obj;
        return this.a == j1bVar.a && this.b == j1bVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PipBoundariesOffset(topYOffset=");
        sb.append(this.a);
        sb.append(", bottomYOffset=");
        return zr6.j(sb, this.b, ")");
    }
}
