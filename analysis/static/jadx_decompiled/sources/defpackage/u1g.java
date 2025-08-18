package defpackage;

/* loaded from: classes2.dex */
public final class u1g {
    public static final t1g Companion = new t1g();
    public final String a;
    public final String b;
    public final String c;

    public /* synthetic */ u1g(String str, int i, String str2, String str3) {
        if (7 != (i & 7)) {
            ju0.I(i, 7, s1g.a.d());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u1g)) {
            return false;
        }
        u1g u1gVar = (u1g) obj;
        return tpa.f(this.a, u1gVar.a) && tpa.f(this.b, u1gVar.b) && tpa.f(this.c, u1gVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + rh4.d(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WebAppStorageGetKeyResponse(requestId=");
        sb.append(this.a);
        sb.append(", key=");
        sb.append(this.b);
        sb.append(", value=");
        return zr6.l(sb, this.c, ")");
    }

    public u1g(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }
}
