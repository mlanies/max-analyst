package defpackage;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class lz2 implements b64 {
    public static final lz2 a = new lz2();
    public static final mz2 b = mz2.b;

    @Override // defpackage.b64
    public final i64 a() {
        return b;
    }

    @Override // defpackage.b64
    public final l64 b(String str, e64 e64Var, Bundle bundle) {
        if (!b.a.contains(e64Var)) {
            return null;
        }
        j64 j64Var = new j64(new hn2(11), new hn2(12));
        if (e64Var.equals(mz2.c)) {
            return new l64(str, e64Var, bundle, 1, j64Var, new i(7));
        }
        throw new IllegalStateException(au1.f("invalid route ", e64Var));
    }
}
