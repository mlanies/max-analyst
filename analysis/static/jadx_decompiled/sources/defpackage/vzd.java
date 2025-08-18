package defpackage;

/* loaded from: classes.dex */
public final class vzd implements u1d {
    public final /* synthetic */ u1d a;
    public final /* synthetic */ g03 b;

    public vzd(g03 g03Var, u1d u1dVar) {
        this.b = g03Var;
        this.a = u1dVar;
    }

    @Override // defpackage.u1d
    public final boolean c() {
        return this.a.c();
    }

    @Override // defpackage.u1d
    public final s1d e(long j) {
        s1d s1dVarE = this.a.e(j);
        y1d y1dVar = s1dVarE.a;
        long j2 = y1dVar.a;
        long j3 = y1dVar.b;
        long j4 = this.b.b;
        y1d y1dVar2 = new y1d(j2, j3 + j4);
        y1d y1dVar3 = s1dVarE.b;
        return new s1d(y1dVar2, new y1d(y1dVar3.a, y1dVar3.b + j4));
    }

    @Override // defpackage.u1d
    public final long f() {
        return this.a.f();
    }
}
