package defpackage;

import one.me.pinbars.PinBarsWidget;

/* loaded from: classes2.dex */
public final /* synthetic */ class yza implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ PinBarsWidget b;

    public /* synthetic */ yza(PinBarsWidget pinBarsWidget, int i) {
        this.a = i;
        this.b = pinBarsWidget;
    }

    @Override // defpackage.k56
    public final Object invoke() {
        k10 k10VarR;
        PinBarsWidget pinBarsWidget = this.b;
        switch (this.a) {
            case 0:
                int i = PinBarsWidget.t0;
                xg6 xg6Var = pinBarsWidget.m0().X;
                if (xg6Var != null) {
                    e52 e52Var = (e52) xg6Var.a.getValue();
                    String str = (e52Var == null || (k10VarR = e52Var.r()) == null) ? null : k10VarR.c;
                    if (str == null || str.length() == 0) {
                        hm9.n(xg6.class.getName(), "Can't join to group call in chat because joinLink is empty");
                    } else {
                        xg6Var.g.g(new ch6(str));
                    }
                }
                return e5f.a;
            case 1:
                int i2 = PinBarsWidget.t0;
                return pinBarsWidget.getRouter();
            case 2:
                int i3 = PinBarsWidget.t0;
                vza vzaVar = vza.a;
                return new xza((kke) vzaVar.getAccessor().c(kke.class), vzaVar.getAccessor().d(lr2.class), vzaVar.getAccessor().d(mm2.class), vzaVar.getAccessor().d(ps2.class), vzaVar.getAccessor().d(ds3.class), vzaVar.getAccessor().d(ck3.class), vzaVar.getAccessor().d(yj3.class), vzaVar.getAccessor().d(kr1.class), vzaVar.getAccessor().d(xb9.class), vzaVar.getAccessor().d(q33.class), vzaVar.getAccessor().d(qe5.class), (ch9) vzaVar.getAccessor().c(ch9.class), vzaVar.getAccessor().d(wha.class), (wza) pinBarsWidget.b.getValue());
            default:
                int i4 = PinBarsWidget.t0;
                return new rg1(new khe(new yza(pinBarsWidget, 1)), new l5g(pinBarsWidget, 0));
        }
    }
}
