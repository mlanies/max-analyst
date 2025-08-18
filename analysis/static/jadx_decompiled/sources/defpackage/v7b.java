package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class v7b extends ffe implements a66 {
    public int X;
    public final /* synthetic */ w7b Y;
    public final /* synthetic */ long Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v7b(w7b w7bVar, long j, Continuation continuation) {
        super(2, continuation);
        this.Y = w7bVar;
        this.Z = j;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((v7b) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new v7b(this.Y, this.Z, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            w7b w7bVar = this.Y;
            kld kldVar = w7bVar.t0;
            int i2 = ft4.o;
            m32 m32VarQ = nu0.Q(kldVar, z7.S(this.Z, kt4.MILLISECONDS));
            xw xwVar = new xw(10, w7bVar);
            this.X = 1;
            if (m32VarQ.d(xwVar, this) == tx3Var) {
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
