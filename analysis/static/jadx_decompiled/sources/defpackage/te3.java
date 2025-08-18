package defpackage;

import kotlin.coroutines.Continuation;
import one.me.calls.ui.bottomsheet.opponent.ConfirmAddOpponentToCallBottomSheet;

/* loaded from: classes.dex */
public final class te3 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ConfirmAddOpponentToCallBottomSheet Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public te3(Continuation continuation, ConfirmAddOpponentToCallBottomSheet confirmAddOpponentToCallBottomSheet) {
        super(2, continuation);
        this.Y = confirmAddOpponentToCallBottomSheet;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        te3 te3Var = (te3) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        te3Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        te3 te3Var = new te3(continuation, this.Y);
        te3Var.X = obj;
        return te3Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        wm9 wm9Var = (wm9) this.X;
        if (wm9Var instanceof c64) {
            je1.c.R1((c64) wm9Var);
            this.Y.s0(true);
        }
        return e5f.a;
    }
}
