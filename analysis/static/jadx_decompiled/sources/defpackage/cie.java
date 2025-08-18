package defpackage;

/* loaded from: classes.dex */
public final class cie {
    public final String a;
    public final int b;
    public final int c;

    public cie(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cie)) {
            return false;
        }
        cie cieVar = (cie) obj;
        return tpa.f(this.a, cieVar.a) && this.b == cieVar.b && this.c == cieVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + k7d.e(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SystemIdInfo(workSpecId=");
        sb.append(this.a);
        sb.append(", generation=");
        sb.append(this.b);
        sb.append(", systemId=");
        return au1.h(sb, this.c, ')');
    }
}
