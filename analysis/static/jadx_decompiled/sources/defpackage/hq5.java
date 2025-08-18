package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.Symbol;

/* loaded from: classes.dex */
public final class hq5 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ mn5 Z;
    public final /* synthetic */ si9 s0;
    public final /* synthetic */ Object t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hq5(mn5 mn5Var, si9 si9Var, Object obj, Continuation continuation) {
        super(2, continuation);
        this.Z = mn5Var;
        this.s0 = si9Var;
        this.t0 = obj;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((hq5) n((vld) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        hq5 hq5Var = new hq5(this.Z, this.s0, this.t0, continuation);
        hq5Var.Y = obj;
        return hq5Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            int iOrdinal = ((vld) this.Y).ordinal();
            si9 si9Var = this.s0;
            if (iOrdinal == 0) {
                this.X = 1;
                if (this.Z.d(si9Var, this) == tx3Var) {
                    return tx3Var;
                }
            } else if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                Symbol symbol = lld.a;
                Object obj2 = this.t0;
                if (obj2 == symbol) {
                    si9Var.f();
                } else {
                    si9Var.g(obj2);
                }
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
