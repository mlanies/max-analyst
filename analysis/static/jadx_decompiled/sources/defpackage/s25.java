package defpackage;

import android.content.Context;
import one.me.sdk.arch.Widget;

/* loaded from: classes.dex */
public final /* synthetic */ class s25 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    public /* synthetic */ s25(int i, t25 t25Var) {
        this.a = 0;
        this.b = i;
        this.c = "one.me.webapp.domain.jsbridge.SuccessResponse.Status";
        this.o = t25Var;
    }

    @Override // defpackage.k56
    public final Object invoke() {
        switch (this.a) {
            case 0:
                int i = this.b;
                r6d[] r6dVarArr = new r6d[i];
                for (int i2 = 0; i2 < i; i2++) {
                    r6dVarArr[i2] = oag.f(((String) this.c) + '.' + ((t25) this.o).e[i2], nae.h, new r6d[0]);
                }
                return r6dVarArr;
            case 1:
                final mec mecVar = new mec();
                final int i3 = 1;
                k56 k56Var = new k56() { // from class: snd
                    @Override // defpackage.k56
                    public final Object invoke() {
                        switch (i3) {
                            case 0:
                                Object obj = mecVar.a;
                                kpa kpaVar = tnd.b;
                                if (tpa.f(obj, kpaVar != null ? (vha) kpaVar.b : null)) {
                                    tnd.b = null;
                                }
                                break;
                            default:
                                Object obj2 = mecVar.a;
                                kpa kpaVar2 = tnd.b;
                                if (tpa.f(obj2, kpaVar2 != null ? (vha) kpaVar2.b : null)) {
                                    tnd.b = null;
                                }
                                break;
                        }
                        return e5f.a;
                    }
                };
                wha whaVar = new wha((Widget) this.c);
                vj1 vj1Var = (vj1) this.o;
                whaVar.g(vj1Var.D);
                whaVar.e(nia.a);
                whaVar.f(pia.a);
                whaVar.d(new ypc(k56Var, 5, vj1Var.E));
                whaVar.c(new eia(0, 0, this.b, 3));
                vha vhaVarI = whaVar.i();
                mecVar.a = vhaVarI;
                return vhaVarI;
            case 2:
                final mec mecVar2 = new mec();
                Widget widget = (Widget) this.o;
                Context context = widget.getContext();
                uj1 uj1Var = (uj1) this.c;
                CharSequence charSequenceB = uj1Var.D.b(context);
                if (charSequenceB == null) {
                    charSequenceB = "";
                }
                final int i4 = 0;
                k56 k56Var2 = new k56() { // from class: snd
                    @Override // defpackage.k56
                    public final Object invoke() {
                        switch (i4) {
                            case 0:
                                Object obj = mecVar2.a;
                                kpa kpaVar = tnd.b;
                                if (tpa.f(obj, kpaVar != null ? (vha) kpaVar.b : null)) {
                                    tnd.b = null;
                                }
                                break;
                            default:
                                Object obj2 = mecVar2.a;
                                kpa kpaVar2 = tnd.b;
                                if (tpa.f(obj2, kpaVar2 != null ? (vha) kpaVar2.b : null)) {
                                    tnd.b = null;
                                }
                                break;
                        }
                        return e5f.a;
                    }
                };
                wha whaVar2 = new wha(widget);
                whaVar2.h(charSequenceB);
                Integer num = uj1Var.E;
                if (num != null) {
                    whaVar2.e(new kia(num.intValue()));
                }
                whaVar2.d(new ho1(3, k56Var2));
                whaVar2.c(new eia(0, 0, this.b, 3));
                vha vhaVarI2 = whaVar2.i();
                mecVar2.a = vhaVarI2;
                return vhaVarI2;
            default:
                return ece.c((String) this.c, this.b, (j92) ((moa) this.o).a);
        }
    }

    public /* synthetic */ s25(Object obj, Object obj2, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.o = obj2;
        this.b = i;
    }

    public /* synthetic */ s25(String str, int i, moa moaVar) {
        this.a = 3;
        this.c = str;
        this.b = i;
        this.o = moaVar;
    }
}
