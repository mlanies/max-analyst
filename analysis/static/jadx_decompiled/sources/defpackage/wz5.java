package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chats.forward.ForwardPickerScreen;

/* loaded from: classes.dex */
public final class wz5 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ForwardPickerScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wz5(Continuation continuation, ForwardPickerScreen forwardPickerScreen) {
        super(2, continuation);
        this.Y = forwardPickerScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        wz5 wz5Var = (wz5) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        wz5Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        wz5 wz5Var = new wz5(continuation, this.Y);
        wz5Var.X = obj;
        return wz5Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        ((Boolean) this.X).getClass();
        bc7[] bc7VarArr = ForwardPickerScreen.I0;
        ForwardPickerScreen forwardPickerScreen = this.Y;
        forwardPickerScreen.z0().setStartIconDrawable(((iz5) forwardPickerScreen.v0().c).g());
        return e5f.a;
    }
}
