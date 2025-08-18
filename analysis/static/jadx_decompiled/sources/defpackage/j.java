package defpackage;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class j implements b64 {
    public static final j a = new j();
    public static final k b = k.b;

    @Override // defpackage.b64
    public final i64 a() {
        return b;
    }

    @Override // defpackage.b64
    public final l64 b(String str, e64 e64Var, Bundle bundle) {
        if (!b.a.contains(e64Var)) {
            return null;
        }
        if (e64Var.equals(k.c)) {
            return new l64(str, e64Var, bundle, 1, null, new i(0), 16);
        }
        throw new IllegalStateException(au1.f("Unknown route=", e64Var));
    }
}
