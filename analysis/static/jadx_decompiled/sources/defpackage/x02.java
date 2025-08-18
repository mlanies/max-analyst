package defpackage;

/* loaded from: classes.dex */
public final class x02 extends ibe implements Comparable {
    public long w0;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        x02 x02Var = (x02) obj;
        if (f(4) == x02Var.f(4)) {
            long j = this.Z - x02Var.Z;
            if (j == 0) {
                j = this.w0 - x02Var.w0;
                if (j == 0) {
                    return 0;
                }
            }
            if (j <= 0) {
                return -1;
            }
        } else if (!f(4)) {
            return -1;
        }
        return 1;
    }
}
