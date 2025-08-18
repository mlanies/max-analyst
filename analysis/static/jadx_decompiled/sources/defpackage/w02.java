package defpackage;

/* loaded from: classes.dex */
public final class w02 extends hbe implements Comparable {
    public long v0;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        w02 w02Var = (w02) obj;
        if (f(4) == w02Var.f(4)) {
            long j = this.Y - w02Var.Y;
            if (j == 0) {
                j = this.v0 - w02Var.v0;
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
