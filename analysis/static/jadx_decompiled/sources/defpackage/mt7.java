package defpackage;

import android.os.Bundle;

/* loaded from: classes2.dex */
public final class mt7 implements b64 {
    public static final mt7 a = new mt7();
    public static final nt7 b = nt7.b;

    @Override // defpackage.b64
    public final i64 a() {
        return b;
    }

    @Override // defpackage.b64
    public final l64 b(String str, e64 e64Var, Bundle bundle) {
        k64 ka3Var;
        if (!b.a.contains(e64Var)) {
            return null;
        }
        if (e64Var.equals(nt7.c)) {
            ka3Var = new i(22);
        } else {
            if (!e64Var.equals(nt7.d)) {
                throw new IllegalStateException(au1.f("invalid route ", e64Var));
            }
            ka3Var = new ka3(i24.D("id", bundle), 3);
        }
        return new l64(str, e64Var, bundle, 0, null, ka3Var, 24);
    }
}
