package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class sj7 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ vj7 Y;
    public final /* synthetic */ long Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sj7(vj7 vj7Var, long j, Continuation continuation) {
        super(2, continuation);
        this.Y = vj7Var;
        this.Z = j;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((sj7) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new sj7(this.Y, this.Z, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            g00 g00Var = new g00(((ki7) this.Y.i.getValue()).a, this.Z, 3);
            this.X = 1;
            obj = od2.A(g00Var, this);
            if (obj == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        return obj;
    }
}
