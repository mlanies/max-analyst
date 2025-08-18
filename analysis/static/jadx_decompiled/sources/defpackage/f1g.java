package defpackage;

/* loaded from: classes2.dex */
public final class f1g {
    public static final e1g Companion = new e1g();
    public final String a;
    public final String b;
    public final String c;

    public /* synthetic */ f1g(String str, int i, String str2, String str3) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f1g)) {
            return false;
        }
        f1g f1gVar = (f1g) obj;
        return tpa.f(this.a, f1gVar.a) && tpa.f(this.b, f1gVar.b) && tpa.f(this.c, f1gVar.c);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WebAppShareRequest(url=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", text=");
        return zr6.l(sb, this.c, ")");
    }
}
