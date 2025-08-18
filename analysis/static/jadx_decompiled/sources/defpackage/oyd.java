package defpackage;

import android.os.Bundle;

/* loaded from: classes2.dex */
public final class oyd implements b64 {
    public static final oyd a = new oyd();
    public static final qyd b = qyd.b;

    @Override // defpackage.b64
    public final i64 a() {
        return b;
    }

    @Override // defpackage.b64
    public final l64 b(String str, e64 e64Var, Bundle bundle) {
        k64 ka3Var;
        k64 lqVar;
        if (!b.a.contains(e64Var)) {
            return null;
        }
        qyd.b.getClass();
        if (e64Var.equals(qyd.c)) {
            ka3Var = new ngd(1);
        } else if (e64Var.equals(qyd.d)) {
            ka3Var = new ngd(2);
        } else if (e64Var.equals(qyd.e)) {
            ka3Var = new ngd(3);
        } else {
            if (e64Var.equals(qyd.f)) {
                lqVar = new lq(3, i24.w("ids", bundle));
                return new l64(str, e64Var, bundle, 1, null, lqVar, 16);
            }
            if (!e64Var.equals(qyd.g)) {
                hm9.p(oyd.class.getName(), "invalid route " + e64Var, new IllegalArgumentException("invalid route " + e64Var));
                return null;
            }
            ka3Var = new ka3(i24.D("id", bundle), 9);
        }
        lqVar = ka3Var;
        return new l64(str, e64Var, bundle, 1, null, lqVar, 16);
    }
}
