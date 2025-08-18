package defpackage;

/* loaded from: classes2.dex */
public final class i1g {
    public static final h1g Companion = new h1g();
    public final String a;
    public final String b;

    public /* synthetic */ i1g(int i, String str, String str2) {
        if (3 != (i & 3)) {
            ju0.I(i, 3, g1g.a.d());
            throw null;
        }
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i1g)) {
            return false;
        }
        i1g i1gVar = (i1g) obj;
        return tpa.f(this.a, i1gVar.a) && tpa.f(this.b, i1gVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WebAppStorageClearRequest(queryId=");
        sb.append(this.a);
        sb.append(", requestId=");
        return zr6.l(sb, this.b, ")");
    }
}
