package defpackage;

/* loaded from: classes.dex */
public final class fbe implements Comparable {
    public final long a;
    public final byte[] b;

    public fbe(long j, byte[] bArr) {
        this.a = j;
        this.b = bArr;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.a, ((fbe) obj).a);
    }
}
