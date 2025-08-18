package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class d79 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ je7 Z;
    public final /* synthetic */ uj3 s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d79(je7 je7Var, uj3 uj3Var, Continuation continuation) {
        super(2, continuation);
        this.Z = je7Var;
        this.s0 = uj3Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((d79) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        d79 d79Var = new d79(this.Z, this.s0, continuation);
        d79Var.Y = obj;
        return d79Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        Throwable th;
        sx3 sx3Var;
        tx3 tx3Var = tx3.a;
        int i = this.X;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                sx3Var = (sx3) this.Y;
                try {
                    od2.a0(obj);
                    return obj;
                } catch (Throwable th2) {
                    th = th2;
                    hm9.p(sx3Var.getClass().getName(), "fail to fetch self avatar", th);
                    return null;
                }
            }
            od2.a0(obj);
            sx3 sx3Var2 = (sx3) this.Y;
            je7 je7Var = this.Z;
            uj3 uj3Var = this.s0;
            try {
                tda tdaVar = (tda) je7Var.getValue();
                this.Y = sx3Var2;
                this.X = 1;
                obj = tdaVar.c(uj3Var, this);
                if (obj == tx3Var) {
                    return tx3Var;
                }
                return obj;
            } catch (Throwable th3) {
                th = th3;
                sx3Var = sx3Var2;
                hm9.p(sx3Var.getClass().getName(), "fail to fetch self avatar", th);
                return null;
            }
        } catch (CancellationException e) {
            throw e;
        }
    }
}
