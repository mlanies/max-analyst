package defpackage;

import android.os.Bundle;

/* loaded from: classes2.dex */
public final class r4e implements b64 {
    public static final r4e a = new r4e();
    public static final s4e b = s4e.b;

    @Override // defpackage.b64
    public final i64 a() {
        return b;
    }

    @Override // defpackage.b64
    public final l64 b(String str, e64 e64Var, Bundle bundle) {
        if (!b.a.contains(e64Var)) {
            return null;
        }
        s4e.b.getClass();
        if (e64Var.equals(s4e.c)) {
            return new l64(str, e64Var, bundle, 1, new j64(new xid(13), new xid(14)), new edb(i24.D("sticker_id", bundle), bundle, 2));
        }
        throw new IllegalStateException(au1.f("invalid route ", e64Var));
    }
}
