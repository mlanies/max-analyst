package defpackage;

import java.util.concurrent.atomic.AtomicLong;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class uwa extends ffe implements a66 {
    public int X;
    public final /* synthetic */ xwa Y;
    public final /* synthetic */ e52 Z;
    public final /* synthetic */ long[] s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uwa(xwa xwaVar, e52 e52Var, long[] jArr, Continuation continuation) {
        super(2, continuation);
        this.Y = xwaVar;
        this.Z = e52Var;
        this.s0 = jArr;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((uwa) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new uwa(this.Y, this.Z, this.s0, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        e5f e5fVar = e5f.a;
        if (i == 0) {
            od2.a0(obj);
            bc7[] bc7VarArr = xwa.l;
            xwa xwaVar = this.Y;
            if (((gh3) xwaVar.f.getValue()).f()) {
                AtomicLong atomicLong = xwaVar.i;
                pk pkVar = (pk) xwaVar.b.getValue();
                atomicLong.set(((k4a) pkVar).d(xwaVar.a, this.Z.b.a, ys.l0(this.s0), true));
                return e5fVar;
            }
            kld kldVar = xwaVar.g;
            rwa rwaVar = rwa.a;
            this.X = 1;
            if (kldVar.a(rwaVar, this) == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        return e5fVar;
    }
}
