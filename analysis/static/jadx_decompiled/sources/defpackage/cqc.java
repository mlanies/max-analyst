package defpackage;

/* loaded from: classes2.dex */
public abstract class cqc {
    public static final w4d a = new w4d(23, muc.b());

    public static iq1 a(f6 f6Var, ztc ztcVar, f6 f6Var2, qj3 qj3Var, ztc ztcVar2) {
        za3 za3VarK = new sa3(0, new aqc(f6Var)).k(ztcVar);
        if (ztcVar2 != null) {
            za3VarK = za3VarK.h(ztcVar2);
        }
        if (f6Var2 == null) {
            f6Var2 = new fa4(8);
        }
        iq1 iq1Var = new iq1(qj3Var, 0, f6Var2);
        za3VarK.i(iq1Var);
        return iq1Var;
    }

    public static void b(zl4 zl4Var) {
        if (c(zl4Var)) {
            return;
        }
        zl4Var.g();
    }

    public static boolean c(zl4 zl4Var) {
        return zl4Var == null || zl4Var.h();
    }
}
