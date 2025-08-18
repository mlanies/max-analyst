package defpackage;

/* loaded from: classes2.dex */
public final class h8f {
    public final float a;
    public final long b;
    public final String c;

    public h8f(float f, long j, String str) {
        this.a = f;
        this.b = j;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h8f)) {
            return false;
        }
        h8f h8fVar = (h8f) obj;
        return Float.compare(this.a, h8fVar.a) == 0 && this.b == h8fVar.b && tpa.f(this.c, h8fVar.c);
    }

    public final int hashCode() {
        int iM = h4f.m(Float.hashCode(this.a) * 31, 31, this.b);
        String str = this.c;
        return iM + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UploadState(progress=");
        sb.append(this.a);
        sb.append(", fileSize=");
        sb.append(this.b);
        sb.append(", uploadToken=");
        return zr6.l(sb, this.c, ")");
    }
}
