package defpackage;

import android.view.View;

/* loaded from: classes.dex */
public final class yf6 extends cg6 {
    public int d;

    @Override // defpackage.cg6
    public final int a(hg6 hg6Var, View view, ote oteVar, int i, boolean z) {
        return Math.max(0, super.a(hg6Var, view, oteVar, i, z));
    }

    @Override // defpackage.cg6
    public final void b(int i, int i2) {
        super.b(i, i2);
        this.d = Math.max(this.d, i + i2);
    }

    @Override // defpackage.cg6
    public final void c() {
        super.c();
        this.d = Integer.MIN_VALUE;
    }

    @Override // defpackage.cg6
    public final int d(boolean z) {
        return Math.max(super.d(z), this.d);
    }
}
