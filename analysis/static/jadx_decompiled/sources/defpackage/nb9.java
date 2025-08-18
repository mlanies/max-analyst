package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class nb9 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ sx3 Z;
    public final /* synthetic */ xb9 s0;
    public long[] t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nb9(Object obj, Continuation continuation, sx3 sx3Var, xb9 xb9Var) {
        super(2, continuation);
        this.Y = obj;
        this.Z = sx3Var;
        this.s0 = xb9Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((nb9) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new nb9(this.Y, continuation, this.Z, this.s0);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        long[] jArr;
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            List list = (List) this.Y;
            j1e.o(this.Z);
            long[] jArrE0 = x53.E0(list);
            this.t0 = jArrE0;
            this.X = 1;
            xb9 xb9Var = this.s0;
            xb9Var.getClass();
            Object objK = j1e.k(new wb9(xb9Var, null, jArrE0), this);
            if (objK == tx3Var) {
                return tx3Var;
            }
            obj = objK;
            jArr = jArrE0;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jArr = this.t0;
            od2.a0(obj);
        }
        return new kpa(jArr, obj);
    }
}
