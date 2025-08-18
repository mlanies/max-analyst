package defpackage;

import android.content.Context;

/* loaded from: classes.dex */
public final class mr8 extends wl7 implements ar8 {
    public ar8 L0;

    @Override // defpackage.ar8
    public final void h(wq8 wq8Var, br8 br8Var) {
        ar8 ar8Var = this.L0;
        if (ar8Var != null) {
            ar8Var.h(wq8Var, br8Var);
        }
    }

    @Override // defpackage.ar8
    public final void k(wq8 wq8Var, br8 br8Var) {
        ar8 ar8Var = this.L0;
        if (ar8Var != null) {
            ar8Var.k(wq8Var, br8Var);
        }
    }

    @Override // defpackage.wl7
    public final es4 q(Context context, boolean z) {
        lr8 lr8Var = new lr8(context, z);
        lr8Var.setHoverListener(this);
        return lr8Var;
    }
}
