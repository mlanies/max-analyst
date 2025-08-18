package defpackage;

import java.util.concurrent.Callable;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class cy3 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ boolean Z = false;
    public final /* synthetic */ ilc s0;
    public final /* synthetic */ String[] t0;
    public final /* synthetic */ Callable u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cy3(ilc ilcVar, String[] strArr, Callable callable, Continuation continuation) {
        super(2, continuation);
        this.s0 = ilcVar;
        this.t0 = strArr;
        this.u0 = callable;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((cy3) n((on5) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        cy3 cy3Var = new cy3(this.s0, this.t0, this.u0, continuation);
        cy3Var.Y = obj;
        return cy3Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            by3 by3Var = new by3(this.Z, this.s0, (on5) this.Y, this.t0, this.u0, null);
            this.X = 1;
            if (j1e.k(by3Var, this) == tx3Var) {
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
