package ru.ok.messages.media.attaches;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import defpackage.bk4;
import defpackage.cu8;
import defpackage.es8;
import defpackage.fk4;
import defpackage.k8g;
import defpackage.l20;
import defpackage.la6;
import defpackage.m20;
import defpackage.rq4;
import defpackage.s5c;
import defpackage.ssc;
import defpackage.sz;
import defpackage.ts8;
import defpackage.wnc;

/* loaded from: classes2.dex */
public class ShareMediaView extends ts8 {
    public float Y0;

    public ShareMediaView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        getContext();
        bk4.b();
        this.Y0 = fk4.b((int) 9.0f);
    }

    @Override // defpackage.ts8
    public final void m(es8 es8Var) {
        k8g k8gVar;
        cu8 cu8Var = es8Var.a;
        l20 l20Var = cu8Var.i().g;
        es8 es8Var2 = this.y0;
        boolean z = es8Var2 == null || es8Var2.a.b != cu8Var.b || s5c.h(es8Var2, es8Var);
        boolean z2 = z || this.y0 == null || (k8gVar = this.w0) == null || ts8.H(l20Var, k8gVar.h(0));
        m20 m20Var = new m20();
        m20Var.a(l20Var);
        k8g k8gVarC = m20Var.c();
        this.w0 = k8gVarC;
        this.y0 = es8Var;
        sz szVarT = t(es8Var, 0, k8gVarC.h(0));
        if (z2) {
            rq4 rq4Var = szVarT.o;
            rq4Var.getClass();
            ((la6) rq4Var).h(ssc.l);
            l20 l20VarH = this.w0.h(0);
            if (s5c.C(l20VarH) > s5c.E(l20VarH)) {
                rq4 rq4Var2 = szVarT.o;
                rq4Var2.getClass();
                ((la6) rq4Var2).n(wnc.a(0.0f, 0.0f, 0.0f, 0.0f));
            } else {
                rq4 rq4Var3 = szVarT.o;
                rq4Var3.getClass();
                float f = this.Y0;
                ((la6) rq4Var3).n(wnc.a(0.0f, 0.0f, f, f));
            }
            Q(this.w0.h(0), szVarT, false);
        }
        if (z) {
            N();
        }
        requestLayout();
    }

    @Override // defpackage.ts8, android.view.View
    public final void onMeasure(int i, int i2) {
        l20 l20VarH = this.w0.h(0);
        if (s5c.C(l20VarH) > s5c.E(l20VarH)) {
            int size = (int) ((View.MeasureSpec.getSize(i) * 2.0f) / 3.0f);
            setMeasuredDimension((int) ((s5c.E(l20VarH) / s5c.C(l20VarH)) * size), size);
        } else {
            int size2 = View.MeasureSpec.getSize(i);
            setMeasuredDimension(size2, (int) ((s5c.C(l20VarH) / s5c.E(l20VarH)) * size2));
        }
        ((sz) this.o.i(0)).Z.d(getMeasuredWidth(), getMeasuredHeight());
        J();
    }

    @Override // defpackage.ts8
    public final int u(l20 l20Var) {
        return 0;
    }
}
