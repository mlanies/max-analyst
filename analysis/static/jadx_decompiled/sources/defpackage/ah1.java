package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.calls.ui.bottomsheet.ratecall.CallRateBottomSheet;

/* loaded from: classes.dex */
public final class ah1 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ CallRateBottomSheet Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ah1(Continuation continuation, CallRateBottomSheet callRateBottomSheet) {
        super(2, continuation);
        this.Y = callRateBottomSheet;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ah1 ah1Var = (ah1) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        ah1Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        ah1 ah1Var = new ah1(continuation, this.Y);
        ah1Var.X = obj;
        return ah1Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        List<v4c> list = (List) this.X;
        bc7[] bc7VarArr = CallRateBottomSheet.I0;
        CallRateBottomSheet callRateBottomSheet = this.Y;
        callRateBottomSheet.getClass();
        ((w4c) callRateBottomSheet.E0.T0(callRateBottomSheet, CallRateBottomSheet.I0[4])).setButtonToolDataList(list);
        return e5f.a;
    }
}
