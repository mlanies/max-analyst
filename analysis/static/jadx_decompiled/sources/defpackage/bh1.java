package defpackage;

import android.transition.TransitionManager;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.calls.ui.bottomsheet.ratecall.CallRateBottomSheet;

/* loaded from: classes.dex */
public final class bh1 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ View Y;
    public final /* synthetic */ CallRateBottomSheet Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bh1(Continuation continuation, View view, CallRateBottomSheet callRateBottomSheet) {
        super(2, continuation);
        this.Y = view;
        this.Z = callRateBottomSheet;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        bh1 bh1Var = (bh1) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        bh1Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        bh1 bh1Var = new bh1(continuation, this.Y, this.Z);
        bh1Var.X = obj;
        return bh1Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        List<ih1> list = (List) this.X;
        ViewGroup viewGroup = (ViewGroup) this.Y;
        CallRateBottomSheet callRateBottomSheet = this.Z;
        TransitionManager.beginDelayedTransition(viewGroup, callRateBottomSheet.B0);
        b5c b5cVarA0 = callRateBottomSheet.A0();
        b5cVarA0.A0.clear();
        b5cVarA0.removeAllViews();
        callRateBottomSheet.A0().setVisibility(list.isEmpty() ^ true ? 0 : 8);
        for (ih1 ih1Var : list) {
            callRateBottomSheet.A0().a(ih1Var.a, String.valueOf(ih1Var.b.b(callRateBottomSheet.getContext())));
        }
        return e5f.a;
    }
}
