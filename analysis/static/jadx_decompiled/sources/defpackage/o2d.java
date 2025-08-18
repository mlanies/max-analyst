package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class o2d extends m2d {
    public final List j;

    public o2d(r4c r4cVar, long j, long j2, long j3, long j4, List list, long j5, List list2, long j6, long j7) {
        super(r4cVar, j, j2, j3, j4, list, j5, j6, j7);
        this.j = list2;
    }

    @Override // defpackage.m2d
    public final long e(long j) {
        return this.j.size();
    }

    @Override // defpackage.m2d
    public final r4c i(long j, lhc lhcVar) {
        return (r4c) this.j.get((int) (j - this.d));
    }

    @Override // defpackage.m2d
    public final boolean j() {
        return true;
    }
}
