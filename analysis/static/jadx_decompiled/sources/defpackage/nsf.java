package defpackage;

import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class nsf extends WeakReference implements zl4 {
    @Override // defpackage.zl4
    public final void g() {
        zl4 zl4Var = (zl4) get();
        if (zl4Var != null) {
            zl4Var.g();
        }
    }

    @Override // defpackage.zl4
    public final boolean h() {
        zl4 zl4Var = (zl4) get();
        return zl4Var == null || zl4Var.h();
    }
}
