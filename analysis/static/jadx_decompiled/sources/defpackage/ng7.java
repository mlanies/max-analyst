package defpackage;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.MainDispatcherLoader;

/* loaded from: classes.dex */
public final class ng7 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ pg7 Y;
    public final /* synthetic */ a66 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ng7(pg7 pg7Var, lg7 lg7Var, Continuation continuation) {
        super(2, continuation);
        this.Y = pg7Var;
        this.Z = lg7Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((ng7) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new ng7(this.Y, (lg7) this.Z, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            gh7 gh7Var = ((rg7) this.Y).a;
            this.X = 1;
            fg7 fg7Var = fg7.c;
            jd4 jd4Var = ql4.a;
            if (j47.t0(MainDispatcherLoader.dispatcher.getImmediate(), new wra(gh7Var, fg7Var, this.Z, null), this) == tx3Var) {
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
