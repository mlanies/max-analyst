package defpackage;

import android.os.Bundle;

/* loaded from: classes2.dex */
public final class a7e implements b64 {
    public static final a7e a = new a7e();
    public static final b7e b = b7e.b;

    @Override // defpackage.b64
    public final i64 a() {
        return b;
    }

    @Override // defpackage.b64
    public final l64 b(String str, e64 e64Var, Bundle bundle) {
        if (!b.a.contains(e64Var)) {
            return null;
        }
        b7e.b.getClass();
        if (e64Var.equals(b7e.c)) {
            return new l64(str, e64Var, bundle, 1, null, new m92(bundle, 10), 16);
        }
        throw new IllegalStateException(au1.f("invalid route ", e64Var));
    }
}
