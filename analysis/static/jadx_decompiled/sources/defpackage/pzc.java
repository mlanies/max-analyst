package defpackage;

/* loaded from: classes.dex */
public final class pzc implements tzc {
    public static final pzc e = new pzc(0, 0, false, false);
    public final int a;
    public final int b;
    public final boolean c;
    public final boolean d;

    public pzc(int i, int i2, boolean z, boolean z2) {
        this.a = i;
        this.b = i2;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pzc)) {
            return false;
        }
        pzc pzcVar = (pzc) obj;
        return this.a == pzcVar.a && this.b == pzcVar.b && this.c == pzcVar.c && this.d == pzcVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ms2.d(k7d.e(this.b, Integer.hashCode(this.a) * 31, 31), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Active(totalMessages=");
        sb.append(this.a);
        sb.append(", selectMessagePosition=");
        sb.append(this.b);
        sb.append(", hasPrev=");
        sb.append(this.c);
        sb.append(", hasAfter=");
        return au1.j(sb, this.d, ")");
    }
}
