package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ow9 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ rw9 Y;
    public final /* synthetic */ long Z;
    public final /* synthetic */ long s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ow9(rw9 rw9Var, long j, long j2, Continuation continuation) {
        super(2, continuation);
        this.Y = rw9Var;
        this.Z = j;
        this.s0 = j2;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((ow9) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new ow9(this.Y, this.Z, this.s0, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            this.X = 1;
            obj = this.Y.c(this.Z, this.s0, this);
            if (obj == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                od2.a0(obj);
                return e5f.a;
            }
            od2.a0(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            qx9 qx9Var = (qx9) this.Y.X.getValue();
            this.X = 2;
            if (qx9Var.g(this.Z, this.s0, this) == tx3Var) {
                return tx3Var;
            }
        }
        return e5f.a;
    }
}
