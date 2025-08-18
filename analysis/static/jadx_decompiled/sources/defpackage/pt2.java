package defpackage;

import android.view.ViewParent;

/* loaded from: classes.dex */
public final class pt2 implements k56 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    public pt2(iwc iwcVar, rwc rwcVar, lwc lwcVar) {
        this.b = iwcVar;
        this.c = rwcVar;
        this.o = lwcVar;
    }

    @Override // defpackage.k56
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return new qd5(((v4) this.o).d(yu2.class), (khe) ((je7) this.b), (khe) ((je7) this.c));
            default:
                iwc iwcVar = (iwc) this.b;
                ViewParent parent = iwcVar.getParent();
                rwc rwcVar = (rwc) this.c;
                if (parent != null) {
                    rwcVar.removeView(iwcVar);
                }
                lwc lwcVar = lwc.a;
                lwc lwcVar2 = (lwc) this.o;
                if (lwcVar2 == lwcVar) {
                    rwcVar.addView(iwcVar, rwcVar.getChildCount());
                } else {
                    rwcVar.addView(iwcVar, 0);
                }
                rwc.a(lwcVar2, rwcVar.u0, rwcVar.v0, new lr1(iwcVar, rwcVar, lwcVar2, 12));
                return Boolean.TRUE;
        }
    }

    public pt2(khe kheVar, v4 v4Var, khe kheVar2) {
        this.b = kheVar;
        this.o = v4Var;
        this.c = kheVar2;
    }
}
