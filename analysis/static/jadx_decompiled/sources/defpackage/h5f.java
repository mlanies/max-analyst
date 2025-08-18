package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class h5f extends ffe implements a66 {
    public int X;
    public final /* synthetic */ j5f Y;
    public final /* synthetic */ long Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h5f(j5f j5fVar, long j, Continuation continuation) {
        super(2, continuation);
        this.Y = j5fVar;
        this.Z = j;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((h5f) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new h5f(this.Y, this.Z, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        e5f e5fVar = e5f.a;
        if (i == 0) {
            od2.a0(obj);
            yj3 yj3Var = (yj3) this.Y.e.getValue();
            this.X = 1;
            yj3Var.a(this.Z);
            if (e5fVar == tx3Var) {
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
