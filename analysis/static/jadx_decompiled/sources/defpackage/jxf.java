package defpackage;

/* loaded from: classes2.dex */
public final class jxf {
    public static final ixf Companion = new ixf();
    public final String a;
    public final String b;

    public /* synthetic */ jxf(int i, String str, String str2) {
        if (3 != (i & 3)) {
            ju0.I(i, 3, hxf.a.d());
            throw null;
        }
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jxf)) {
            return false;
        }
        jxf jxfVar = (jxf) obj;
        return tpa.f(this.a, jxfVar.a) && tpa.f(this.b, jxfVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WebAppDownloadFileResponse(requestId=");
        sb.append(this.a);
        sb.append(", status=");
        return zr6.l(sb, this.b, ")");
    }

    public jxf(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}
