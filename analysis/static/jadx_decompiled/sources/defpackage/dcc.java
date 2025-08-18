package defpackage;

import kotlin.coroutines.Continuation;
import one.me.calls.ui.bottomsheet.exit.RecordExitBottomSheet;

/* loaded from: classes.dex */
public final class dcc extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ RecordExitBottomSheet Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dcc(Continuation continuation, RecordExitBottomSheet recordExitBottomSheet) {
        super(2, continuation);
        this.Y = recordExitBottomSheet;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        dcc dccVar = (dcc) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        dccVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        dcc dccVar = new dcc(continuation, this.Y);
        dccVar.X = obj;
        return dccVar;
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
