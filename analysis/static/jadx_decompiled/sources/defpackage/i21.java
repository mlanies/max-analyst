package defpackage;

import kotlin.coroutines.Continuation;
import one.me.calls.ui.ui.call.panels.CallBottomPanelWidget;

/* loaded from: classes.dex */
public final class i21 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ CallBottomPanelWidget Y;
    public final /* synthetic */ r11 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i21(CallBottomPanelWidget callBottomPanelWidget, r11 r11Var, Continuation continuation) {
        super(2, continuation);
        this.Y = callBottomPanelWidget;
        this.Z = r11Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        i21 i21Var = (i21) n((sx3) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        i21Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        i21 i21Var = new i21(this.Y, this.Z, continuation);
        i21Var.X = obj;
        return i21Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        sx3 sx3Var = (sx3) this.X;
        bc7[] bc7VarArr = CallBottomPanelWidget.s0;
        od2.L(new zn5(this.Y.n0().x0, new lq0(2, this.Z, r11.class, "setVolumeMicrophone", "setVolumeMicrophone(F)V", 4, 3), 5), sx3Var);
        return e5f.a;
    }
}
