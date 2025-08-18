package defpackage;

import android.os.Bundle;

/* loaded from: classes2.dex */
public final class q6e implements b64 {
    public static final q6e a = new q6e();
    public static final r6e b = r6e.b;

    @Override // defpackage.b64
    public final i64 a() {
        return b;
    }

    @Override // defpackage.b64
    public final l64 b(String str, e64 e64Var, Bundle bundle) {
        k64 ka3Var;
        if (!b.a.contains(e64Var)) {
            return null;
        }
        Long lV = i24.v("set_id", bundle);
        long jLongValue = lV != null ? lV.longValue() : -1L;
        r6e.b.getClass();
        if (e64Var.equals(r6e.c)) {
            ka3Var = new ngd(4);
        } else if (e64Var.equals(r6e.d)) {
            ka3Var = new ngd(5);
        } else if (e64Var.equals(r6e.e)) {
            ka3Var = new ngd(6);
        } else {
            if (!e64Var.equals(r6e.f)) {
                throw new IllegalStateException(au1.f("invalid route ", e64Var));
            }
            ka3Var = new ka3(jLongValue, 10);
        }
        return new l64(str, e64Var, bundle, 1, null, ka3Var, 16);
    }
}
