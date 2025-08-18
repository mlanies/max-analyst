package defpackage;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class g97 implements b64 {
    public static final g97 a = new g97();
    public static final h97 b = h97.b;

    @Override // defpackage.b64
    public final i64 a() {
        return b;
    }

    @Override // defpackage.b64
    public final l64 b(String str, e64 e64Var, Bundle bundle) {
        if (!b.a.contains(e64Var)) {
            return null;
        }
        j64 j64Var = new j64(new m57(5), new m57(6));
        h97.b.getClass();
        if (e64Var.equals(h97.c)) {
            return new l64(str, e64Var, bundle, 0, j64Var, new m92(bundle, 5), 8);
        }
        throw new IllegalStateException(au1.f("unknown screen ", e64Var));
    }
}
