package defpackage;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class dk2 implements Serializable {
    public final wm3 a;
    public final s7b b;
    public final long c;

    public dk2(wm3 wm3Var, s7b s7bVar, long j) {
        this.a = wm3Var;
        this.b = s7bVar;
        this.c = j;
    }

    public static dk2 a(gy8 gy8Var) {
        int iN = lz7.N(gy8Var);
        wm3 wm3VarE = null;
        if (iN == 0) {
            return null;
        }
        s7b s7bVarA = null;
        long jM = 0;
        for (int i = 0; i < iN; i++) {
            String strZ0 = gy8Var.z0();
            strZ0.getClass();
            switch (strZ0) {
                case "presence":
                    s7bVarA = s7b.a(gy8Var);
                    break;
                case "readMark":
                    jM = lz7.M(gy8Var, 0L);
                    break;
                case "contact":
                    wm3VarE = wm3.e(gy8Var);
                    break;
                default:
                    gy8Var.z();
                    break;
            }
        }
        return new dk2(wm3VarE, s7bVarA, jM);
    }
}
