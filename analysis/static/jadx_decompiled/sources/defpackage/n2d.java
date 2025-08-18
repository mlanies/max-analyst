package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class n2d extends l2d {
    public final List j;

    public n2d(q4c q4cVar, long j, long j2, long j3, long j4, List list, long j5, List list2, long j6, long j7) {
        super(q4cVar, j, j2, j3, j4, list, j5, j6, j7);
        this.j = list2;
    }

    @Override // defpackage.l2d
    public final long e(long j) {
        return this.j.size();
    }

    @Override // defpackage.l2d
    public final q4c i(long j, khc khcVar) {
        return (q4c) this.j.get((int) (j - this.d));
    }

    @Override // defpackage.l2d
    public final boolean j() {
        return true;
    }
}
