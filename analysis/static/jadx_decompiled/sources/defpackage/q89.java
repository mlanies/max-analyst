package defpackage;

import android.os.Bundle;

/* loaded from: classes2.dex */
public final class q89 implements b64 {
    public static final q89 a = new q89();
    public static final r89 b = r89.b;

    @Override // defpackage.b64
    public final i64 a() {
        return b;
    }

    @Override // defpackage.b64
    public final l64 b(String str, e64 e64Var, Bundle bundle) {
        if (!b.a.contains(e64Var)) {
            return null;
        }
        r89.b.getClass();
        if (e64Var.equals(r89.c)) {
            return new l64(str, e64Var, bundle, 0, null, new i(25), 24);
        }
        hm9.p(q89.class.getName(), "invalid route " + e64Var, new IllegalArgumentException("invalid route " + e64Var));
        return null;
    }
}
