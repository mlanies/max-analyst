package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public abstract class kbe extends q54 implements bbe {
    public bbe X;
    public long Y;

    @Override // defpackage.bbe
    public final int g(long j) {
        bbe bbeVar = this.X;
        bbeVar.getClass();
        return bbeVar.g(j - this.Y);
    }

    @Override // defpackage.bbe
    public final long i(int i) {
        bbe bbeVar = this.X;
        bbeVar.getClass();
        return bbeVar.i(i) + this.Y;
    }

    @Override // defpackage.bbe
    public final List p(long j) {
        bbe bbeVar = this.X;
        bbeVar.getClass();
        return bbeVar.p(j - this.Y);
    }

    @Override // defpackage.bbe
    public final int u() {
        bbe bbeVar = this.X;
        bbeVar.getClass();
        return bbeVar.u();
    }

    @Override // defpackage.q54
    public final void v() {
        super.v();
        this.X = null;
    }
}
