package defpackage;

import android.graphics.drawable.Animatable;

/* loaded from: classes.dex */
public final class bv6 extends ii0 {
    public final cv6 b;
    public long c = -1;

    public bv6(t44 t44Var) {
        this.b = t44Var;
    }

    @Override // defpackage.ii0, defpackage.ev3
    public final void a(String str, ru6 ru6Var, Animatable animatable) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        cv6 cv6Var = this.b;
        if (cv6Var != null) {
            t44 t44Var = (t44) cv6Var;
            t44Var.D0 = jCurrentTimeMillis - this.c;
            t44Var.invalidateSelf();
        }
    }

    @Override // defpackage.ii0, defpackage.ev3
    public final void e(Object obj, String str) {
        this.c = System.currentTimeMillis();
    }
}
