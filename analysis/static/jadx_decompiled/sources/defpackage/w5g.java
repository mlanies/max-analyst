package defpackage;

/* loaded from: classes2.dex */
public final class w5g {
    public final qi9 a = new qi9(1);
    public final qi9 b = new qi9(1);

    public final pnf a(Class cls) {
        String strI = wg0.i("one.me.sdk.arch.ViewModelStore:key:", cls.getCanonicalName());
        qi9 qi9Var = this.a;
        pnf pnfVar = (pnf) qi9Var.f(strI);
        if (cls.isInstance(pnfVar)) {
            Object objCast = cls.cast(pnfVar);
            if (objCast != null) {
                return (pnf) objCast;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        qi9 qi9Var2 = this.b;
        Object objF = qi9Var2.f(strI);
        if (objF == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        pnf pnfVarA = ((onf) objF).a(cls);
        qi9Var.k(strI, pnfVarA);
        return pnfVarA;
    }
}
