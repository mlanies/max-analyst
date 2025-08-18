package defpackage;

/* loaded from: classes2.dex */
public final class yne {
    public final long a;
    public final long b;
    public final String c;
    public final String d;
    public final long e = System.currentTimeMillis();

    public yne(String str, String str2, long j, long j2) {
        this.a = j;
        this.b = j2;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yne)) {
            return false;
        }
        yne yneVar = (yne) obj;
        return this.a == yneVar.a && this.b == yneVar.b && tpa.f(this.c, yneVar.c) && tpa.f(this.d, yneVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + rh4.d(h4f.m(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TaskFileFromWebAppDownloadData(requestId=");
        sb.append(this.a);
        sb.append(", botId=");
        sb.append(this.b);
        sb.append(", fileUrl=");
        sb.append(this.c);
        sb.append(", fileName=");
        return zr6.l(sb, this.d, ")");
    }
}
