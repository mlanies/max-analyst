package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ms9 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ ps9 Y;
    public final /* synthetic */ long Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ms9(ps9 ps9Var, long j, Continuation continuation) {
        super(2, continuation);
        this.Y = ps9Var;
        this.Z = j;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((ms9) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new ms9(this.Y, this.Z, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            gb6 gb6Var = (gb6) this.Y.f.getValue();
            this.X = 1;
            obj = gb6Var.a(this.Z, false, this);
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
