package defpackage;

import android.os.Bundle;

/* loaded from: classes2.dex */
public final class r3g implements b64 {
    public static final r3g a = new r3g();
    public static final s3g b = s3g.b;

    @Override // defpackage.b64
    public final i64 a() {
        return b;
    }

    @Override // defpackage.b64
    public final l64 b(String str, e64 e64Var, Bundle bundle) {
        if (!b.a.contains(e64Var)) {
            return null;
        }
        s3g.b.getClass();
        if (e64Var.equals(s3g.c)) {
            return new l64(str, e64Var, bundle, 1, null, new ngd(8), 16);
        }
        hm9.p(r3g.class.getName(), "invalid route " + e64Var, new IllegalArgumentException("invalid route " + e64Var));
        return null;
    }
}
