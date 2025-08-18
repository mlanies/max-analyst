package defpackage;

import android.os.Bundle;

/* loaded from: classes2.dex */
public final class i5e implements b64 {
    public static final i5e a = new i5e();
    public static final j5e b = j5e.b;

    @Override // defpackage.b64
    public final i64 a() {
        return b;
    }

    @Override // defpackage.b64
    public final l64 b(String str, e64 e64Var, Bundle bundle) {
        if (!b.a.contains(e64Var)) {
            return null;
        }
        j5e.b.getClass();
        if (e64Var.equals(j5e.c)) {
            return new l64(str, e64Var, bundle, 1, null, new m92(bundle, 9), 16);
        }
        throw new IllegalStateException(au1.f("invalid route ", e64Var));
    }
}
