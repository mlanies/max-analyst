package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.complaintbottomsheet.ComplaintBottomSheet;

/* loaded from: classes.dex */
public final class fa3 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ComplaintBottomSheet Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fa3(Continuation continuation, ComplaintBottomSheet complaintBottomSheet) {
        super(2, continuation);
        this.Y = complaintBottomSheet;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        fa3 fa3Var = (fa3) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        fa3Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        fa3 fa3Var = new fa3(continuation, this.Y);
        fa3Var.X = obj;
        return fa3Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        if (!tpa.f((ma3) this.X, ma3.a)) {
            throw new NoWhenBranchMatchedException();
        }
        ((wha) this.Y.o.getValue()).i();
        return e5f.a;
    }
}
