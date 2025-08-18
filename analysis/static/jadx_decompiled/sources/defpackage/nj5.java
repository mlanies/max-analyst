package defpackage;

/* loaded from: classes2.dex */
public final class nj5 {
    public final long a;
    public final String b;
    public final String c;

    public nj5(long j, String str, String str2) {
        this.a = j;
        this.b = str;
        this.c = str2;
    }

    public final String toString() {
        boolean z = !oag.t(this.b);
        StringBuilder sb = new StringBuilder("FileUploadInfo{fileId=");
        sb.append(this.a);
        sb.append(", token='");
        sb.append(z);
        sb.append("', url='");
        return zr6.l(sb, this.c, "'}");
    }
}
