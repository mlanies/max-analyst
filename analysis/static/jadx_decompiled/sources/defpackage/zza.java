package defpackage;

import android.view.View;
import one.me.chatscreen.ChatScreen;
import one.me.pinbars.PinBarsWidget;

/* loaded from: classes2.dex */
public final /* synthetic */ class zza implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ PinBarsWidget b;

    public /* synthetic */ zza(PinBarsWidget pinBarsWidget, int i) {
        this.a = i;
        this.b = pinBarsWidget;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        y0b y0bVar;
        g5f g5fVar;
        g5f g5fVar2;
        c64 c64VarZ1 = null;
        PinBarsWidget pinBarsWidget = this.b;
        switch (this.a) {
            case 0:
                int i = PinBarsWidget.t0;
                xza xzaVarM0 = pinBarsWidget.m0();
                Object parentController = pinBarsWidget.getParentController();
                a0b a0bVar = parentController instanceof a0b ? (a0b) parentController : null;
                int iA0 = a0bVar != null ? ((ChatScreen) a0bVar).A0() : 0;
                y0b y0bVar2 = xzaVarM0.c;
                if (y0bVar2 != null) {
                    vxd vxdVar = y0bVar2.g;
                    if (vxdVar == null || !vxdVar.isActive()) {
                        y0bVar2.g = j47.T(y0bVar2.d, ((w9a) y0bVar2.b).b(), null, new x0b(y0bVar2, iA0, null), 2);
                        break;
                    }
                }
                break;
            case 1:
                int i2 = PinBarsWidget.t0;
                xza xzaVarM02 = pinBarsWidget.m0();
                wza wzaVar = xzaVarM02.b;
                Long l = wzaVar.c;
                if (l != null && (y0bVar = xzaVarM02.c) != null) {
                    long jLongValue = l.longValue();
                    boolean z = wzaVar.o == 1;
                    Object value = y0bVar.h.getValue();
                    c1b c1bVar = value instanceof c1b ? (c1b) value : null;
                    if (c1bVar != null) {
                        n0b.c.getClass();
                        c64VarZ1 = n0b.Z1(jLongValue, c1bVar.a, z);
                    }
                    if (c64VarZ1 != null) {
                        pnf.o(xzaVarM02.z0, c64VarZ1);
                        break;
                    }
                }
                break;
            case 2:
                int i3 = PinBarsWidget.t0;
                xza xzaVarM03 = pinBarsWidget.m0();
                xzaVarM03.w0.b();
                xzaVarM03.Y.h();
                ywe yweVar = pinBarsWidget.a;
                if (yweVar != null) {
                    yweVar.dismiss();
                }
                pinBarsWidget.a = null;
                break;
            case 3:
                int i4 = PinBarsWidget.t0;
                pinBarsWidget.m0().w0.a();
                break;
            case 4:
                int i5 = PinBarsWidget.t0;
                xza xzaVarM04 = pinBarsWidget.m0();
                wza wzaVar2 = xzaVarM04.b;
                c64 c64VarD = ((y3b) xzaVarM04.w0.c).d(wzaVar2.c, wzaVar2.o == 1);
                if (c64VarD != null) {
                    pnf.o(xzaVarM04.z0, c64VarD);
                    break;
                }
                break;
            case 5:
                int i6 = PinBarsWidget.t0;
                xza xzaVarM05 = pinBarsWidget.m0();
                Object parentController2 = pinBarsWidget.getParentController();
                a0b a0bVar2 = parentController2 instanceof a0b ? (a0b) parentController2 : null;
                int iA02 = a0bVar2 != null ? ((ChatScreen) a0bVar2).A0() : 0;
                j5f j5fVar = xzaVarM05.o;
                if (j5fVar != null && (g5fVar = (g5f) j5fVar.i.a.getValue()) != null) {
                    j47.T(j5fVar.a, ((w9a) j5fVar.c).b(), null, new h5f(j5fVar, g5fVar.a, null), 2);
                    j5fVar.h.setValue(null);
                    wha whaVar = (wha) j5fVar.f.getValue();
                    whaVar.c(new eia(0, 0, iA02, 3));
                    whaVar.e(new kia(woc.z));
                    whaVar.g(new eqe(oea.h));
                    whaVar.i();
                    break;
                }
                break;
            default:
                int i7 = PinBarsWidget.t0;
                j5f j5fVar2 = pinBarsWidget.m0().o;
                if (j5fVar2 != null && (g5fVar2 = (g5f) j5fVar2.i.a.getValue()) != null) {
                    j47.T(j5fVar2.a, ((w9a) j5fVar2.c).b(), null, new i5f(j5fVar2, g5fVar2.a, null), 2);
                    j5fVar2.h.setValue(null);
                    break;
                }
                break;
        }
    }
}
