package defpackage;

/* loaded from: classes.dex */
public final class wt2 {
    public final String a;
    public final ta2 b;
    public final q0e c;
    public final t03 d;

    public wt2(String str, ta2 ta2Var, kke kkeVar) {
        this.a = str;
        this.b = ta2Var;
        q0e q0eVarA = r0e.a(null);
        this.c = q0eVarA;
        this.d = new t03(q0eVarA, 11);
        w9a w9aVar = (w9a) kkeVar;
        od2.L(od2.F(new zn5(new ac(((zb2) ta2Var).g(), 15, this), new ut2(this, null), 5), w9aVar.a()), j1e.a(w9aVar.a()));
    }

    public final at5 a() {
        String str = this.a;
        try {
            at5 at5Var = (at5) this.c.getValue();
            if (at5Var == null && (at5Var = (at5) ((zb2) this.b).t0.get(str)) == null) {
                throw new IllegalArgumentException(("folder " + str + " not found").toString());
            }
            return at5Var;
        } catch (Throwable th) {
            hm9.p(wt2.class.getName(), "fail to get folderValue for id " + str, th);
            throw th;
        }
    }
}
