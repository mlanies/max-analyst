package defpackage;

import android.view.View;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class epf extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ c66 Z;
    public final /* synthetic */ View s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public epf(c66 c66Var, View view, Continuation continuation) {
        super(2, continuation);
        this.Z = c66Var;
        this.s0 = view;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((epf) n((fka) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        epf epfVar = new epf(this.Z, this.s0, continuation);
        epfVar.Y = obj;
        return epfVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            fka fkaVar = (fka) this.Y;
            this.X = 1;
            if (this.Z.invoke(this.s0, fkaVar, this) == tx3Var) {
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
