package defpackage;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class m95 implements b64 {
    public static final m95 a = new m95();
    public static final n95 b = n95.b;

    @Override // defpackage.b64
    public final i64 a() {
        return b;
    }

    @Override // defpackage.b64
    public final l64 b(String str, e64 e64Var, Bundle bundle) {
        if (!b.a.contains(e64Var)) {
            return null;
        }
        n95.b.getClass();
        if (e64Var.equals(n95.c)) {
            return new l64(str, e64Var, bundle, 0, null, new m92(bundle, 2), 24);
        }
        throw new IllegalStateException(au1.f("unknown screen ", e64Var));
    }
}
