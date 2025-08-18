package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import one.me.chats.forward.ForwardPickerScreen;
import one.me.sdk.arch.Widget;
import one.me.stickersshowcase.StickersShowcaseScreen;

/* loaded from: classes.dex */
public final class rz5 implements bha {
    public final /* synthetic */ int a;
    public final /* synthetic */ Widget b;

    public /* synthetic */ rz5(Widget widget, int i) {
        this.a = i;
        this.b = widget;
    }

    @Override // defpackage.bha
    public final void I(CharSequence charSequence) {
        vxd vxdVar;
        Widget widget = this.b;
        switch (this.a) {
            case 0:
                bc7[] bc7VarArr = ForwardPickerScreen.I0;
                txa txaVarV0 = ((ForwardPickerScreen) widget).v0();
                String string = charSequence != null ? charSequence.toString() : null;
                txaVarV0.getClass();
                if (string == null) {
                    string = "";
                }
                txaVarV0.t0.m(null, string);
                break;
            default:
                bc7[] bc7VarArr2 = StickersShowcaseScreen.v0;
                i7e i7eVarN0 = ((StickersShowcaseScreen) widget).n0();
                g6e g6eVar = i7eVarN0.X;
                if (!g6eVar.a() && (vxdVar = i7eVarN0.c.g) != null) {
                    vxdVar.cancel((CancellationException) null);
                }
                String strValueOf = String.valueOf(charSequence);
                AtomicReference atomicReference = g6eVar.g;
                if (!strValueOf.equals(((c6e) atomicReference.get()).b)) {
                    vxd vxdVar2 = g6eVar.h;
                    if (vxdVar2 != null) {
                        vxdVar2.cancel((CancellationException) null);
                    }
                    int length = strValueOf.length();
                    q0e q0eVar = g6eVar.d;
                    q0e q0eVar2 = g6eVar.f;
                    if (length != 0) {
                        q0eVar.m(null, new d6e(1, true, null));
                        q0eVar2.m(null, strValueOf);
                        break;
                    } else {
                        x77 x77Var = (x77) g6eVar.i.T0(g6eVar, g6e.j[0]);
                        if (x77Var != null) {
                            x77Var.cancel(null);
                        }
                        q0eVar.setValue(g6e.k);
                        atomicReference.set(new c6e((String) null, 3));
                        q0eVar2.setValue(null);
                        break;
                    }
                }
                break;
        }
    }
}
