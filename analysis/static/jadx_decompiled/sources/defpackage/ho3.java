package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class ho3 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ oo3 Y;
    public final /* synthetic */ long Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ho3(oo3 oo3Var, long j, Continuation continuation) {
        super(2, continuation);
        this.Y = oo3Var;
        this.Z = j;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((ho3) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new ho3(this.Y, this.Z, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        e5f e5fVar = e5f.a;
        if (i == 0) {
            od2.a0(obj);
            gq3 gq3Var = (gq3) this.Y.u0.getValue();
            this.X = 1;
            gq3Var.a(this.Z);
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
