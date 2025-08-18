package defpackage;

import android.os.Bundle;

/* loaded from: classes2.dex */
public final class ogd implements b64 {
    public static final ogd a = new ogd();
    public static final pgd b = pgd.b;

    @Override // defpackage.b64
    public final i64 a() {
        return b;
    }

    @Override // defpackage.b64
    public final l64 b(String str, e64 e64Var, Bundle bundle) {
        if (!b.a.contains(e64Var)) {
            return null;
        }
        pgd.b.getClass();
        if (e64Var.equals(pgd.c)) {
            return new l64(str, e64Var, bundle, 0, null, new ngd(0), 24);
        }
        hm9.p(ogd.class.getName(), "invalid route " + e64Var, new IllegalArgumentException("invalid route " + e64Var));
        return null;
    }
}
