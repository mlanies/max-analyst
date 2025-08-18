package defpackage;

/* loaded from: classes2.dex */
public final class dzf implements kzf {
    public final String a;
    public final String b;

    public dzf(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dzf)) {
            return false;
        }
        dzf dzfVar = (dzf) obj;
        return tpa.f(this.a, dzfVar.a) && tpa.f(this.b, dzfVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SendJsEvent(name=");
        sb.append(this.a);
        sb.append(", data=");
        return zr6.l(sb, this.b, ")");
    }
}
