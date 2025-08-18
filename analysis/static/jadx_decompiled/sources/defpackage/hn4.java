package defpackage;

/* loaded from: classes2.dex */
public final class hn4 extends pi0 {
    public final String b;
    public final String c;
    public final long o;

    public hn4(String str, String str2, long j, long j2) {
        super(j);
        this.b = str;
        this.c = str2 == null ? "" : str2;
        this.o = j2;
    }

    @Override // defpackage.pi0
    public final String toString() {
        StringBuilder sb = new StringBuilder("DownloadErrorEvent{url='");
        sb.append(this.b);
        sb.append("', attachLocalId='");
        return zr6.l(sb, this.c, "'}");
    }
}
