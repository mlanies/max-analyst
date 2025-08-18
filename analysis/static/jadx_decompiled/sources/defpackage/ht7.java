package defpackage;

/* loaded from: classes2.dex */
public final class ht7 extends ol implements lme {
    public final long X;
    public final long Y;
    public final long Z;
    public final String o;
    public final String s0;
    public final long t0;
    public final long u0;
    public final long v0;
    public final kme w0;

    public ht7(long j, String str, long j2, long j3, long j4, String str2, long j5, long j6, long j7) {
        super(j);
        this.o = str;
        this.X = j2;
        this.Y = j3;
        this.Z = j4;
        this.s0 = str2;
        this.t0 = j5;
        this.u0 = j6;
        this.v0 = j7;
        this.w0 = new kme();
    }

    @Override // defpackage.lme
    public final kme b() {
        return this.w0;
    }

    @Override // defpackage.lme
    public final void e(gle gleVar) throws Throwable {
        j47.f0(hz4.a, new gt7(this, (kt7) gleVar, null));
    }

    @Override // defpackage.lme
    public final void g(pke pkeVar) {
        pl plVar = this.c;
        if (plVar == null) {
            plVar = null;
        }
        ((xt7) plVar.l.getValue()).a(pkeVar);
    }

    @Override // defpackage.ol
    public final dle i() {
        pl plVar = this.c;
        if (plVar == null) {
            plVar = null;
        }
        return new jt7(this.o, ((ri4) plVar.b.getValue()).d(), this.X, this.Y, this.Z, this.s0, this.t0, this.u0, this.v0);
    }
}
