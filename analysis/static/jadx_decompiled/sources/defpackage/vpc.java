package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class vpc implements bb3, grd {
    public final /* synthetic */ sx3 a = zd6.a;
    public final /* synthetic */ lx3 b;
    public final /* synthetic */ a66 c;

    public /* synthetic */ vpc(lx3 lx3Var, ms3 ms3Var) {
        this.b = lx3Var;
        this.c = ms3Var;
    }

    @Override // defpackage.bb3
    public void b(ra3 ra3Var) {
        upc upcVar = new upc(v3c.x(this.a, this.b), ra3Var, 0);
        dm4.d(ra3Var, new uy1(new tpc(upcVar)));
        upcVar.start(vx3.a, upcVar, this.c);
    }

    @Override // defpackage.grd
    public void j(nqd nqdVar) {
        upc upcVar = new upc(v3c.x(this.a, this.b), nqdVar, 1);
        dm4.d(nqdVar, new uy1(new tpc(upcVar)));
        upcVar.start(vx3.a, upcVar, this.c);
    }

    public /* synthetic */ vpc(lx3 lx3Var, rie rieVar) {
        this.b = lx3Var;
        this.c = rieVar;
    }
}
