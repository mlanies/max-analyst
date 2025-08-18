package defpackage;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class li7 implements b64 {
    public static final li7 a = new li7();
    public static final mi7 b = mi7.b;

    @Override // defpackage.b64
    public final i64 a() {
        return b;
    }

    @Override // defpackage.b64
    public final l64 b(String str, e64 e64Var, Bundle bundle) {
        if (mi7.b.a.contains(e64Var)) {
            return new l64(str, e64Var, bundle, 0, j64.c, new m92(bundle, 6), 8);
        }
        return null;
    }
}
