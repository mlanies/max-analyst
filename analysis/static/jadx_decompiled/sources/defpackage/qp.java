package defpackage;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class qp implements b64 {
    public static final qp a = new qp();
    public static final rp b = rp.b;

    @Override // defpackage.b64
    public final i64 a() {
        return b;
    }

    @Override // defpackage.b64
    public final l64 b(String str, e64 e64Var, Bundle bundle) {
        if (!b.a.contains(e64Var)) {
            return null;
        }
        if (e64Var.equals(rp.c)) {
            return new l64(str, e64Var, bundle, 1, null, new i(1), 16);
        }
        throw new IllegalStateException(au1.f("Unknown route=", e64Var));
    }
}
