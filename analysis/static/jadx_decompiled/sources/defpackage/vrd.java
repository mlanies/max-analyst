package defpackage;

import android.os.Bundle;

/* loaded from: classes.dex */
public abstract class vrd implements b64 {
    public final urd a;

    public vrd() {
        urd urdVar = new urd();
        e(urdVar);
        this.a = urdVar;
    }

    @Override // defpackage.b64
    public final i64 a() {
        return this.a;
    }

    @Override // defpackage.b64
    public final l64 b(String str, e64 e64Var, Bundle bundle) {
        if (this.a.a.contains(e64Var)) {
            return new l64(str, e64Var, bundle, 0, c(), d(bundle), 8);
        }
        return null;
    }

    public abstract j64 c();

    public abstract k64 d(Bundle bundle);

    public abstract void e(urd urdVar);
}
