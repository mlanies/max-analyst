package defpackage;

import kotlin.coroutines.Continuation;
import one.me.calls.ui.bottomsheet.more.CallMoreBottomSheet;

/* loaded from: classes.dex */
public final class de1 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ CallMoreBottomSheet Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public de1(Continuation continuation, CallMoreBottomSheet callMoreBottomSheet) {
        super(2, continuation);
        this.Y = callMoreBottomSheet;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        de1 de1Var = (de1) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        de1Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        de1 de1Var = new de1(continuation, this.Y);
        de1Var.X = obj;
        return de1Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        if (tpa.f((wm9) this.X, cj1.D)) {
            this.Y.s0(true);
        }
        return e5f.a;
    }
}
