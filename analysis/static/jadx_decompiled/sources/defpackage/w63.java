package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class w63 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ mn5[] Y;
    public final /* synthetic */ int Z;
    public final /* synthetic */ AtomicInteger s0;
    public final /* synthetic */ e32 t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w63(mn5[] mn5VarArr, int i, AtomicInteger atomicInteger, zt0 zt0Var, Continuation continuation) {
        super(2, continuation);
        this.Y = mn5VarArr;
        this.Z = i;
        this.s0 = atomicInteger;
        this.t0 = zt0Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((w63) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new w63(this.Y, this.Z, this.s0, (zt0) this.t0, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        AtomicInteger atomicInteger = this.s0;
        e32 e32Var = this.t0;
        try {
            if (i == 0) {
                od2.a0(obj);
                mn5[] mn5VarArr = this.Y;
                int i2 = this.Z;
                mn5 mn5Var = mn5VarArr[i2];
                v63 v63Var = new v63(i2, 0, e32Var);
                this.X = 1;
                if (mn5Var.d(v63Var, this) == tx3Var) {
                    return tx3Var;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                od2.a0(obj);
            }
            if (atomicInteger.decrementAndGet() == 0) {
                e32Var.i(null);
            }
            return e5f.a;
        } finally {
            if (atomicInteger.decrementAndGet() == 0) {
                e32Var.i(null);
            }
        }
    }
}
