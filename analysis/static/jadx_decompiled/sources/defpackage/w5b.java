package defpackage;

import android.view.View;

/* loaded from: classes2.dex */
public final class w5b {
    public final z5b a;
    public int b;

    public w5b(z5b z5bVar) {
        this.a = z5bVar;
    }

    public final void a(int i) {
        View viewD;
        z5b z5bVar = this.a;
        if (z5bVar == null || (viewD = z5bVar.d()) == null) {
            return;
        }
        int iE = ote.e(i - z5bVar.c(), 0, Integer.MAX_VALUE);
        int i2 = iE - this.b;
        this.b = iE;
        viewD.offsetTopAndBottom(i2);
    }
}
