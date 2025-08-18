package defpackage;

/* loaded from: classes2.dex */
public final class ql {
    public final String a;
    public final String b;

    public ql(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ql)) {
            return false;
        }
        ql qlVar = (ql) obj;
        return tpa.f(this.a, qlVar.a) && tpa.f(this.b, qlVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Info(token=");
        sb.append(this.a);
        sb.append(", apiEndpoint=");
        return zr6.l(sb, this.b, ")");
    }
}
