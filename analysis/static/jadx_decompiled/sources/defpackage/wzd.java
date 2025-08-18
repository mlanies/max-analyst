package defpackage;

/* loaded from: classes.dex */
public final class wzd extends q06 {
    public final /* synthetic */ v1d b;
    public final /* synthetic */ g03 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wzd(g03 g03Var, v1d v1dVar, v1d v1dVar2) {
        super(v1dVar);
        this.c = g03Var;
        this.b = v1dVar2;
    }

    @Override // defpackage.q06, defpackage.v1d
    public final t1d e(long j) {
        t1d t1dVarE = this.b.e(j);
        z1d z1dVar = t1dVarE.a;
        long j2 = z1dVar.a;
        long j3 = z1dVar.b;
        long j4 = this.c.b;
        z1d z1dVar2 = new z1d(j2, j3 + j4);
        z1d z1dVar3 = t1dVarE.b;
        return new t1d(z1dVar2, new z1d(z1dVar3.a, z1dVar3.b + j4));
    }
}
