package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public abstract class jbe extends oy implements abe {
    public long X;
    public long c;
    public abe o;

    @Override // defpackage.abe
    public final int g(long j) {
        abe abeVar = this.o;
        abeVar.getClass();
        return abeVar.g(j - this.X);
    }

    @Override // defpackage.abe
    public final long i(int i) {
        abe abeVar = this.o;
        abeVar.getClass();
        return abeVar.i(i) + this.X;
    }

    @Override // defpackage.abe
    public final List p(long j) {
        abe abeVar = this.o;
        abeVar.getClass();
        return abeVar.p(j - this.X);
    }

    @Override // defpackage.abe
    public final int u() {
        abe abeVar = this.o;
        abeVar.getClass();
        return abeVar.u();
    }

    public abstract void v();

    public final void w(long j, abe abeVar, long j2) {
        this.c = j;
        this.o = abeVar;
        if (j2 != Long.MAX_VALUE) {
            j = j2;
        }
        this.X = j;
    }
}
