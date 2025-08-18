package defpackage;

import android.view.View;
import android.view.ViewGroup;
import kotlin.coroutines.Continuation;
import one.me.pinbars.PinBarsWidget;

/* loaded from: classes2.dex */
public final class c0b extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ PinBarsWidget Y;
    public final /* synthetic */ View Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0b(View view, Continuation continuation, PinBarsWidget pinBarsWidget) {
        super(2, continuation);
        this.Y = pinBarsWidget;
        this.Z = view;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        c0b c0bVar = (c0b) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        c0bVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        c0b c0bVar = new c0b(this.Z, continuation, this.Y);
        c0bVar.X = obj;
        return c0bVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        ah6 ah6Var = (ah6) this.X;
        ViewGroup viewGroup = (ViewGroup) this.Z;
        int i = PinBarsWidget.t0;
        PinBarsWidget pinBarsWidget = this.Y;
        pinBarsWidget.getClass();
        if (ah6Var instanceof yg6) {
            if (pinBarsWidget.s0 == null) {
                bh6 bh6Var = new bh6(pinBarsWidget.getContext());
                bh6Var.setId(mea.a);
                bh6Var.setJoinAction(new yza(pinBarsWidget, 0));
                pinBarsWidget.s0 = bh6Var;
                viewGroup.addView(bh6Var, viewGroup.getChildCount());
            }
            bh6 bh6Var2 = pinBarsWidget.s0;
            if (bh6Var2 != null) {
                yg6 yg6Var = (yg6) ah6Var;
                bh6Var2.G0.setAvatars(yg6Var.c);
                bh6Var2.I0.setText(yg6Var.b.d(bh6Var2));
            }
        } else {
            viewGroup.removeView(viewGroup.findViewById(mea.a));
            pinBarsWidget.s0 = null;
        }
        return e5f.a;
    }
}
