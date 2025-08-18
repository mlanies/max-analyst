package defpackage;

import android.content.Context;
import android.view.View;

/* loaded from: classes.dex */
public final class b7 extends ir8 {
    public final /* synthetic */ int m = 0;
    public final /* synthetic */ e7 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b7(e7 e7Var, Context context, wq8 wq8Var, View view) {
        super(vsb.actionOverflowMenuStyle, 0, wq8Var, context, view, true);
        this.n = e7Var;
        this.g = 8388613;
        qqd qqdVar = e7Var.H0;
        this.i = qqdVar;
        gr8 gr8Var = this.j;
        if (gr8Var != null) {
            gr8Var.g(qqdVar);
        }
    }

    @Override // defpackage.ir8
    public final void c() {
        switch (this.m) {
            case 0:
                this.n.E0 = null;
                super.c();
                break;
            default:
                e7 e7Var = this.n;
                wq8 wq8Var = e7Var.c;
                if (wq8Var != null) {
                    wq8Var.c(true);
                }
                e7Var.D0 = null;
                super.c();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b7(e7 e7Var, Context context, qae qaeVar, View view) {
        super(vsb.actionOverflowMenuStyle, 0, qaeVar, context, view, false);
        this.n = e7Var;
        if (!qaeVar.L0.f()) {
            View view2 = e7Var.t0;
            this.f = view2 == null ? (View) e7Var.s0 : view2;
        }
        qqd qqdVar = e7Var.H0;
        this.i = qqdVar;
        gr8 gr8Var = this.j;
        if (gr8Var != null) {
            gr8Var.g(qqdVar);
        }
    }
}
