package defpackage;

import android.widget.TextView;
import kotlin.coroutines.Continuation;
import one.me.calls.ui.bottomsheet.raisehand.RaiseHandActionBottomSheet;

/* loaded from: classes.dex */
public final class h4c extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ RaiseHandActionBottomSheet Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h4c(RaiseHandActionBottomSheet raiseHandActionBottomSheet, Continuation continuation) {
        super(2, continuation);
        this.Y = raiseHandActionBottomSheet;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        h4c h4cVar = (h4c) n((l4c) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        h4cVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        h4c h4cVar = new h4c(this.Y, continuation);
        h4cVar.X = obj;
        return h4cVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        l4c l4cVar = (l4c) this.X;
        bc7[] bc7VarArr = RaiseHandActionBottomSheet.B0;
        RaiseHandActionBottomSheet raiseHandActionBottomSheet = this.Y;
        raiseHandActionBottomSheet.getClass();
        bc7[] bc7VarArr2 = RaiseHandActionBottomSheet.B0;
        ((TextView) raiseHandActionBottomSheet.z0.T0(raiseHandActionBottomSheet, bc7VarArr2[0])).setText(l4cVar.a.b(raiseHandActionBottomSheet.getContext()));
        q7c q7cVar = raiseHandActionBottomSheet.A0;
        jqe jqeVar = l4cVar.b;
        if (jqeVar != null) {
            ((TextView) q7cVar.T0(raiseHandActionBottomSheet, bc7VarArr2[1])).setText(jqeVar.b(raiseHandActionBottomSheet.getContext()));
        }
        ((TextView) q7cVar.T0(raiseHandActionBottomSheet, bc7VarArr2[1])).setVisibility(jqeVar == null ? 8 : 0);
        return e5f.a;
    }
}
