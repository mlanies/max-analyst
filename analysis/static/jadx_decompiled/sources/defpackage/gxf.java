package defpackage;

/* loaded from: classes2.dex */
public final class gxf {
    public static final fxf Companion = new fxf();
    public final String a;
    public final String b;
    public final String c;

    public /* synthetic */ gxf(String str, int i, String str2, String str3) {
        if (7 != (i & 7)) {
            ju0.I(i, 7, exf.a.d());
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
        if (!(obj instanceof gxf)) {
            return false;
        }
        gxf gxfVar = (gxf) obj;
        return tpa.f(this.a, gxfVar.a) && tpa.f(this.b, gxfVar.b) && tpa.f(this.c, gxfVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + rh4.d(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WebAppDownloadFileRequest(requestId=");
        sb.append(this.a);
        sb.append(", url=");
        sb.append(this.b);
        sb.append(", fileName=");
        return zr6.l(sb, this.c, ")");
    }
}
