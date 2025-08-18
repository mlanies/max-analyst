package defpackage;

/* loaded from: classes2.dex */
public final class j5f {
    public final sx3 a;
    public final ds3 b;
    public final kke c;
    public final je7 d;
    public final je7 e;
    public final je7 f;
    public final je7 g;
    public final q0e h;
    public final w7c i;

    public j5f(j0e j0eVar, sx3 sx3Var, ds3 ds3Var, kke kkeVar, je7 je7Var, je7 je7Var2, je7 je7Var3, je7 je7Var4) {
        uj3 uj3VarL;
        this.a = sx3Var;
        this.b = ds3Var;
        this.c = kkeVar;
        this.d = je7Var2;
        this.e = je7Var3;
        this.f = je7Var4;
        this.g = je7Var;
        Long lValueOf = null;
        q0e q0eVarA = r0e.a(null);
        this.h = q0eVarA;
        this.i = new w7c(q0eVarA);
        e52 e52Var = (e52) j0eVar.getValue();
        if (e52Var != null && e52Var.M() && ((e52Var.C() || e52Var.R()) && (uj3VarL = e52Var.l()) != null && !uj3VarL.t())) {
            lValueOf = Long.valueOf(uj3VarL.n());
        }
        if (lValueOf != null) {
            od2.L(od2.F(new zn5(new t03(ds3Var.c(lValueOf.longValue()), 11), new shb(2, this, j5f.class, "handleContact", "handleContact(Lru/ok/tamtam/contacts/Contact;)V", 4, 23), 5), ((w9a) kkeVar).b()), sx3Var);
        }
    }
}
