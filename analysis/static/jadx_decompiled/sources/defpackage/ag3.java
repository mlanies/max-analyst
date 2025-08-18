package defpackage;

import kotlin.coroutines.Continuation;
import one.me.calls.ui.bottomsheet.opponent.ConfirmRemoveOpponentToCallBottomSheet;

/* loaded from: classes.dex */
public final class ag3 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ConfirmRemoveOpponentToCallBottomSheet Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ag3(Continuation continuation, ConfirmRemoveOpponentToCallBottomSheet confirmRemoveOpponentToCallBottomSheet) {
        super(2, continuation);
        this.Y = confirmRemoveOpponentToCallBottomSheet;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ag3 ag3Var = (ag3) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        ag3Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        ag3 ag3Var = new ag3(continuation, this.Y);
        ag3Var.X = obj;
        return ag3Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        wm9 wm9Var = (wm9) this.X;
        if (wm9Var instanceof vj1) {
            ConfirmRemoveOpponentToCallBottomSheet confirmRemoveOpponentToCallBottomSheet = this.Y;
            tnd tndVar = (tnd) confirmRemoveOpponentToCallBottomSheet.z0.getValue();
            int iIntValue = ((Number) confirmRemoveOpponentToCallBottomSheet.A0.getValue()).intValue();
            tndVar.getClass();
            tnd.b(dj1.b, new s25(confirmRemoveOpponentToCallBottomSheet, (vj1) wm9Var, iIntValue, 1));
            confirmRemoveOpponentToCallBottomSheet.s0(true);
        }
        return e5f.a;
    }
}
