package defpackage;

/* loaded from: classes2.dex */
public final class zva {
    public final ewa a;
    public final qv4 b;
    public final yva c;
    public final jc6 d;
    public cwa e;

    public zva(ewa ewaVar, qv4 qv4Var, yva yvaVar, jc6 jc6Var, ov4 ov4Var, boolean z, boolean z2, boolean z3) {
        this.a = ewaVar;
        this.b = qv4Var;
        qv4Var.b = this;
        this.c = yvaVar;
        ewaVar.a.add(this);
        this.d = jc6Var;
        cwa cwaVar = new cwa(false, false, false, z, z2, false, z3);
        this.e = cwaVar;
        ewaVar.a(cwaVar);
        jc6Var.f(qv4Var, ov4Var, true);
        if (z && z2) {
            qv4Var.a.setDrawStickerEnabled(true);
            jc6Var.f(qv4Var, qv4Var.a(), false);
        }
    }
}
