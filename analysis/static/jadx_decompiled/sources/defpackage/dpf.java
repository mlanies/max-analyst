package defpackage;

import android.view.View;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class dpf extends ffe implements a66 {
    public int X;
    public final /* synthetic */ c66 Y;
    public final /* synthetic */ View Z;
    public final /* synthetic */ View s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpf(c66 c66Var, View view, View view2, Continuation continuation) {
        super(2, continuation);
        this.Y = c66Var;
        this.Z = view;
        this.s0 = view2;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((dpf) n((on5) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new dpf(this.Y, this.Z, this.s0, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            fka fkaVarI = qp4.u0.b(this.s0.getContext()).i();
            this.X = 1;
            if (this.Y.invoke(this.Z, fkaVarI, this) == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        return e5f.a;
    }
}
