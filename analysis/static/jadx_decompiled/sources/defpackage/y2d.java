package defpackage;

/* loaded from: classes.dex */
public final class y2d implements Comparable {
    public final long a;
    public final a34 b;

    public y2d(long j, a34 a34Var) {
        this.a = j;
        this.b = a34Var;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = ((y2d) obj).a;
        int i = oaf.a;
        long j2 = this.a;
        if (j2 < j) {
            return -1;
        }
        return j2 == j ? 0 : 1;
    }
}
