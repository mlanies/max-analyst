package defpackage;

/* loaded from: classes2.dex */
public final class xva extends lz {
    public final je7 c;
    public rx d;

    public xva(l20 l20Var, khe kheVar) {
        super(l20Var);
        this.c = kheVar;
    }

    @Override // defpackage.lz
    public final void a() {
        b(this.d, new Throwable("cancelled"));
    }

    @Override // defpackage.lz
    public final qy9 d() {
        qy9 qy9VarD = super.d();
        if (qy9VarD != null) {
            return qy9VarD;
        }
        mec mecVar = new mec();
        rx rxVar = this.d;
        mecVar.a = rxVar;
        if (rxVar != null) {
            return rxVar;
        }
        rx rxVar2 = new rx();
        this.d = rxVar2;
        mecVar.a = rxVar2;
        ((av6) this.c.getValue()).a(this.a.b.a(), new wva(this, 0, mecVar));
        return (qy9) mecVar.a;
    }
}
